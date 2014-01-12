package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableIntegersValue2

class TestOneArrayOfNullableIntegersValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableIntegersValue2].member("oneArrayOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer?[]]
      , typeOf[OneArrayOfNullableIntegersValue2].member("oneArrayOfNullableIntegers": TermName).asMethod.returnType
      )
}
