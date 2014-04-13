package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslBinary
    extends OcdDslBoxType
    with `type.Binary`

case object `dsl.Binary`          extends DslBinary with `box.One`
case object `dsl.Binary?`         extends DslBinary with `box.Nullable`
case object `dsl.Array<Binary>`   extends DslBinary with `box.OneArrayOfOne`
case object `dsl.Binary[]`        extends DslBinary with `box.OneBracketsOfOne`
case object `dsl.Array<Binary>?`  extends DslBinary with `box.NullableArrayOfOne`
case object `dsl.Binary[]?`       extends DslBinary with `box.NullableBracketsOfOne`
case object `dsl.Array<Binary?>`  extends DslBinary with `box.OneArrayOfNullable`
case object `dsl.Binary?[]`       extends DslBinary with `box.OneBracketsOfNullable`
case object `dsl.Array<Binary?>?` extends DslBinary with `box.NullableArrayOfNullable`
case object `dsl.Binary?[]?`      extends DslBinary with `box.NullableBracketsOfNullable`
case object `dsl.List<Binary>`    extends DslBinary with `box.OneListOfOne`
case object `dsl.List<Binary>?`   extends DslBinary with `box.NullableListOfOne`
case object `dsl.List<Binary?>`   extends DslBinary with `box.OneListOfNullable`
case object `dsl.List<Binary?>?`  extends DslBinary with `box.NullableListOfNullable`
case object `dsl.Set<Binary>`     extends DslBinary with `box.OneSetOfOne`
case object `dsl.Set<Binary>?`    extends DslBinary with `box.NullableSetOfOne`
case object `dsl.Set<Binary?>`    extends DslBinary with `box.OneSetOfNullable`
case object `dsl.Set<Binary?>?`   extends DslBinary with `box.NullableSetOfNullable`
