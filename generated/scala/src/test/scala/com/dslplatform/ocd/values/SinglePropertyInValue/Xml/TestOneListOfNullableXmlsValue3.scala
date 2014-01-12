package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableXmlsValue3

class TestOneListOfNullableXmlsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableXmlsValue3].member("oneListOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml?>]
      , typeOf[OneListOfNullableXmlsValue3].member("oneListOfNullableXmls": TermName).asMethod.returnType
      )
}
