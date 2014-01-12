package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableBinariesValue2

class TestOneListOfNullableBinariesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableBinariesValue2].member("oneListOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Binary?>]
      , typeOf[OneListOfNullableBinariesValue2].member("oneListOfNullableBinaries": TermName).asMethod.returnType
      )
}
