package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneLongsValue1

class TestOneSetOfOneLongsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneLongsValue1].member("oneSetOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Long>]
      , typeOf[OneSetOfOneLongsValue1].member("oneSetOfOneLongs": TermName).asMethod.returnType
      )
}
