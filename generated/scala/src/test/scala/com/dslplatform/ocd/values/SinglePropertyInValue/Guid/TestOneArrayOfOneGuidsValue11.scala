package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneGuidsValue11

class TestOneArrayOfOneGuidsValue11
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneGuidsValue11].member("oneArrayOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid[]]
      , typeOf[OneArrayOfOneGuidsValue11].member("oneArrayOfOneGuids": TermName).asMethod.returnType
      )
}
