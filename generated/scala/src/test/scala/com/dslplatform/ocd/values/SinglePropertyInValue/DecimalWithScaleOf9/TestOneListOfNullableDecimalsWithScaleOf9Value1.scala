package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDecimalsWithScaleOf9Value1

class TestOneListOfNullableDecimalsWithScaleOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableDecimalsWithScaleOf9Value1].member("oneListOfNullableDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal(9)?>]
      , typeOf[OneListOfNullableDecimalsWithScaleOf9Value1].member("oneListOfNullableDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
