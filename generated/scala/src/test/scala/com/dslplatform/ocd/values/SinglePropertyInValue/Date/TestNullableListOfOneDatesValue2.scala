package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDatesValue2

class TestNullableListOfOneDatesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneDatesValue2].member("nullableListOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Date>?]
      , typeOf[NullableListOfOneDatesValue2].member("nullableListOfOneDates": TermName).asMethod.returnType
      )
}
