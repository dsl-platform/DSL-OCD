package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDecimalsValue5

class TestOneArrayOfNullableDecimalsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableDecimalsValue5].member("oneArrayOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal?[]]
      , typeOf[OneArrayOfNullableDecimalsValue5].member("oneArrayOfNullableDecimals": TermName).asMethod.returnType
      )
}
