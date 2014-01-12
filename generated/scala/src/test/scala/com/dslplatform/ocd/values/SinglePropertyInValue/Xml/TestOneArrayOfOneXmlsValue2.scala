package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneXmlsValue2

class TestOneArrayOfOneXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneXmlsValue2].member("oneArrayOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml[]]
      , typeOf[OneArrayOfOneXmlsValue2].member("oneArrayOfOneXmls": TermName).asMethod.returnType
      )
}
