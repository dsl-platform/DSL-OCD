package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneSetOfOneBooleansValue1

class TestOneSetOfOneBooleansValue1
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneSetOfOneBooleansValue1].member("oneSetOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.Set<Boolean>]
      , typeOf[OneSetOfOneBooleansValue1].member("oneSetOfOneBooleans": TermName).asMethod.returnType
      )
}
