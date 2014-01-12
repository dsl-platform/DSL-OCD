package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIntegersValue2

class TestOneSetOfNullableIntegersValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableIntegersValue2].member("oneSetOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer?>]
      , typeOf[OneSetOfNullableIntegersValue2].member("oneSetOfNullableIntegers": TermName).asMethod.returnType
      )
}
