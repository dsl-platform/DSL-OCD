package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableFloatsValue2

class TestOneArrayOfNullableFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableFloatsValue2].member("oneArrayOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Float?[]]
      , typeOf[OneArrayOfNullableFloatsValue2].member("oneArrayOfNullableFloats": TermName).asMethod.returnType
      )
}
