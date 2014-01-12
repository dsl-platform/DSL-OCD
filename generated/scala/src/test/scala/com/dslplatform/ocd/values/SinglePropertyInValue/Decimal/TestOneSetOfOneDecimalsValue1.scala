package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDecimalsValue1

class TestOneSetOfOneDecimalsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneDecimalsValue1].member("oneSetOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal>]
      , typeOf[OneSetOfOneDecimalsValue1].member("oneSetOfOneDecimals": TermName).asMethod.returnType
      )
}
