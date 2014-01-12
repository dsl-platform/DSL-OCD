package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableFloatsValue3

class TestNullableSetOfNullableFloatsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableFloatsValue3].member("nullableSetOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Float?>?]
      , typeOf[NullableSetOfNullableFloatsValue3].member("nullableSetOfNullableFloats": TermName).asMethod.returnType
      )
}
