package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBinariesValue2

class TestOneArrayOfOneBinariesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneBinariesValue2].member("oneArrayOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary[]]
      , typeOf[OneArrayOfOneBinariesValue2].member("oneArrayOfOneBinaries": TermName).asMethod.returnType
      )
}
