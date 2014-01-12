package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTimestampsValue6

class TestNullableSetOfOneTimestampsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneTimestampsValue6].member("nullableSetOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp>?]
      , typeOf[NullableSetOfOneTimestampsValue6].member("nullableSetOfOneTimestamps": TermName).asMethod.returnType
      )
}
