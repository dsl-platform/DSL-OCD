package com.dslplatform.ocd
package types

import box._

trait `box.OptListOpt`
    extends BoxNullableType
    with BoxListType
    with BoxElementsNullableType {

  def boxDesc = "OptListOpt"
}
