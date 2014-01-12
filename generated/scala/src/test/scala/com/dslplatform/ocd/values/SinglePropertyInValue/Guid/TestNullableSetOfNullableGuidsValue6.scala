package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableGuidsValue6

class TestNullableSetOfNullableGuidsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableGuidsValue6].member("nullableSetOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid?>?]
      , typeOf[NullableSetOfNullableGuidsValue6].member("nullableSetOfNullableGuids": TermName).asMethod.returnType
      )
}
