package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneXmlsValue5

class TestNullableArrayOfOneXmlsValue5
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneXmlsValue5].member("nullableArrayOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml[]?]
      , typeOf[NullableArrayOfOneXmlsValue5].member("nullableArrayOfOneXmls": TermName).asMethod.returnType
      )
}
