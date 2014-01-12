package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.OneStringWithMaxLengthOf9Value2

class TestOneStringWithMaxLengthOf9Value2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneStringWithMaxLengthOf9Value2].member("oneStringWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String(9)]
      , typeOf[OneStringWithMaxLengthOf9Value2].member("oneStringWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
