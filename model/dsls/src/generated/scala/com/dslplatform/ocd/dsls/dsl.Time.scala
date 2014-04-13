package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslTime
    extends OcdDslBoxType
    with `type.Time`

case object `dsl.Time`          extends DslTime with `box.One`
case object `dsl.Time?`         extends DslTime with `box.Nullable`
case object `dsl.Array<Time>`   extends DslTime with `box.OneArrayOfOne`
case object `dsl.Time[]`        extends DslTime with `box.OneBracketsOfOne`
case object `dsl.Array<Time>?`  extends DslTime with `box.NullableArrayOfOne`
case object `dsl.Time[]?`       extends DslTime with `box.NullableBracketsOfOne`
case object `dsl.Array<Time?>`  extends DslTime with `box.OneArrayOfNullable`
case object `dsl.Time?[]`       extends DslTime with `box.OneBracketsOfNullable`
case object `dsl.Array<Time?>?` extends DslTime with `box.NullableArrayOfNullable`
case object `dsl.Time?[]?`      extends DslTime with `box.NullableBracketsOfNullable`
case object `dsl.List<Time>`    extends DslTime with `box.OneListOfOne`
case object `dsl.List<Time>?`   extends DslTime with `box.NullableListOfOne`
case object `dsl.List<Time?>`   extends DslTime with `box.OneListOfNullable`
case object `dsl.List<Time?>?`  extends DslTime with `box.NullableListOfNullable`
case object `dsl.Set<Time>`     extends DslTime with `box.OneSetOfOne`
case object `dsl.Set<Time>?`    extends DslTime with `box.NullableSetOfOne`
case object `dsl.Set<Time?>`    extends DslTime with `box.OneSetOfNullable`
case object `dsl.Set<Time?>?`   extends DslTime with `box.NullableSetOfNullable`
