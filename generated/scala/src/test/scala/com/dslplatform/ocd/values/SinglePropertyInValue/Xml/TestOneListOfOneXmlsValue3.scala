package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneXmlsValue3

class TestOneListOfOneXmlsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneXmlsValue3].member("oneListOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml>]
      , typeOf[OneListOfOneXmlsValue3].member("oneListOfOneXmls": TermName).asMethod.returnType
      )
}
