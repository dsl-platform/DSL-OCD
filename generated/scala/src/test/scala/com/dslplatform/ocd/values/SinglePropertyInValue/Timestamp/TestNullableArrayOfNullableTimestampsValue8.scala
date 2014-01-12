package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTimestampsValue8

class TestNullableArrayOfNullableTimestampsValue8
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableTimestampsValue8].member("nullableArrayOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp?[]?]
      , typeOf[NullableArrayOfNullableTimestampsValue8].member("nullableArrayOfNullableTimestamps": TermName).asMethod.returnType
      )
}
