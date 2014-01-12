package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneLocationsValue1

class TestNullableSetOfOneLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneLocationsValue1].member("nullableSetOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Location>?]
      , typeOf[NullableSetOfOneLocationsValue1].member("nullableSetOfOneLocations": TermName).asMethod.returnType
      )
}
