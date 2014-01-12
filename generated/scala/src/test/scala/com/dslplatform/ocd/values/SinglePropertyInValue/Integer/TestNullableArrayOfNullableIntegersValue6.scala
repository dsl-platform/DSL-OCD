package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableIntegersValue6

class TestNullableArrayOfNullableIntegersValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableIntegersValue6].member("nullableArrayOfNullableIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer?[]?]
      , typeOf[NullableArrayOfNullableIntegersValue6].member("nullableArrayOfNullableIntegers": TermName).asMethod.returnType
      )
}
