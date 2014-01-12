package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneGuidsValue4

class TestNullableListOfOneGuidsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneGuidsValue4].member("nullableListOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid>?]
      , typeOf[NullableListOfOneGuidsValue4].member("nullableListOfOneGuids": TermName).asMethod.returnType
      )
}
