/*
* generated by Xtext
*/
package org.xtext.example.mydsl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractMyDslJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.mydsl.myDsl.MyDslPackage.eINSTANCE);
		return result;
	}

}
