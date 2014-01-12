package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBinariesValue6

class TestOneArrayOfOneBinariesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneBinariesValue6].member("oneArrayOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary[]]
      , typeOf[OneArrayOfOneBinariesValue6].member("oneArrayOfOneBinaries": TermName).asMethod.returnType
      )
}
