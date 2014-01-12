package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBooleansValue8

class TestOneArrayOfOneBooleansValue8
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneBooleansValue8].member("oneArrayOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean[]]
      , typeOf[OneArrayOfOneBooleansValue8].member("oneArrayOfOneBooleans": TermName).asMethod.returnType
      )
}
