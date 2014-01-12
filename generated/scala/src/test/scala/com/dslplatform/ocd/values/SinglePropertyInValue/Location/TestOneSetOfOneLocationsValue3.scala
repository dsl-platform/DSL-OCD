package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneLocationsValue3

class TestOneSetOfOneLocationsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneLocationsValue3].member("oneSetOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Location>]
      , typeOf[OneSetOfOneLocationsValue3].member("oneSetOfOneLocations": TermName).asMethod.returnType
      )
}
