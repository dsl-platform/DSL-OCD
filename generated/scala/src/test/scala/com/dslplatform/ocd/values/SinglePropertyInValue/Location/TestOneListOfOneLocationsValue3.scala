package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneLocationsValue3

class TestOneListOfOneLocationsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneLocationsValue3].member("oneListOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Location>]
      , typeOf[OneListOfOneLocationsValue3].member("oneListOfOneLocations": TermName).asMethod.returnType
      )
}
