package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDoublesValue4

class TestNullableArrayOfNullableDoublesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDoublesValue4].member("nullableArrayOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double?[]?]
      , typeOf[NullableArrayOfNullableDoublesValue4].member("nullableArrayOfNullableDoubles": TermName).asMethod.returnType
      )
}
