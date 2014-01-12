package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDecimalsWithScaleOf9Value1

class TestNullableListOfNullableDecimalsWithScaleOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDecimalsWithScaleOf9Value1].member("nullableListOfNullableDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal(9)?>?]
      , typeOf[NullableListOfNullableDecimalsWithScaleOf9Value1].member("nullableListOfNullableDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
