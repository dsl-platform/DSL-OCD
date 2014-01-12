package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDatesValue6

class TestNullableArrayOfNullableDatesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDatesValue6].member("nullableArrayOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date?[]?]
      , typeOf[NullableArrayOfNullableDatesValue6].member("nullableArrayOfNullableDates": TermName).asMethod.returnType
      )
}
