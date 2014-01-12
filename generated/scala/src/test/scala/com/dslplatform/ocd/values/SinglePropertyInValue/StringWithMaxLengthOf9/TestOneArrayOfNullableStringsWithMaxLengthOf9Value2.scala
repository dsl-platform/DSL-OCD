package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableStringsWithMaxLengthOf9Value2

class TestOneArrayOfNullableStringsWithMaxLengthOf9Value2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableStringsWithMaxLengthOf9Value2].member("oneArrayOfNullableStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String(9)?[]]
      , typeOf[OneArrayOfNullableStringsWithMaxLengthOf9Value2].member("oneArrayOfNullableStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
