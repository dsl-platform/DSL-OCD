package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableStringsWithMaxLengthOf9Value1

class TestOneSetOfNullableStringsWithMaxLengthOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableStringsWithMaxLengthOf9Value1].member("oneSetOfNullableStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String(9)?>]
      , typeOf[OneSetOfNullableStringsWithMaxLengthOf9Value1].member("oneSetOfNullableStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
