package com.dslplatform.ocd.values.SinglePropertyInValue.DecimalWithScaleOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDecimalsWithScaleOf9Value5

class TestNullableArrayOfNullableDecimalsWithScaleOf9Value5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDecimalsWithScaleOf9Value5].member("nullableArrayOfNullableDecimalsWithScaleOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal(9)?[]?]
      , typeOf[NullableArrayOfNullableDecimalsWithScaleOf9Value5].member("nullableArrayOfNullableDecimalsWithScaleOf9": TermName).asMethod.returnType
      )
}
