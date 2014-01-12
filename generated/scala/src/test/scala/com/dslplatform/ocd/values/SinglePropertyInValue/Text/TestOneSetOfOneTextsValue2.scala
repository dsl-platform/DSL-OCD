package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneTextsValue2

class TestOneSetOfOneTextsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneTextsValue2].member("oneSetOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Text>]
      , typeOf[OneSetOfOneTextsValue2].member("oneSetOfOneTexts": TermName).asMethod.returnType
      )
}
