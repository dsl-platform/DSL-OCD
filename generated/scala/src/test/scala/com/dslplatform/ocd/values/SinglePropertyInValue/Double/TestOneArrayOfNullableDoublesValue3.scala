package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableDoublesValue3

class TestOneArrayOfNullableDoublesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableDoublesValue3].member("oneArrayOfNullableDoubles": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double?[]]
      , typeOf[OneArrayOfNullableDoublesValue3].member("oneArrayOfNullableDoubles": TermName).asMethod.returnType
      )
}
