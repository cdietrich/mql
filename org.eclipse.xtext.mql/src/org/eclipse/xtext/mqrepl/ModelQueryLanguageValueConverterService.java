package org.eclipse.xtext.mqrepl;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

@SuppressWarnings("restriction")
public class ModelQueryLanguageValueConverterService extends XbaseValueConverterService {
	
	@ValueConverter(rule = "QualifiedNameWithWildCard")
	public IValueConverter<String> getQualifiedNameWithWildCard() {
		return getQualifiedNameValueConverter();
	}
	

}
