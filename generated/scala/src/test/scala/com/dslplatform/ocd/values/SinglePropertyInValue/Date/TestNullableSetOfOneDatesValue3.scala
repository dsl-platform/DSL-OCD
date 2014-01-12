package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDatesValue3

class TestNullableSetOfOneDatesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneDatesValue3].member("nullableSetOfOneDates": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Date>?]
      , typeOf[NullableSetOfOneDatesValue3].member("nullableSetOfOneDates": TermName).asMethod.returnType
      )
}
