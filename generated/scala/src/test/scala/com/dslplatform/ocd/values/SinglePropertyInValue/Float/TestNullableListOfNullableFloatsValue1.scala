package com.dslplatform.ocd.values.SinglePropertyInValue.Float

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableFloatsValue1

class TestNullableListOfNullableFloatsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableFloatsValue1].member("nullableListOfNullableFloats": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Float?>?]
      , typeOf[NullableListOfNullableFloatsValue1].member("nullableListOfNullableFloats": TermName).asMethod.returnType
      )
}
