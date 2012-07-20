package org.eclipse.xtext.mqrepl.ui;

import java.util.List;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Lists;

public class DelegatingClassLoader extends ClassLoader {
	
	private final Function0<BundleContext> bundleContextProvider;
	
	private static final List<String> bundles = Lists.newArrayList("org.xtext.example.mydsl", "org.eclipse.xtext", "com.google.inject", "org.eclipse.xtext.xbase.lib");

	public DelegatingClassLoader(Function0<BundleContext> bundleContextProvider) {
		this.bundleContextProvider = bundleContextProvider;
	}
	
	@Override
	public Class<?> loadClass(String arg0) throws ClassNotFoundException {
		for(Bundle b : bundleContextProvider.apply().getBundles()) {
			if (bundles.contains(b.getSymbolicName())) {
				
				try {
					Class c = b.loadClass(arg0);
					return c;
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			
			}
		}
		return super.loadClass(arg0);
	}

}
