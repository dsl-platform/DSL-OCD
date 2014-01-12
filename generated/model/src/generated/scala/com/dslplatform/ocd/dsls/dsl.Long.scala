package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslLong
    extends OcdDsl
    with `type.Long`

case object `dsl.Long`          extends DslLong with `box.One`
case object `dsl.Array<Long>`   extends DslLong with `box.OneArrayOfOne`
case object `dsl.Long[]`        extends DslLong with `box.OneBracketsOfOne`
case object `dsl.Array<Long?>`  extends DslLong with `box.OneArrayOfNullable`
case object `dsl.Long?[]`       extends DslLong with `box.OneBracketsOfNullable`
case object `dsl.List<Long>`    extends DslLong with `box.OneListOfOne`
case object `dsl.List<Long?>`   extends DslLong with `box.OneListOfNullable`
case object `dsl.Set<Long>`     extends DslLong with `box.OneSetOfOne`
case object `dsl.Set<Long?>`    extends DslLong with `box.OneSetOfNullable`
case object `dsl.Long?`         extends DslLong with `box.Nullable`
case object `dsl.Array<Long>?`  extends DslLong with `box.NullableArrayOfOne`
case object `dsl.Long[]?`       extends DslLong with `box.NullableBracketsOfOne`
case object `dsl.Array<Long?>?` extends DslLong with `box.NullableArrayOfNullable`
case object `dsl.Long?[]?`      extends DslLong with `box.NullableBracketsOfNullable`
case object `dsl.List<Long>?`   extends DslLong with `box.NullableListOfOne`
case object `dsl.List<Long?>?`  extends DslLong with `box.NullableListOfNullable`
case object `dsl.Set<Long>?`    extends DslLong with `box.NullableSetOfOne`
case object `dsl.Set<Long?>?`   extends DslLong with `box.NullableSetOfNullable`

case object `dsl.LONG`          extends DslLong with `box.One`
case object `dsl.ARRAY<LONG>`   extends DslLong with `box.OneArrayOfOne`
case object `dsl.LONG[]`        extends DslLong with `box.OneBracketsOfOne`
case object `dsl.ARRAY<LONG?>`  extends DslLong with `box.OneArrayOfNullable`
case object `dsl.LONG?[]`       extends DslLong with `box.OneBracketsOfNullable`
case object `dsl.LIST<LONG>`    extends DslLong with `box.OneListOfOne`
case object `dsl.LIST<LONG?>`   extends DslLong with `box.OneListOfNullable`
case object `dsl.SET<LONG>`     extends DslLong with `box.OneSetOfOne`
case object `dsl.SET<LONG?>`    extends DslLong with `box.OneSetOfNullable`
case object `dsl.LONG?`         extends DslLong with `box.Nullable`
case object `dsl.ARRAY<LONG>?`  extends DslLong with `box.NullableArrayOfOne`
case object `dsl.LONG[]?`       extends DslLong with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<LONG?>?` extends DslLong with `box.NullableArrayOfNullable`
case object `dsl.LONG?[]?`      extends DslLong with `box.NullableBracketsOfNullable`
case object `dsl.LIST<LONG>?`   extends DslLong with `box.NullableListOfOne`
case object `dsl.LIST<LONG?>?`  extends DslLong with `box.NullableListOfNullable`
case object `dsl.SET<LONG>?`    extends DslLong with `box.NullableSetOfOne`
case object `dsl.SET<LONG?>?`   extends DslLong with `box.NullableSetOfNullable`

case object `dsl.long`          extends DslLong with `box.One`
case object `dsl.array<long>`   extends DslLong with `box.OneArrayOfOne`
case object `dsl.long[]`        extends DslLong with `box.OneBracketsOfOne`
case object `dsl.array<long?>`  extends DslLong with `box.OneArrayOfNullable`
case object `dsl.long?[]`       extends DslLong with `box.OneBracketsOfNullable`
case object `dsl.list<long>`    extends DslLong with `box.OneListOfOne`
case object `dsl.list<long?>`   extends DslLong with `box.OneListOfNullable`
case object `dsl.set<long>`     extends DslLong with `box.OneSetOfOne`
case object `dsl.set<long?>`    extends DslLong with `box.OneSetOfNullable`
case object `dsl.long?`         extends DslLong with `box.Nullable`
case object `dsl.array<long>?`  extends DslLong with `box.NullableArrayOfOne`
case object `dsl.long[]?`       extends DslLong with `box.NullableBracketsOfOne`
case object `dsl.array<long?>?` extends DslLong with `box.NullableArrayOfNullable`
case object `dsl.long?[]?`      extends DslLong with `box.NullableBracketsOfNullable`
case object `dsl.list<long>?`   extends DslLong with `box.NullableListOfOne`
case object `dsl.list<long?>?`  extends DslLong with `box.NullableListOfNullable`
case object `dsl.set<long>?`    extends DslLong with `box.NullableSetOfOne`
case object `dsl.set<long?>?`   extends DslLong with `box.NullableSetOfNullable`
