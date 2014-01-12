package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneFloatsValue6

class TestNullableArrayOfOneFloatsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneFloatsValue6].member("nullableArrayOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float[]?]
      , typeOf[NullableArrayOfOneFloatsValue6].member("nullableArrayOfOneFloats": TermName).asMethod.returnType
      )
}
