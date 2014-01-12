package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLocationsValue2

class TestNullableArrayOfNullableLocationsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableLocationsValue2].member("nullableArrayOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location?[]?]
      , typeOf[NullableArrayOfNullableLocationsValue2].member("nullableArrayOfNullableLocations": TermName).asMethod.returnType
      )
}
