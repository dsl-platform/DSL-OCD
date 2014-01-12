package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableIntegersValue5

class TestNullableSetOfNullableIntegersValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableIntegersValue5].member("nullableSetOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer?>?]
      , typeOf[NullableSetOfNullableIntegersValue5].member("nullableSetOfNullableIntegers": TermName).asMethod.returnType
      )
}
