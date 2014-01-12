package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneStringsValue4

class TestOneArrayOfOneStringsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneStringsValue4].member("oneArrayOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String[]]
      , typeOf[OneArrayOfOneStringsValue4].member("oneArrayOfOneStrings": TermName).asMethod.returnType
      )
}
