package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneTimestampsValue6

class TestOneListOfOneTimestampsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneTimestampsValue6].member("oneListOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Timestamp>]
      , typeOf[OneListOfOneTimestampsValue6].member("oneListOfOneTimestamps": TermName).asMethod.returnType
      )
}
