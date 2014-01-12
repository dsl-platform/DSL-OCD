package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBooleansValue6

class TestOneArrayOfOneBooleansValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneBooleansValue6].member("oneArrayOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean[]]
      , typeOf[OneArrayOfOneBooleansValue6].member("oneArrayOfOneBooleans": TermName).asMethod.returnType
      )
}
