package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneLongsValue2

class TestNullableListOfOneLongsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneLongsValue2].member("nullableListOfOneLongs": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Long>?]
      , typeOf[NullableListOfOneLongsValue2].member("nullableListOfOneLongs": TermName).asMethod.returnType
      )
}
