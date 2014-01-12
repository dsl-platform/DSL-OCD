package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneIpsValue3

class TestNullableSetOfOneIpsValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneIpsValue3].member("nullableSetOfOneIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Ip>?]
      , typeOf[NullableSetOfOneIpsValue3].member("nullableSetOfOneIps": TermName).asMethod.returnType
      )
}
