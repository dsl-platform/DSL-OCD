package com.dslplatform.ocd.values.SinglePropertyInValue.Image

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneImagesValue9

class TestOneArrayOfOneImagesValue9
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneImagesValue9].member("oneArrayOfOneImages": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Image[]]
      , typeOf[OneArrayOfOneImagesValue9].member("oneArrayOfOneImages": TermName).asMethod.returnType
      )
}
