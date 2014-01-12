package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneIntegersValue1

class TestNullableSetOfOneIntegersValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneIntegersValue1].member("nullableSetOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer>?]
      , typeOf[NullableSetOfOneIntegersValue1].member("nullableSetOfOneIntegers": TermName).asMethod.returnType
      )
}
