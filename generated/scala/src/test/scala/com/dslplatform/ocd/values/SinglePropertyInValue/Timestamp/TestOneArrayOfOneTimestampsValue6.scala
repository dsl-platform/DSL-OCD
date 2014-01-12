package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTimestampsValue6

class TestOneArrayOfOneTimestampsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneTimestampsValue6].member("oneArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]]
      , typeOf[OneArrayOfOneTimestampsValue6].member("oneArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
