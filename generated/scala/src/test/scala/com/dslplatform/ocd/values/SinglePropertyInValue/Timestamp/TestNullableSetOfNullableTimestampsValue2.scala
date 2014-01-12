package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableTimestampsValue2

class TestNullableSetOfNullableTimestampsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableTimestampsValue2].member("nullableSetOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp?>?]
      , typeOf[NullableSetOfNullableTimestampsValue2].member("nullableSetOfNullableTimestamps": TermName).asMethod.returnType
      )
}
