package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTimestampsValue11

class TestOneArrayOfOneTimestampsValue11
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneTimestampsValue11].member("oneArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]]
      , typeOf[OneArrayOfOneTimestampsValue11].member("oneArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
