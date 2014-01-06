package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslDecimal`
    extends OcdDsl
    with `type.Decimal`

case object `dsl.Decimal` extends `DslDecimal` with `box.One`
case object `dsl.Array<Decimal>` extends `DslDecimal` with `box.OneArrayOfOne`
case object `dsl.Decimal[]` extends `DslDecimal` with `box.OneBracketsOfOne`
case object `dsl.Array<Decimal?>` extends `DslDecimal` with `box.OneArrayOfNullable`
case object `dsl.Decimal?[]` extends `DslDecimal` with `box.OneBracketsOfNullable`
case object `dsl.List<Decimal>` extends `DslDecimal` with `box.OneListOfOne`
case object `dsl.List<Decimal?>` extends `DslDecimal` with `box.OneListOfNullable`
case object `dsl.Set<Decimal>` extends `DslDecimal` with `box.OneSetOfOne`
case object `dsl.Set<Decimal?>` extends `DslDecimal` with `box.OneSetOfNullable`
case object `dsl.Decimal?` extends `DslDecimal` with `box.Nullable`
case object `dsl.Array<Decimal>?` extends `DslDecimal` with `box.NullableArrayOfOne`
case object `dsl.Decimal[]?` extends `DslDecimal` with `box.NullableBracketsOfOne`
case object `dsl.Array<Decimal?>?` extends `DslDecimal` with `box.NullableArrayOfNullable`
case object `dsl.Decimal?[]?` extends `DslDecimal` with `box.NullableBracketsOfNullable`
case object `dsl.List<Decimal>?` extends `DslDecimal` with `box.NullableListOfOne`
case object `dsl.List<Decimal?>?` extends `DslDecimal` with `box.NullableListOfNullable`
case object `dsl.Set<Decimal>?` extends `DslDecimal` with `box.NullableSetOfOne`
case object `dsl.Set<Decimal?>?` extends `DslDecimal` with `box.NullableSetOfNullable`

case object `dsl.DECIMAL` extends `DslDecimal` with `box.One`
case object `dsl.ARRAY<DECIMAL>` extends `DslDecimal` with `box.OneArrayOfOne`
case object `dsl.DECIMAL[]` extends `DslDecimal` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<DECIMAL?>` extends `DslDecimal` with `box.OneArrayOfNullable`
case object `dsl.DECIMAL?[]` extends `DslDecimal` with `box.OneBracketsOfNullable`
case object `dsl.LIST<DECIMAL>` extends `DslDecimal` with `box.OneListOfOne`
case object `dsl.LIST<DECIMAL?>` extends `DslDecimal` with `box.OneListOfNullable`
case object `dsl.SET<DECIMAL>` extends `DslDecimal` with `box.OneSetOfOne`
case object `dsl.SET<DECIMAL?>` extends `DslDecimal` with `box.OneSetOfNullable`
case object `dsl.DECIMAL?` extends `DslDecimal` with `box.Nullable`
case object `dsl.ARRAY<DECIMAL>?` extends `DslDecimal` with `box.NullableArrayOfOne`
case object `dsl.DECIMAL[]?` extends `DslDecimal` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<DECIMAL?>?` extends `DslDecimal` with `box.NullableArrayOfNullable`
case object `dsl.DECIMAL?[]?` extends `DslDecimal` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<DECIMAL>?` extends `DslDecimal` with `box.NullableListOfOne`
case object `dsl.LIST<DECIMAL?>?` extends `DslDecimal` with `box.NullableListOfNullable`
case object `dsl.SET<DECIMAL>?` extends `DslDecimal` with `box.NullableSetOfOne`
case object `dsl.SET<DECIMAL?>?` extends `DslDecimal` with `box.NullableSetOfNullable`

case object `dsl.decimal` extends `DslDecimal` with `box.One`
case object `dsl.array<decimal>` extends `DslDecimal` with `box.OneArrayOfOne`
case object `dsl.decimal[]` extends `DslDecimal` with `box.OneBracketsOfOne`
case object `dsl.array<decimal?>` extends `DslDecimal` with `box.OneArrayOfNullable`
case object `dsl.decimal?[]` extends `DslDecimal` with `box.OneBracketsOfNullable`
case object `dsl.list<decimal>` extends `DslDecimal` with `box.OneListOfOne`
case object `dsl.list<decimal?>` extends `DslDecimal` with `box.OneListOfNullable`
case object `dsl.set<decimal>` extends `DslDecimal` with `box.OneSetOfOne`
case object `dsl.set<decimal?>` extends `DslDecimal` with `box.OneSetOfNullable`
case object `dsl.decimal?` extends `DslDecimal` with `box.Nullable`
case object `dsl.array<decimal>?` extends `DslDecimal` with `box.NullableArrayOfOne`
case object `dsl.decimal[]?` extends `DslDecimal` with `box.NullableBracketsOfOne`
case object `dsl.array<decimal?>?` extends `DslDecimal` with `box.NullableArrayOfNullable`
case object `dsl.decimal?[]?` extends `DslDecimal` with `box.NullableBracketsOfNullable`
case object `dsl.list<decimal>?` extends `DslDecimal` with `box.NullableListOfOne`
case object `dsl.list<decimal?>?` extends `DslDecimal` with `box.NullableListOfNullable`
case object `dsl.set<decimal>?` extends `DslDecimal` with `box.NullableSetOfOne`
case object `dsl.set<decimal?>?` extends `DslDecimal` with `box.NullableSetOfNullable`
