package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDatesValue2

class TestNullableListOfNullableDatesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDatesValue2].member("nullableListOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Date?>?]
      , typeOf[NullableListOfNullableDatesValue2].member("nullableListOfNullableDates": TermName).asMethod.returnType
      )
}
