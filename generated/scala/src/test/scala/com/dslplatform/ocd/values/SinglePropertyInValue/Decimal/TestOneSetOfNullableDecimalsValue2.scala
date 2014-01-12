package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableDecimalsValue2

class TestOneSetOfNullableDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableDecimalsValue2].member("oneSetOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal?>]
      , typeOf[OneSetOfNullableDecimalsValue2].member("oneSetOfNullableDecimals": TermName).asMethod.returnType
      )
}
