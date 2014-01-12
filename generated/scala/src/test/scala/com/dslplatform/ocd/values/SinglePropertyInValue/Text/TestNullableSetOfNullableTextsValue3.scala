package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableTextsValue3

class TestNullableSetOfNullableTextsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableTextsValue3].member("nullableSetOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text?>?]
      , typeOf[NullableSetOfNullableTextsValue3].member("nullableSetOfNullableTexts": TermName).asMethod.returnType
      )
}
