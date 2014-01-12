package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneUrlsValue2

class TestOneArrayOfOneUrlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneUrlsValue2].member("oneArrayOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url[]]
      , typeOf[OneArrayOfOneUrlsValue2].member("oneArrayOfOneUrls": TermName).asMethod.returnType
      )
}
