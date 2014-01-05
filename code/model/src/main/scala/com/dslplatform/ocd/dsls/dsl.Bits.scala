package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslBits`
    extends OcdDsl
    with `type.Bits` {

  def dslName = toString.substring(4)
}

case object `dsl.Bits` extends `DslBits` with `box.One`
case object `dsl.Array<Bits>` extends `DslBits` with `box.OneArrayOfOne`
case object `dsl.Bits[]` extends `DslBits` with `box.OneBracketsOfOne`
case object `dsl.Array<Bits?>` extends `DslBits` with `box.OneArrayOfNullable`
case object `dsl.Bits?[]` extends `DslBits` with `box.OneBracketsOfNullable`
case object `dsl.List<Bits>` extends `DslBits` with `box.OneListOfOne`
case object `dsl.List<Bits?>` extends `DslBits` with `box.OneListOfNullable`
case object `dsl.Set<Bits>` extends `DslBits` with `box.OneSetOfOne`
case object `dsl.Set<Bits?>` extends `DslBits` with `box.OneSetOfNullable`
case object `dsl.Bits?` extends `DslBits` with `box.Nullable`
case object `dsl.Array<Bits>?` extends `DslBits` with `box.NullableArrayOfOne`
case object `dsl.Bits[]?` extends `DslBits` with `box.NullableBracketsOfOne`
case object `dsl.Array<Bits?>?` extends `DslBits` with `box.NullableArrayOfNullable`
case object `dsl.Bits?[]?` extends `DslBits` with `box.NullableBracketsOfNullable`
case object `dsl.List<Bits>?` extends `DslBits` with `box.NullableListOfOne`
case object `dsl.List<Bits?>?` extends `DslBits` with `box.NullableListOfNullable`
case object `dsl.Set<Bits>?` extends `DslBits` with `box.NullableSetOfOne`
case object `dsl.Set<Bits?>?` extends `DslBits` with `box.NullableSetOfNullable`

case object `dsl.BITS` extends `DslBits` with `box.One`
case object `dsl.ARRAY<BITS>` extends `DslBits` with `box.OneArrayOfOne`
case object `dsl.BITS[]` extends `DslBits` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<BITS?>` extends `DslBits` with `box.OneArrayOfNullable`
case object `dsl.BITS?[]` extends `DslBits` with `box.OneBracketsOfNullable`
case object `dsl.LIST<BITS>` extends `DslBits` with `box.OneListOfOne`
case object `dsl.LIST<BITS?>` extends `DslBits` with `box.OneListOfNullable`
case object `dsl.SET<BITS>` extends `DslBits` with `box.OneSetOfOne`
case object `dsl.SET<BITS?>` extends `DslBits` with `box.OneSetOfNullable`
case object `dsl.BITS?` extends `DslBits` with `box.Nullable`
case object `dsl.ARRAY<BITS>?` extends `DslBits` with `box.NullableArrayOfOne`
case object `dsl.BITS[]?` extends `DslBits` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<BITS?>?` extends `DslBits` with `box.NullableArrayOfNullable`
case object `dsl.BITS?[]?` extends `DslBits` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<BITS>?` extends `DslBits` with `box.NullableListOfOne`
case object `dsl.LIST<BITS?>?` extends `DslBits` with `box.NullableListOfNullable`
case object `dsl.SET<BITS>?` extends `DslBits` with `box.NullableSetOfOne`
case object `dsl.SET<BITS?>?` extends `DslBits` with `box.NullableSetOfNullable`

case object `dsl.bits` extends `DslBits` with `box.One`
case object `dsl.array<bits>` extends `DslBits` with `box.OneArrayOfOne`
case object `dsl.bits[]` extends `DslBits` with `box.OneBracketsOfOne`
case object `dsl.array<bits?>` extends `DslBits` with `box.OneArrayOfNullable`
case object `dsl.bits?[]` extends `DslBits` with `box.OneBracketsOfNullable`
case object `dsl.list<bits>` extends `DslBits` with `box.OneListOfOne`
case object `dsl.list<bits?>` extends `DslBits` with `box.OneListOfNullable`
case object `dsl.set<bits>` extends `DslBits` with `box.OneSetOfOne`
case object `dsl.set<bits?>` extends `DslBits` with `box.OneSetOfNullable`
case object `dsl.bits?` extends `DslBits` with `box.Nullable`
case object `dsl.array<bits>?` extends `DslBits` with `box.NullableArrayOfOne`
case object `dsl.bits[]?` extends `DslBits` with `box.NullableBracketsOfOne`
case object `dsl.array<bits?>?` extends `DslBits` with `box.NullableArrayOfNullable`
case object `dsl.bits?[]?` extends `DslBits` with `box.NullableBracketsOfNullable`
case object `dsl.list<bits>?` extends `DslBits` with `box.NullableListOfOne`
case object `dsl.list<bits?>?` extends `DslBits` with `box.NullableListOfNullable`
case object `dsl.set<bits>?` extends `DslBits` with `box.NullableSetOfOne`
case object `dsl.set<bits?>?` extends `DslBits` with `box.NullableSetOfNullable`
