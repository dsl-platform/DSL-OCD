package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableGuidsValue2

class TestOneSetOfNullableGuidsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableGuidsValue2].member("oneSetOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid?>]
      , typeOf[OneSetOfNullableGuidsValue2].member("oneSetOfNullableGuids": TermName).asMethod.returnType
      )
}
