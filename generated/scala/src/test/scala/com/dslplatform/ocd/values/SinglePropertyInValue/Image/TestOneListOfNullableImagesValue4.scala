package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableImagesValue4

class TestOneListOfNullableImagesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableImagesValue4].member("oneListOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image?>]
      , typeOf[OneListOfNullableImagesValue4].member("oneListOfNullableImages": TermName).asMethod.returnType
      )
}
