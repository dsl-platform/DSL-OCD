package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableTimestampValue7

class TestNullableTimestampValue7
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableTimestampValue7].member("nullableTimestamp": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp?]
      , typeOf[NullableTimestampValue7].member("nullableTimestamp": TermName).asMethod.returnType
      )
}
