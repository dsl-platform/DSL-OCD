package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneIntegersValue1

class TestNullableListOfOneIntegersValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneIntegersValue1].member("nullableListOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Integer>?]
      , typeOf[NullableListOfOneIntegersValue1].member("nullableListOfOneIntegers": TermName).asMethod.returnType
      )
}
