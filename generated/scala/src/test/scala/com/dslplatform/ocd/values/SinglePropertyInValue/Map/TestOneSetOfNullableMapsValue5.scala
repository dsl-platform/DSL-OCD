package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableMapsValue5

class TestOneSetOfNullableMapsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableMapsValue5].member("oneSetOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Map?>]
      , typeOf[OneSetOfNullableMapsValue5].member("oneSetOfNullableMaps": TermName).asMethod.returnType
      )
}
