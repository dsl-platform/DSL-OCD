package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneTextsValue2

class TestOneArrayOfOneTextsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneTextsValue2].member("oneArrayOfOneTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Text[]]
      , typeOf[OneArrayOfOneTextsValue2].member("oneArrayOfOneTexts": TermName).asMethod.returnType
      )
}
