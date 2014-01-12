package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableGuidsValue3

class TestOneListOfNullableGuidsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableGuidsValue3].member("oneListOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid?>]
      , typeOf[OneListOfNullableGuidsValue3].member("oneListOfNullableGuids": TermName).asMethod.returnType
      )
}
