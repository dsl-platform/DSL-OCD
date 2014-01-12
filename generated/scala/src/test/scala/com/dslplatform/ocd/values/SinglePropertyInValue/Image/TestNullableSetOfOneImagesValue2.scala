package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneImagesValue2

class TestNullableSetOfOneImagesValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneImagesValue2].member("nullableSetOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image>?]
      , typeOf[NullableSetOfOneImagesValue2].member("nullableSetOfOneImages": TermName).asMethod.returnType
      )
}
