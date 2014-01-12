package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableFloatsValue2

class TestNullableListOfNullableFloatsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableFloatsValue2].member("nullableListOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float?>?]
      , typeOf[NullableListOfNullableFloatsValue2].member("nullableListOfNullableFloats": TermName).asMethod.returnType
      )
}
