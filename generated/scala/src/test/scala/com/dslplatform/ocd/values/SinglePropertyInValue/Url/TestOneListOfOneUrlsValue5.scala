package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneUrlsValue5

class TestOneListOfOneUrlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneUrlsValue5].member("oneListOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Url>]
      , typeOf[OneListOfOneUrlsValue5].member("oneListOfOneUrls": TermName).asMethod.returnType
      )
}
