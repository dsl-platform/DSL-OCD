package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableDecimalsValue2

class TestNullableSetOfNullableDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableDecimalsValue2].member("nullableSetOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal?>?]
      , typeOf[NullableSetOfNullableDecimalsValue2].member("nullableSetOfNullableDecimals": TermName).asMethod.returnType
      )
}
