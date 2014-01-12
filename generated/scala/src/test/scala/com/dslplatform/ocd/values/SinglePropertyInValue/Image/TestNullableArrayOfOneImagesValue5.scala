package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneImagesValue5

class TestNullableArrayOfOneImagesValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneImagesValue5].member("nullableArrayOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image[]?]
      , typeOf[NullableArrayOfOneImagesValue5].member("nullableArrayOfOneImages": TermName).asMethod.returnType
      )
}
