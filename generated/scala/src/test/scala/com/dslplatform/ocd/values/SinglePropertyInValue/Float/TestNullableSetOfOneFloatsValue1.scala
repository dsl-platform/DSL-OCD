package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneFloatsValue1

class TestNullableSetOfOneFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneFloatsValue1].member("nullableSetOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Float>?]
      , typeOf[NullableSetOfOneFloatsValue1].member("nullableSetOfOneFloats": TermName).asMethod.returnType
      )
}
