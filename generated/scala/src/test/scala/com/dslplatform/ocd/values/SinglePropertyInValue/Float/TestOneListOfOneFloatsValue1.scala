package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneFloatsValue1

class TestOneListOfOneFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneFloatsValue1].member("oneListOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float>]
      , typeOf[OneListOfOneFloatsValue1].member("oneListOfOneFloats": TermName).asMethod.returnType
      )
}
