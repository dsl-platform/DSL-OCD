package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDecimalsWithScaleOf9Value3

class TestOneArrayOfNullableDecimalsWithScaleOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableDecimalsWithScaleOf9Value3].member("oneArrayOfNullableDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal(9)?[]]
      , typeOf[OneArrayOfNullableDecimalsWithScaleOf9Value3].member("oneArrayOfNullableDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
