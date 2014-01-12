package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableBinariesValue2

class TestNullableListOfNullableBinariesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableBinariesValue2].member("nullableListOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Binary?>?]
      , typeOf[NullableListOfNullableBinariesValue2].member("nullableListOfNullableBinaries": TermName).asMethod.returnType
      )
}
