package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTimestampsValue13

class TestNullableArrayOfOneTimestampsValue13
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneTimestampsValue13].member("nullableArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]?]
      , typeOf[NullableArrayOfOneTimestampsValue13].member("nullableArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
