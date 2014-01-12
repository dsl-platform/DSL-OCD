package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableGuidsValue12

class TestNullableArrayOfNullableGuidsValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableGuidsValue12].member("nullableArrayOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid?[]?]
      , typeOf[NullableArrayOfNullableGuidsValue12].member("nullableArrayOfNullableGuids": TermName).asMethod.returnType
      )
}
