package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneFloatsValue2

class TestOneListOfOneFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneFloatsValue2].member("oneListOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float>]
      , typeOf[OneListOfOneFloatsValue2].member("oneListOfOneFloats": TermName).asMethod.returnType
      )
}
