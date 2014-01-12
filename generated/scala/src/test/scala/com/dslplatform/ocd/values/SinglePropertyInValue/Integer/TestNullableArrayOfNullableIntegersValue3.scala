package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIntegersValue3

class TestNullableArrayOfNullableIntegersValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIntegersValue3].member("nullableArrayOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer?[]?]
      , typeOf[NullableArrayOfNullableIntegersValue3].member("nullableArrayOfNullableIntegers": TermName).asMethod.returnType
      )
}
