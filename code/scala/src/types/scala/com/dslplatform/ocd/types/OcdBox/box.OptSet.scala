package com.dslplatform.ocd
package types

import box._

trait `box.OptSet`
    extends BoxNullableType
    with BoxSetType
    with BoxElementsNonNullableType {

  def boxDesc = "OptSet"
}
