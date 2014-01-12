package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDatesValue6

class TestOneArrayOfOneDatesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDatesValue6].member("oneArrayOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date[]]
      , typeOf[OneArrayOfOneDatesValue6].member("oneArrayOfOneDates": TermName).asMethod.returnType
      )
}
