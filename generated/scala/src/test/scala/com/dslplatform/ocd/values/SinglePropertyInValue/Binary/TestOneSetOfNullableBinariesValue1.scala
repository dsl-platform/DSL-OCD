package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableBinariesValue1

class TestOneSetOfNullableBinariesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableBinariesValue1].member("oneSetOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary?>]
      , typeOf[OneSetOfNullableBinariesValue1].member("oneSetOfNullableBinaries": TermName).asMethod.returnType
      )
}
