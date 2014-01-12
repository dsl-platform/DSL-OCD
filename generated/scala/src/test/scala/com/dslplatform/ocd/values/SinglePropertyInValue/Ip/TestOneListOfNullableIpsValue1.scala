package com.dslplatform.ocd.values.SinglePropertyInValue.Ip

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfNullableIpsValue1

class TestOneListOfNullableIpsValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfNullableIpsValue1].member("oneListOfNullableIps": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Ip?>]
      , typeOf[OneListOfNullableIpsValue1].member("oneListOfNullableIps": TermName).asMethod.returnType
      )
}
