package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableFloatsValue2

class TestNullableArrayOfNullableFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableFloatsValue2].member("nullableArrayOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float?[]?]
      , typeOf[NullableArrayOfNullableFloatsValue2].member("nullableArrayOfNullableFloats": TermName).asMethod.returnType
      )
}
