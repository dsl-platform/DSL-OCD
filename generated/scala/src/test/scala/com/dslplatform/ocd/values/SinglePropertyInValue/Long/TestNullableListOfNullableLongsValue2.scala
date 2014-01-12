package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableLongsValue2

class TestNullableListOfNullableLongsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableLongsValue2].member("nullableListOfNullableLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Long?>?]
      , typeOf[NullableListOfNullableLongsValue2].member("nullableListOfNullableLongs": TermName).asMethod.returnType
      )
}
