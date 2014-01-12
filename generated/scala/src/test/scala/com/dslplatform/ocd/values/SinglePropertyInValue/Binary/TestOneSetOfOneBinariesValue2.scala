package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBinariesValue2

class TestOneSetOfOneBinariesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneBinariesValue2].member("oneSetOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary>]
      , typeOf[OneSetOfOneBinariesValue2].member("oneSetOfOneBinaries": TermName).asMethod.returnType
      )
}
