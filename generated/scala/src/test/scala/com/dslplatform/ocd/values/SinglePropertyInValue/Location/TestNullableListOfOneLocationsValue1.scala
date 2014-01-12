package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneLocationsValue1

class TestNullableListOfOneLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneLocationsValue1].member("nullableListOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Location>?]
      , typeOf[NullableListOfOneLocationsValue1].member("nullableListOfOneLocations": TermName).asMethod.returnType
      )
}
