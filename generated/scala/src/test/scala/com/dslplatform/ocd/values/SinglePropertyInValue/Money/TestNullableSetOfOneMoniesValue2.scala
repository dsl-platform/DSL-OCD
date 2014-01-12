package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneMoniesValue2

class TestNullableSetOfOneMoniesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneMoniesValue2].member("nullableSetOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money>?]
      , typeOf[NullableSetOfOneMoniesValue2].member("nullableSetOfOneMonies": TermName).asMethod.returnType
      )
}
