package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneBinariesValue3

class TestOneListOfOneBinariesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneBinariesValue3].member("oneListOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Binary>]
      , typeOf[OneListOfOneBinariesValue3].member("oneListOfOneBinaries": TermName).asMethod.returnType
      )
}
