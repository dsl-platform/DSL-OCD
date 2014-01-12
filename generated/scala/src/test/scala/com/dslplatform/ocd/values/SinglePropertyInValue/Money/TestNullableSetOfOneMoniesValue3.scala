package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneMoniesValue3

class TestNullableSetOfOneMoniesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneMoniesValue3].member("nullableSetOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Money>?]
      , typeOf[NullableSetOfOneMoniesValue3].member("nullableSetOfOneMonies": TermName).asMethod.returnType
      )
}
