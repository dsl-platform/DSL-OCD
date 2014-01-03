package com.dslplatform.ocd
package types

import box._

trait `box.OptArrayOpt`
    extends BoxNullableType
    with BoxArrayType
    with BoxElementsNullableType {

  def boxDesc = "OptArrayOpt"
}

object `box.OptArrayOpt` extends `box.OptArrayOpt`
