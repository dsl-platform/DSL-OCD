package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableGuidsValue5

class TestNullableSetOfNullableGuidsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableGuidsValue5].member("nullableSetOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid?>?]
      , typeOf[NullableSetOfNullableGuidsValue5].member("nullableSetOfNullableGuids": TermName).asMethod.returnType
      )
}
