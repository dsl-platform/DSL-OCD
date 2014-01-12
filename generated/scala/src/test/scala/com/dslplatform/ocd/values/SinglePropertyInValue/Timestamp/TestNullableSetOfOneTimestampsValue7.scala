package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTimestampsValue7

class TestNullableSetOfOneTimestampsValue7
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneTimestampsValue7].member("nullableSetOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp>?]
      , typeOf[NullableSetOfOneTimestampsValue7].member("nullableSetOfOneTimestamps": TermName).asMethod.returnType
      )
}
