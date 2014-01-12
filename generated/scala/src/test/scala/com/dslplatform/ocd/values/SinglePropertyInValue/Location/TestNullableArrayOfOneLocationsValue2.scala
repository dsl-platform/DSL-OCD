package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLocationsValue2

class TestNullableArrayOfOneLocationsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneLocationsValue2].member("nullableArrayOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location[]?]
      , typeOf[NullableArrayOfOneLocationsValue2].member("nullableArrayOfOneLocations": TermName).asMethod.returnType
      )
}
