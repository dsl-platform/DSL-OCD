package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDecimalsValue3

class TestOneListOfNullableDecimalsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableDecimalsValue3].member("oneListOfNullableDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal?>]
      , typeOf[OneListOfNullableDecimalsValue3].member("oneListOfNullableDecimals": TermName).asMethod.returnType
      )
}
