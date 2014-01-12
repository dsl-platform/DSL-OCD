package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOnePointsValue2

class TestNullableSetOfOnePointsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOnePointsValue2].member("nullableSetOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Point>?]
      , typeOf[NullableSetOfOnePointsValue2].member("nullableSetOfOnePoints": TermName).asMethod.returnType
      )
}
