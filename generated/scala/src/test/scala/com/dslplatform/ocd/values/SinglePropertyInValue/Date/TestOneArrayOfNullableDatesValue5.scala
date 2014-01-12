package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDatesValue5

class TestOneArrayOfNullableDatesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableDatesValue5].member("oneArrayOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date?[]]
      , typeOf[OneArrayOfNullableDatesValue5].member("oneArrayOfNullableDates": TermName).asMethod.returnType
      )
}
