package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneUrlsValue10

class TestNullableArrayOfOneUrlsValue10
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneUrlsValue10].member("nullableArrayOfOneUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url[]?]
      , typeOf[NullableArrayOfOneUrlsValue10].member("nullableArrayOfOneUrls": TermName).asMethod.returnType
      )
}
