package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDatesValue3

class TestNullableSetOfNullableDatesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableDatesValue3].member("nullableSetOfNullableDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Date?>?]
      , typeOf[NullableSetOfNullableDatesValue3].member("nullableSetOfNullableDates": TermName).asMethod.returnType
      )
}
