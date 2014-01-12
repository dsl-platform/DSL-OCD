package com.dslplatform.ocd.values.SinglePropertyInValue.Text

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableTextsValue2

class TestOneListOfNullableTextsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableTextsValue2].member("oneListOfNullableTexts": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Text?>]
      , typeOf[OneListOfNullableTextsValue2].member("oneListOfNullableTexts": TermName).asMethod.returnType
      )
}
