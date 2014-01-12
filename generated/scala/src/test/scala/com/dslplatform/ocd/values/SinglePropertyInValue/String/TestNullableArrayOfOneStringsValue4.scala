package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneStringsValue4

class TestNullableArrayOfOneStringsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneStringsValue4].member("nullableArrayOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String[]?]
      , typeOf[NullableArrayOfOneStringsValue4].member("nullableArrayOfOneStrings": TermName).asMethod.returnType
      )
}
