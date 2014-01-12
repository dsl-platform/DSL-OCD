package com.dslplatform.ocd.values.SinglePropertyInValue.Binary

import com.dslplatform.ocd.values.SinglePropertyInValue.NullableBinaryValue3

class TestNullableBinaryValue3
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[NullableBinaryValue3].member("nullableBinary": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Binary?]
      , typeOf[NullableBinaryValue3].member("nullableBinary": TermName).asMethod.returnType
      )
}
