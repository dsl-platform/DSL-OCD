package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneStringsValue5

class TestOneArrayOfOneStringsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneStringsValue5].member("oneArrayOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String[]]
      , typeOf[OneArrayOfOneStringsValue5].member("oneArrayOfOneStrings": TermName).asMethod.returnType
      )
}
