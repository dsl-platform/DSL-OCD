package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTextsValue1

class TestOneArrayOfOneTextsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneTextsValue1].member("oneArrayOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Text[]]
      , typeOf[OneArrayOfOneTextsValue1].member("oneArrayOfOneTexts": TermName).asMethod.returnType
      )
}
