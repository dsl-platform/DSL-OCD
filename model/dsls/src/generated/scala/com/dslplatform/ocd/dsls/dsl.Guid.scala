package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslGuid
    extends OcdDslBoxType
    with `type.Guid`

case object `dsl.Guid`          extends DslGuid with `box.One`
case object `dsl.Guid?`         extends DslGuid with `box.Nullable`
case object `dsl.Array<Guid>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.Guid[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.Array<Guid>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.Guid[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.Array<Guid?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.Guid?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.Array<Guid?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.Guid?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.List<Guid>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.List<Guid>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.List<Guid?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.List<Guid?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.Set<Guid>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.Set<Guid>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.Set<Guid?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.Set<Guid?>?`   extends DslGuid with `box.NullableSetOfNullable`
