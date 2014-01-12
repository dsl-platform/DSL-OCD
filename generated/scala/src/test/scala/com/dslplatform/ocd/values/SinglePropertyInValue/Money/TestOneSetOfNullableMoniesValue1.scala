package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableMoniesValue1

class TestOneSetOfNullableMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableMoniesValue1].member("oneSetOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money?>]
      , typeOf[OneSetOfNullableMoniesValue1].member("oneSetOfNullableMonies": TermName).asMethod.returnType
      )
}
