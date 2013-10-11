package com.dslplatform.ocd
package types

import box._

trait `box.OptList`
    extends BoxNullableType
    with BoxListType
    with BoxElementsNonNullableType {

  def boxDesc = "OptList"
}
