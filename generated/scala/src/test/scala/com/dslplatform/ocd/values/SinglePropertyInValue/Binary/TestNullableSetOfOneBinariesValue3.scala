package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneBinariesValue3

class TestNullableSetOfOneBinariesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneBinariesValue3].member("nullableSetOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Binary>?]
      , typeOf[NullableSetOfOneBinariesValue3].member("nullableSetOfOneBinaries": TermName).asMethod.returnType
      )
}
