package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDatesValue1

class TestOneSetOfNullableDatesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableDatesValue1].member("oneSetOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Date?>]
      , typeOf[OneSetOfNullableDatesValue1].member("oneSetOfNullableDates": TermName).asMethod.returnType
      )
}
