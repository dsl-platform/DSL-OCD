package com.dslplatform.ocd
package types

import box._

trait `box.OptLinkedListOpt`
    extends BoxNullableType
    with BoxLinkedListType
    with BoxElementsNullableType {

  def boxDesc = "OptLinkedListOpt"
}

object `box.OptLinkedListOpt` extends `box.OptLinkedListOpt`
