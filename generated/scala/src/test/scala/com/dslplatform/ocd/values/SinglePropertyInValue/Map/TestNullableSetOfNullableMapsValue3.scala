package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableMapsValue3

class TestNullableSetOfNullableMapsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableMapsValue3].member("nullableSetOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Map?>?]
      , typeOf[NullableSetOfNullableMapsValue3].member("nullableSetOfNullableMaps": TermName).asMethod.returnType
      )
}
