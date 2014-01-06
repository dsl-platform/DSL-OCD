package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslRectangle`
    extends OcdDsl
    with `type.Rectangle`

case object `dsl.Rectangle` extends `DslRectangle` with `box.One`
case object `dsl.Array<Rectangle>` extends `DslRectangle` with `box.OneArrayOfOne`
case object `dsl.Rectangle[]` extends `DslRectangle` with `box.OneBracketsOfOne`
case object `dsl.Array<Rectangle?>` extends `DslRectangle` with `box.OneArrayOfNullable`
case object `dsl.Rectangle?[]` extends `DslRectangle` with `box.OneBracketsOfNullable`
case object `dsl.List<Rectangle>` extends `DslRectangle` with `box.OneListOfOne`
case object `dsl.List<Rectangle?>` extends `DslRectangle` with `box.OneListOfNullable`
case object `dsl.Set<Rectangle>` extends `DslRectangle` with `box.OneSetOfOne`
case object `dsl.Set<Rectangle?>` extends `DslRectangle` with `box.OneSetOfNullable`
case object `dsl.Rectangle?` extends `DslRectangle` with `box.Nullable`
case object `dsl.Array<Rectangle>?` extends `DslRectangle` with `box.NullableArrayOfOne`
case object `dsl.Rectangle[]?` extends `DslRectangle` with `box.NullableBracketsOfOne`
case object `dsl.Array<Rectangle?>?` extends `DslRectangle` with `box.NullableArrayOfNullable`
case object `dsl.Rectangle?[]?` extends `DslRectangle` with `box.NullableBracketsOfNullable`
case object `dsl.List<Rectangle>?` extends `DslRectangle` with `box.NullableListOfOne`
case object `dsl.List<Rectangle?>?` extends `DslRectangle` with `box.NullableListOfNullable`
case object `dsl.Set<Rectangle>?` extends `DslRectangle` with `box.NullableSetOfOne`
case object `dsl.Set<Rectangle?>?` extends `DslRectangle` with `box.NullableSetOfNullable`

case object `dsl.BOX` extends `DslRectangle` with `box.One`
case object `dsl.ARRAY<BOX>` extends `DslRectangle` with `box.OneArrayOfOne`
case object `dsl.BOX[]` extends `DslRectangle` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<BOX?>` extends `DslRectangle` with `box.OneArrayOfNullable`
case object `dsl.BOX?[]` extends `DslRectangle` with `box.OneBracketsOfNullable`
case object `dsl.LIST<BOX>` extends `DslRectangle` with `box.OneListOfOne`
case object `dsl.LIST<BOX?>` extends `DslRectangle` with `box.OneListOfNullable`
case object `dsl.SET<BOX>` extends `DslRectangle` with `box.OneSetOfOne`
case object `dsl.SET<BOX?>` extends `DslRectangle` with `box.OneSetOfNullable`
case object `dsl.BOX?` extends `DslRectangle` with `box.Nullable`
case object `dsl.ARRAY<BOX>?` extends `DslRectangle` with `box.NullableArrayOfOne`
case object `dsl.BOX[]?` extends `DslRectangle` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<BOX?>?` extends `DslRectangle` with `box.NullableArrayOfNullable`
case object `dsl.BOX?[]?` extends `DslRectangle` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<BOX>?` extends `DslRectangle` with `box.NullableListOfOne`
case object `dsl.LIST<BOX?>?` extends `DslRectangle` with `box.NullableListOfNullable`
case object `dsl.SET<BOX>?` extends `DslRectangle` with `box.NullableSetOfOne`
case object `dsl.SET<BOX?>?` extends `DslRectangle` with `box.NullableSetOfNullable`

case object `dsl.Box` extends `DslRectangle` with `box.One`
case object `dsl.Array<Box>` extends `DslRectangle` with `box.OneArrayOfOne`
case object `dsl.Box[]` extends `DslRectangle` with `box.OneBracketsOfOne`
case object `dsl.Array<Box?>` extends `DslRectangle` with `box.OneArrayOfNullable`
case object `dsl.Box?[]` extends `DslRectangle` with `box.OneBracketsOfNullable`
case object `dsl.List<Box>` extends `DslRectangle` with `box.OneListOfOne`
case object `dsl.List<Box?>` extends `DslRectangle` with `box.OneListOfNullable`
case object `dsl.Set<Box>` extends `DslRectangle` with `box.OneSetOfOne`
case object `dsl.Set<Box?>` extends `DslRectangle` with `box.OneSetOfNullable`
case object `dsl.Box?` extends `DslRectangle` with `box.Nullable`
case object `dsl.Array<Box>?` extends `DslRectangle` with `box.NullableArrayOfOne`
case object `dsl.Box[]?` extends `DslRectangle` with `box.NullableBracketsOfOne`
case object `dsl.Array<Box?>?` extends `DslRectangle` with `box.NullableArrayOfNullable`
case object `dsl.Box?[]?` extends `DslRectangle` with `box.NullableBracketsOfNullable`
case object `dsl.List<Box>?` extends `DslRectangle` with `box.NullableListOfOne`
case object `dsl.List<Box?>?` extends `DslRectangle` with `box.NullableListOfNullable`
case object `dsl.Set<Box>?` extends `DslRectangle` with `box.NullableSetOfOne`
case object `dsl.Set<Box?>?` extends `DslRectangle` with `box.NullableSetOfNullable`

