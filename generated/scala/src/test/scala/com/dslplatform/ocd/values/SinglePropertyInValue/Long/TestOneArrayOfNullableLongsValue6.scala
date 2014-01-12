package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLongsValue6

class TestOneArrayOfNullableLongsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableLongsValue6].member("oneArrayOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long?[]]
      , typeOf[OneArrayOfNullableLongsValue6].member("oneArrayOfNullableLongs": TermName).asMethod.returnType
      )
}
