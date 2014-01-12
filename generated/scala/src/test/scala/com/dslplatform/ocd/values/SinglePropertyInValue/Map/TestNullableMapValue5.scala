package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableMapValue5

class TestNullableMapValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableMapValue5].member("nullableMap": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Map?]
      , typeOf[NullableMapValue5].member("nullableMap": TermName).asMethod.returnType
      )
}
