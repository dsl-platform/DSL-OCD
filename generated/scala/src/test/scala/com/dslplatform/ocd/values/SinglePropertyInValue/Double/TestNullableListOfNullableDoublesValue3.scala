package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDoublesValue3

class TestNullableListOfNullableDoublesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDoublesValue3].member("nullableListOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double?>?]
      , typeOf[NullableListOfNullableDoublesValue3].member("nullableListOfNullableDoubles": TermName).asMethod.returnType
      )
}
