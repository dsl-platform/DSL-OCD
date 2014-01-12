package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableGuidsValue6

class TestNullableListOfNullableGuidsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableGuidsValue6].member("nullableListOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid?>?]
      , typeOf[NullableListOfNullableGuidsValue6].member("nullableListOfNullableGuids": TermName).asMethod.returnType
      )
}
