package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIntegersValue4

class TestNullableArrayOfNullableIntegersValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIntegersValue4].member("nullableArrayOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer?[]?]
      , typeOf[NullableArrayOfNullableIntegersValue4].member("nullableArrayOfNullableIntegers": TermName).asMethod.returnType
      )
}
