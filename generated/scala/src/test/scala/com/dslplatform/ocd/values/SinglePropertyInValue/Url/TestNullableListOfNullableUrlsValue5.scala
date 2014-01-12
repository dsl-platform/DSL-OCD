package com.dslplatform.ocd.values.SinglePropertyInValue.Url

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableUrlsValue5

class TestNullableListOfNullableUrlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableUrlsValue5].member("nullableListOfNullableUrls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Url?>?]
      , typeOf[NullableListOfNullableUrlsValue5].member("nullableListOfNullableUrls": TermName).asMethod.returnType
      )
}
