package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableTextsValue2

class TestNullableListOfNullableTextsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableTextsValue2].member("nullableListOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Text?>?]
      , typeOf[NullableListOfNullableTextsValue2].member("nullableListOfNullableTexts": TermName).asMethod.returnType
      )
}
