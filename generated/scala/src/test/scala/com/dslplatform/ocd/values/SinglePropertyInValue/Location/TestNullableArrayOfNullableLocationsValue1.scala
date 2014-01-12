package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLocationsValue1

class TestNullableArrayOfNullableLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableLocationsValue1].member("nullableArrayOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location?[]?]
      , typeOf[NullableArrayOfNullableLocationsValue1].member("nullableArrayOfNullableLocations": TermName).asMethod.returnType
      )
}
