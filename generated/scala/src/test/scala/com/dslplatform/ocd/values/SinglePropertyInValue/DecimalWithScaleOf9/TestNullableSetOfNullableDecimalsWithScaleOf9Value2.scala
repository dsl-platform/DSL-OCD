package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDecimalsWithScaleOf9Value2

class TestNullableSetOfNullableDecimalsWithScaleOf9Value2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableDecimalsWithScaleOf9Value2].member("nullableSetOfNullableDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal(9)?>?]
      , typeOf[NullableSetOfNullableDecimalsWithScaleOf9Value2].member("nullableSetOfNullableDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
