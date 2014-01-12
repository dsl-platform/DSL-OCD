package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMapsValue4

class TestNullableSetOfNullableMapsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableMapsValue4].member("nullableSetOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Map?>?]
      , typeOf[NullableSetOfNullableMapsValue4].member("nullableSetOfNullableMaps": TermName).asMethod.returnType
      )
}