case object `dsl.RECTANGLE` extends `DslRectangle` with `box.One`
case object `dsl.ARRAY<RECTANGLE>` extends `DslRectangle` with `box.OneArrayOfOne`
case object `dsl.RECTANGLE[]` extends `DslRectangle` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<RECTANGLE?>` extends `DslRectangle` with `box.OneArrayOfNullable`
case object `dsl.RECTANGLE?[]` extends `DslRectangle` with `box.OneBracketsOfNullable`
case object `dsl.LIST<RECTANGLE>` extends `DslRectangle` with `box.OneListOfOne`
case object `dsl.LIST<RECTANGLE?>` extends `DslRectangle` with `box.OneListOfNullable`
case object `dsl.SET<RECTANGLE>` extends `DslRectangle` with `box.OneSetOfOne`
case object `dsl.SET<RECTANGLE?>` extends `DslRectangle` with `box.OneSetOfNullable`
case object `dsl.RECTANGLE?` extends `DslRectangle` with `box.Nullable`
case object `dsl.ARRAY<RECTANGLE>?` extends `DslRectangle` with `box.NullableArrayOfOne`
case object `dsl.RECTANGLE[]?` extends `DslRectangle` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<RECTANGLE?>?` extends `DslRectangle` with `box.NullableArrayOfNullable`
case object `dsl.RECTANGLE?[]?` extends `DslRectangle` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<RECTANGLE>?` extends `DslRectangle` with `box.NullableListOfOne`
case object `dsl.LIST<RECTANGLE?>?` extends `DslRectangle` with `box.NullableListOfNullable`
case object `dsl.SET<RECTANGLE>?` extends `DslRectangle` with `box.NullableSetOfOne`
case object `dsl.SET<RECTANGLE?>?` extends `DslRectangle` with `box.NullableSetOfNullable`

case object `dsl.box` extends `DslRectangle` with `box.One`
case object `dsl.array<box>` extends `DslRectangle` with `box.OneArrayOfOne`
case object `dsl.box[]` extends `DslRectangle` with `box.OneBracketsOfOne`
case object `dsl.array<box?>` extends `DslRectangle` with `box.OneArrayOfNullable`
case object `dsl.box?[]` extends `DslRectangle` with `box.OneBracketsOfNullable`
case object `dsl.list<box>` extends `DslRectangle` with `box.OneListOfOne`
case object `dsl.list<box?>` extends `DslRectangle` with `box.OneListOfNullable`
case object `dsl.set<box>` extends `DslRectangle` with `box.OneSetOfOne`
case object `dsl.set<box?>` extends `DslRectangle` with `box.OneSetOfNullable`
case object `dsl.box?` extends `DslRectangle` with `box.Nullable`
case object `dsl.array<box>?` extends `DslRectangle` with `box.NullableArrayOfOne`
case object `dsl.box[]?` extends `DslRectangle` with `box.NullableBracketsOfOne`
case object `dsl.array<box?>?` extends `DslRectangle` with `box.NullableArrayOfNullable`
case object `dsl.box?[]?` extends `DslRectangle` with `box.NullableBracketsOfNullable`
case object `dsl.list<box>?` extends `DslRectangle` with `box.NullableListOfOne`
case object `dsl.list<box?>?` extends `DslRectangle` with `box.NullableListOfNullable`
case object `dsl.set<box>?` extends `DslRectangle` with `box.NullableSetOfOne`
case object `dsl.set<box?>?` extends `DslRectangle` with `box.NullableSetOfNullable`

case object `dsl.rectangle` extends `DslRectangle` with `box.One`
case object `dsl.array<rectangle>` extends `DslRectangle` with `box.OneArrayOfOne`
case object `dsl.rectangle[]` extends `DslRectangle` with `box.OneBracketsOfOne`
case object `dsl.array<rectangle?>` extends `DslRectangle` with `box.OneArrayOfNullable`
case object `dsl.rectangle?[]` extends `DslRectangle` with `box.OneBracketsOfNullable`
case object `dsl.list<rectangle>` extends `DslRectangle` with `box.OneListOfOne`
case object `dsl.list<rectangle?>` extends `DslRectangle` with `box.OneListOfNullable`
case object `dsl.set<rectangle>` extends `DslRectangle` with `box.OneSetOfOne`
case object `dsl.set<rectangle?>` extends `DslRectangle` with `box.OneSetOfNullable`
case object `dsl.rectangle?` extends `DslRectangle` with `box.Nullable`
case object `dsl.array<rectangle>?` extends `DslRectangle` with `box.NullableArrayOfOne`
case object `dsl.rectangle[]?` extends `DslRectangle` with `box.NullableBracketsOfOne`
case object `dsl.array<rectangle?>?` extends `DslRectangle` with `box.NullableArrayOfNullable`
case object `dsl.rectangle?[]?` extends `DslRectangle` with `box.NullableBracketsOfNullable`
case object `dsl.list<rectangle>?` extends `DslRectangle` with `box.NullableListOfOne`
case object `dsl.list<rectangle?>?` extends `DslRectangle` with `box.NullableListOfNullable`
case object `dsl.set<rectangle>?` extends `DslRectangle` with `box.NullableSetOfOne`
case object `dsl.set<rectangle?>?` extends `DslRectangle` with `box.NullableSetOfNullable`
