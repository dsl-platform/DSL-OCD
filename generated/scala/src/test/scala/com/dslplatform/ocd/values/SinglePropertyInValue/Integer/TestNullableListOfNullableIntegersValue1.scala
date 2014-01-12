package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableIntegersValue1

class TestNullableListOfNullableIntegersValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableIntegersValue1].member("nullableListOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Integer?>?]
      , typeOf[NullableListOfNullableIntegersValue1].member("nullableListOfNullableIntegers": TermName).asMethod.returnType
      )
}
