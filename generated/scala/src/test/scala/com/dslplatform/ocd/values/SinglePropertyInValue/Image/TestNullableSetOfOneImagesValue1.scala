package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneImagesValue1

class TestNullableSetOfOneImagesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneImagesValue1].member("nullableSetOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image>?]
      , typeOf[NullableSetOfOneImagesValue1].member("nullableSetOfOneImages": TermName).asMethod.returnType
      )
}
