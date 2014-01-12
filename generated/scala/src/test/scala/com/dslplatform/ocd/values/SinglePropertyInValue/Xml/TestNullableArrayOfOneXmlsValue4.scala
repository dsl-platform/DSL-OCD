package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableArrayOfOneXmlsValue4

class TestNullableArrayOfOneXmlsValue4
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableArrayOfOneXmlsValue4].member("nullableArrayOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml[]?]
      , typeOf[NullableArrayOfOneXmlsValue4].member("nullableArrayOfOneXmls": TermName).asMethod.returnType
      )
}
