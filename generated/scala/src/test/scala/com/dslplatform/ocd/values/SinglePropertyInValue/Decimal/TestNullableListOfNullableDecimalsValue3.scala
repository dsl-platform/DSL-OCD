package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableDecimalsValue3

class TestNullableListOfNullableDecimalsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableDecimalsValue3].member("nullableListOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal?>?]
      , typeOf[NullableListOfNullableDecimalsValue3].member("nullableListOfNullableDecimals": TermName).asMethod.returnType
      )
}
