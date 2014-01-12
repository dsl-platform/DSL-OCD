package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDoublesValue1

class TestOneListOfOneDoublesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneDoublesValue1].member("oneListOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double>]
      , typeOf[OneListOfOneDoublesValue1].member("oneListOfOneDoubles": TermName).asMethod.returnType
      )
}
