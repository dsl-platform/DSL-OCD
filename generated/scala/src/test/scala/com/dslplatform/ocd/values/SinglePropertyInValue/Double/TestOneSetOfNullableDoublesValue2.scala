package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDoublesValue2

class TestOneSetOfNullableDoublesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableDoublesValue2].member("oneSetOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Double?>]
      , typeOf[OneSetOfNullableDoublesValue2].member("oneSetOfNullableDoubles": TermName).asMethod.returnType
      )
}
