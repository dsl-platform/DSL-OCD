package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDecimalsValue3

class TestNullableListOfOneDecimalsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneDecimalsValue3].member("nullableListOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal>?]
      , typeOf[NullableListOfOneDecimalsValue3].member("nullableListOfOneDecimals": TermName).asMethod.returnType
      )
}
