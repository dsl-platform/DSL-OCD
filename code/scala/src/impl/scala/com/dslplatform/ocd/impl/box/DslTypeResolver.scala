package com.dslplatform.ocd
package impl.box

import types._
import impl.mapping._
import types.box._

object DslTypeResolver {
  def resolve(
      tipe: OcdTipe
    , box: BoxNullnessType with BoxOnenessType) = {
    tipe match {
      case `tipe.Bool` => DslBoolBoxes.boxes(box)
      case `tipe.Integer` => DslIntegerBoxes.boxes(box)
    }
  }
}
