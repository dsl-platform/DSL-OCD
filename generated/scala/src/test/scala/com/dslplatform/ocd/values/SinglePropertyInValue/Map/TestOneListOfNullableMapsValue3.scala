package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableMapsValue3

class TestOneListOfNullableMapsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableMapsValue3].member("oneListOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map?>]
      , typeOf[OneListOfNullableMapsValue3].member("oneListOfNullableMaps": TermName).asMethod.returnType
      )
}
