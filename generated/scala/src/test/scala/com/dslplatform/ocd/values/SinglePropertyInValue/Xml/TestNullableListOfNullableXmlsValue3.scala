package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfNullableXmlsValue3

class TestNullableListOfNullableXmlsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfNullableXmlsValue3].member("nullableListOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml?>?]
      , typeOf[NullableListOfNullableXmlsValue3].member("nullableListOfNullableXmls": TermName).asMethod.returnType
      )
}
