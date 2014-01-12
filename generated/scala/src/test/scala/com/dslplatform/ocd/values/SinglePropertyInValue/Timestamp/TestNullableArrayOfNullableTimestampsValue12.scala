package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTimestampsValue12

class TestNullableArrayOfNullableTimestampsValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableTimestampsValue12].member("nullableArrayOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp?[]?]
      , typeOf[NullableArrayOfNullableTimestampsValue12].member("nullableArrayOfNullableTimestamps": TermName).asMethod.returnType
      )
}
