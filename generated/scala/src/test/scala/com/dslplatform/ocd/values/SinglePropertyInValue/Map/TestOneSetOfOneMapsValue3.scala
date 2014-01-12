package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneMapsValue3

class TestOneSetOfOneMapsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneMapsValue3].member("oneSetOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Map>]
      , typeOf[OneSetOfOneMapsValue3].member("oneSetOfOneMaps": TermName).asMethod.returnType
      )
}
