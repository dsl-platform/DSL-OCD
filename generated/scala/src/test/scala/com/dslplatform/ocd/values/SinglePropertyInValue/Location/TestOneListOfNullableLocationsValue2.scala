package com.dslplatform.ocd.values.SinglePropertyInValue.Location

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableLocationsValue2

class TestOneListOfNullableLocationsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableLocationsValue2].member("oneListOfNullableLocations": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Location?>]
      , typeOf[OneListOfNullableLocationsValue2].member("oneListOfNullableLocations": TermName).asMethod.returnType
      )
}
