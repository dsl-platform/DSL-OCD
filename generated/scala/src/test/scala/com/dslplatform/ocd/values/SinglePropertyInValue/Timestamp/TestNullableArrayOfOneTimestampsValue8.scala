package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTimestampsValue8

class TestNullableArrayOfOneTimestampsValue8
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneTimestampsValue8].member("nullableArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]?]
      , typeOf[NullableArrayOfOneTimestampsValue8].member("nullableArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
