package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableTimestampsValue1

class TestNullableSetOfNullableTimestampsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableTimestampsValue1].member("nullableSetOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp?>?]
      , typeOf[NullableSetOfNullableTimestampsValue1].member("nullableSetOfNullableTimestamps": TermName).asMethod.returnType
      )
}
