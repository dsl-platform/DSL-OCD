package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneFloatsValue1

class TestNullableListOfOneFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneFloatsValue1].member("nullableListOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float>?]
      , typeOf[NullableListOfOneFloatsValue1].member("nullableListOfOneFloats": TermName).asMethod.returnType
      )
}
