package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableStringsValue3

class TestNullableArrayOfNullableStringsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableStringsValue3].member("nullableArrayOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String?[]?]
      , typeOf[NullableArrayOfNullableStringsValue3].member("nullableArrayOfNullableStrings": TermName).asMethod.returnType
      )
}
