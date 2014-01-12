package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableStringsValue6

class TestOneArrayOfNullableStringsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableStringsValue6].member("oneArrayOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String?[]]
      , typeOf[OneArrayOfNullableStringsValue6].member("oneArrayOfNullableStrings": TermName).asMethod.returnType
      )
}
