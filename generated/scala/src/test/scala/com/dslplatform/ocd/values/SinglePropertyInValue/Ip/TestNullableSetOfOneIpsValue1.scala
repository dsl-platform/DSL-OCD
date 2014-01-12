package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableSetOfOneIpsValue1

class TestNullableSetOfOneIpsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableSetOfOneIpsValue1].member("nullableSetOfOneIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Ip>?]
      , typeOf[NullableSetOfOneIpsValue1].member("nullableSetOfOneIps": TermName).asMethod.returnType
      )
}
