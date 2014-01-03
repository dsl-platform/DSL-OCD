package com.dslplatform.ocd
package types

import box._

trait `box.List`
    extends BoxNonNullableType
    with BoxListType
    with BoxElementsNonNullableType {

  def boxDesc = "List"
}

object `box.List` extends `box.List`
