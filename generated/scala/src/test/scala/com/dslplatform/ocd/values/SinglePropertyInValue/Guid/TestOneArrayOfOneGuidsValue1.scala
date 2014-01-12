package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneGuidsValue1

class TestOneArrayOfOneGuidsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneGuidsValue1].member("oneArrayOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid[]]
      , typeOf[OneArrayOfOneGuidsValue1].member("oneArrayOfOneGuids": TermName).asMethod.returnType
      )
}
