package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIntegersValue2

class TestNullableArrayOfOneIntegersValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneIntegersValue2].member("nullableArrayOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer[]?]
      , typeOf[NullableArrayOfOneIntegersValue2].member("nullableArrayOfOneIntegers": TermName).asMethod.returnType
      )
}
