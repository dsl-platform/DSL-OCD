package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDecimalsValue2

class TestNullableListOfOneDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneDecimalsValue2].member("nullableListOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal>?]
      , typeOf[NullableListOfOneDecimalsValue2].member("nullableListOfOneDecimals": TermName).asMethod.returnType
      )
}
