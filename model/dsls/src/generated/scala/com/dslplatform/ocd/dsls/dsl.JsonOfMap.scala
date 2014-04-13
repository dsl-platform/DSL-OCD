package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslJsonOfMapKind
    extends OcdDslBoxType
    with `type.JsonOf<Map>`

case object `dsl.JsonOf<Map>`          extends DslJsonOfMapKind with `box.One`
case object `dsl.JsonOf<Map>?`         extends DslJsonOfMapKind with `box.Nullable`
case object `dsl.Array<JsonOf<Map>>`   extends DslJsonOfMapKind with `box.OneArrayOfOne`
case object `dsl.JsonOf<Map>[]`        extends DslJsonOfMapKind with `box.OneBracketsOfOne`
case object `dsl.Array<JsonOf<Map>>?`  extends DslJsonOfMapKind with `box.NullableArrayOfOne`
case object `dsl.JsonOf<Map>[]?`       extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
case object `dsl.Array<JsonOf<Map>?>`  extends DslJsonOfMapKind with `box.OneArrayOfNullable`
case object `dsl.JsonOf<Map>?[]`       extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
case object `dsl.Array<JsonOf<Map>?>?` extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
case object `dsl.JsonOf<Map>?[]?`      extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
case object `dsl.List<JsonOf<Map>>`    extends DslJsonOfMapKind with `box.OneListOfOne`
case object `dsl.List<JsonOf<Map>>?`   extends DslJsonOfMapKind with `box.NullableListOfOne`
case object `dsl.List<JsonOf<Map>?>`   extends DslJsonOfMapKind with `box.OneListOfNullable`
case object `dsl.List<JsonOf<Map>?>?`  extends DslJsonOfMapKind with `box.NullableListOfNullable`
case object `dsl.Set<JsonOf<Map>>`     extends DslJsonOfMapKind with `box.OneSetOfOne`
case object `dsl.Set<JsonOf<Map>>?`    extends DslJsonOfMapKind with `box.NullableSetOfOne`
case object `dsl.Set<JsonOf<Map>?>`    extends DslJsonOfMapKind with `box.OneSetOfNullable`
case object `dsl.Set<JsonOf<Map>?>?`   extends DslJsonOfMapKind with `box.NullableSetOfNullable`
