package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneMapsValue2

class TestOneArrayOfOneMapsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneMapsValue2].member("oneArrayOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Map[]]
      , typeOf[OneArrayOfOneMapsValue2].member("oneArrayOfOneMaps": TermName).asMethod.returnType
      )
}
