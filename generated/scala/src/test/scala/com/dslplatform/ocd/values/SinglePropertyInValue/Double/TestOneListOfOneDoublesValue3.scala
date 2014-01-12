package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDoublesValue3

class TestOneListOfOneDoublesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneDoublesValue3].member("oneListOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double>]
      , typeOf[OneListOfOneDoublesValue3].member("oneListOfOneDoubles": TermName).asMethod.returnType
      )
}
