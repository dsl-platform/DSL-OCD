package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOnePointsValue1

class TestOneListOfOnePointsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOnePointsValue1].member("oneListOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Point>]
      , typeOf[OneListOfOnePointsValue1].member("oneListOfOnePoints": TermName).asMethod.returnType
      )
}
