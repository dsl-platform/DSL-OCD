package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTimestampsValue1

class TestNullableSetOfOneTimestampsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneTimestampsValue1].member("nullableSetOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp>?]
      , typeOf[NullableSetOfOneTimestampsValue1].member("nullableSetOfOneTimestamps": TermName).asMethod.returnType
      )
}
