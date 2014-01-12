package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneStringsValue1

class TestNullableListOfOneStringsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneStringsValue1].member("nullableListOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<String>?]
      , typeOf[NullableListOfOneStringsValue1].member("nullableListOfOneStrings": TermName).asMethod.returnType
      )
}
