package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableTimestampsValue4

class TestOneListOfNullableTimestampsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableTimestampsValue4].member("oneListOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp?>]
      , typeOf[OneListOfNullableTimestampsValue4].member("oneListOfNullableTimestamps": TermName).asMethod.returnType
      )
}
