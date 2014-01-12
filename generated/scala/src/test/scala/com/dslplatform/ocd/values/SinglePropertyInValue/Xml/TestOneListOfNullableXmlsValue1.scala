package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableXmlsValue1

class TestOneListOfNullableXmlsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableXmlsValue1].member("oneListOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml?>]
      , typeOf[OneListOfNullableXmlsValue1].member("oneListOfNullableXmls": TermName).asMethod.returnType
      )
}
