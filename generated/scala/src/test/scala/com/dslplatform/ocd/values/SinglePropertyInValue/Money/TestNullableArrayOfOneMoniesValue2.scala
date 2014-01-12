package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMoniesValue2

class TestNullableArrayOfOneMoniesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneMoniesValue2].member("nullableArrayOfOneMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money[]?]
      , typeOf[NullableArrayOfOneMoniesValue2].member("nullableArrayOfOneMonies": TermName).asMethod.returnType
      )
}
