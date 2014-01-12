package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneIpsValue6

class TestOneArrayOfOneIpsValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneIpsValue6].member("oneArrayOfOneIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Ip[]]
      , typeOf[OneArrayOfOneIpsValue6].member("oneArrayOfOneIps": TermName).asMethod.returnType
      )
}
