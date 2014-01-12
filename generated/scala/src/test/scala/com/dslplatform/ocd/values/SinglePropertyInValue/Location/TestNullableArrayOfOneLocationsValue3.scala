package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneLocationsValue3

class TestNullableArrayOfOneLocationsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneLocationsValue3].member("nullableArrayOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location[]?]
      , typeOf[NullableArrayOfOneLocationsValue3].member("nullableArrayOfOneLocations": TermName).asMethod.returnType
      )
}
