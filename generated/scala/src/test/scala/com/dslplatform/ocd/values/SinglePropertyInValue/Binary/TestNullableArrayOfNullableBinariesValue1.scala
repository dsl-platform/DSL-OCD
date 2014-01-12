package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableBinariesValue1

class TestNullableArrayOfNullableBinariesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableBinariesValue1].member("nullableArrayOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary?[]?]
      , typeOf[NullableArrayOfNullableBinariesValue1].member("nullableArrayOfNullableBinaries": TermName).asMethod.returnType
      )
}
