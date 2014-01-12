package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTextsValue3

class TestNullableSetOfOneTextsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneTextsValue3].member("nullableSetOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text>?]
      , typeOf[NullableSetOfOneTextsValue3].member("nullableSetOfOneTexts": TermName).asMethod.returnType
      )
}
