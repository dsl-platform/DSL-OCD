package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableLocationsValue3

class TestOneArrayOfNullableLocationsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableLocationsValue3].member("oneArrayOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Location?[]]
      , typeOf[OneArrayOfNullableLocationsValue3].member("oneArrayOfNullableLocations": TermName).asMethod.returnType
      )
}
