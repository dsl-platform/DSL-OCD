package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMoniesValue1

class TestNullableSetOfNullableMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableMoniesValue1].member("nullableSetOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money?>?]
      , typeOf[NullableSetOfNullableMoniesValue1].member("nullableSetOfNullableMonies": TermName).asMethod.returnType
      )
}
