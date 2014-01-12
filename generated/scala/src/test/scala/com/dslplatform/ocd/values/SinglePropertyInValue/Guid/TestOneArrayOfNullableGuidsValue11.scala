package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableGuidsValue11

class TestOneArrayOfNullableGuidsValue11
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableGuidsValue11].member("oneArrayOfNullableGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid?[]]
      , typeOf[OneArrayOfNullableGuidsValue11].member("oneArrayOfNullableGuids": TermName).asMethod.returnType
      )
}
