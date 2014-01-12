package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableMoniesValue3

class TestOneSetOfNullableMoniesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableMoniesValue3].member("oneSetOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money?>]
      , typeOf[OneSetOfNullableMoniesValue3].member("oneSetOfNullableMonies": TermName).asMethod.returnType
      )
}
