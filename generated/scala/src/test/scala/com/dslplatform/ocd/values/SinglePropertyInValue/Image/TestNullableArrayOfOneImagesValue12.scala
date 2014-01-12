package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneImagesValue12

class TestNullableArrayOfOneImagesValue12
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneImagesValue12].member("nullableArrayOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image[]?]
      , typeOf[NullableArrayOfOneImagesValue12].member("nullableArrayOfOneImages": TermName).asMethod.returnType
      )
}
