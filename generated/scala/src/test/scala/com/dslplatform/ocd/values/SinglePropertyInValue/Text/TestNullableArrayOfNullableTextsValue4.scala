package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableTextsValue4

class TestNullableArrayOfNullableTextsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableTextsValue4].member("nullableArrayOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Text?[]?]
      , typeOf[NullableArrayOfNullableTextsValue4].member("nullableArrayOfNullableTexts": TermName).asMethod.returnType
      )
}
