package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneBinariesValue1

class TestNullableListOfOneBinariesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneBinariesValue1].member("nullableListOfOneBinaries": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Binary>?]
      , typeOf[NullableListOfOneBinariesValue1].member("nullableListOfOneBinaries": TermName).asMethod.returnType
      )
}
