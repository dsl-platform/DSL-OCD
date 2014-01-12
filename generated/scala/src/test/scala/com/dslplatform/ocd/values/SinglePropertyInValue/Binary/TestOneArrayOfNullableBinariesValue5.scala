package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableBinariesValue5

class TestOneArrayOfNullableBinariesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableBinariesValue5].member("oneArrayOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary?[]]
      , typeOf[OneArrayOfNullableBinariesValue5].member("oneArrayOfNullableBinaries": TermName).asMethod.returnType
      )
}
