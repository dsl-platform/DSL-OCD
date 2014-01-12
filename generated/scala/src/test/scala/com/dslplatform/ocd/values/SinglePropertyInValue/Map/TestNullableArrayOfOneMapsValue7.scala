package com.dslplatform.ocd.values.SinglePropertyInValue.Map

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneMapsValue7

class TestNullableArrayOfOneMapsValue7
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneMapsValue7].member("nullableArrayOfOneMaps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Map[]?]
      , typeOf[NullableArrayOfOneMapsValue7].member("nullableArrayOfOneMaps": TermName).asMethod.returnType
      )
}
