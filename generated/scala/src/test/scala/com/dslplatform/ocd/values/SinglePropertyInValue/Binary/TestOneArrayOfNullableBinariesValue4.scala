package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBinariesValue4

class TestOneArrayOfNullableBinariesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableBinariesValue4].member("oneArrayOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary?[]]
      , typeOf[OneArrayOfNullableBinariesValue4].member("oneArrayOfNullableBinaries": TermName).asMethod.returnType
      )
}
