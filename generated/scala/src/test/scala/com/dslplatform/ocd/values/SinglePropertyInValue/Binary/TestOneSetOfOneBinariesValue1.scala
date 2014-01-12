package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBinariesValue1

class TestOneSetOfOneBinariesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneBinariesValue1].member("oneSetOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary>]
      , typeOf[OneSetOfOneBinariesValue1].member("oneSetOfOneBinaries": TermName).asMethod.returnType
      )
}
