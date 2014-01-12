package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneMoniesValue1

class TestNullableListOfOneMoniesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneMoniesValue1].member("nullableListOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Money>?]
      , typeOf[NullableListOfOneMoniesValue1].member("nullableListOfOneMonies": TermName).asMethod.returnType
      )
}
