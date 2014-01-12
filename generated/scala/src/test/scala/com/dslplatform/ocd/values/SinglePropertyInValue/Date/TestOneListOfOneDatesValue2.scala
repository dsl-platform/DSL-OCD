package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDatesValue2

class TestOneListOfOneDatesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneDatesValue2].member("oneListOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Date>]
      , typeOf[OneListOfOneDatesValue2].member("oneListOfOneDates": TermName).asMethod.returnType
      )
}
