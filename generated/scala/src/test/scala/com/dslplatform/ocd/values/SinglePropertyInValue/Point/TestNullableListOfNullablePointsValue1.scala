package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullablePointsValue1

class TestNullableListOfNullablePointsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullablePointsValue1].member("nullableListOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Point?>?]
      , typeOf[NullableListOfNullablePointsValue1].member("nullableListOfNullablePoints": TermName).asMethod.returnType
      )
}
