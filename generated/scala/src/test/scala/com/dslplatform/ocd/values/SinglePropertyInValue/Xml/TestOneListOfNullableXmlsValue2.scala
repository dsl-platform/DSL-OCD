package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableXmlsValue2

class TestOneListOfNullableXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableXmlsValue2].member("oneListOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Xml?>]
      , typeOf[OneListOfNullableXmlsValue2].member("oneListOfNullableXmls": TermName).asMethod.returnType
      )
}
