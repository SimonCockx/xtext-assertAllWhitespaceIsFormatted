/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.xtext.example.mydsl.myDsl.Model;

public class MyDslFormatter extends AbstractJavaFormatter {
	protected void format(Model model, IFormattableDocument doc) {
  		doc.prepend(regionFor(model).keyword("Hello"), this::noSpace);
  		doc.append(regionFor(model).keyword("Hello"), this::noSpace);
  	}
}