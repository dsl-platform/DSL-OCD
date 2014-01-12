package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableUrlsValue1

class TestNullableArrayOfNullableUrlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableUrlsValue1].member("nullableArrayOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Url?[]?]
      , typeOf[NullableArrayOfNullableUrlsValue1].member("nullableArrayOfNullableUrls": TermName).asMethod.returnType
      )
}
