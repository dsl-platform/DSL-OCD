package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfNullableXmlsValue2

class TestOneSetOfNullableXmlsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfNullableXmlsValue2].member("oneSetOfNullableXmls": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Xml?>]
      , typeOf[OneSetOfNullableXmlsValue2].member("oneSetOfNullableXmls": TermName).asMethod.returnType
      )
}
