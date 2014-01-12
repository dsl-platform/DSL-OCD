package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableFloatsValue1

class TestNullableSetOfNullableFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableFloatsValue1].member("nullableSetOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Float?>?]
      , typeOf[NullableSetOfNullableFloatsValue1].member("nullableSetOfNullableFloats": TermName).asMethod.returnType
      )
}
