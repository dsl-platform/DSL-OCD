package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneGuidsValue9

class TestOneArrayOfOneGuidsValue9
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneGuidsValue9].member("oneArrayOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Guid[]]
      , typeOf[OneArrayOfOneGuidsValue9].member("oneArrayOfOneGuids": TermName).asMethod.returnType
      )
}
