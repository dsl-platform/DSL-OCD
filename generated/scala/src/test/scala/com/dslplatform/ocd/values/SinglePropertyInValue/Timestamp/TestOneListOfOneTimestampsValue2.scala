package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneTimestampsValue2

class TestOneListOfOneTimestampsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneTimestampsValue2].member("oneListOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp>]
      , typeOf[OneListOfOneTimestampsValue2].member("oneListOfOneTimestamps": TermName).asMethod.returnType
      )
}
