package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLongsValue6

class TestNullableArrayOfOneLongsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneLongsValue6].member("nullableArrayOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long[]?]
      , typeOf[NullableArrayOfOneLongsValue6].member("nullableArrayOfOneLongs": TermName).asMethod.returnType
      )
}
