package com.dslplatform.ocd.values.SinglePropertyInValue.StringWithMaxLengthOf9

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableStringsWithMaxLengthOf9Value2

class TestNullableArrayOfNullableStringsWithMaxLengthOf9Value2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableStringsWithMaxLengthOf9Value2].member("nullableArrayOfNullableStringsWithMaxLengthOf9": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String(9)?[]?]
      , typeOf[NullableArrayOfNullableStringsWithMaxLengthOf9Value2].member("nullableArrayOfNullableStringsWithMaxLengthOf9": TermName).asMethod.returnType
      )
}
