package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableLocationsValue1

class TestNullableListOfNullableLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableLocationsValue1].member("nullableListOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Location?>?]
      , typeOf[NullableListOfNullableLocationsValue1].member("nullableListOfNullableLocations": TermName).asMethod.returnType
      )
}
