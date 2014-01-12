package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneXmlsValue1

class TestNullableSetOfOneXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneXmlsValue1].member("nullableSetOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Xml>?]
      , typeOf[NullableSetOfOneXmlsValue1].member("nullableSetOfOneXmls": TermName).asMethod.returnType
      )
}
