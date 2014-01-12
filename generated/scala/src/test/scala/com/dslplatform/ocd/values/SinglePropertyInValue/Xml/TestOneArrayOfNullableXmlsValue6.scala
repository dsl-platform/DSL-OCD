package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableXmlsValue6

class TestOneArrayOfNullableXmlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableXmlsValue6].member("oneArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]]
      , typeOf[OneArrayOfNullableXmlsValue6].member("oneArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
