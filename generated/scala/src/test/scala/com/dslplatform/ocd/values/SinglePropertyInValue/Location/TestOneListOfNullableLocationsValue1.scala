package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableLocationsValue1

class TestOneListOfNullableLocationsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableLocationsValue1].member("oneListOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Location?>]
      , typeOf[OneListOfNullableLocationsValue1].member("oneListOfNullableLocations": TermName).asMethod.returnType
      )
}
