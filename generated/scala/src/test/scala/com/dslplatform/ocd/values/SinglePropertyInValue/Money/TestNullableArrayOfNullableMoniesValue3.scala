package com.dslplatform.ocd.values.SinglePropertyInValue.Money

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableMoniesValue3

class TestNullableArrayOfNullableMoniesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableMoniesValue3].member("nullableArrayOfNullableMonies": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Money?[]?]
      , typeOf[NullableArrayOfNullableMoniesValue3].member("nullableArrayOfNullableMonies": TermName).asMethod.returnType
      )
}
