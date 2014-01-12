package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneIntegersValue10

class TestNullableArrayOfOneIntegersValue10
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneIntegersValue10].member("nullableArrayOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Integer[]?]
      , typeOf[NullableArrayOfOneIntegersValue10].member("nullableArrayOfOneIntegers": TermName).asMethod.returnType
      )
}
