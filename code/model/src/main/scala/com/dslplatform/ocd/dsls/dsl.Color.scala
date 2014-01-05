package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslColor`
    extends OcdDsl
    with `type.Color` {

  def dslName = toString.substring(4)
}

case object `dsl.Color` extends `DslColor` with `box.One`
case object `dsl.Array<Color>` extends `DslColor` with `box.OneArrayOfOne`
case object `dsl.Color[]` extends `DslColor` with `box.OneBracketsOfOne`
case object `dsl.Array<Color?>` extends `DslColor` with `box.OneArrayOfNullable`
case object `dsl.Color?[]` extends `DslColor` with `box.OneBracketsOfNullable`
case object `dsl.List<Color>` extends `DslColor` with `box.OneListOfOne`
case object `dsl.List<Color?>` extends `DslColor` with `box.OneListOfNullable`
case object `dsl.Set<Color>` extends `DslColor` with `box.OneSetOfOne`
case object `dsl.Set<Color?>` extends `DslColor` with `box.OneSetOfNullable`
case object `dsl.Color?` extends `DslColor` with `box.Nullable`
case object `dsl.Array<Color>?` extends `DslColor` with `box.NullableArrayOfOne`
case object `dsl.Color[]?` extends `DslColor` with `box.NullableBracketsOfOne`
case object `dsl.Array<Color?>?` extends `DslColor` with `box.NullableArrayOfNullable`
case object `dsl.Color?[]?` extends `DslColor` with `box.NullableBracketsOfNullable`
case object `dsl.List<Color>?` extends `DslColor` with `box.NullableListOfOne`
case object `dsl.List<Color?>?` extends `DslColor` with `box.NullableListOfNullable`
case object `dsl.Set<Color>?` extends `DslColor` with `box.NullableSetOfOne`
case object `dsl.Set<Color?>?` extends `DslColor` with `box.NullableSetOfNullable`

case object `dsl.COLOR` extends `DslColor` with `box.One`
case object `dsl.ARRAY<COLOR>` extends `DslColor` with `box.OneArrayOfOne`
case object `dsl.COLOR[]` extends `DslColor` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<COLOR?>` extends `DslColor` with `box.OneArrayOfNullable`
case object `dsl.COLOR?[]` extends `DslColor` with `box.OneBracketsOfNullable`
case object `dsl.LIST<COLOR>` extends `DslColor` with `box.OneListOfOne`
case object `dsl.LIST<COLOR?>` extends `DslColor` with `box.OneListOfNullable`
case object `dsl.SET<COLOR>` extends `DslColor` with `box.OneSetOfOne`
case object `dsl.SET<COLOR?>` extends `DslColor` with `box.OneSetOfNullable`
case object `dsl.COLOR?` extends `DslColor` with `box.Nullable`
case object `dsl.ARRAY<COLOR>?` extends `DslColor` with `box.NullableArrayOfOne`
case object `dsl.COLOR[]?` extends `DslColor` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<COLOR?>?` extends `DslColor` with `box.NullableArrayOfNullable`
case object `dsl.COLOR?[]?` extends `DslColor` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<COLOR>?` extends `DslColor` with `box.NullableListOfOne`
case object `dsl.LIST<COLOR?>?` extends `DslColor` with `box.NullableListOfNullable`
case object `dsl.SET<COLOR>?` extends `DslColor` with `box.NullableSetOfOne`
case object `dsl.SET<COLOR?>?` extends `DslColor` with `box.NullableSetOfNullable`

case object `dsl.color` extends `DslColor` with `box.One`
case object `dsl.array<color>` extends `DslColor` with `box.OneArrayOfOne`
case object `dsl.color[]` extends `DslColor` with `box.OneBracketsOfOne`
case object `dsl.array<color?>` extends `DslColor` with `box.OneArrayOfNullable`
case object `dsl.color?[]` extends `DslColor` with `box.OneBracketsOfNullable`
case object `dsl.list<color>` extends `DslColor` with `box.OneListOfOne`
case object `dsl.list<color?>` extends `DslColor` with `box.OneListOfNullable`
case object `dsl.set<color>` extends `DslColor` with `box.OneSetOfOne`
case object `dsl.set<color?>` extends `DslColor` with `box.OneSetOfNullable`
case object `dsl.color?` extends `DslColor` with `box.Nullable`
case object `dsl.array<color>?` extends `DslColor` with `box.NullableArrayOfOne`
case object `dsl.color[]?` extends `DslColor` with `box.NullableBracketsOfOne`
case object `dsl.array<color?>?` extends `DslColor` with `box.NullableArrayOfNullable`
case object `dsl.color?[]?` extends `DslColor` with `box.NullableBracketsOfNullable`
case object `dsl.list<color>?` extends `DslColor` with `box.NullableListOfOne`
case object `dsl.list<color?>?` extends `DslColor` with `box.NullableListOfNullable`
case object `dsl.set<color>?` extends `DslColor` with `box.NullableSetOfOne`
case object `dsl.set<color?>?` extends `DslColor` with `box.NullableSetOfNullable`
