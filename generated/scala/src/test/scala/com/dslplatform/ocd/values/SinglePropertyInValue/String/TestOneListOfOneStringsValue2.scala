package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneStringsValue2

class TestOneListOfOneStringsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneStringsValue2].member("oneListOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String>]
      , typeOf[OneListOfOneStringsValue2].member("oneListOfOneStrings": TermName).asMethod.returnType
      )
}
