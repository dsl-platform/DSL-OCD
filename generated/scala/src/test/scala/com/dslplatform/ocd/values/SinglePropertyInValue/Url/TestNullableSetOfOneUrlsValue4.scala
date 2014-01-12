package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneUrlsValue4

class TestNullableSetOfOneUrlsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneUrlsValue4].member("nullableSetOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Url>?]
      , typeOf[NullableSetOfOneUrlsValue4].member("nullableSetOfOneUrls": TermName).asMethod.returnType
      )
}
