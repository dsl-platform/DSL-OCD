package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneStringsValue1

class TestOneArrayOfOneStringsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneStringsValue1].member("oneArrayOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String[]]
      , typeOf[OneArrayOfOneStringsValue1].member("oneArrayOfOneStrings": TermName).asMethod.returnType
      )
}
