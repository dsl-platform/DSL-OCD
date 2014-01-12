package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTimestampsValue6

class TestNullableArrayOfNullableTimestampsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableTimestampsValue6].member("nullableArrayOfNullableTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp?[]?]
      , typeOf[NullableArrayOfNullableTimestampsValue6].member("nullableArrayOfNullableTimestamps": TermName).asMethod.returnType
      )
}
