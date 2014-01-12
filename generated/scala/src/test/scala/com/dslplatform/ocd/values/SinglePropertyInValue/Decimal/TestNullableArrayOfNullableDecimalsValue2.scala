package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableDecimalsValue2

class TestNullableArrayOfNullableDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableDecimalsValue2].member("nullableArrayOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal?[]?]
      , typeOf[NullableArrayOfNullableDecimalsValue2].member("nullableArrayOfNullableDecimals": TermName).asMethod.returnType
      )
}
