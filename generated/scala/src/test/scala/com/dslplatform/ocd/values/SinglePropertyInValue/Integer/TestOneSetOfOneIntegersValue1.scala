package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneIntegersValue1

class TestOneSetOfOneIntegersValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneIntegersValue1].member("oneSetOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Integer>]
      , typeOf[OneSetOfOneIntegersValue1].member("oneSetOfOneIntegers": TermName).asMethod.returnType
      )
}
