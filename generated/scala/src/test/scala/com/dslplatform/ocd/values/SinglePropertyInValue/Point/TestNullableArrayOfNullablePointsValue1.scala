package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullablePointsValue1

class TestNullableArrayOfNullablePointsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullablePointsValue1].member("nullableArrayOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point?[]?]
      , typeOf[NullableArrayOfNullablePointsValue1].member("nullableArrayOfNullablePoints": TermName).asMethod.returnType
      )
}
