package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneUrlsValue5

class TestOneSetOfOneUrlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneUrlsValue5].member("oneSetOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url>]
      , typeOf[OneSetOfOneUrlsValue5].member("oneSetOfOneUrls": TermName).asMethod.returnType
      )
}
