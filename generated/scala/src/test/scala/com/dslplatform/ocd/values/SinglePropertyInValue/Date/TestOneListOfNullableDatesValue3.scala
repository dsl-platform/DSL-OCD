package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDatesValue3

class TestOneListOfNullableDatesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableDatesValue3].member("oneListOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Date?>]
      , typeOf[OneListOfNullableDatesValue3].member("oneListOfNullableDates": TermName).asMethod.returnType
      )
}
