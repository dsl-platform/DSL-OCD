package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableMapsValue4

class TestOneListOfNullableMapsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableMapsValue4].member("oneListOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Map?>]
      , typeOf[OneListOfNullableMapsValue4].member("oneListOfNullableMaps": TermName).asMethod.returnType
      )
}
