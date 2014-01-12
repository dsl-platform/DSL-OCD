package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableTimestampsValue4

class TestOneArrayOfNullableTimestampsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableTimestampsValue4].member("oneArrayOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp?[]]
      , typeOf[OneArrayOfNullableTimestampsValue4].member("oneArrayOfNullableTimestamps": TermName).asMethod.returnType
      )
}
