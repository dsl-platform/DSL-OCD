package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableTimestampsValue6

class TestOneListOfNullableTimestampsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableTimestampsValue6].member("oneListOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp?>]
      , typeOf[OneListOfNullableTimestampsValue6].member("oneListOfNullableTimestamps": TermName).asMethod.returnType
      )
}
