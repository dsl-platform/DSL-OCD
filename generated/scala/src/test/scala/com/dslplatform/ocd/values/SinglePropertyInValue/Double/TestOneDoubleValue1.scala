package com.dslplatform.ocd.values.SinglePropertyInValue.Double

import com.dslplatform.ocd.values.SinglePropertyInValue.OneDoubleValue1

class TestOneDoubleValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneDoubleValue1].member("oneDouble": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Double]
      , typeOf[OneDoubleValue1].member("oneDouble": TermName).asMethod.returnType
      )
}
