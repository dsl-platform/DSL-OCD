package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneXmlsValue1

class TestOneListOfOneXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneXmlsValue1].member("oneListOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml>]
      , typeOf[OneListOfOneXmlsValue1].member("oneListOfOneXmls": TermName).asMethod.returnType
      )
}
