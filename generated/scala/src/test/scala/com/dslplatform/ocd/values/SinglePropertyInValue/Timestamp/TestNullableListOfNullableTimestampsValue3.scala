package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableTimestampsValue3

class TestNullableListOfNullableTimestampsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableTimestampsValue3].member("nullableListOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp?>?]
      , typeOf[NullableListOfNullableTimestampsValue3].member("nullableListOfNullableTimestamps": TermName).asMethod.returnType
      )
}
