package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOnePointsValue2

class TestNullableArrayOfOnePointsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOnePointsValue2].member("nullableArrayOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point[]?]
      , typeOf[NullableArrayOfOnePointsValue2].member("nullableArrayOfOnePoints": TermName).asMethod.returnType
      )
}
