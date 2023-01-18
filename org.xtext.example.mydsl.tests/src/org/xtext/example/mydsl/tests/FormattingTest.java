package org.xtext.example.mydsl.tests;

import javax.inject.Inject;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
public class FormattingTest {
	@Inject
	private FormatterTestHelper helper;
	
	@Test
	public void testWhiteSpaceIsFormattedBug() {
		helper.assertFormatted((config) -> {
  			config.setToBeFormatted("Hello"); // This test succeeds if you pass " Hello " instead.
  			config.setExpectation("Hello");
  			config.setAllowUnformattedWhitespace(false);
		});
	}
}
