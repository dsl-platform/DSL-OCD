package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneBinariesValue4

class TestNullableArrayOfOneBinariesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneBinariesValue4].member("nullableArrayOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary[]?]
      , typeOf[NullableArrayOfOneBinariesValue4].member("nullableArrayOfOneBinaries": TermName).asMethod.returnType
      )
}
