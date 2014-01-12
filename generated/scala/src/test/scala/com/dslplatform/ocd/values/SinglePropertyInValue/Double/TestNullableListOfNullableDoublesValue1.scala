package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDoublesValue1

class TestNullableListOfNullableDoublesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDoublesValue1].member("nullableListOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double?>?]
      , typeOf[NullableListOfNullableDoublesValue1].member("nullableListOfNullableDoubles": TermName).asMethod.returnType
      )
}
