package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneFloatsValue2

class TestNullableListOfOneFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneFloatsValue2].member("nullableListOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float>?]
      , typeOf[NullableListOfOneFloatsValue2].member("nullableListOfOneFloats": TermName).asMethod.returnType
      )
}
