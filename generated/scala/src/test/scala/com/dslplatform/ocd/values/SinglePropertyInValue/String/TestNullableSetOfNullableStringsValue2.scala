package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableStringsValue2

class TestNullableSetOfNullableStringsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableStringsValue2].member("nullableSetOfNullableStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String?>?]
      , typeOf[NullableSetOfNullableStringsValue2].member("nullableSetOfNullableStrings": TermName).asMethod.returnType
      )
}
