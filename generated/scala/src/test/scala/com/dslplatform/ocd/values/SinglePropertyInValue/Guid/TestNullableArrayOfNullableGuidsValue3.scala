package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableGuidsValue3

class TestNullableArrayOfNullableGuidsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableGuidsValue3].member("nullableArrayOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid?[]?]
      , typeOf[NullableArrayOfNullableGuidsValue3].member("nullableArrayOfNullableGuids": TermName).asMethod.returnType
      )
}
