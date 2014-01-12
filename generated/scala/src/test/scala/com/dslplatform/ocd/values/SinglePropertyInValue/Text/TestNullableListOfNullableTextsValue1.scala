package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableTextsValue1

class TestNullableListOfNullableTextsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableTextsValue1].member("nullableListOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Text?>?]
      , typeOf[NullableListOfNullableTextsValue1].member("nullableListOfNullableTexts": TermName).asMethod.returnType
      )
}
