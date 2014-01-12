package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLongsValue3

class TestNullableArrayOfNullableLongsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableLongsValue3].member("nullableArrayOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long?[]?]
      , typeOf[NullableArrayOfNullableLongsValue3].member("nullableArrayOfNullableLongs": TermName).asMethod.returnType
      )
}
