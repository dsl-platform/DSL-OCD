package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslBool`
    extends OcdDsl
    with `type.Bool` {

  def dslName = toString.substring(4)
}

case object `dsl.Bool` extends `DslBool` with `box.One`
case object `dsl.Array<Bool>` extends `DslBool` with `box.OneArrayOfOne`
case object `dsl.Bool[]` extends `DslBool` with `box.OneBracketsOfOne`
case object `dsl.Array<Bool?>` extends `DslBool` with `box.OneArrayOfNullable`
case object `dsl.Bool?[]` extends `DslBool` with `box.OneBracketsOfNullable`
case object `dsl.List<Bool>` extends `DslBool` with `box.OneListOfOne`
case object `dsl.List<Bool?>` extends `DslBool` with `box.OneListOfNullable`
case object `dsl.Set<Bool>` extends `DslBool` with `box.OneSetOfOne`
case object `dsl.Set<Bool?>` extends `DslBool` with `box.OneSetOfNullable`
case object `dsl.Bool?` extends `DslBool` with `box.Nullable`
case object `dsl.Array<Bool>?` extends `DslBool` with `box.NullableArrayOfOne`
case object `dsl.Bool[]?` extends `DslBool` with `box.NullableBracketsOfOne`
case object `dsl.Array<Bool?>?` extends `DslBool` with `box.NullableArrayOfNullable`
case object `dsl.Bool?[]?` extends `DslBool` with `box.NullableBracketsOfNullable`
case object `dsl.List<Bool>?` extends `DslBool` with `box.NullableListOfOne`
case object `dsl.List<Bool?>?` extends `DslBool` with `box.NullableListOfNullable`
case object `dsl.Set<Bool>?` extends `DslBool` with `box.NullableSetOfOne`
case object `dsl.Set<Bool?>?` extends `DslBool` with `box.NullableSetOfNullable`

case object `dsl.BOOL` extends `DslBool` with `box.One`
case object `dsl.ARRAY<BOOL>` extends `DslBool` with `box.OneArrayOfOne`
case object `dsl.BOOL[]` extends `DslBool` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<BOOL?>` extends `DslBool` with `box.OneArrayOfNullable`
case object `dsl.BOOL?[]` extends `DslBool` with `box.OneBracketsOfNullable`
case object `dsl.LIST<BOOL>` extends `DslBool` with `box.OneListOfOne`
case object `dsl.LIST<BOOL?>` extends `DslBool` with `box.OneListOfNullable`
case object `dsl.SET<BOOL>` extends `DslBool` with `box.OneSetOfOne`
case object `dsl.SET<BOOL?>` extends `DslBool` with `box.OneSetOfNullable`
case object `dsl.BOOL?` extends `DslBool` with `box.Nullable`
case object `dsl.ARRAY<BOOL>?` extends `DslBool` with `box.NullableArrayOfOne`
case object `dsl.BOOL[]?` extends `DslBool` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<BOOL?>?` extends `DslBool` with `box.NullableArrayOfNullable`
case object `dsl.BOOL?[]?` extends `DslBool` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<BOOL>?` extends `DslBool` with `box.NullableListOfOne`
case object `dsl.LIST<BOOL?>?` extends `DslBool` with `box.NullableListOfNullable`
case object `dsl.SET<BOOL>?` extends `DslBool` with `box.NullableSetOfOne`
case object `dsl.SET<BOOL?>?` extends `DslBool` with `box.NullableSetOfNullable`

