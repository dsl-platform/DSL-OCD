package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableGuidsValue3

class TestOneSetOfNullableGuidsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableGuidsValue3].member("oneSetOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid?>]
      , typeOf[OneSetOfNullableGuidsValue3].member("oneSetOfNullableGuids": TermName).asMethod.returnType
      )
}
