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

case object `dsl.BOOL`          extends DslBoolean with `box.One`
case object `dsl.BOOL?`         extends DslBoolean with `box.Nullable`
case object `dsl.ARRAY<BOOL>`   extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.BOOL[]`        extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.ARRAY<BOOL>?`  extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.BOOL[]?`       extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<BOOL?>`  extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.BOOL?[]`       extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<BOOL?>?` extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.BOOL?[]?`      extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.LIST<BOOL>`    extends DslBoolean with `box.OneListOfOne`
case object `dsl.LIST<BOOL>?`   extends DslBoolean with `box.NullableListOfOne`
case object `dsl.LIST<BOOL?>`   extends DslBoolean with `box.OneListOfNullable`
case object `dsl.LIST<BOOL?>?`  extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.SET<BOOL>`     extends DslBoolean with `box.OneSetOfOne`
case object `dsl.SET<BOOL>?`    extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.SET<BOOL?>`    extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.SET<BOOL?>?`   extends DslBoolean with `box.NullableSetOfNullable`

case object `dsl.BOOLEAN`          extends DslBoolean with `box.One`
case object `dsl.BOOLEAN?`         extends DslBoolean with `box.Nullable`
case object `dsl.ARRAY<BOOLEAN>`   extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.BOOLEAN[]`        extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.ARRAY<BOOLEAN>?`  extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.BOOLEAN[]?`       extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<BOOLEAN?>`  extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.BOOLEAN?[]`       extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<BOOLEAN?>?` extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.BOOLEAN?[]?`      extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.LIST<BOOLEAN>`    extends DslBoolean with `box.OneListOfOne`
case object `dsl.LIST<BOOLEAN>?`   extends DslBoolean with `box.NullableListOfOne`
case object `dsl.LIST<BOOLEAN?>`   extends DslBoolean with `box.OneListOfNullable`
case object `dsl.LIST<BOOLEAN?>?`  extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.SET<BOOLEAN>`     extends DslBoolean with `box.OneSetOfOne`
case object `dsl.SET<BOOLEAN>?`    extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.SET<BOOLEAN?>`    extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.SET<BOOLEAN?>?`   extends DslBoolean with `box.NullableSetOfNullable`

case object `dsl.Bool`          extends DslBoolean with `box.One`
case object `dsl.Bool?`         extends DslBoolean with `box.Nullable`
case object `dsl.Array<Bool>`   extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.Bool[]`        extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.Array<Bool>?`  extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.Bool[]?`       extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.Array<Bool?>`  extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.Bool?[]`       extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.Array<Bool?>?` extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.Bool?[]?`      extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.List<Bool>`    extends DslBoolean with `box.OneListOfOne`
case object `dsl.List<Bool>?`   extends DslBoolean with `box.NullableListOfOne`
case object `dsl.List<Bool?>`   extends DslBoolean with `box.OneListOfNullable`
case object `dsl.List<Bool?>?`  extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.Set<Bool>`     extends DslBoolean with `box.OneSetOfOne`
case object `dsl.Set<Bool>?`    extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.Set<Bool?>`    extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.Set<Bool?>?`   extends DslBoolean with `box.NullableSetOfNullable`

case object `dsl.bool`          extends DslBoolean with `box.One`
case object `dsl.bool?`         extends DslBoolean with `box.Nullable`
case object `dsl.array<bool>`   extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.bool[]`        extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.array<bool>?`  extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.bool[]?`       extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.array<bool?>`  extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.bool?[]`       extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.array<bool?>?` extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.bool?[]?`      extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.list<bool>`    extends DslBoolean with `box.OneListOfOne`
case object `dsl.list<bool>?`   extends DslBoolean with `box.NullableListOfOne`
case object `dsl.list<bool?>`   extends DslBoolean with `box.OneListOfNullable`
case object `dsl.list<bool?>?`  extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.set<bool>`     extends DslBoolean with `box.OneSetOfOne`
case object `dsl.set<bool>?`    extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.set<bool?>`    extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.set<bool?>?`   extends DslBoolean with `box.NullableSetOfNullable`

case object `dsl.boolean`          extends DslBoolean with `box.One`
case object `dsl.boolean?`         extends DslBoolean with `box.Nullable`
case object `dsl.array<boolean>`   extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.boolean[]`        extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.array<boolean>?`  extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.boolean[]?`       extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.array<boolean?>`  extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.boolean?[]`       extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.array<boolean?>?` extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.boolean?[]?`      extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.list<boolean>`    extends DslBoolean with `box.OneListOfOne`
case object `dsl.list<boolean>?`   extends DslBoolean with `box.NullableListOfOne`
case object `dsl.list<boolean?>`   extends DslBoolean with `box.OneListOfNullable`
case object `dsl.list<boolean?>?`  extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.set<boolean>`     extends DslBoolean with `box.OneSetOfOne`
case object `dsl.set<boolean>?`    extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.set<boolean?>`    extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.set<boolean?>?`   extends DslBoolean with `box.NullableSetOfNullable`