case object `dsl.BOOLEAN` extends `DslBool` with `box.One`
case object `dsl.ARRAY<BOOLEAN>` extends `DslBool` with `box.OneArrayOfOne`
case object `dsl.BOOLEAN[]` extends `DslBool` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<BOOLEAN?>` extends `DslBool` with `box.OneArrayOfNullable`
case object `dsl.BOOLEAN?[]` extends `DslBool` with `box.OneBracketsOfNullable`
case object `dsl.LIST<BOOLEAN>` extends `DslBool` with `box.OneListOfOne`
case object `dsl.LIST<BOOLEAN?>` extends `DslBool` with `box.OneListOfNullable`
case object `dsl.SET<BOOLEAN>` extends `DslBool` with `box.OneSetOfOne`
case object `dsl.SET<BOOLEAN?>` extends `DslBool` with `box.OneSetOfNullable`
case object `dsl.BOOLEAN?` extends `DslBool` with `box.Nullable`
case object `dsl.ARRAY<BOOLEAN>?` extends `DslBool` with `box.NullableArrayOfOne`
case object `dsl.BOOLEAN[]?` extends `DslBool` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<BOOLEAN?>?` extends `DslBool` with `box.NullableArrayOfNullable`
case object `dsl.BOOLEAN?[]?` extends `DslBool` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<BOOLEAN>?` extends `DslBool` with `box.NullableListOfOne`
case object `dsl.LIST<BOOLEAN?>?` extends `DslBool` with `box.NullableListOfNullable`
case object `dsl.SET<BOOLEAN>?` extends `DslBool` with `box.NullableSetOfOne`
case object `dsl.SET<BOOLEAN?>?` extends `DslBool` with `box.NullableSetOfNullable`

case object `dsl.Boolean` extends `DslBool` with `box.One`
case object `dsl.Array<Boolean>` extends `DslBool` with `box.OneArrayOfOne`
case object `dsl.Boolean[]` extends `DslBool` with `box.OneBracketsOfOne`
case object `dsl.Array<Boolean?>` extends `DslBool` with `box.OneArrayOfNullable`
case object `dsl.Boolean?[]` extends `DslBool` with `box.OneBracketsOfNullable`
case object `dsl.List<Boolean>` extends `DslBool` with `box.OneListOfOne`
case object `dsl.List<Boolean?>` extends `DslBool` with `box.OneListOfNullable`
case object `dsl.Set<Boolean>` extends `DslBool` with `box.OneSetOfOne`
case object `dsl.Set<Boolean?>` extends `DslBool` with `box.OneSetOfNullable`
case object `dsl.Boolean?` extends `DslBool` with `box.Nullable`
case object `dsl.Array<Boolean>?` extends `DslBool` with `box.NullableArrayOfOne`
case object `dsl.Boolean[]?` extends `DslBool` with `box.NullableBracketsOfOne`
case object `dsl.Array<Boolean?>?` extends `DslBool` with `box.NullableArrayOfNullable`
case object `dsl.Boolean?[]?` extends `DslBool` with `box.NullableBracketsOfNullable`
case object `dsl.List<Boolean>?` extends `DslBool` with `box.NullableListOfOne`
case object `dsl.List<Boolean?>?` extends `DslBool` with `box.NullableListOfNullable`
case object `dsl.Set<Boolean>?` extends `DslBool` with `box.NullableSetOfOne`
case object `dsl.Set<Boolean?>?` extends `DslBool` with `box.NullableSetOfNullable`

case object `dsl.bool` extends `DslBool` with `box.One`
case object `dsl.array<bool>` extends `DslBool` with `box.OneArrayOfOne`
case object `dsl.bool[]` extends `DslBool` with `box.OneBracketsOfOne`
case object `dsl.array<bool?>` extends `DslBool` with `box.OneArrayOfNullable`
case object `dsl.bool?[]` extends `DslBool` with `box.OneBracketsOfNullable`
case object `dsl.list<bool>` extends `DslBool` with `box.OneListOfOne`
case object `dsl.list<bool?>` extends `DslBool` with `box.OneListOfNullable`
case object `dsl.set<bool>` extends `DslBool` with `box.OneSetOfOne`
case object `dsl.set<bool?>` extends `DslBool` with `box.OneSetOfNullable`
case object `dsl.bool?` extends `DslBool` with `box.Nullable`
case object `dsl.array<bool>?` extends `DslBool` with `box.NullableArrayOfOne`
case object `dsl.bool[]?` extends `DslBool` with `box.NullableBracketsOfOne`
case object `dsl.array<bool?>?` extends `DslBool` with `box.NullableArrayOfNullable`
case object `dsl.bool?[]?` extends `DslBool` with `box.NullableBracketsOfNullable`
case object `dsl.list<bool>?` extends `DslBool` with `box.NullableListOfOne`
case object `dsl.list<bool?>?` extends `DslBool` with `box.NullableListOfNullable`
case object `dsl.set<bool>?` extends `DslBool` with `box.NullableSetOfOne`
case object `dsl.set<bool?>?` extends `DslBool` with `box.NullableSetOfNullable`

case object `dsl.boolean` extends `DslBool` with `box.One`
case object `dsl.array<boolean>` extends `DslBool` with `box.OneArrayOfOne`
case object `dsl.boolean[]` extends `DslBool` with `box.OneBracketsOfOne`
case object `dsl.array<boolean?>` extends `DslBool` with `box.OneArrayOfNullable`
case object `dsl.boolean?[]` extends `DslBool` with `box.OneBracketsOfNullable`
case object `dsl.list<boolean>` extends `DslBool` with `box.OneListOfOne`
case object `dsl.list<boolean?>` extends `DslBool` with `box.OneListOfNullable`
case object `dsl.set<boolean>` extends `DslBool` with `box.OneSetOfOne`
case object `dsl.set<boolean?>` extends `DslBool` with `box.OneSetOfNullable`
case object `dsl.boolean?` extends `DslBool` with `box.Nullable`
case object `dsl.array<boolean>?` extends `DslBool` with `box.NullableArrayOfOne`
case object `dsl.boolean[]?` extends `DslBool` with `box.NullableBracketsOfOne`
case object `dsl.array<boolean?>?` extends `DslBool` with `box.NullableArrayOfNullable`
case object `dsl.boolean?[]?` extends `DslBool` with `box.NullableBracketsOfNullable`
case object `dsl.list<boolean>?` extends `DslBool` with `box.NullableListOfOne`
case object `dsl.list<boolean?>?` extends `DslBool` with `box.NullableListOfNullable`
case object `dsl.set<boolean>?` extends `DslBool` with `box.NullableSetOfOne`
case object `dsl.set<boolean?>?` extends `DslBool` with `box.NullableSetOfNullable`
