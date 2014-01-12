package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDatesValue2

class TestOneArrayOfOneDatesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDatesValue2].member("oneArrayOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date[]]
      , typeOf[OneArrayOfOneDatesValue2].member("oneArrayOfOneDates": TermName).asMethod.returnType
      )
}
