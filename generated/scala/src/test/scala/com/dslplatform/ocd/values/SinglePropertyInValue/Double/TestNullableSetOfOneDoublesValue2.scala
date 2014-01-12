package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDoublesValue2

class TestNullableSetOfOneDoublesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneDoublesValue2].member("nullableSetOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Double>?]
      , typeOf[NullableSetOfOneDoublesValue2].member("nullableSetOfOneDoubles": TermName).asMethod.returnType
      )
}
