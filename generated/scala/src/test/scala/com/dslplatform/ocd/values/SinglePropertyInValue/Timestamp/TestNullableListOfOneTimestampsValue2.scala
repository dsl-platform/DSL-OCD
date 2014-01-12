package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneTimestampsValue2

class TestNullableListOfOneTimestampsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneTimestampsValue2].member("nullableListOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp>?]
      , typeOf[NullableListOfOneTimestampsValue2].member("nullableListOfOneTimestamps": TermName).asMethod.returnType
      )
}
