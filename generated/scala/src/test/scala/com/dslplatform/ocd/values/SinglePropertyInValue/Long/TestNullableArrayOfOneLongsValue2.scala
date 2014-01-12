package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLongsValue2

class TestNullableArrayOfOneLongsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneLongsValue2].member("nullableArrayOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long[]?]
      , typeOf[NullableArrayOfOneLongsValue2].member("nullableArrayOfOneLongs": TermName).asMethod.returnType
      )
}
