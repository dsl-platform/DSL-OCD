package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDoublesValue6

class TestNullableArrayOfNullableDoublesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDoublesValue6].member("nullableArrayOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double?[]?]
      , typeOf[NullableArrayOfNullableDoublesValue6].member("nullableArrayOfNullableDoubles": TermName).asMethod.returnType
      )
}
