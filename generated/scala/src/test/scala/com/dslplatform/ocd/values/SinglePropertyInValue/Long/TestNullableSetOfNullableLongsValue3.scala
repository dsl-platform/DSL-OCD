package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableLongsValue3

class TestNullableSetOfNullableLongsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableLongsValue3].member("nullableSetOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Long?>?]
      , typeOf[NullableSetOfNullableLongsValue3].member("nullableSetOfNullableLongs": TermName).asMethod.returnType
      )
}
