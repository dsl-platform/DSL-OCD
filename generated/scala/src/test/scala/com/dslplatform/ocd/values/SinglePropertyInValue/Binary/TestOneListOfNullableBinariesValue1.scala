package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableBinariesValue1

class TestOneListOfNullableBinariesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableBinariesValue1].member("oneListOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Binary?>]
      , typeOf[OneListOfNullableBinariesValue1].member("oneListOfNullableBinaries": TermName).asMethod.returnType
      )
}
