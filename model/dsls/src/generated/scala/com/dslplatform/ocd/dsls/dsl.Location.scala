package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslLocation
    extends OcdDslBoxType
    with `type.Location`

case object `dsl.Location`          extends DslLocation with `box.One`
case object `dsl.Location?`         extends DslLocation with `box.Nullable`
case object `dsl.Array<Location>`   extends DslLocation with `box.OneArrayOfOne`
case object `dsl.Location[]`        extends DslLocation with `box.OneBracketsOfOne`
case object `dsl.Array<Location>?`  extends DslLocation with `box.NullableArrayOfOne`
case object `dsl.Location[]?`       extends DslLocation with `box.NullableBracketsOfOne`
case object `dsl.Array<Location?>`  extends DslLocation with `box.OneArrayOfNullable`
case object `dsl.Location?[]`       extends DslLocation with `box.OneBracketsOfNullable`
case object `dsl.Array<Location?>?` extends DslLocation with `box.NullableArrayOfNullable`
case object `dsl.Location?[]?`      extends DslLocation with `box.NullableBracketsOfNullable`
case object `dsl.List<Location>`    extends DslLocation with `box.OneListOfOne`
case object `dsl.List<Location>?`   extends DslLocation with `box.NullableListOfOne`
case object `dsl.List<Location?>`   extends DslLocation with `box.OneListOfNullable`
case object `dsl.List<Location?>?`  extends DslLocation with `box.NullableListOfNullable`
case object `dsl.Set<Location>`     extends DslLocation with `box.OneSetOfOne`
case object `dsl.Set<Location>?`    extends DslLocation with `box.NullableSetOfOne`
case object `dsl.Set<Location?>`    extends DslLocation with `box.OneSetOfNullable`
case object `dsl.Set<Location?>?`   extends DslLocation with `box.NullableSetOfNullable`
