package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableTimestampsValue6

class TestNullableListOfNullableTimestampsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableTimestampsValue6].member("nullableListOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp?>?]
      , typeOf[NullableListOfNullableTimestampsValue6].member("nullableListOfNullableTimestamps": TermName).asMethod.returnType
      )
}
