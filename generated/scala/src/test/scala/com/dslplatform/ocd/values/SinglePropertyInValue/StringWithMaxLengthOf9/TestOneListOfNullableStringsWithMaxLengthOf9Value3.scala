package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableStringsWithMaxLengthOf9Value3

class TestOneListOfNullableStringsWithMaxLengthOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableStringsWithMaxLengthOf9Value3].member("oneListOfNullableStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String(9)?>]
      , typeOf[OneListOfNullableStringsWithMaxLengthOf9Value3].member("oneListOfNullableStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
