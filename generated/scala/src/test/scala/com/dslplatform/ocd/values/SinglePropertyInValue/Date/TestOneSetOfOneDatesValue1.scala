package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDatesValue1

class TestOneSetOfOneDatesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneDatesValue1].member("oneSetOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Date>]
      , typeOf[OneSetOfOneDatesValue1].member("oneSetOfOneDates": TermName).asMethod.returnType
      )
}
