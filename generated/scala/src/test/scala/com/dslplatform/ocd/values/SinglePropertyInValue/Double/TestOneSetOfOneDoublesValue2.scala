package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDoublesValue2

class TestOneSetOfOneDoublesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneDoublesValue2].member("oneSetOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Double>]
      , typeOf[OneSetOfOneDoublesValue2].member("oneSetOfOneDoubles": TermName).asMethod.returnType
      )
}
