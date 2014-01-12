package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneXmlsValue1

class TestOneArrayOfOneXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneXmlsValue1].member("oneArrayOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml[]]
      , typeOf[OneArrayOfOneXmlsValue1].member("oneArrayOfOneXmls": TermName).asMethod.returnType
      )
}
