package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneMoniesValue1

class TestNullableSetOfOneMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneMoniesValue1].member("nullableSetOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money>?]
      , typeOf[NullableSetOfOneMoniesValue1].member("nullableSetOfOneMonies": TermName).asMethod.returnType
      )
}
