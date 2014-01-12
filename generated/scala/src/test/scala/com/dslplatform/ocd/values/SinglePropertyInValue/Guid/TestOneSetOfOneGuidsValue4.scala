package com.dslplatform.ocd.values.SinglePropertyInValue.Guid

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneGuidsValue4

class TestOneSetOfOneGuidsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneGuidsValue4].member("oneSetOfOneGuids": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Guid>]
      , typeOf[OneSetOfOneGuidsValue4].member("oneSetOfOneGuids": TermName).asMethod.returnType
      )
}
