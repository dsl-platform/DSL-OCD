package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableStringsValue3

class TestOneSetOfNullableStringsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableStringsValue3].member("oneSetOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String?>]
      , typeOf[OneSetOfNullableStringsValue3].member("oneSetOfNullableStrings": TermName).asMethod.returnType
      )
}
