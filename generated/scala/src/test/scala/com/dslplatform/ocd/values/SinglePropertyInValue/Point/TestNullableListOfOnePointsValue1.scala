package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOnePointsValue1

class TestNullableListOfOnePointsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOnePointsValue1].member("nullableListOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Point>?]
      , typeOf[NullableListOfOnePointsValue1].member("nullableListOfOnePoints": TermName).asMethod.returnType
      )
}
