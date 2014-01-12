package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDecimalsValue4

class TestOneArrayOfNullableDecimalsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableDecimalsValue4].member("oneArrayOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal?[]]
      , typeOf[OneArrayOfNullableDecimalsValue4].member("oneArrayOfNullableDecimals": TermName).asMethod.returnType
      )
}
