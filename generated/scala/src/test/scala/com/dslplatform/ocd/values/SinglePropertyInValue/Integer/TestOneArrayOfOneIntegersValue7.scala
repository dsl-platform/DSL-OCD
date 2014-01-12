package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue7

class TestOneArrayOfOneIntegersValue7
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneIntegersValue7].member("oneArrayOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer[]]
      , typeOf[OneArrayOfOneIntegersValue7].member("oneArrayOfOneIntegers": TermName).asMethod.returnType
      )
}
