package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableListOfOneIpsValue2

class TestNullableListOfOneIpsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableListOfOneIpsValue2].member("nullableListOfOneIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Ip>?]
      , typeOf[NullableListOfOneIpsValue2].member("nullableListOfOneIps": TermName).asMethod.returnType
      )
}
