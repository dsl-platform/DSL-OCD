package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableXmlsValue5

class TestNullableArrayOfNullableXmlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableXmlsValue5].member("nullableArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]?]
      , typeOf[NullableArrayOfNullableXmlsValue5].member("nullableArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
