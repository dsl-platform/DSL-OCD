package com.dslplatform.ocd.values.SinglePropertyInValue.Xml

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableXmlValue2

class TestNullableXmlValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableXmlValue2].member("nullableXml": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Xml?]
      , typeOf[NullableXmlValue2].member("nullableXml": TermName).asMethod.returnType
      )
}
