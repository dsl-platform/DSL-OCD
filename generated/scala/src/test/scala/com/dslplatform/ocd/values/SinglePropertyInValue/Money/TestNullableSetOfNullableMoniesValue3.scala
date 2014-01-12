package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMoniesValue3

class TestNullableSetOfNullableMoniesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableMoniesValue3].member("nullableSetOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money?>?]
      , typeOf[NullableSetOfNullableMoniesValue3].member("nullableSetOfNullableMonies": TermName).asMethod.returnType
      )
}
