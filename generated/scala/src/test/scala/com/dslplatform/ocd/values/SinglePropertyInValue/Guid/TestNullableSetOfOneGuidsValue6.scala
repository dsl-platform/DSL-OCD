package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneGuidsValue6

class TestNullableSetOfOneGuidsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneGuidsValue6].member("nullableSetOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid>?]
      , typeOf[NullableSetOfOneGuidsValue6].member("nullableSetOfOneGuids": TermName).asMethod.returnType
      )
}
