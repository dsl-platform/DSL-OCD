package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableImagesValue4

class TestNullableListOfNullableImagesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableImagesValue4].member("nullableListOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image?>?]
      , typeOf[NullableListOfNullableImagesValue4].member("nullableListOfNullableImages": TermName).asMethod.returnType
      )
}
