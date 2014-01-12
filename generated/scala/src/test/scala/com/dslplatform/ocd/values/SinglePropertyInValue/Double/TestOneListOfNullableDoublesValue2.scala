package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableDoublesValue2

class TestOneListOfNullableDoublesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableDoublesValue2].member("oneListOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double?>]
      , typeOf[OneListOfNullableDoublesValue2].member("oneListOfNullableDoubles": TermName).asMethod.returnType
      )
}
