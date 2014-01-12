package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDoublesValue1

class TestNullableSetOfNullableDoublesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableDoublesValue1].member("nullableSetOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Double?>?]
      , typeOf[NullableSetOfNullableDoublesValue1].member("nullableSetOfNullableDoubles": TermName).asMethod.returnType
      )
}
