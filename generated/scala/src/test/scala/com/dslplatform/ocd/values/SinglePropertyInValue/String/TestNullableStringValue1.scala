package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableStringValue1

class TestNullableStringValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableStringValue1].member("nullableString": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.String?]
      , typeOf[NullableStringValue1].member("nullableString": TermName).asMethod.returnType
      )
}
