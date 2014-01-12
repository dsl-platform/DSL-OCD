package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneIpsValue2

class TestOneSetOfOneIpsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneIpsValue2].member("oneSetOfOneIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Ip>]
      , typeOf[OneSetOfOneIpsValue2].member("oneSetOfOneIps": TermName).asMethod.returnType
      )
}
