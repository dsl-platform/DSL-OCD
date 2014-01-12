package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDecimalsValue2

class TestOneListOfOneDecimalsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneDecimalsValue2].member("oneListOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal>]
      , typeOf[OneListOfOneDecimalsValue2].member("oneListOfOneDecimals": TermName).asMethod.returnType
      )
}
