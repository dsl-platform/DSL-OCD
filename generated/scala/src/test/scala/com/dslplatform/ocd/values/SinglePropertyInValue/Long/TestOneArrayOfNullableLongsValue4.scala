package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLongsValue4

class TestOneArrayOfNullableLongsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableLongsValue4].member("oneArrayOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long?[]]
      , typeOf[OneArrayOfNullableLongsValue4].member("oneArrayOfNullableLongs": TermName).asMethod.returnType
      )
}
