
package org.eclipse.xtext.mqrepl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ModelQueryLanguageStandaloneSetup extends ModelQueryLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new ModelQueryLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

