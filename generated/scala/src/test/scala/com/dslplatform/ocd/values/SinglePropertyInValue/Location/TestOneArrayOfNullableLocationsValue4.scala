package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLocationsValue4

class TestOneArrayOfNullableLocationsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableLocationsValue4].member("oneArrayOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location?[]]
      , typeOf[OneArrayOfNullableLocationsValue4].member("oneArrayOfNullableLocations": TermName).asMethod.returnType
      )
}
