package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneFloatsValue3

class TestOneArrayOfOneFloatsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneFloatsValue3].member("oneArrayOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float[]]
      , typeOf[OneArrayOfOneFloatsValue3].member("oneArrayOfOneFloats": TermName).asMethod.returnType
      )
}
