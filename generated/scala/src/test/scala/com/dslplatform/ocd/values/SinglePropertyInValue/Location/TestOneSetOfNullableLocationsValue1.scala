package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableLocationsValue1

class TestOneSetOfNullableLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableLocationsValue1].member("oneSetOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Location?>]
      , typeOf[OneSetOfNullableLocationsValue1].member("oneSetOfNullableLocations": TermName).asMethod.returnType
      )
}
