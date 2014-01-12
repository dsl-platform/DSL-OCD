package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneUrlsValue9

class TestNullableArrayOfOneUrlsValue9
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneUrlsValue9].member("nullableArrayOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url[]?]
      , typeOf[NullableArrayOfOneUrlsValue9].member("nullableArrayOfOneUrls": TermName).asMethod.returnType
      )
}
