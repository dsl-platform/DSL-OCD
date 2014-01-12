package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableGuidsValue5

class TestOneListOfNullableGuidsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableGuidsValue5].member("oneListOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid?>]
      , typeOf[OneListOfNullableGuidsValue5].member("oneListOfNullableGuids": TermName).asMethod.returnType
      )
}
