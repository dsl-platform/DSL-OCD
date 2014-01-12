package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTextsValue4

class TestNullableArrayOfOneTextsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneTextsValue4].member("nullableArrayOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Text[]?]
      , typeOf[NullableArrayOfOneTextsValue4].member("nullableArrayOfOneTexts": TermName).asMethod.returnType
      )
}
