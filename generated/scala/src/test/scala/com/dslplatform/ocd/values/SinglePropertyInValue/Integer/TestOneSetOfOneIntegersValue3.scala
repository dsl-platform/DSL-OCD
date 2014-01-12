package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneIntegersValue3

class TestOneSetOfOneIntegersValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneIntegersValue3].member("oneSetOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer>]
      , typeOf[OneSetOfOneIntegersValue3].member("oneSetOfOneIntegers": TermName).asMethod.returnType
      )
}
