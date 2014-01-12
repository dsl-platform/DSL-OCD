package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneMapsValue5

class TestOneListOfOneMapsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneMapsValue5].member("oneListOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map>]
      , typeOf[OneListOfOneMapsValue5].member("oneListOfOneMaps": TermName).asMethod.returnType
      )
}
