package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneTextsValue2

class TestNullableListOfOneTextsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneTextsValue2].member("nullableListOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Text>?]
      , typeOf[NullableListOfOneTextsValue2].member("nullableListOfOneTexts": TermName).asMethod.returnType
      )
}
