package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDecimalsWithScaleOf9Value1

class TestOneSetOfNullableDecimalsWithScaleOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableDecimalsWithScaleOf9Value1].member("oneSetOfNullableDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal(9)?>]
      , typeOf[OneSetOfNullableDecimalsWithScaleOf9Value1].member("oneSetOfNullableDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
