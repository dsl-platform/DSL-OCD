package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDatesValue2

class TestNullableSetOfNullableDatesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableDatesValue2].member("nullableSetOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Date?>?]
      , typeOf[NullableSetOfNullableDatesValue2].member("nullableSetOfNullableDates": TermName).asMethod.returnType
      )
}
