package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableImagesValue3

class TestNullableSetOfNullableImagesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableImagesValue3].member("nullableSetOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image?>?]
      , typeOf[NullableSetOfNullableImagesValue3].member("nullableSetOfNullableImages": TermName).asMethod.returnType
      )
}
