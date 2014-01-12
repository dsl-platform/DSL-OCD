package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDoublesValue4

class TestOneArrayOfOneDoublesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDoublesValue4].member("oneArrayOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double[]]
      , typeOf[OneArrayOfOneDoublesValue4].member("oneArrayOfOneDoubles": TermName).asMethod.returnType
      )
}
