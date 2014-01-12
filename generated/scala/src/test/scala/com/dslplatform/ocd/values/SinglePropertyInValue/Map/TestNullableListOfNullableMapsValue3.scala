package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableMapsValue3

class TestNullableListOfNullableMapsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableMapsValue3].member("nullableListOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map?>?]
      , typeOf[NullableListOfNullableMapsValue3].member("nullableListOfNullableMaps": TermName).asMethod.returnType
      )
}
