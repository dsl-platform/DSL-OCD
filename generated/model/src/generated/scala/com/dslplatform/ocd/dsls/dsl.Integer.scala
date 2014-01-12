package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslInteger
    extends OcdDsl
    with `type.Integer`

case object `dsl.Integer`          extends DslInteger with `box.One`
case object `dsl.Array<Integer>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.Integer[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.Array<Integer?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.Integer?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.List<Integer>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.List<Integer?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.Set<Integer>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.Set<Integer?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.Integer?`         extends DslInteger with `box.Nullable`
case object `dsl.Array<Integer>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.Integer[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.Array<Integer?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.Integer?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.List<Integer>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.List<Integer?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.Set<Integer>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.Set<Integer?>?`   extends DslInteger with `box.NullableSetOfNullable`

case object `dsl.INT`          extends DslInteger with `box.One`
case object `dsl.ARRAY<INT>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.INT[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.ARRAY<INT?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.INT?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.LIST<INT>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.LIST<INT?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.SET<INT>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.SET<INT?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.INT?`         extends DslInteger with `box.Nullable`
case object `dsl.ARRAY<INT>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.INT[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<INT?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.INT?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.LIST<INT>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.LIST<INT?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.SET<INT>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.SET<INT?>?`   extends DslInteger with `box.NullableSetOfNullable`

case object `dsl.INTEGER`          extends DslInteger with `box.One`
case object `dsl.ARRAY<INTEGER>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.INTEGER[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.ARRAY<INTEGER?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.INTEGER?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.LIST<INTEGER>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.LIST<INTEGER?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.SET<INTEGER>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.SET<INTEGER?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.INTEGER?`         extends DslInteger with `box.Nullable`
case object `dsl.ARRAY<INTEGER>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.INTEGER[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<INTEGER?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.INTEGER?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.LIST<INTEGER>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.LIST<INTEGER?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.SET<INTEGER>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.SET<INTEGER?>?`   extends DslInteger with `box.NullableSetOfNullable`

case object `dsl.Int`          extends DslInteger with `box.One`
case object `dsl.Array<Int>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.Int[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.Array<Int?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.Int?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.List<Int>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.List<Int?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.Set<Int>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.Set<Int?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.Int?`         extends DslInteger with `box.Nullable`
case object `dsl.Array<Int>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.Int[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.Array<Int?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.Int?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.List<Int>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.List<Int?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.Set<Int>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.Set<Int?>?`   extends DslInteger with `box.NullableSetOfNullable`

case object `dsl.int`          extends DslInteger with `box.One`
case object `dsl.array<int>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.int[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.array<int?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.int?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.list<int>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.list<int?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.set<int>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.set<int?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.int?`         extends DslInteger with `box.Nullable`
case object `dsl.array<int>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.int[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.array<int?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.int?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.list<int>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.list<int?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.set<int>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.set<int?>?`   extends DslInteger with `box.NullableSetOfNullable`

case object `dsl.integer`          extends DslInteger with `box.One`
case object `dsl.array<integer>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.integer[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.array<integer?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.integer?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.list<integer>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.list<integer?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.set<integer>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.set<integer?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.integer?`         extends DslInteger with `box.Nullable`
case object `dsl.array<integer>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.integer[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.array<integer?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.integer?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.list<integer>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.list<integer?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.set<integer>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.set<integer?>?`   extends DslInteger with `box.NullableSetOfNullable`
