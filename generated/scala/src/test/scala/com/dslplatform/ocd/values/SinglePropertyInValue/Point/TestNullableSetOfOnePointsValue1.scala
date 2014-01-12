package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOnePointsValue1

class TestNullableSetOfOnePointsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOnePointsValue1].member("nullableSetOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Point>?]
      , typeOf[NullableSetOfOnePointsValue1].member("nullableSetOfOnePoints": TermName).asMethod.returnType
      )
}
