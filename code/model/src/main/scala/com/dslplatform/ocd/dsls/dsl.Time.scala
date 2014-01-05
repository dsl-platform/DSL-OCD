package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslTime`
    extends OcdDsl
    with `type.Time` {

  def dslName = toString.substring(4)
}

case object `dsl.Time` extends `DslTime` with `box.One`
case object `dsl.Array<Time>` extends `DslTime` with `box.OneArrayOfOne`
case object `dsl.Time[]` extends `DslTime` with `box.OneBracketsOfOne`
case object `dsl.Array<Time?>` extends `DslTime` with `box.OneArrayOfNullable`
case object `dsl.Time?[]` extends `DslTime` with `box.OneBracketsOfNullable`
case object `dsl.List<Time>` extends `DslTime` with `box.OneListOfOne`
case object `dsl.List<Time?>` extends `DslTime` with `box.OneListOfNullable`
case object `dsl.Set<Time>` extends `DslTime` with `box.OneSetOfOne`
case object `dsl.Set<Time?>` extends `DslTime` with `box.OneSetOfNullable`
case object `dsl.Time?` extends `DslTime` with `box.Nullable`
case object `dsl.Array<Time>?` extends `DslTime` with `box.NullableArrayOfOne`
case object `dsl.Time[]?` extends `DslTime` with `box.NullableBracketsOfOne`
case object `dsl.Array<Time?>?` extends `DslTime` with `box.NullableArrayOfNullable`
case object `dsl.Time?[]?` extends `DslTime` with `box.NullableBracketsOfNullable`
case object `dsl.List<Time>?` extends `DslTime` with `box.NullableListOfOne`
case object `dsl.List<Time?>?` extends `DslTime` with `box.NullableListOfNullable`
case object `dsl.Set<Time>?` extends `DslTime` with `box.NullableSetOfOne`
case object `dsl.Set<Time?>?` extends `DslTime` with `box.NullableSetOfNullable`

case object `dsl.TIME` extends `DslTime` with `box.One`
case object `dsl.ARRAY<TIME>` extends `DslTime` with `box.OneArrayOfOne`
case object `dsl.TIME[]` extends `DslTime` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<TIME?>` extends `DslTime` with `box.OneArrayOfNullable`
case object `dsl.TIME?[]` extends `DslTime` with `box.OneBracketsOfNullable`
case object `dsl.LIST<TIME>` extends `DslTime` with `box.OneListOfOne`
case object `dsl.LIST<TIME?>` extends `DslTime` with `box.OneListOfNullable`
case object `dsl.SET<TIME>` extends `DslTime` with `box.OneSetOfOne`
case object `dsl.SET<TIME?>` extends `DslTime` with `box.OneSetOfNullable`
case object `dsl.TIME?` extends `DslTime` with `box.Nullable`
case object `dsl.ARRAY<TIME>?` extends `DslTime` with `box.NullableArrayOfOne`
case object `dsl.TIME[]?` extends `DslTime` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<TIME?>?` extends `DslTime` with `box.NullableArrayOfNullable`
case object `dsl.TIME?[]?` extends `DslTime` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<TIME>?` extends `DslTime` with `box.NullableListOfOne`
case object `dsl.LIST<TIME?>?` extends `DslTime` with `box.NullableListOfNullable`
case object `dsl.SET<TIME>?` extends `DslTime` with `box.NullableSetOfOne`
case object `dsl.SET<TIME?>?` extends `DslTime` with `box.NullableSetOfNullable`

case object `dsl.time` extends `DslTime` with `box.One`
case object `dsl.array<time>` extends `DslTime` with `box.OneArrayOfOne`
case object `dsl.time[]` extends `DslTime` with `box.OneBracketsOfOne`
case object `dsl.array<time?>` extends `DslTime` with `box.OneArrayOfNullable`
case object `dsl.time?[]` extends `DslTime` with `box.OneBracketsOfNullable`
case object `dsl.list<time>` extends `DslTime` with `box.OneListOfOne`
case object `dsl.list<time?>` extends `DslTime` with `box.OneListOfNullable`
case object `dsl.set<time>` extends `DslTime` with `box.OneSetOfOne`
case object `dsl.set<time?>` extends `DslTime` with `box.OneSetOfNullable`
case object `dsl.time?` extends `DslTime` with `box.Nullable`
case object `dsl.array<time>?` extends `DslTime` with `box.NullableArrayOfOne`
case object `dsl.time[]?` extends `DslTime` with `box.NullableBracketsOfOne`
case object `dsl.array<time?>?` extends `DslTime` with `box.NullableArrayOfNullable`
case object `dsl.time?[]?` extends `DslTime` with `box.NullableBracketsOfNullable`
case object `dsl.list<time>?` extends `DslTime` with `box.NullableListOfOne`
case object `dsl.list<time?>?` extends `DslTime` with `box.NullableListOfNullable`
case object `dsl.set<time>?` extends `DslTime` with `box.NullableSetOfOne`
case object `dsl.set<time?>?` extends `DslTime` with `box.NullableSetOfNullable`
