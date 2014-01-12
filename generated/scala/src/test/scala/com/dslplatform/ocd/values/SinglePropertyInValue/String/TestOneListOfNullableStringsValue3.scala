package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableStringsValue3

class TestOneListOfNullableStringsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableStringsValue3].member("oneListOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String?>]
      , typeOf[OneListOfNullableStringsValue3].member("oneListOfNullableStrings": TermName).asMethod.returnType
      )
}
