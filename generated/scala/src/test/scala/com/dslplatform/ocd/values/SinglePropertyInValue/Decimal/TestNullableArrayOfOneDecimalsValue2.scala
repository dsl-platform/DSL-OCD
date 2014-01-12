package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDecimalsValue2

class TestNullableArrayOfOneDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneDecimalsValue2].member("nullableArrayOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal[]?]
      , typeOf[NullableArrayOfOneDecimalsValue2].member("nullableArrayOfOneDecimals": TermName).asMethod.returnType
      )
}
