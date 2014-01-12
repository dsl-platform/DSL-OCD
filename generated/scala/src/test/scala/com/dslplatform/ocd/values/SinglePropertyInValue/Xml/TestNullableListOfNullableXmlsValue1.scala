package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableXmlsValue1

class TestNullableListOfNullableXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableXmlsValue1].member("nullableListOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml?>?]
      , typeOf[NullableListOfNullableXmlsValue1].member("nullableListOfNullableXmls": TermName).asMethod.returnType
      )
}
