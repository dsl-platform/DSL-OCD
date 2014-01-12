package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOnePointsValue3

class TestOneListOfOnePointsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOnePointsValue3].member("oneListOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Point>]
      , typeOf[OneListOfOnePointsValue3].member("oneListOfOnePoints": TermName).asMethod.returnType
      )
}
