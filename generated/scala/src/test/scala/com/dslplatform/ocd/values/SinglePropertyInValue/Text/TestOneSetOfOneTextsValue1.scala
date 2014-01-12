package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneTextsValue1

class TestOneSetOfOneTextsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneTextsValue1].member("oneSetOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text>]
      , typeOf[OneSetOfOneTextsValue1].member("oneSetOfOneTexts": TermName).asMethod.returnType
      )
}
