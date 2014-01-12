package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneLocationsValue2

class TestNullableSetOfOneLocationsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneLocationsValue2].member("nullableSetOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Location>?]
      , typeOf[NullableSetOfOneLocationsValue2].member("nullableSetOfOneLocations": TermName).asMethod.returnType
      )
}
