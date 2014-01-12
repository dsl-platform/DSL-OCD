package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableIntegersValue5

class TestOneListOfNullableIntegersValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableIntegersValue5].member("oneListOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Integer?>]
      , typeOf[OneListOfNullableIntegersValue5].member("oneListOfNullableIntegers": TermName).asMethod.returnType
      )
}
