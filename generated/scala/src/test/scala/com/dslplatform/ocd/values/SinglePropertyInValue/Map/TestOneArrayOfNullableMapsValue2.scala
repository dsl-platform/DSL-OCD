package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableMapsValue2

class TestOneArrayOfNullableMapsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableMapsValue2].member("oneArrayOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Map?[]]
      , typeOf[OneArrayOfNullableMapsValue2].member("oneArrayOfNullableMaps": TermName).asMethod.returnType
      )
}
