package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableXmlsValue5

class TestOneArrayOfNullableXmlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableXmlsValue5].member("oneArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]]
      , typeOf[OneArrayOfNullableXmlsValue5].member("oneArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
