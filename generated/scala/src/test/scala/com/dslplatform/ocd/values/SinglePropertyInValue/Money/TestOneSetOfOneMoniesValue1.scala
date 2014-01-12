package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneMoniesValue1

class TestOneSetOfOneMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneMoniesValue1].member("oneSetOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money>]
      , typeOf[OneSetOfOneMoniesValue1].member("oneSetOfOneMonies": TermName).asMethod.returnType
      )
}
