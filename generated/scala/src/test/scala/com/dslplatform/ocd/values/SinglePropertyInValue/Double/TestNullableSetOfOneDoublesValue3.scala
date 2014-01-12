package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneDoublesValue3

class TestNullableSetOfOneDoublesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneDoublesValue3].member("nullableSetOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Double>?]
      , typeOf[NullableSetOfOneDoublesValue3].member("nullableSetOfOneDoubles": TermName).asMethod.returnType
      )
}
