package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslColor
    extends OcdDslBoxType
    with `type.Color`

case object `dsl.Color`          extends DslColor with `box.One`
case object `dsl.Color?`         extends DslColor with `box.Nullable`
case object `dsl.Array<Color>`   extends DslColor with `box.OneArrayOfOne`
case object `dsl.Color[]`        extends DslColor with `box.OneBracketsOfOne`
case object `dsl.Array<Color>?`  extends DslColor with `box.NullableArrayOfOne`
case object `dsl.Color[]?`       extends DslColor with `box.NullableBracketsOfOne`
case object `dsl.Array<Color?>`  extends DslColor with `box.OneArrayOfNullable`
case object `dsl.Color?[]`       extends DslColor with `box.OneBracketsOfNullable`
case object `dsl.Array<Color?>?` extends DslColor with `box.NullableArrayOfNullable`
case object `dsl.Color?[]?`      extends DslColor with `box.NullableBracketsOfNullable`
case object `dsl.List<Color>`    extends DslColor with `box.OneListOfOne`
case object `dsl.List<Color>?`   extends DslColor with `box.NullableListOfOne`
case object `dsl.List<Color?>`   extends DslColor with `box.OneListOfNullable`
case object `dsl.List<Color?>?`  extends DslColor with `box.NullableListOfNullable`
case object `dsl.Set<Color>`     extends DslColor with `box.OneSetOfOne`
case object `dsl.Set<Color>?`    extends DslColor with `box.NullableSetOfOne`
case object `dsl.Set<Color?>`    extends DslColor with `box.OneSetOfNullable`
case object `dsl.Set<Color?>?`   extends DslColor with `box.NullableSetOfNullable`
