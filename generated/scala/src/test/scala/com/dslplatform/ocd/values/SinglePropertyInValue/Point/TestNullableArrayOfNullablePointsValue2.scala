package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullablePointsValue2

class TestNullableArrayOfNullablePointsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullablePointsValue2].member("nullableArrayOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point?[]?]
      , typeOf[NullableArrayOfNullablePointsValue2].member("nullableArrayOfNullablePoints": TermName).asMethod.returnType
      )
}
