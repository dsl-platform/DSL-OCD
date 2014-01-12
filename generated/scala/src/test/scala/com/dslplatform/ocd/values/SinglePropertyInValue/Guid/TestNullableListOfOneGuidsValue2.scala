package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneGuidsValue2

class TestNullableListOfOneGuidsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneGuidsValue2].member("nullableListOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid>?]
      , typeOf[NullableListOfOneGuidsValue2].member("nullableListOfOneGuids": TermName).asMethod.returnType
      )
}
