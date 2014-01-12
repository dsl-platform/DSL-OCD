package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneStringsValue1

class TestNullableSetOfOneStringsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneStringsValue1].member("nullableSetOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String>?]
      , typeOf[NullableSetOfOneStringsValue1].member("nullableSetOfOneStrings": TermName).asMethod.returnType
      )
}
