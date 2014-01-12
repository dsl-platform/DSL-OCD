package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableMapsValue6

class TestOneSetOfNullableMapsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableMapsValue6].member("oneSetOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Map?>]
      , typeOf[OneSetOfNullableMapsValue6].member("oneSetOfNullableMaps": TermName).asMethod.returnType
      )
}
