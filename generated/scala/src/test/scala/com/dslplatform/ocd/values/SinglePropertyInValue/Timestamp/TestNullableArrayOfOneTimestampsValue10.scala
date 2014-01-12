package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTimestampsValue10

class TestNullableArrayOfOneTimestampsValue10
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneTimestampsValue10].member("nullableArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]?]
      , typeOf[NullableArrayOfOneTimestampsValue10].member("nullableArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
