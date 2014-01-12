package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDatesValue3

class TestOneSetOfNullableDatesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableDatesValue3].member("oneSetOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Date?>]
      , typeOf[OneSetOfNullableDatesValue3].member("oneSetOfNullableDates": TermName).asMethod.returnType
      )
}
