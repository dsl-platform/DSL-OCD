package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneTimestampsValue7

class TestOneSetOfOneTimestampsValue7
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneTimestampsValue7].member("oneSetOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Timestamp>]
      , typeOf[OneSetOfOneTimestampsValue7].member("oneSetOfOneTimestamps": TermName).asMethod.returnType
      )
}
