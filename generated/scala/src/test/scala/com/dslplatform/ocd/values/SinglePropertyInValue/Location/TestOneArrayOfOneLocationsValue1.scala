package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneLocationsValue1

class TestOneArrayOfOneLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneLocationsValue1].member("oneArrayOfOneLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location[]]
      , typeOf[OneArrayOfOneLocationsValue1].member("oneArrayOfOneLocations": TermName).asMethod.returnType
      )
}
