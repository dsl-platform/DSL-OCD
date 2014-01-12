package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableXmlsValue1

class TestNullableSetOfNullableXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableXmlsValue1].member("nullableSetOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Xml?>?]
      , typeOf[NullableSetOfNullableXmlsValue1].member("nullableSetOfNullableXmls": TermName).asMethod.returnType
      )
}
