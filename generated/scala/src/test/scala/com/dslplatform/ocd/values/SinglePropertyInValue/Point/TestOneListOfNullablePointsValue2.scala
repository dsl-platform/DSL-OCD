package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullablePointsValue2

class TestOneListOfNullablePointsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullablePointsValue2].member("oneListOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Point?>]
      , typeOf[OneListOfNullablePointsValue2].member("oneListOfNullablePoints": TermName).asMethod.returnType
      )
}
