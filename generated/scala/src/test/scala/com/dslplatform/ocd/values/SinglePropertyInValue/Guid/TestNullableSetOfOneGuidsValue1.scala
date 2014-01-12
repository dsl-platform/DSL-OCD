package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneGuidsValue1

class TestNullableSetOfOneGuidsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneGuidsValue1].member("nullableSetOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid>?]
      , typeOf[NullableSetOfOneGuidsValue1].member("nullableSetOfOneGuids": TermName).asMethod.returnType
      )
}
