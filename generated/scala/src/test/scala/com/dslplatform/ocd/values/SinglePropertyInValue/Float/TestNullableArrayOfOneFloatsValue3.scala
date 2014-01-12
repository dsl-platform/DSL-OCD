package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneFloatsValue3

class TestNullableArrayOfOneFloatsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneFloatsValue3].member("nullableArrayOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float[]?]
      , typeOf[NullableArrayOfOneFloatsValue3].member("nullableArrayOfOneFloats": TermName).asMethod.returnType
      )
}
