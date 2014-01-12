package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneStringsWithMaxLengthOf9Value3

class TestNullableListOfOneStringsWithMaxLengthOf9Value3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneStringsWithMaxLengthOf9Value3].member("nullableListOfOneStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String(9)>?]
      , typeOf[NullableListOfOneStringsWithMaxLengthOf9Value3].member("nullableListOfOneStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
