package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableMapsValue5

class TestNullableArrayOfNullableMapsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableMapsValue5].member("nullableArrayOfNullableMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Map?[]?]
      , typeOf[NullableArrayOfNullableMapsValue5].member("nullableArrayOfNullableMaps": TermName).asMethod.returnType
      )
}
