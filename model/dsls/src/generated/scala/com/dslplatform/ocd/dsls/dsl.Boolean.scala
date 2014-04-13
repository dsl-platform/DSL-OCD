package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslBoolean
    extends OcdDslBoxType
    with `type.Boolean`

case object `dsl.Boolean`          extends DslBoolean with `box.One`
case object `dsl.Boolean?`         extends DslBoolean with `box.Nullable`
case object `dsl.Array<Boolean>`   extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.Boolean[]`        extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.Array<Boolean>?`  extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.Boolean[]?`       extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.Array<Boolean?>`  extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.Boolean?[]`       extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.Array<Boolean?>?` extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.Boolean?[]?`      extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.List<Boolean>`    extends DslBoolean with `box.OneListOfOne`
case object `dsl.List<Boolean>?`   extends DslBoolean with `box.NullableListOfOne`
case object `dsl.List<Boolean?>`   extends DslBoolean with `box.OneListOfNullable`
case object `dsl.List<Boolean?>?`  extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.Set<Boolean>`     extends DslBoolean with `box.OneSetOfOne`
case object `dsl.Set<Boolean>?`    extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.Set<Boolean?>`    extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.Set<Boolean?>?`   extends DslBoolean with `box.NullableSetOfNullable`
