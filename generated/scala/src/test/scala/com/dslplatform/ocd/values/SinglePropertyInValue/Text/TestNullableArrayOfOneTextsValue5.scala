package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneTextsValue5

class TestNullableArrayOfOneTextsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneTextsValue5].member("nullableArrayOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Text[]?]
      , typeOf[NullableArrayOfOneTextsValue5].member("nullableArrayOfOneTexts": TermName).asMethod.returnType
      )
}
