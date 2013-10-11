package com.dslplatform.ocd
package types

import box._

trait `box.SetOpt`
    extends BoxNonNullableType
    with BoxSetType
    with BoxElementsNullableType {

  def boxDesc = "SetOpt"
}
