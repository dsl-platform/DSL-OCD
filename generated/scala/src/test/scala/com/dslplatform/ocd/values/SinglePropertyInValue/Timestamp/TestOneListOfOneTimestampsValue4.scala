package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneTimestampsValue4

class TestOneListOfOneTimestampsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneTimestampsValue4].member("oneListOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp>]
      , typeOf[OneListOfOneTimestampsValue4].member("oneListOfOneTimestamps": TermName).asMethod.returnType
      )
}
