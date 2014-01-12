package com.dslplatform.ocd.values.SinglePropertyInValue.Boolean

import com.dslplatform.ocd.values.SinglePropertyInValue.OneListOfOneBooleansValue6

class TestOneListOfOneBooleansValue6
    extends SpecExtensions {

    /* Testing the property field public accesss via reflection (no instantiation) */
    def `Test property field access`() =
      assert(
        typeOf[OneListOfOneBooleansValue6].member("oneListOfOneBooleans": TermName).asMethod.isPublic
      )

    /* Testing the property field type via reflection (no instantiation) */
    def `Test property field type`() =
      checkType(
        typeOf[scala.List<Boolean>]
      , typeOf[OneListOfOneBooleansValue6].member("oneListOfOneBooleans": TermName).asMethod.returnType
      )
}
