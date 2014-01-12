package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneMoniesValue2

class TestOneListOfOneMoniesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneMoniesValue2].member("oneListOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Money>]
      , typeOf[OneListOfOneMoniesValue2].member("oneListOfOneMonies": TermName).asMethod.returnType
      )
}
