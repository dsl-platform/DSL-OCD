package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableImagesValue10

class TestNullableArrayOfNullableImagesValue10
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableImagesValue10].member("nullableArrayOfNullableImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image?[]?]
      , typeOf[NullableArrayOfNullableImagesValue10].member("nullableArrayOfNullableImages": TermName).asMethod.returnType
      )
}
