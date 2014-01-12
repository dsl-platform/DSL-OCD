package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableImagesValue1

class TestOneListOfNullableImagesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableImagesValue1].member("oneListOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image?>]
      , typeOf[OneListOfNullableImagesValue1].member("oneListOfNullableImages": TermName).asMethod.returnType
      )
}
