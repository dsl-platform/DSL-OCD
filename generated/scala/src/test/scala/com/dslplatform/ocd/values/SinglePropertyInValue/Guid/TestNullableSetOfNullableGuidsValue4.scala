package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableGuidsValue4

class TestNullableSetOfNullableGuidsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableGuidsValue4].member("nullableSetOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid?>?]
      , typeOf[NullableSetOfNullableGuidsValue4].member("nullableSetOfNullableGuids": TermName).asMethod.returnType
      )
}
