package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneXmlsValue1

class TestOneSetOfOneXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneXmlsValue1].member("oneSetOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Xml>]
      , typeOf[OneSetOfOneXmlsValue1].member("oneSetOfOneXmls": TermName).asMethod.returnType
      )
}
