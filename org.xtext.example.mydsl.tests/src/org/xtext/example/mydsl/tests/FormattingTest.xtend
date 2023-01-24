package org.xtext.example.mydsl.tests

import javax.inject.Inject
import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.formatter.FormatterTestHelper
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class FormattingTest {
	@Inject
	FormatterTestHelper helper;
	
	@Test
	def void testWhiteSpaceIsFormattedBug() {
		helper.assertFormatted[
			preferences[
				put(FormatterPreferenceKeys.maxLineWidth, 10);
			]
			
			toBeFormatted = '''
			Expression: if True then True exists
			
			Expression  : True
			
			'''
			expectation = '''
			«""»

				Expression:
					if True
					then True
						exists
				Expression:
					True
			
			'''
		]
	}
}