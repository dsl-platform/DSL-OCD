package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableFloatsValue2

class TestOneListOfNullableFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableFloatsValue2].member("oneListOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float?>]
      , typeOf[OneListOfNullableFloatsValue2].member("oneListOfNullableFloats": TermName).asMethod.returnType
      )
}
