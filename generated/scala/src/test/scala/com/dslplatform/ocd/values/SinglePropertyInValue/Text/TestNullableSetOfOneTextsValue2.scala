package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneTextsValue2

class TestNullableSetOfOneTextsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneTextsValue2].member("nullableSetOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text>?]
      , typeOf[NullableSetOfOneTextsValue2].member("nullableSetOfOneTexts": TermName).asMethod.returnType
      )
}
