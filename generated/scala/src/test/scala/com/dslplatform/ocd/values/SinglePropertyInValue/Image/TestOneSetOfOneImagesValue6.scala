package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneImagesValue6

class TestOneSetOfOneImagesValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneImagesValue6].member("oneSetOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Image>]
      , typeOf[OneSetOfOneImagesValue6].member("oneSetOfOneImages": TermName).asMethod.returnType
      )
}
