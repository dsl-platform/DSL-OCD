package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneMapsValue6

class TestNullableListOfOneMapsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneMapsValue6].member("nullableListOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map>?]
      , typeOf[NullableListOfOneMapsValue6].member("nullableListOfOneMaps": TermName).asMethod.returnType
      )
}
