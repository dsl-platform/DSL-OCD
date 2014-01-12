package com.dslplatform.ocd.values.SinglePropertyInValue.Integer

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneIntegersValue1

class TestOneListOfOneIntegersValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneIntegersValue1].member("oneListOfOneIntegers": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Integer>]
      , typeOf[OneListOfOneIntegersValue1].member("oneListOfOneIntegers": TermName).asMethod.returnType
      )
}
