package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableFloatsValue1

class TestOneListOfNullableFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableFloatsValue1].member("oneListOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float?>]
      , typeOf[OneListOfNullableFloatsValue1].member("oneListOfNullableFloats": TermName).asMethod.returnType
      )
}
