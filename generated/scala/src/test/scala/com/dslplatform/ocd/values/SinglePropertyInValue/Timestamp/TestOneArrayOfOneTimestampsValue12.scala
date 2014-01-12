package com.dslplatform.ocd.values.SinglePropertyInValue.Timestamp

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTimestampsValue12

class TestOneArrayOfOneTimestampsValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneTimestampsValue12].member("oneArrayOfOneTimestamps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Timestamp[]]
      , typeOf[OneArrayOfOneTimestampsValue12].member("oneArrayOfOneTimestamps": TermName).asMethod.returnType
      )
}
