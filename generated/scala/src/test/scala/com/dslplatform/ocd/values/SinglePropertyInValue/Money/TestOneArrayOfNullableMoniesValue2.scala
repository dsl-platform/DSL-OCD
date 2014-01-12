package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMoniesValue2

class TestOneArrayOfNullableMoniesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableMoniesValue2].member("oneArrayOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money?[]]
      , typeOf[OneArrayOfNullableMoniesValue2].member("oneArrayOfNullableMonies": TermName).asMethod.returnType
      )
}
