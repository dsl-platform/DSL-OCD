package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfNullableXmlsValue2

class TestNullableArrayOfNullableXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfNullableXmlsValue2].member("nullableArrayOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?[]?]
      , typeOf[NullableArrayOfNullableXmlsValue2].member("nullableArrayOfNullableXmls": TermName).asMethod.returnType
      )
}
