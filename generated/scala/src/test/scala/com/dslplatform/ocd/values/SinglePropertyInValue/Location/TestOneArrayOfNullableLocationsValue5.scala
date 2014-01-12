package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLocationsValue5

class TestOneArrayOfNullableLocationsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableLocationsValue5].member("oneArrayOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location?[]]
      , typeOf[OneArrayOfNullableLocationsValue5].member("oneArrayOfNullableLocations": TermName).asMethod.returnType
      )
}
