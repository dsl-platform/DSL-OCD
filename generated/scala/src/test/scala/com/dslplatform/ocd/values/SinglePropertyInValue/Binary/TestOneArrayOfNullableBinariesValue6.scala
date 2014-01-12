package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBinariesValue6

class TestOneArrayOfNullableBinariesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableBinariesValue6].member("oneArrayOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary?[]]
      , typeOf[OneArrayOfNullableBinariesValue6].member("oneArrayOfNullableBinaries": TermName).asMethod.returnType
      )
}
