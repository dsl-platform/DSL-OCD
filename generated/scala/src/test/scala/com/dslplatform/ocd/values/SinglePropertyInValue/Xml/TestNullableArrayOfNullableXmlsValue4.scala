package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableXmlsValue4

class TestNullableArrayOfNullableXmlsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableXmlsValue4].member("nullableArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]?]
      , typeOf[NullableArrayOfNullableXmlsValue4].member("nullableArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
