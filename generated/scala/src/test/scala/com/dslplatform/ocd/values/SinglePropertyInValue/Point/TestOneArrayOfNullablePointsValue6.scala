package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullablePointsValue6

class TestOneArrayOfNullablePointsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullablePointsValue6].member("oneArrayOfNullablePoints": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point?[]]
      , typeOf[OneArrayOfNullablePointsValue6].member("oneArrayOfNullablePoints": TermName).asMethod.returnType
      )
}
