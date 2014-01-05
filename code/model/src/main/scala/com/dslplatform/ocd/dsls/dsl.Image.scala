package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslImage`
    extends OcdDsl
    with `type.Image` {

  def dslName = toString.substring(4)
}

case object `dsl.Image` extends `DslImage` with `box.One`
case object `dsl.Array<Image>` extends `DslImage` with `box.OneArrayOfOne`
case object `dsl.Image[]` extends `DslImage` with `box.OneBracketsOfOne`
case object `dsl.Array<Image?>` extends `DslImage` with `box.OneArrayOfNullable`
case object `dsl.Image?[]` extends `DslImage` with `box.OneBracketsOfNullable`
case object `dsl.List<Image>` extends `DslImage` with `box.OneListOfOne`
case object `dsl.List<Image?>` extends `DslImage` with `box.OneListOfNullable`
case object `dsl.Set<Image>` extends `DslImage` with `box.OneSetOfOne`
case object `dsl.Set<Image?>` extends `DslImage` with `box.OneSetOfNullable`
case object `dsl.Image?` extends `DslImage` with `box.Nullable`
case object `dsl.Array<Image>?` extends `DslImage` with `box.NullableArrayOfOne`
case object `dsl.Image[]?` extends `DslImage` with `box.NullableBracketsOfOne`
case object `dsl.Array<Image?>?` extends `DslImage` with `box.NullableArrayOfNullable`
case object `dsl.Image?[]?` extends `DslImage` with `box.NullableBracketsOfNullable`
case object `dsl.List<Image>?` extends `DslImage` with `box.NullableListOfOne`
case object `dsl.List<Image?>?` extends `DslImage` with `box.NullableListOfNullable`
case object `dsl.Set<Image>?` extends `DslImage` with `box.NullableSetOfOne`
case object `dsl.Set<Image?>?` extends `DslImage` with `box.NullableSetOfNullable`

case object `dsl.IMAGE` extends `DslImage` with `box.One`
case object `dsl.ARRAY<IMAGE>` extends `DslImage` with `box.OneArrayOfOne`
case object `dsl.IMAGE[]` extends `DslImage` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<IMAGE?>` extends `DslImage` with `box.OneArrayOfNullable`
case object `dsl.IMAGE?[]` extends `DslImage` with `box.OneBracketsOfNullable`
case object `dsl.LIST<IMAGE>` extends `DslImage` with `box.OneListOfOne`
case object `dsl.LIST<IMAGE?>` extends `DslImage` with `box.OneListOfNullable`
case object `dsl.SET<IMAGE>` extends `DslImage` with `box.OneSetOfOne`
case object `dsl.SET<IMAGE?>` extends `DslImage` with `box.OneSetOfNullable`
case object `dsl.IMAGE?` extends `DslImage` with `box.Nullable`
case object `dsl.ARRAY<IMAGE>?` extends `DslImage` with `box.NullableArrayOfOne`
case object `dsl.IMAGE[]?` extends `DslImage` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<IMAGE?>?` extends `DslImage` with `box.NullableArrayOfNullable`
case object `dsl.IMAGE?[]?` extends `DslImage` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<IMAGE>?` extends `DslImage` with `box.NullableListOfOne`
case object `dsl.LIST<IMAGE?>?` extends `DslImage` with `box.NullableListOfNullable`
case object `dsl.SET<IMAGE>?` extends `DslImage` with `box.NullableSetOfOne`
case object `dsl.SET<IMAGE?>?` extends `DslImage` with `box.NullableSetOfNullable`

