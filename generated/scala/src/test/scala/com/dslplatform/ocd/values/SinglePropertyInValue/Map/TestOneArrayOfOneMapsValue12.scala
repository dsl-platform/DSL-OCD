package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneMapsValue12

class TestOneArrayOfOneMapsValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneMapsValue12].member("oneArrayOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Map[]]
      , typeOf[OneArrayOfOneMapsValue12].member("oneArrayOfOneMaps": TermName).asMethod.returnType
      )
}
