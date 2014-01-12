package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneStringsWithMaxLengthOf9Value3

class TestOneArrayOfOneStringsWithMaxLengthOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneStringsWithMaxLengthOf9Value3].member("oneArrayOfOneStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String(9)[]]
      , typeOf[OneArrayOfOneStringsWithMaxLengthOf9Value3].member("oneArrayOfOneStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
