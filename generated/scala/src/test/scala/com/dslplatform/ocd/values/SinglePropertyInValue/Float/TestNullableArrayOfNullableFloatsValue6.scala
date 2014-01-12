package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableFloatsValue6

class TestNullableArrayOfNullableFloatsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableFloatsValue6].member("nullableArrayOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float?[]?]
      , typeOf[NullableArrayOfNullableFloatsValue6].member("nullableArrayOfNullableFloats": TermName).asMethod.returnType
      )
}
