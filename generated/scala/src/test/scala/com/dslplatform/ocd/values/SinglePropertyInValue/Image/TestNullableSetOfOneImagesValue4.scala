package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneImagesValue4

class TestNullableSetOfOneImagesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneImagesValue4].member("nullableSetOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image>?]
      , typeOf[NullableSetOfOneImagesValue4].member("nullableSetOfOneImages": TermName).asMethod.returnType
      )
}
