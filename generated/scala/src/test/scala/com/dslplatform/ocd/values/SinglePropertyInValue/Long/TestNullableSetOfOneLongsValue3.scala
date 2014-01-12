package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneLongsValue3

class TestNullableSetOfOneLongsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneLongsValue3].member("nullableSetOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Long>?]
      , typeOf[NullableSetOfOneLongsValue3].member("nullableSetOfOneLongs": TermName).asMethod.returnType
      )
}
