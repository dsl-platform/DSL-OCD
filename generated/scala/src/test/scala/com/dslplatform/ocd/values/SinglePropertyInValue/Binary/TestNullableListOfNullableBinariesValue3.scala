package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableBinariesValue3

class TestNullableListOfNullableBinariesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableBinariesValue3].member("nullableListOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Binary?>?]
      , typeOf[NullableListOfNullableBinariesValue3].member("nullableListOfNullableBinaries": TermName).asMethod.returnType
      )
}
