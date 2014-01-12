package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneBinariesValue2

class TestNullableSetOfOneBinariesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneBinariesValue2].member("nullableSetOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary>?]
      , typeOf[NullableSetOfOneBinariesValue2].member("nullableSetOfOneBinaries": TermName).asMethod.returnType
      )
}
