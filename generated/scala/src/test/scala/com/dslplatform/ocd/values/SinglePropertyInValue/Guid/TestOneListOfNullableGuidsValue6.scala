package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableGuidsValue6

class TestOneListOfNullableGuidsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableGuidsValue6].member("oneListOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid?>]
      , typeOf[OneListOfNullableGuidsValue6].member("oneListOfNullableGuids": TermName).asMethod.returnType
      )
}
