package com.dslplatform.ocd
package impl

import types._
import impl.mapping._
import types.box._

object DslTypeResolver {
  def resolve(
      tipe: OcdTipe
    , box: BoxNullnessType with BoxOnenessType) = {
    tipe match {
      case `tipe.Binary`  => DslBinaryBoxes.boxes(box)
      case `tipe.Bool`    => DslBoolBoxes.boxes(box)
      case `tipe.Integer` => DslIntBoxes.boxes(box)
      case `tipe.Long`    => DslLongBoxes.boxes(box)
      case `tipe.String`  => DslStringBoxes.boxes(box)
      case `tipe.Guid`    => DslUUIDBoxes.boxes(box)
    }
  }
}
