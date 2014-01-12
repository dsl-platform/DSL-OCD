package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLocationsValue6

class TestNullableArrayOfOneLocationsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneLocationsValue6].member("nullableArrayOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location[]?]
      , typeOf[NullableArrayOfOneLocationsValue6].member("nullableArrayOfOneLocations": TermName).asMethod.returnType
      )
}
