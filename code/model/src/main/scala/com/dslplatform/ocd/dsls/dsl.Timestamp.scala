package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslTimestamp`
    extends OcdDsl
    with `type.Timestamp` {

  def dslName = toString.substring(4)
}

case object `dsl.Timestamp` extends `DslTimestamp` with `box.One`
case object `dsl.Array<Timestamp>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.Timestamp[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.Array<Timestamp?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.Timestamp?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.List<Timestamp>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.List<Timestamp?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.Set<Timestamp>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.Set<Timestamp?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.Timestamp?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.Array<Timestamp>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.Timestamp[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.Array<Timestamp?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.Timestamp?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.List<Timestamp>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.List<Timestamp?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.Set<Timestamp>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.Set<Timestamp?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`

case object `dsl.DATETIME` extends `DslTimestamp` with `box.One`
case object `dsl.ARRAY<DATETIME>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.DATETIME[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<DATETIME?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.DATETIME?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.LIST<DATETIME>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.LIST<DATETIME?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.SET<DATETIME>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.SET<DATETIME?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.DATETIME?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.ARRAY<DATETIME>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.DATETIME[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<DATETIME?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.DATETIME?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<DATETIME>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.LIST<DATETIME?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.SET<DATETIME>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.SET<DATETIME?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`

case object `dsl.DateTime` extends `DslTimestamp` with `box.One`
case object `dsl.Array<DateTime>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.DateTime[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.Array<DateTime?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.DateTime?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.List<DateTime>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.List<DateTime?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.Set<DateTime>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.Set<DateTime?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.DateTime?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.Array<DateTime>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.DateTime[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.Array<DateTime?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.DateTime?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.List<DateTime>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.List<DateTime?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.Set<DateTime>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.Set<DateTime?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`

case object `dsl.Datetime` extends `DslTimestamp` with `box.One`
case object `dsl.Array<Datetime>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.Datetime[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.Array<Datetime?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.Datetime?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.List<Datetime>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.List<Datetime?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.Set<Datetime>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.Set<Datetime?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.Datetime?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.Array<Datetime>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.Datetime[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.Array<Datetime?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.Datetime?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.List<Datetime>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.List<Datetime?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.Set<Datetime>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.Set<Datetime?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`

case object `dsl.TIMESTAMP` extends `DslTimestamp` with `box.One`
case object `dsl.ARRAY<TIMESTAMP>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.TIMESTAMP[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<TIMESTAMP?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.TIMESTAMP?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.LIST<TIMESTAMP>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.LIST<TIMESTAMP?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.SET<TIMESTAMP>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.SET<TIMESTAMP?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.TIMESTAMP?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.ARRAY<TIMESTAMP>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.TIMESTAMP[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<TIMESTAMP?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.TIMESTAMP?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<TIMESTAMP>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.LIST<TIMESTAMP?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.SET<TIMESTAMP>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.SET<TIMESTAMP?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`

case object `dsl.datetime` extends `DslTimestamp` with `box.One`
case object `dsl.array<datetime>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.datetime[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.array<datetime?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.datetime?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.list<datetime>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.list<datetime?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.set<datetime>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.set<datetime?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.datetime?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.array<datetime>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.datetime[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.array<datetime?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.datetime?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.list<datetime>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.list<datetime?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.set<datetime>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.set<datetime?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`

case object `dsl.timestamp` extends `DslTimestamp` with `box.One`
case object `dsl.array<timestamp>` extends `DslTimestamp` with `box.OneArrayOfOne`
case object `dsl.timestamp[]` extends `DslTimestamp` with `box.OneBracketsOfOne`
case object `dsl.array<timestamp?>` extends `DslTimestamp` with `box.OneArrayOfNullable`
case object `dsl.timestamp?[]` extends `DslTimestamp` with `box.OneBracketsOfNullable`
case object `dsl.list<timestamp>` extends `DslTimestamp` with `box.OneListOfOne`
case object `dsl.list<timestamp?>` extends `DslTimestamp` with `box.OneListOfNullable`
case object `dsl.set<timestamp>` extends `DslTimestamp` with `box.OneSetOfOne`
case object `dsl.set<timestamp?>` extends `DslTimestamp` with `box.OneSetOfNullable`
case object `dsl.timestamp?` extends `DslTimestamp` with `box.Nullable`
case object `dsl.array<timestamp>?` extends `DslTimestamp` with `box.NullableArrayOfOne`
case object `dsl.timestamp[]?` extends `DslTimestamp` with `box.NullableBracketsOfOne`
case object `dsl.array<timestamp?>?` extends `DslTimestamp` with `box.NullableArrayOfNullable`
case object `dsl.timestamp?[]?` extends `DslTimestamp` with `box.NullableBracketsOfNullable`
case object `dsl.list<timestamp>?` extends `DslTimestamp` with `box.NullableListOfOne`
case object `dsl.list<timestamp?>?` extends `DslTimestamp` with `box.NullableListOfNullable`
case object `dsl.set<timestamp>?` extends `DslTimestamp` with `box.NullableSetOfOne`
case object `dsl.set<timestamp?>?` extends `DslTimestamp` with `box.NullableSetOfNullable`
