package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableImagesValue5

class TestNullableListOfNullableImagesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableImagesValue5].member("nullableListOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image?>?]
      , typeOf[NullableListOfNullableImagesValue5].member("nullableListOfNullableImages": TermName).asMethod.returnType
      )
}
