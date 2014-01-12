package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneStringsWithMaxLengthOf9Value1

class TestNullableSetOfOneStringsWithMaxLengthOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneStringsWithMaxLengthOf9Value1].member("nullableSetOfOneStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String(9)>?]
      , typeOf[NullableSetOfOneStringsWithMaxLengthOf9Value1].member("nullableSetOfOneStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
