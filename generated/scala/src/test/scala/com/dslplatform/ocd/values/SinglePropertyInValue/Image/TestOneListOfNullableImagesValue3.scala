package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableImagesValue3

class TestOneListOfNullableImagesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableImagesValue3].member("oneListOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image?>]
      , typeOf[OneListOfNullableImagesValue3].member("oneListOfNullableImages": TermName).asMethod.returnType
      )
}
