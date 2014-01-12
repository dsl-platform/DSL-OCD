package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDatesValue2

class TestNullableArrayOfNullableDatesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDatesValue2].member("nullableArrayOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date?[]?]
      , typeOf[NullableArrayOfNullableDatesValue2].member("nullableArrayOfNullableDates": TermName).asMethod.returnType
      )
}
