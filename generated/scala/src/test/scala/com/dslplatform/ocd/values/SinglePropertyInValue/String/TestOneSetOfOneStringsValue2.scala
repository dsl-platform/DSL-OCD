package com.dslplatform.ocd.values.SinglePropertyInValue.String

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneStringsValue2

class TestOneSetOfOneStringsValue2
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneStringsValue2].member("oneSetOfOneStrings": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<String>]
      , typeOf[OneSetOfOneStringsValue2].member("oneSetOfOneStrings": TermName).asMethod.returnType
      )
}
