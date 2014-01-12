package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDatesValue1

class TestOneListOfNullableDatesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableDatesValue1].member("oneListOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Date?>]
      , typeOf[OneListOfNullableDatesValue1].member("oneListOfNullableDates": TermName).asMethod.returnType
      )
}
