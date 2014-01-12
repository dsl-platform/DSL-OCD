package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableTextsValue1

class TestOneSetOfNullableTextsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableTextsValue1].member("oneSetOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text?>]
      , typeOf[OneSetOfNullableTextsValue1].member("oneSetOfNullableTexts": TermName).asMethod.returnType
      )
}
