package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableXmlsValue2

class TestNullableSetOfNullableXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableXmlsValue2].member("nullableSetOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Xml?>?]
      , typeOf[NullableSetOfNullableXmlsValue2].member("nullableSetOfNullableXmls": TermName).asMethod.returnType
      )
}
