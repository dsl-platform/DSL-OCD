package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableImagesValue2

class TestOneSetOfNullableImagesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableImagesValue2].member("oneSetOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image?>]
      , typeOf[OneSetOfNullableImagesValue2].member("oneSetOfNullableImages": TermName).asMethod.returnType
      )
}
