package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableBinariesValue2

class TestNullableSetOfNullableBinariesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableBinariesValue2].member("nullableSetOfNullableBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary?>?]
      , typeOf[NullableSetOfNullableBinariesValue2].member("nullableSetOfNullableBinaries": TermName).asMethod.returnType
      )
}
