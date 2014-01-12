package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableImagesValue5

class TestOneArrayOfNullableImagesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableImagesValue5].member("oneArrayOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image?[]]
      , typeOf[OneArrayOfNullableImagesValue5].member("oneArrayOfNullableImages": TermName).asMethod.returnType
      )
}
