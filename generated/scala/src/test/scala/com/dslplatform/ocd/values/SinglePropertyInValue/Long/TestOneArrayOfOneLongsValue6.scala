package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneLongsValue6

class TestOneArrayOfOneLongsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneLongsValue6].member("oneArrayOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long[]]
      , typeOf[OneArrayOfOneLongsValue6].member("oneArrayOfOneLongs": TermName).asMethod.returnType
      )
}
