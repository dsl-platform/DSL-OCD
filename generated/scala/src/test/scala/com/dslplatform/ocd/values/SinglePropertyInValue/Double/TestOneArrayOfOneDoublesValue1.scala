package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDoublesValue1

class TestOneArrayOfOneDoublesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDoublesValue1].member("oneArrayOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double[]]
      , typeOf[OneArrayOfOneDoublesValue1].member("oneArrayOfOneDoubles": TermName).asMethod.returnType
      )
}
