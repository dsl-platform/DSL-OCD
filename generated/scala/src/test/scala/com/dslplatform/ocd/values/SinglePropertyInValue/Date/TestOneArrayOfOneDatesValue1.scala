package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDatesValue1

class TestOneArrayOfOneDatesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDatesValue1].member("oneArrayOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date[]]
      , typeOf[OneArrayOfOneDatesValue1].member("oneArrayOfOneDates": TermName).asMethod.returnType
      )
}
