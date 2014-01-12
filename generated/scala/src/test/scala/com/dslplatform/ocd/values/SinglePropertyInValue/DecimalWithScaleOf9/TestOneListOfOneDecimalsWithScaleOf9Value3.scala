package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDecimalsWithScaleOf9Value3

class TestOneListOfOneDecimalsWithScaleOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneDecimalsWithScaleOf9Value3].member("oneListOfOneDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal(9)>]
      , typeOf[OneListOfOneDecimalsWithScaleOf9Value3].member("oneListOfOneDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
