package com.dslplatform.ocd.values.SinglePropertyInValue.Date

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDateValue3

class TestOneDateValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneDateValue3].member("oneDate": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Date]
      , typeOf[OneDateValue3].member("oneDate": TermName).asMethod.returnType
      )
}
