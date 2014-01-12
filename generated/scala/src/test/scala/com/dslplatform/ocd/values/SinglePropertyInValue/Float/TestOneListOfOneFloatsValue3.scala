package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneFloatsValue3

class TestOneListOfOneFloatsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneFloatsValue3].member("oneListOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float>]
      , typeOf[OneListOfOneFloatsValue3].member("oneListOfOneFloats": TermName).asMethod.returnType
      )
}
