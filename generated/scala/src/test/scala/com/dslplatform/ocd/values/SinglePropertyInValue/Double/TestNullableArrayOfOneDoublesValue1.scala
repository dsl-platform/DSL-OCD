package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneDoublesValue1

class TestNullableArrayOfOneDoublesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneDoublesValue1].member("nullableArrayOfOneDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double[]?]
      , typeOf[NullableArrayOfOneDoublesValue1].member("nullableArrayOfOneDoubles": TermName).asMethod.returnType
      )
}
