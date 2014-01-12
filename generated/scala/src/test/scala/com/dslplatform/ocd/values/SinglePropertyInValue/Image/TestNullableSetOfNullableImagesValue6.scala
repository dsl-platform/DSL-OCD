package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfNullableImagesValue6

class TestNullableSetOfNullableImagesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfNullableImagesValue6].member("nullableSetOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image?>?]
      , typeOf[NullableSetOfNullableImagesValue6].member("nullableSetOfNullableImages": TermName).asMethod.returnType
      )
}
