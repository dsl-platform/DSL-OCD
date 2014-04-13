package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslRectangle
    extends OcdDslBoxType
    with `type.Rectangle`

case object `dsl.Rectangle`          extends DslRectangle with `box.One`
case object `dsl.Rectangle?`         extends DslRectangle with `box.Nullable`
case object `dsl.Array<Rectangle>`   extends DslRectangle with `box.OneArrayOfOne`
case object `dsl.Rectangle[]`        extends DslRectangle with `box.OneBracketsOfOne`
case object `dsl.Array<Rectangle>?`  extends DslRectangle with `box.NullableArrayOfOne`
case object `dsl.Rectangle[]?`       extends DslRectangle with `box.NullableBracketsOfOne`
case object `dsl.Array<Rectangle?>`  extends DslRectangle with `box.OneArrayOfNullable`
case object `dsl.Rectangle?[]`       extends DslRectangle with `box.OneBracketsOfNullable`
case object `dsl.Array<Rectangle?>?` extends DslRectangle with `box.NullableArrayOfNullable`
case object `dsl.Rectangle?[]?`      extends DslRectangle with `box.NullableBracketsOfNullable`
case object `dsl.List<Rectangle>`    extends DslRectangle with `box.OneListOfOne`
case object `dsl.List<Rectangle>?`   extends DslRectangle with `box.NullableListOfOne`
case object `dsl.List<Rectangle?>`   extends DslRectangle with `box.OneListOfNullable`
case object `dsl.List<Rectangle?>?`  extends DslRectangle with `box.NullableListOfNullable`
case object `dsl.Set<Rectangle>`     extends DslRectangle with `box.OneSetOfOne`
case object `dsl.Set<Rectangle>?`    extends DslRectangle with `box.NullableSetOfOne`
case object `dsl.Set<Rectangle?>`    extends DslRectangle with `box.OneSetOfNullable`
case object `dsl.Set<Rectangle?>?`   extends DslRectangle with `box.NullableSetOfNullable`
