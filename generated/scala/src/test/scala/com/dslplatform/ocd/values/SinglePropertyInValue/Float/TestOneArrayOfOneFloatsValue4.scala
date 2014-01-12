package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneFloatsValue4

class TestOneArrayOfOneFloatsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneFloatsValue4].member("oneArrayOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float[]]
      , typeOf[OneArrayOfOneFloatsValue4].member("oneArrayOfOneFloats": TermName).asMethod.returnType
      )
}
