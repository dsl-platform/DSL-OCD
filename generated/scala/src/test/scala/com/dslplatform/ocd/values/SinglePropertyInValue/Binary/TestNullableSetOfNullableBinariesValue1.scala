package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableBinariesValue1

class TestNullableSetOfNullableBinariesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableBinariesValue1].member("nullableSetOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary?>?]
      , typeOf[NullableSetOfNullableBinariesValue1].member("nullableSetOfNullableBinaries": TermName).asMethod.returnType
      )
}
