package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneIntegersValue4

class TestOneListOfOneIntegersValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneIntegersValue4].member("oneListOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Integer>]
      , typeOf[OneListOfOneIntegersValue4].member("oneListOfOneIntegers": TermName).asMethod.returnType
      )
}
