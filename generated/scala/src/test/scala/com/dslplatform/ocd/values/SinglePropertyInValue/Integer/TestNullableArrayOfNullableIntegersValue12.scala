package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIntegersValue12

class TestNullableArrayOfNullableIntegersValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIntegersValue12].member("nullableArrayOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer?[]?]
      , typeOf[NullableArrayOfNullableIntegersValue12].member("nullableArrayOfNullableIntegers": TermName).asMethod.returnType
      )
}
