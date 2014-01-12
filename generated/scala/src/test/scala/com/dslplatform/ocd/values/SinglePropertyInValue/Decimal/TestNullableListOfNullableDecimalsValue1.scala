package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDecimalsValue1

class TestNullableListOfNullableDecimalsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDecimalsValue1].member("nullableListOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal?>?]
      , typeOf[NullableListOfNullableDecimalsValue1].member("nullableListOfNullableDecimals": TermName).asMethod.returnType
      )
}
