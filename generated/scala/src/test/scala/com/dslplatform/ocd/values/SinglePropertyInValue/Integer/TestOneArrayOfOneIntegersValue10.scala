package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIntegersValue10

class TestOneArrayOfOneIntegersValue10
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneIntegersValue10].member("oneArrayOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer[]]
      , typeOf[OneArrayOfOneIntegersValue10].member("oneArrayOfOneIntegers": TermName).asMethod.returnType
      )
}
