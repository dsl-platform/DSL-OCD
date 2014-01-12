package com.dslplatform.ocd.values.SinglePropertyInValue.Point

import com.dslplatform.ocd.values.SinglePropertyInValue.NullablePointValue1

class TestNullablePointValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullablePointValue1].member("nullablePoint": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Point?]
      , typeOf[NullablePointValue1].member("nullablePoint": TermName).asMethod.returnType
      )
}
