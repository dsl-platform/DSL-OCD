package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneStringsWithMaxLengthOf9Value1

class TestNullableArrayOfOneStringsWithMaxLengthOf9Value1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneStringsWithMaxLengthOf9Value1].member("nullableArrayOfOneStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String(9)[]?]
      , typeOf[NullableArrayOfOneStringsWithMaxLengthOf9Value1].member("nullableArrayOfOneStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
