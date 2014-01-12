package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableLocationsValue5

class TestNullableArrayOfNullableLocationsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableLocationsValue5].member("nullableArrayOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location?[]?]
      , typeOf[NullableArrayOfNullableLocationsValue5].member("nullableArrayOfNullableLocations": TermName).asMethod.returnType
      )
}
