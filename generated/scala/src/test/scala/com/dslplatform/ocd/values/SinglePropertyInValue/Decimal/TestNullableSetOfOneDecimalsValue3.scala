package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDecimalsValue3

class TestNullableSetOfOneDecimalsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneDecimalsValue3].member("nullableSetOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal>?]
      , typeOf[NullableSetOfOneDecimalsValue3].member("nullableSetOfOneDecimals": TermName).asMethod.returnType
      )
}
