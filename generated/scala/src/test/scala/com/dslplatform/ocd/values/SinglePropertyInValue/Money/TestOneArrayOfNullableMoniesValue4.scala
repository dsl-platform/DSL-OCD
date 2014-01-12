package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMoniesValue4

class TestOneArrayOfNullableMoniesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableMoniesValue4].member("oneArrayOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money?[]]
      , typeOf[OneArrayOfNullableMoniesValue4].member("oneArrayOfNullableMonies": TermName).asMethod.returnType
      )
}
