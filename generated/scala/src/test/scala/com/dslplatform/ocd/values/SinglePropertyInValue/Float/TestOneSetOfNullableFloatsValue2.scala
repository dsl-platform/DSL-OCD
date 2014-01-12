package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableFloatsValue2

class TestOneSetOfNullableFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableFloatsValue2].member("oneSetOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Float?>]
      , typeOf[OneSetOfNullableFloatsValue2].member("oneSetOfNullableFloats": TermName).asMethod.returnType
      )
}
