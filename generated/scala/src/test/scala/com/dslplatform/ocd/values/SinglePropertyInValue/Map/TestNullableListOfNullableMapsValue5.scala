package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableMapsValue5

class TestNullableListOfNullableMapsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableMapsValue5].member("nullableListOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map?>?]
      , typeOf[NullableListOfNullableMapsValue5].member("nullableListOfNullableMaps": TermName).asMethod.returnType
      )
}
