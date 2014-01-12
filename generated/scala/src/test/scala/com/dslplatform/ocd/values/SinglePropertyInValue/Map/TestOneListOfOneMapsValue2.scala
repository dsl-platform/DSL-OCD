package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneMapsValue2

class TestOneListOfOneMapsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneMapsValue2].member("oneListOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map>]
      , typeOf[OneListOfOneMapsValue2].member("oneListOfOneMaps": TermName).asMethod.returnType
      )
}
