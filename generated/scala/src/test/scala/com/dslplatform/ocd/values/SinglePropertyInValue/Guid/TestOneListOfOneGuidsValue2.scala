package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneGuidsValue2

class TestOneListOfOneGuidsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneGuidsValue2].member("oneListOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Guid>]
      , typeOf[OneListOfOneGuidsValue2].member("oneListOfOneGuids": TermName).asMethod.returnType
      )
}
