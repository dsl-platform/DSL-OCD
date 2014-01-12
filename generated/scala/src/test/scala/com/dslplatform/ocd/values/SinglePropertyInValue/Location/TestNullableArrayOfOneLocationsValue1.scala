package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLocationsValue1

class TestNullableArrayOfOneLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneLocationsValue1].member("nullableArrayOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location[]?]
      , typeOf[NullableArrayOfOneLocationsValue1].member("nullableArrayOfOneLocations": TermName).asMethod.returnType
      )
}
