package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableFloatsValue1

class TestOneSetOfNullableFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableFloatsValue1].member("oneSetOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Float?>]
      , typeOf[OneSetOfNullableFloatsValue1].member("oneSetOfNullableFloats": TermName).asMethod.returnType
      )
}
