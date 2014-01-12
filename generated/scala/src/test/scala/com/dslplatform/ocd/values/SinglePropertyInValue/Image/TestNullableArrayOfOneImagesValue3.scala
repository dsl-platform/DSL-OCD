package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneImagesValue3

class TestNullableArrayOfOneImagesValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneImagesValue3].member("nullableArrayOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image[]?]
      , typeOf[NullableArrayOfOneImagesValue3].member("nullableArrayOfOneImages": TermName).asMethod.returnType
      )
}
