package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDatesValue5

class TestNullableArrayOfNullableDatesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDatesValue5].member("nullableArrayOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date?[]?]
      , typeOf[NullableArrayOfNullableDatesValue5].member("nullableArrayOfNullableDates": TermName).asMethod.returnType
      )
}
