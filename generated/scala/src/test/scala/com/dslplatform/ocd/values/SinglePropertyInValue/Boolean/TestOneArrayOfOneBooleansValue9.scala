package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneArrayOfOneBooleansValue9

class TestOneArrayOfOneBooleansValue9
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneArrayOfOneBooleansValue9].member("oneArrayOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Boolean[]]
      , typeOf[OneArrayOfOneBooleansValue9].member("oneArrayOfOneBooleans": TermName).asMethod.returnType
      )
}
