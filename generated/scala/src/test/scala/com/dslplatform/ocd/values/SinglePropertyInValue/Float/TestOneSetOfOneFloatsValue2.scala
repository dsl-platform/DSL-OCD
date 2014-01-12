package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneFloatsValue2

class TestOneSetOfOneFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneFloatsValue2].member("oneSetOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Float>]
      , typeOf[OneSetOfOneFloatsValue2].member("oneSetOfOneFloats": TermName).asMethod.returnType
      )
}
