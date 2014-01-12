package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableStringsValue2

class TestOneListOfNullableStringsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableStringsValue2].member("oneListOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String?>]
      , typeOf[OneListOfNullableStringsValue2].member("oneListOfNullableStrings": TermName).asMethod.returnType
      )
}
