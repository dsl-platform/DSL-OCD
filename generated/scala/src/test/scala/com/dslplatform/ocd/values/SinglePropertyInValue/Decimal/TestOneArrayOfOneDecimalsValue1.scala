package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneDecimalsValue1

class TestOneArrayOfOneDecimalsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneDecimalsValue1].member("oneArrayOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Decimal[]]
      , typeOf[OneArrayOfOneDecimalsValue1].member("oneArrayOfOneDecimals": TermName).asMethod.returnType
      )
}
