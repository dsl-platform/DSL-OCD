package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableStringsWithMaxLengthOf9Value3

class TestNullableSetOfNullableStringsWithMaxLengthOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableStringsWithMaxLengthOf9Value3].member("nullableSetOfNullableStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String(9)?>?]
      , typeOf[NullableSetOfNullableStringsWithMaxLengthOf9Value3].member("nullableSetOfNullableStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
