package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneMapsValue2

class TestNullableListOfOneMapsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneMapsValue2].member("nullableListOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map>?]
      , typeOf[NullableListOfOneMapsValue2].member("nullableListOfOneMaps": TermName).asMethod.returnType
      )
}
