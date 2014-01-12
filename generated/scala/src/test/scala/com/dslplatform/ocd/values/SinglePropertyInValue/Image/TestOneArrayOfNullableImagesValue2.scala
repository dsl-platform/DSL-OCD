package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfNullableImagesValue2

class TestOneArrayOfNullableImagesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfNullableImagesValue2].member("oneArrayOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image?[]]
      , typeOf[OneArrayOfNullableImagesValue2].member("oneArrayOfNullableImages": TermName).asMethod.returnType
      )
}
