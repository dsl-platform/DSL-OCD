package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableMoniesValue2

class TestOneListOfNullableMoniesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableMoniesValue2].member("oneListOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Money?>]
      , typeOf[OneListOfNullableMoniesValue2].member("oneListOfNullableMonies": TermName).asMethod.returnType
      )
}