case object `dsl.PICTURE` extends `DslImage` with `box.One`
case object `dsl.ARRAY<PICTURE>` extends `DslImage` with `box.OneArrayOfOne`
case object `dsl.PICTURE[]` extends `DslImage` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<PICTURE?>` extends `DslImage` with `box.OneArrayOfNullable`
case object `dsl.PICTURE?[]` extends `DslImage` with `box.OneBracketsOfNullable`
case object `dsl.LIST<PICTURE>` extends `DslImage` with `box.OneListOfOne`
case object `dsl.LIST<PICTURE?>` extends `DslImage` with `box.OneListOfNullable`
case object `dsl.SET<PICTURE>` extends `DslImage` with `box.OneSetOfOne`
case object `dsl.SET<PICTURE?>` extends `DslImage` with `box.OneSetOfNullable`
case object `dsl.PICTURE?` extends `DslImage` with `box.Nullable`
case object `dsl.ARRAY<PICTURE>?` extends `DslImage` with `box.NullableArrayOfOne`
case object `dsl.PICTURE[]?` extends `DslImage` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<PICTURE?>?` extends `DslImage` with `box.NullableArrayOfNullable`
case object `dsl.PICTURE?[]?` extends `DslImage` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<PICTURE>?` extends `DslImage` with `box.NullableListOfOne`
case object `dsl.LIST<PICTURE?>?` extends `DslImage` with `box.NullableListOfNullable`
case object `dsl.SET<PICTURE>?` extends `DslImage` with `box.NullableSetOfOne`
case object `dsl.SET<PICTURE?>?` extends `DslImage` with `box.NullableSetOfNullable`

case object `dsl.Picture` extends `DslImage` with `box.One`
case object `dsl.Array<Picture>` extends `DslImage` with `box.OneArrayOfOne`
case object `dsl.Picture[]` extends `DslImage` with `box.OneBracketsOfOne`
case object `dsl.Array<Picture?>` extends `DslImage` with `box.OneArrayOfNullable`
case object `dsl.Picture?[]` extends `DslImage` with `box.OneBracketsOfNullable`
case object `dsl.List<Picture>` extends `DslImage` with `box.OneListOfOne`
case object `dsl.List<Picture?>` extends `DslImage` with `box.OneListOfNullable`
case object `dsl.Set<Picture>` extends `DslImage` with `box.OneSetOfOne`
case object `dsl.Set<Picture?>` extends `DslImage` with `box.OneSetOfNullable`
case object `dsl.Picture?` extends `DslImage` with `box.Nullable`
case object `dsl.Array<Picture>?` extends `DslImage` with `box.NullableArrayOfOne`
case object `dsl.Picture[]?` extends `DslImage` with `box.NullableBracketsOfOne`
case object `dsl.Array<Picture?>?` extends `DslImage` with `box.NullableArrayOfNullable`
case object `dsl.Picture?[]?` extends `DslImage` with `box.NullableBracketsOfNullable`
case object `dsl.List<Picture>?` extends `DslImage` with `box.NullableListOfOne`
case object `dsl.List<Picture?>?` extends `DslImage` with `box.NullableListOfNullable`
case object `dsl.Set<Picture>?` extends `DslImage` with `box.NullableSetOfOne`
case object `dsl.Set<Picture?>?` extends `DslImage` with `box.NullableSetOfNullable`

case object `dsl.image` extends `DslImage` with `box.One`
case object `dsl.array<image>` extends `DslImage` with `box.OneArrayOfOne`
case object `dsl.image[]` extends `DslImage` with `box.OneBracketsOfOne`
case object `dsl.array<image?>` extends `DslImage` with `box.OneArrayOfNullable`
case object `dsl.image?[]` extends `DslImage` with `box.OneBracketsOfNullable`
case object `dsl.list<image>` extends `DslImage` with `box.OneListOfOne`
case object `dsl.list<image?>` extends `DslImage` with `box.OneListOfNullable`
case object `dsl.set<image>` extends `DslImage` with `box.OneSetOfOne`
case object `dsl.set<image?>` extends `DslImage` with `box.OneSetOfNullable`
case object `dsl.image?` extends `DslImage` with `box.Nullable`
case object `dsl.array<image>?` extends `DslImage` with `box.NullableArrayOfOne`
case object `dsl.image[]?` extends `DslImage` with `box.NullableBracketsOfOne`
case object `dsl.array<image?>?` extends `DslImage` with `box.NullableArrayOfNullable`
case object `dsl.image?[]?` extends `DslImage` with `box.NullableBracketsOfNullable`
case object `dsl.list<image>?` extends `DslImage` with `box.NullableListOfOne`
case object `dsl.list<image?>?` extends `DslImage` with `box.NullableListOfNullable`
case object `dsl.set<image>?` extends `DslImage` with `box.NullableSetOfOne`
case object `dsl.set<image?>?` extends `DslImage` with `box.NullableSetOfNullable`

case object `dsl.picture` extends `DslImage` with `box.One`
case object `dsl.array<picture>` extends `DslImage` with `box.OneArrayOfOne`
case object `dsl.picture[]` extends `DslImage` with `box.OneBracketsOfOne`
case object `dsl.array<picture?>` extends `DslImage` with `box.OneArrayOfNullable`
case object `dsl.picture?[]` extends `DslImage` with `box.OneBracketsOfNullable`
case object `dsl.list<picture>` extends `DslImage` with `box.OneListOfOne`
case object `dsl.list<picture?>` extends `DslImage` with `box.OneListOfNullable`
case object `dsl.set<picture>` extends `DslImage` with `box.OneSetOfOne`
case object `dsl.set<picture?>` extends `DslImage` with `box.OneSetOfNullable`
case object `dsl.picture?` extends `DslImage` with `box.Nullable`
case object `dsl.array<picture>?` extends `DslImage` with `box.NullableArrayOfOne`
case object `dsl.picture[]?` extends `DslImage` with `box.NullableBracketsOfOne`
case object `dsl.array<picture?>?` extends `DslImage` with `box.NullableArrayOfNullable`
case object `dsl.picture?[]?` extends `DslImage` with `box.NullableBracketsOfNullable`
case object `dsl.list<picture>?` extends `DslImage` with `box.NullableListOfOne`
case object `dsl.list<picture?>?` extends `DslImage` with `box.NullableListOfNullable`
case object `dsl.set<picture>?` extends `DslImage` with `box.NullableSetOfOne`
case object `dsl.set<picture?>?` extends `DslImage` with `box.NullableSetOfNullable`
