package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullablePointsValue2

class TestNullableSetOfNullablePointsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullablePointsValue2].member("nullableSetOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Point?>?]
      , typeOf[NullableSetOfNullablePointsValue2].member("nullableSetOfNullablePoints": TermName).asMethod.returnType
      )
}
