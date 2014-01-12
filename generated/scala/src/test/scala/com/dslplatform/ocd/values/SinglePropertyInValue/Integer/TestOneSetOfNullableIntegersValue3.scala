package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableIntegersValue3

class TestOneSetOfNullableIntegersValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableIntegersValue3].member("oneSetOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer?>]
      , typeOf[OneSetOfNullableIntegersValue3].member("oneSetOfNullableIntegers": TermName).asMethod.returnType
      )
}
