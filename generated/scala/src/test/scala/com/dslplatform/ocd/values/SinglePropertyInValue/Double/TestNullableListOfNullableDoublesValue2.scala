package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDoublesValue2

class TestNullableListOfNullableDoublesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDoublesValue2].member("nullableListOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double?>?]
      , typeOf[NullableListOfNullableDoublesValue2].member("nullableListOfNullableDoubles": TermName).asMethod.returnType
      )
}
