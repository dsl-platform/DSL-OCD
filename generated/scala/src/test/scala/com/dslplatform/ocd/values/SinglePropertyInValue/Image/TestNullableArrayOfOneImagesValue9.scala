package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneImagesValue9

class TestNullableArrayOfOneImagesValue9
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneImagesValue9].member("nullableArrayOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image[]?]
      , typeOf[NullableArrayOfOneImagesValue9].member("nullableArrayOfOneImages": TermName).asMethod.returnType
      )
}
