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

case object `dsl.JSONOF<MAP>`          extends DslJsonOfMapKind with `box.One`
case object `dsl.JSONOF<MAP>?`         extends DslJsonOfMapKind with `box.Nullable`
case object `dsl.ARRAY<JSONOF<MAP>>`   extends DslJsonOfMapKind with `box.OneArrayOfOne`
case object `dsl.JSONOF<MAP>[]`        extends DslJsonOfMapKind with `box.OneBracketsOfOne`
case object `dsl.ARRAY<JSONOF<MAP>>?`  extends DslJsonOfMapKind with `box.NullableArrayOfOne`
case object `dsl.JSONOF<MAP>[]?`       extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<JSONOF<MAP>?>`  extends DslJsonOfMapKind with `box.OneArrayOfNullable`
case object `dsl.JSONOF<MAP>?[]`       extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<JSONOF<MAP>?>?` extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
case object `dsl.JSONOF<MAP>?[]?`      extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
case object `dsl.LIST<JSONOF<MAP>>`    extends DslJsonOfMapKind with `box.OneListOfOne`
case object `dsl.LIST<JSONOF<MAP>>?`   extends DslJsonOfMapKind with `box.NullableListOfOne`
case object `dsl.LIST<JSONOF<MAP>?>`   extends DslJsonOfMapKind with `box.OneListOfNullable`
case object `dsl.LIST<JSONOF<MAP>?>?`  extends DslJsonOfMapKind with `box.NullableListOfNullable`
case object `dsl.SET<JSONOF<MAP>>`     extends DslJsonOfMapKind with `box.OneSetOfOne`
case object `dsl.SET<JSONOF<MAP>>?`    extends DslJsonOfMapKind with `box.NullableSetOfOne`
case object `dsl.SET<JSONOF<MAP>?>`    extends DslJsonOfMapKind with `box.OneSetOfNullable`
case object `dsl.SET<JSONOF<MAP>?>?`   extends DslJsonOfMapKind with `box.NullableSetOfNullable`

case object `dsl.Jsonof<map>`          extends DslJsonOfMapKind with `box.One`
case object `dsl.Jsonof<map>?`         extends DslJsonOfMapKind with `box.Nullable`
case object `dsl.Array<Jsonof<map>>`   extends DslJsonOfMapKind with `box.OneArrayOfOne`
case object `dsl.Jsonof<map>[]`        extends DslJsonOfMapKind with `box.OneBracketsOfOne`
case object `dsl.Array<Jsonof<map>>?`  extends DslJsonOfMapKind with `box.NullableArrayOfOne`
case object `dsl.Jsonof<map>[]?`       extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
case object `dsl.Array<Jsonof<map>?>`  extends DslJsonOfMapKind with `box.OneArrayOfNullable`
case object `dsl.Jsonof<map>?[]`       extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
case object `dsl.Array<Jsonof<map>?>?` extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
case object `dsl.Jsonof<map>?[]?`      extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
case object `dsl.List<Jsonof<map>>`    extends DslJsonOfMapKind with `box.OneListOfOne`
case object `dsl.List<Jsonof<map>>?`   extends DslJsonOfMapKind with `box.NullableListOfOne`
case object `dsl.List<Jsonof<map>?>`   extends DslJsonOfMapKind with `box.OneListOfNullable`
case object `dsl.List<Jsonof<map>?>?`  extends DslJsonOfMapKind with `box.NullableListOfNullable`
case object `dsl.Set<Jsonof<map>>`     extends DslJsonOfMapKind with `box.OneSetOfOne`
case object `dsl.Set<Jsonof<map>>?`    extends DslJsonOfMapKind with `box.NullableSetOfOne`
case object `dsl.Set<Jsonof<map>?>`    extends DslJsonOfMapKind with `box.OneSetOfNullable`
case object `dsl.Set<Jsonof<map>?>?`   extends DslJsonOfMapKind with `box.NullableSetOfNullable`

case object `dsl.jsonof<map>`          extends DslJsonOfMapKind with `box.One`
case object `dsl.jsonof<map>?`         extends DslJsonOfMapKind with `box.Nullable`
case object `dsl.array<jsonof<map>>`   extends DslJsonOfMapKind with `box.OneArrayOfOne`
case object `dsl.jsonof<map>[]`        extends DslJsonOfMapKind with `box.OneBracketsOfOne`
case object `dsl.array<jsonof<map>>?`  extends DslJsonOfMapKind with `box.NullableArrayOfOne`
case object `dsl.jsonof<map>[]?`       extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
case object `dsl.array<jsonof<map>?>`  extends DslJsonOfMapKind with `box.OneArrayOfNullable`
case object `dsl.jsonof<map>?[]`       extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
case object `dsl.array<jsonof<map>?>?` extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
case object `dsl.jsonof<map>?[]?`      extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
case object `dsl.list<jsonof<map>>`    extends DslJsonOfMapKind with `box.OneListOfOne`
case object `dsl.list<jsonof<map>>?`   extends DslJsonOfMapKind with `box.NullableListOfOne`
case object `dsl.list<jsonof<map>?>`   extends DslJsonOfMapKind with `box.OneListOfNullable`
case object `dsl.list<jsonof<map>?>?`  extends DslJsonOfMapKind with `box.NullableListOfNullable`
case object `dsl.set<jsonof<map>>`     extends DslJsonOfMapKind with `box.OneSetOfOne`
case object `dsl.set<jsonof<map>>?`    extends DslJsonOfMapKind with `box.NullableSetOfOne`
case object `dsl.set<jsonof<map>?>`    extends DslJsonOfMapKind with `box.OneSetOfNullable`
case object `dsl.set<jsonof<map>?>?`   extends DslJsonOfMapKind with `box.NullableSetOfNullable`
