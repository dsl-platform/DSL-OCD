package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDecimalWithScaleOf9Value1

class TestOneDecimalWithScaleOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneDecimalWithScaleOf9Value1].member("oneDecimalWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal(9)]
      , typeOf[OneDecimalWithScaleOf9Value1].member("oneDecimalWithScaleOf9": TermName).asMethod.returnType
      )
}
