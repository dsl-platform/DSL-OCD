package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableXmlsValue6

class TestNullableArrayOfNullableXmlsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableXmlsValue6].member("nullableArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]?]
      , typeOf[NullableArrayOfNullableXmlsValue6].member("nullableArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
