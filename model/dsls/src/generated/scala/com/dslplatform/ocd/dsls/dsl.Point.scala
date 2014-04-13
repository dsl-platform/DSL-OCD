package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslPoint
    extends OcdDslBoxType
    with `type.Point`

case object `dsl.Point`          extends DslPoint with `box.One`
case object `dsl.Point?`         extends DslPoint with `box.Nullable`
case object `dsl.Array<Point>`   extends DslPoint with `box.OneArrayOfOne`
case object `dsl.Point[]`        extends DslPoint with `box.OneBracketsOfOne`
case object `dsl.Array<Point>?`  extends DslPoint with `box.NullableArrayOfOne`
case object `dsl.Point[]?`       extends DslPoint with `box.NullableBracketsOfOne`
case object `dsl.Array<Point?>`  extends DslPoint with `box.OneArrayOfNullable`
case object `dsl.Point?[]`       extends DslPoint with `box.OneBracketsOfNullable`
case object `dsl.Array<Point?>?` extends DslPoint with `box.NullableArrayOfNullable`
case object `dsl.Point?[]?`      extends DslPoint with `box.NullableBracketsOfNullable`
case object `dsl.List<Point>`    extends DslPoint with `box.OneListOfOne`
case object `dsl.List<Point>?`   extends DslPoint with `box.NullableListOfOne`
case object `dsl.List<Point?>`   extends DslPoint with `box.OneListOfNullable`
case object `dsl.List<Point?>?`  extends DslPoint with `box.NullableListOfNullable`
case object `dsl.Set<Point>`     extends DslPoint with `box.OneSetOfOne`
case object `dsl.Set<Point>?`    extends DslPoint with `box.NullableSetOfOne`
case object `dsl.Set<Point?>`    extends DslPoint with `box.OneSetOfNullable`
case object `dsl.Set<Point?>?`   extends DslPoint with `box.NullableSetOfNullable`
