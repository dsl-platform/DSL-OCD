package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneIntegersValue5

class TestOneListOfOneIntegersValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneIntegersValue5].member("oneListOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Integer>]
      , typeOf[OneListOfOneIntegersValue5].member("oneListOfOneIntegers": TermName).asMethod.returnType
      )
}
