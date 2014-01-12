package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneXmlsValue2

class TestNullableSetOfOneXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneXmlsValue2].member("nullableSetOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Xml>?]
      , typeOf[NullableSetOfOneXmlsValue2].member("nullableSetOfOneXmls": TermName).asMethod.returnType
      )
}
