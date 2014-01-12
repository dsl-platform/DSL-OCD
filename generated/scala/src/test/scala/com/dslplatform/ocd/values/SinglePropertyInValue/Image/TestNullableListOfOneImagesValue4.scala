package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneImagesValue4

class TestNullableListOfOneImagesValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneImagesValue4].member("nullableListOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image>?]
      , typeOf[NullableListOfOneImagesValue4].member("nullableListOfOneImages": TermName).asMethod.returnType
      )
}
