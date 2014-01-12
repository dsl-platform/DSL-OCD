package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableXmlsValue2

class TestOneArrayOfNullableXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableXmlsValue2].member("oneArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]]
      , typeOf[OneArrayOfNullableXmlsValue2].member("oneArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
