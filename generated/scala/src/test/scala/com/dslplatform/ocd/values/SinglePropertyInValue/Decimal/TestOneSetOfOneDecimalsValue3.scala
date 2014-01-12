package com.dslplatform.ocd.values.SinglePropertyInValue.Decimal

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneDecimalsValue3

class TestOneSetOfOneDecimalsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneDecimalsValue3].member("oneSetOfOneDecimals": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Decimal>]
      , typeOf[OneSetOfOneDecimalsValue3].member("oneSetOfOneDecimals": TermName).asMethod.returnType
      )
}
