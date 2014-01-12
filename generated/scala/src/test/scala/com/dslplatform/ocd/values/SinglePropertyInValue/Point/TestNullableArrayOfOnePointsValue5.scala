package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOnePointsValue5

class TestNullableArrayOfOnePointsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOnePointsValue5].member("nullableArrayOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point[]?]
      , typeOf[NullableArrayOfOnePointsValue5].member("nullableArrayOfOnePoints": TermName).asMethod.returnType
      )
}
