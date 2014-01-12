package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableTimestampsValue5

class TestOneSetOfNullableTimestampsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableTimestampsValue5].member("oneSetOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp?>]
      , typeOf[OneSetOfNullableTimestampsValue5].member("oneSetOfNullableTimestamps": TermName).asMethod.returnType
      )
}
