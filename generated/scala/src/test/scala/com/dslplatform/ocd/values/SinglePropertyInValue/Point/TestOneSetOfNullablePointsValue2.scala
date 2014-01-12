package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullablePointsValue2

class TestOneSetOfNullablePointsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullablePointsValue2].member("oneSetOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Point?>]
      , typeOf[OneSetOfNullablePointsValue2].member("oneSetOfNullablePoints": TermName).asMethod.returnType
      )
}
