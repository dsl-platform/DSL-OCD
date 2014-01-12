package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneLongsValue3

class TestOneSetOfOneLongsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneLongsValue3].member("oneSetOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Long>]
      , typeOf[OneSetOfOneLongsValue3].member("oneSetOfOneLongs": TermName).asMethod.returnType
      )
}
