package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneGuidsValue4

class TestNullableArrayOfOneGuidsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneGuidsValue4].member("nullableArrayOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid[]?]
      , typeOf[NullableArrayOfOneGuidsValue4].member("nullableArrayOfOneGuids": TermName).asMethod.returnType
      )
}
