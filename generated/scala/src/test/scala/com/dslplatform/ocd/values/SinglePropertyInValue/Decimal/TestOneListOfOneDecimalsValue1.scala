package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneDecimalsValue1

class TestOneListOfOneDecimalsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneDecimalsValue1].member("oneListOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Decimal>]
      , typeOf[OneListOfOneDecimalsValue1].member("oneListOfOneDecimals": TermName).asMethod.returnType
      )
}
