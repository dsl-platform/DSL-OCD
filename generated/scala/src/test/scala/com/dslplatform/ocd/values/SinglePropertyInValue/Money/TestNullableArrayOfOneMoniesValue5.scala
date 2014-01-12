package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMoniesValue5

class TestNullableArrayOfOneMoniesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneMoniesValue5].member("nullableArrayOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money[]?]
      , typeOf[NullableArrayOfOneMoniesValue5].member("nullableArrayOfOneMonies": TermName).asMethod.returnType
      )
}
