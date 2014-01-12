package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneUrlsValue6

class TestOneSetOfOneUrlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneUrlsValue6].member("oneSetOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url>]
      , typeOf[OneSetOfOneUrlsValue6].member("oneSetOfOneUrls": TermName).asMethod.returnType
      )
}
