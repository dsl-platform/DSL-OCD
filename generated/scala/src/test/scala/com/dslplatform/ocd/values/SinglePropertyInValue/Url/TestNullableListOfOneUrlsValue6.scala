package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneUrlsValue6

class TestNullableListOfOneUrlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneUrlsValue6].member("nullableListOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Url>?]
      , typeOf[NullableListOfOneUrlsValue6].member("nullableListOfOneUrls": TermName).asMethod.returnType
      )
}
