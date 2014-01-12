package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneLocationsValue2

class TestNullableListOfOneLocationsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneLocationsValue2].member("nullableListOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Location>?]
      , typeOf[NullableListOfOneLocationsValue2].member("nullableListOfOneLocations": TermName).asMethod.returnType
      )
}
