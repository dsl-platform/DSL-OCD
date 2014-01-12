package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDatesValue4

class TestNullableArrayOfOneDatesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneDatesValue4].member("nullableArrayOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date[]?]
      , typeOf[NullableArrayOfOneDatesValue4].member("nullableArrayOfOneDates": TermName).asMethod.returnType
      )
}
