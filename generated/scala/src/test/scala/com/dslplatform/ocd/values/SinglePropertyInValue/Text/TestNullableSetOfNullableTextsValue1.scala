package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableTextsValue1

class TestNullableSetOfNullableTextsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableTextsValue1].member("nullableSetOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text?>?]
      , typeOf[NullableSetOfNullableTextsValue1].member("nullableSetOfNullableTexts": TermName).asMethod.returnType
      )
}
