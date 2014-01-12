package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneTimestampsValue5

class TestNullableListOfOneTimestampsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneTimestampsValue5].member("nullableListOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp>?]
      , typeOf[NullableListOfOneTimestampsValue5].member("nullableListOfOneTimestamps": TermName).asMethod.returnType
      )
}
