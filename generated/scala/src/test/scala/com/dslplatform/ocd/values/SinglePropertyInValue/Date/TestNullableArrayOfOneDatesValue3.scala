package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDatesValue3

class TestNullableArrayOfOneDatesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneDatesValue3].member("nullableArrayOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date[]?]
      , typeOf[NullableArrayOfOneDatesValue3].member("nullableArrayOfOneDates": TermName).asMethod.returnType
      )
}
