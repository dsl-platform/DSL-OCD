package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneFloatsValue5

class TestNullableArrayOfOneFloatsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneFloatsValue5].member("nullableArrayOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float[]?]
      , typeOf[NullableArrayOfOneFloatsValue5].member("nullableArrayOfOneFloats": TermName).asMethod.returnType
      )
}
