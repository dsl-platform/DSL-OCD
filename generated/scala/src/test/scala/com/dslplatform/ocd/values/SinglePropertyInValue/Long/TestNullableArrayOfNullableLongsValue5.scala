package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLongsValue5

class TestNullableArrayOfNullableLongsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableLongsValue5].member("nullableArrayOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long?[]?]
      , typeOf[NullableArrayOfNullableLongsValue5].member("nullableArrayOfNullableLongs": TermName).asMethod.returnType
      )
}
