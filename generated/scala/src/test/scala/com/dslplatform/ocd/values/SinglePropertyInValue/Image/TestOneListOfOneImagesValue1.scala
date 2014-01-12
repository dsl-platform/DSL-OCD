package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneImagesValue1

class TestOneListOfOneImagesValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneImagesValue1].member("oneListOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Image>]
      , typeOf[OneListOfOneImagesValue1].member("oneListOfOneImages": TermName).asMethod.returnType
      )
}
