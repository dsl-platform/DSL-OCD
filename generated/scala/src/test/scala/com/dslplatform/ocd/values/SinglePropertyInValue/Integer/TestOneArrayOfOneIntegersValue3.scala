package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue3

class TestOneArrayOfOneIntegersValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneIntegersValue3].member("oneArrayOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer[]]
      , typeOf[OneArrayOfOneIntegersValue3].member("oneArrayOfOneIntegers": TermName).asMethod.returnType
      )
}
