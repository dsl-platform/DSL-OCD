package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableTextsValue6

class TestOneArrayOfNullableTextsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableTextsValue6].member("oneArrayOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Text?[]]
      , typeOf[OneArrayOfNullableTextsValue6].member("oneArrayOfNullableTexts": TermName).asMethod.returnType
      )
}
