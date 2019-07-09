package com.vladsch.flexmark.html.converter;

import org.junit.runners.Suite;

@org.junit.runner.RunWith(Suite.class)
@Suite.SuiteClasses({
        ComboFlexmarkHtmlConverterTest.class,
        ComboFlexmarkHtmlAttributesConverterTest.class,
        ComboAppHtmlConverterTest.class,
        ComboAppHtmlAttributeConverterTest.class,
        ComboHtmlConverterIssueTest.class,
        ComboHtmlAttributeConverterIssueTest.class,
})
public class FlexmarkHtmlConverterTestSuite {
}
