package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDecimalsValue2

class TestOneArrayOfOneDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDecimalsValue2].member("oneArrayOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal[]]
      , typeOf[OneArrayOfOneDecimalsValue2].member("oneArrayOfOneDecimals": TermName).asMethod.returnType
      )
}
