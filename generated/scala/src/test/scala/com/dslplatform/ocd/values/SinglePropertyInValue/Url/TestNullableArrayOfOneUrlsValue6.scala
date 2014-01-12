package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneUrlsValue6

class TestNullableArrayOfOneUrlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneUrlsValue6].member("nullableArrayOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url[]?]
      , typeOf[NullableArrayOfOneUrlsValue6].member("nullableArrayOfOneUrls": TermName).asMethod.returnType
      )
}
