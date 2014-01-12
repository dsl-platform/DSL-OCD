package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneXmlsValue2

class TestNullableListOfOneXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneXmlsValue2].member("nullableListOfOneXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml>?]
      , typeOf[NullableListOfOneXmlsValue2].member("nullableListOfOneXmls": TermName).asMethod.returnType
      )
}
