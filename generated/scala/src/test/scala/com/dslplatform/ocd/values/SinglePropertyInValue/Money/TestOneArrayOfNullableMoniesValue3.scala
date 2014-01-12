package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMoniesValue3

class TestOneArrayOfNullableMoniesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableMoniesValue3].member("oneArrayOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money?[]]
      , typeOf[OneArrayOfNullableMoniesValue3].member("oneArrayOfNullableMonies": TermName).asMethod.returnType
      )
}
