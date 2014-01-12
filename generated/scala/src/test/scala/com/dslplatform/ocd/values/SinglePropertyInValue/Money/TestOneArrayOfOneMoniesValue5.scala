package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneMoniesValue5

class TestOneArrayOfOneMoniesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneMoniesValue5].member("oneArrayOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money[]]
      , typeOf[OneArrayOfOneMoniesValue5].member("oneArrayOfOneMonies": TermName).asMethod.returnType
      )
}
