package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableLongsValue3

class TestOneSetOfNullableLongsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableLongsValue3].member("oneSetOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Long?>]
      , typeOf[OneSetOfNullableLongsValue3].member("oneSetOfNullableLongs": TermName).asMethod.returnType
      )
}
