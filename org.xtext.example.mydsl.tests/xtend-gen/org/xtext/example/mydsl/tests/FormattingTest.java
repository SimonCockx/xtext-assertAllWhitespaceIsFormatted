package org.xtext.example.mydsl.tests;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.formatting2.FormatterPreferenceKeys;
import org.eclipse.xtext.preferences.MapBasedPreferenceValues;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.formatter.FormatterTestHelper;
import org.eclipse.xtext.testing.formatter.FormatterTestRequest;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class FormattingTest {
  @Inject
  private FormatterTestHelper helper;

  @Test
  public void testWhiteSpaceIsFormattedBug() {
    final Procedure1<FormatterTestRequest> _function = (FormatterTestRequest it) -> {
      final Procedure1<MapBasedPreferenceValues> _function_1 = (MapBasedPreferenceValues it_1) -> {
        it_1.<Integer>put(FormatterPreferenceKeys.maxLineWidth, Integer.valueOf(10));
      };
      it.preferences(_function_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Expression: if True then True exists");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Expression  : True");
      _builder.newLine();
      _builder.newLine();
      it.setToBeFormatted(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Expression:");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("if True");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("then True");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("exists");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("Expression:");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("True");
      _builder_1.newLine();
      _builder_1.newLine();
      it.setExpectation(_builder_1);
    };
    this.helper.assertFormatted(_function);
  }
}
