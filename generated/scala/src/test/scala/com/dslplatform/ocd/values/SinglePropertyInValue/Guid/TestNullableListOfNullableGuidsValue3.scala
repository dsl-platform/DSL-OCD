package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableGuidsValue3

class TestNullableListOfNullableGuidsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableGuidsValue3].member("nullableListOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid?>?]
      , typeOf[NullableListOfNullableGuidsValue3].member("nullableListOfNullableGuids": TermName).asMethod.returnType
      )
}
