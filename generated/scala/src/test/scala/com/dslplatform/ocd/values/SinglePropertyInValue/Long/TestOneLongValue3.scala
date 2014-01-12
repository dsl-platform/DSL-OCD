package com.dslplatform.ocd.values.SinglePropertyInValue.Long

import com.dslplatform.ocd.values.SinglePropertyInValue.OneLongValue3

class TestOneLongValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneLongValue3].member("oneLong": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Long]
      , typeOf[OneLongValue3].member("oneLong": TermName).asMethod.returnType
      )
}
