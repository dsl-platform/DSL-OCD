package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableStringsValue2

class TestNullableListOfNullableStringsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableStringsValue2].member("nullableListOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String?>?]
      , typeOf[NullableListOfNullableStringsValue2].member("nullableListOfNullableStrings": TermName).asMethod.returnType
      )
}
