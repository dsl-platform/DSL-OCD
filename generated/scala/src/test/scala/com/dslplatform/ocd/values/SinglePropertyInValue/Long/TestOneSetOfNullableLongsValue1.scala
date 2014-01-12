package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableLongsValue1

class TestOneSetOfNullableLongsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableLongsValue1].member("oneSetOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Long?>]
      , typeOf[OneSetOfNullableLongsValue1].member("oneSetOfNullableLongs": TermName).asMethod.returnType
      )
}
