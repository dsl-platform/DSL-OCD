package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneGuidsValue1

class TestOneSetOfOneGuidsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneGuidsValue1].member("oneSetOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid>]
      , typeOf[OneSetOfOneGuidsValue1].member("oneSetOfOneGuids": TermName).asMethod.returnType
      )
}
