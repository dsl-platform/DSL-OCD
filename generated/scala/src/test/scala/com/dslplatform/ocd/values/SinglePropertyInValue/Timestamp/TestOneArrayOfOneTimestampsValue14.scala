package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTimestampsValue14

class TestOneArrayOfOneTimestampsValue14
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneTimestampsValue14].member("oneArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]]
      , typeOf[OneArrayOfOneTimestampsValue14].member("oneArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
