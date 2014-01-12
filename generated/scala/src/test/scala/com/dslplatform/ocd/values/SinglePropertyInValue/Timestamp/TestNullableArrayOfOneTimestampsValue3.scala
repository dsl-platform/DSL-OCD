package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTimestampsValue3

class TestNullableArrayOfOneTimestampsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneTimestampsValue3].member("nullableArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]?]
      , typeOf[NullableArrayOfOneTimestampsValue3].member("nullableArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
