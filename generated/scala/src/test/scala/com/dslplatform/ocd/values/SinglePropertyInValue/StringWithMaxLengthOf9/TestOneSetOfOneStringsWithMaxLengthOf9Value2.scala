package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneStringsWithMaxLengthOf9Value2

class TestOneSetOfOneStringsWithMaxLengthOf9Value2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneStringsWithMaxLengthOf9Value2].member("oneSetOfOneStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String(9)>]
      , typeOf[OneSetOfOneStringsWithMaxLengthOf9Value2].member("oneSetOfOneStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
