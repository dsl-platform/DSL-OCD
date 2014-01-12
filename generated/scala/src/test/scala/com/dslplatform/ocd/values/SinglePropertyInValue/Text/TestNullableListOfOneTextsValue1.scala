package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneTextsValue1

class TestNullableListOfOneTextsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneTextsValue1].member("nullableListOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Text>?]
      , typeOf[NullableListOfOneTextsValue1].member("nullableListOfOneTexts": TermName).asMethod.returnType
      )
}
