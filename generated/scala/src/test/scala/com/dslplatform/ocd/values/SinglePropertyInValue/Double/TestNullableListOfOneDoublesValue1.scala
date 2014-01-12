package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneDoublesValue1

class TestNullableListOfOneDoublesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneDoublesValue1].member("nullableListOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Double>?]
      , typeOf[NullableListOfOneDoublesValue1].member("nullableListOfOneDoubles": TermName).asMethod.returnType
      )
}
