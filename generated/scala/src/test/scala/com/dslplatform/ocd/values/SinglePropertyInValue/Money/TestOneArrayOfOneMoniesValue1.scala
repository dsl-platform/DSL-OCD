package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneMoniesValue1

class TestOneArrayOfOneMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneMoniesValue1].member("oneArrayOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money[]]
      , typeOf[OneArrayOfOneMoniesValue1].member("oneArrayOfOneMonies": TermName).asMethod.returnType
      )
}
