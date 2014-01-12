package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOnePointsValue3

class TestOneSetOfOnePointsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOnePointsValue3].member("oneSetOfOnePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Point>]
      , typeOf[OneSetOfOnePointsValue3].member("oneSetOfOnePoints": TermName).asMethod.returnType
      )
}
