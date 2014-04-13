package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslJson
    extends OcdDslBoxType
    with `type.Json`

case object `dsl.Json`          extends DslJson with `box.One`
case object `dsl.Json?`         extends DslJson with `box.Nullable`
case object `dsl.Array<Json>`   extends DslJson with `box.OneArrayOfOne`
case object `dsl.Json[]`        extends DslJson with `box.OneBracketsOfOne`
case object `dsl.Array<Json>?`  extends DslJson with `box.NullableArrayOfOne`
case object `dsl.Json[]?`       extends DslJson with `box.NullableBracketsOfOne`
case object `dsl.Array<Json?>`  extends DslJson with `box.OneArrayOfNullable`
case object `dsl.Json?[]`       extends DslJson with `box.OneBracketsOfNullable`
case object `dsl.Array<Json?>?` extends DslJson with `box.NullableArrayOfNullable`
case object `dsl.Json?[]?`      extends DslJson with `box.NullableBracketsOfNullable`
case object `dsl.List<Json>`    extends DslJson with `box.OneListOfOne`
case object `dsl.List<Json>?`   extends DslJson with `box.NullableListOfOne`
case object `dsl.List<Json?>`   extends DslJson with `box.OneListOfNullable`
case object `dsl.List<Json?>?`  extends DslJson with `box.NullableListOfNullable`
case object `dsl.Set<Json>`     extends DslJson with `box.OneSetOfOne`
case object `dsl.Set<Json>?`    extends DslJson with `box.NullableSetOfOne`
case object `dsl.Set<Json?>`    extends DslJson with `box.OneSetOfNullable`
case object `dsl.Set<Json?>?`   extends DslJson with `box.NullableSetOfNullable`
