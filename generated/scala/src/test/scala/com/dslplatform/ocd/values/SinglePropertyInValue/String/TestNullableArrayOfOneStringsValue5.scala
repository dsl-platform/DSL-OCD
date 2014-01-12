package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneStringsValue5

class TestNullableArrayOfOneStringsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneStringsValue5].member("nullableArrayOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String[]?]
      , typeOf[NullableArrayOfOneStringsValue5].member("nullableArrayOfOneStrings": TermName).asMethod.returnType
      )
}
