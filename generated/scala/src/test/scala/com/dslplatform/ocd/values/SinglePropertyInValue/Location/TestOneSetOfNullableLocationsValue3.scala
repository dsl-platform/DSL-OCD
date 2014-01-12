package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableLocationsValue3

class TestOneSetOfNullableLocationsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableLocationsValue3].member("oneSetOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Location?>]
      , typeOf[OneSetOfNullableLocationsValue3].member("oneSetOfNullableLocations": TermName).asMethod.returnType
      )
}
