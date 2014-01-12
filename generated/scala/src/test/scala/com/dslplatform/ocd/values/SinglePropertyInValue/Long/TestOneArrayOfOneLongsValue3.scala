package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneLongsValue3

class TestOneArrayOfOneLongsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneLongsValue3].member("oneArrayOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long[]]
      , typeOf[OneArrayOfOneLongsValue3].member("oneArrayOfOneLongs": TermName).asMethod.returnType
      )
}
