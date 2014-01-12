package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBinariesValue5

class TestOneArrayOfOneBinariesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneBinariesValue5].member("oneArrayOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary[]]
      , typeOf[OneArrayOfOneBinariesValue5].member("oneArrayOfOneBinaries": TermName).asMethod.returnType
      )
}
