package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneMapsValue5

class TestNullableSetOfOneMapsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneMapsValue5].member("nullableSetOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Map>?]
      , typeOf[NullableSetOfOneMapsValue5].member("nullableSetOfOneMaps": TermName).asMethod.returnType
      )
}
