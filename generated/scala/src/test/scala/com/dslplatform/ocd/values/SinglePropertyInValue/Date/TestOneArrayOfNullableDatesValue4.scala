package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDatesValue4

class TestOneArrayOfNullableDatesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableDatesValue4].member("oneArrayOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date?[]]
      , typeOf[OneArrayOfNullableDatesValue4].member("oneArrayOfNullableDates": TermName).asMethod.returnType
      )
}
