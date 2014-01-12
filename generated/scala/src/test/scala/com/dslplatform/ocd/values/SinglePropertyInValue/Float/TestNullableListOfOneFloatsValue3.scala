package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneFloatsValue3

class TestNullableListOfOneFloatsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneFloatsValue3].member("nullableListOfOneFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float>?]
      , typeOf[NullableListOfOneFloatsValue3].member("nullableListOfOneFloats": TermName).asMethod.returnType
      )
}
