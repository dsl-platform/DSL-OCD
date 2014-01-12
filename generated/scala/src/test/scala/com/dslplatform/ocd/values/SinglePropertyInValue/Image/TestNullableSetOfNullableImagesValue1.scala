package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableImagesValue1

class TestNullableSetOfNullableImagesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableImagesValue1].member("nullableSetOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image?>?]
      , typeOf[NullableSetOfNullableImagesValue1].member("nullableSetOfNullableImages": TermName).asMethod.returnType
      )
}
