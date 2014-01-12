package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneGuidsValue4

class TestNullableSetOfOneGuidsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneGuidsValue4].member("nullableSetOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid>?]
      , typeOf[NullableSetOfOneGuidsValue4].member("nullableSetOfOneGuids": TermName).asMethod.returnType
      )
}
