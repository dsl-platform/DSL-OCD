package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslEmail`
    extends OcdDsl
    with `type.Email` {

  def dslName = toString.substring(4)
}

case object `dsl.Email` extends `DslEmail` with `box.One`
case object `dsl.Array<Email>` extends `DslEmail` with `box.OneArrayOfOne`
case object `dsl.Email[]` extends `DslEmail` with `box.OneBracketsOfOne`
case object `dsl.Array<Email?>` extends `DslEmail` with `box.OneArrayOfNullable`
case object `dsl.Email?[]` extends `DslEmail` with `box.OneBracketsOfNullable`
case object `dsl.List<Email>` extends `DslEmail` with `box.OneListOfOne`
case object `dsl.List<Email?>` extends `DslEmail` with `box.OneListOfNullable`
case object `dsl.Set<Email>` extends `DslEmail` with `box.OneSetOfOne`
case object `dsl.Set<Email?>` extends `DslEmail` with `box.OneSetOfNullable`
case object `dsl.Email?` extends `DslEmail` with `box.Nullable`
case object `dsl.Array<Email>?` extends `DslEmail` with `box.NullableArrayOfOne`
case object `dsl.Email[]?` extends `DslEmail` with `box.NullableBracketsOfOne`
case object `dsl.Array<Email?>?` extends `DslEmail` with `box.NullableArrayOfNullable`
case object `dsl.Email?[]?` extends `DslEmail` with `box.NullableBracketsOfNullable`
case object `dsl.List<Email>?` extends `DslEmail` with `box.NullableListOfOne`
case object `dsl.List<Email?>?` extends `DslEmail` with `box.NullableListOfNullable`
case object `dsl.Set<Email>?` extends `DslEmail` with `box.NullableSetOfOne`
case object `dsl.Set<Email?>?` extends `DslEmail` with `box.NullableSetOfNullable`

case object `dsl.EMAIL` extends `DslEmail` with `box.One`
case object `dsl.ARRAY<EMAIL>` extends `DslEmail` with `box.OneArrayOfOne`
case object `dsl.EMAIL[]` extends `DslEmail` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<EMAIL?>` extends `DslEmail` with `box.OneArrayOfNullable`
case object `dsl.EMAIL?[]` extends `DslEmail` with `box.OneBracketsOfNullable`
case object `dsl.LIST<EMAIL>` extends `DslEmail` with `box.OneListOfOne`
case object `dsl.LIST<EMAIL?>` extends `DslEmail` with `box.OneListOfNullable`
case object `dsl.SET<EMAIL>` extends `DslEmail` with `box.OneSetOfOne`
case object `dsl.SET<EMAIL?>` extends `DslEmail` with `box.OneSetOfNullable`
case object `dsl.EMAIL?` extends `DslEmail` with `box.Nullable`
case object `dsl.ARRAY<EMAIL>?` extends `DslEmail` with `box.NullableArrayOfOne`
case object `dsl.EMAIL[]?` extends `DslEmail` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<EMAIL?>?` extends `DslEmail` with `box.NullableArrayOfNullable`
case object `dsl.EMAIL?[]?` extends `DslEmail` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<EMAIL>?` extends `DslEmail` with `box.NullableListOfOne`
case object `dsl.LIST<EMAIL?>?` extends `DslEmail` with `box.NullableListOfNullable`
case object `dsl.SET<EMAIL>?` extends `DslEmail` with `box.NullableSetOfOne`
case object `dsl.SET<EMAIL?>?` extends `DslEmail` with `box.NullableSetOfNullable`

case object `dsl.email` extends `DslEmail` with `box.One`
case object `dsl.array<email>` extends `DslEmail` with `box.OneArrayOfOne`
case object `dsl.email[]` extends `DslEmail` with `box.OneBracketsOfOne`
case object `dsl.array<email?>` extends `DslEmail` with `box.OneArrayOfNullable`
case object `dsl.email?[]` extends `DslEmail` with `box.OneBracketsOfNullable`
case object `dsl.list<email>` extends `DslEmail` with `box.OneListOfOne`
case object `dsl.list<email?>` extends `DslEmail` with `box.OneListOfNullable`
case object `dsl.set<email>` extends `DslEmail` with `box.OneSetOfOne`
case object `dsl.set<email?>` extends `DslEmail` with `box.OneSetOfNullable`
case object `dsl.email?` extends `DslEmail` with `box.Nullable`
case object `dsl.array<email>?` extends `DslEmail` with `box.NullableArrayOfOne`
case object `dsl.email[]?` extends `DslEmail` with `box.NullableBracketsOfOne`
case object `dsl.array<email?>?` extends `DslEmail` with `box.NullableArrayOfNullable`
case object `dsl.email?[]?` extends `DslEmail` with `box.NullableBracketsOfNullable`
case object `dsl.list<email>?` extends `DslEmail` with `box.NullableListOfOne`
case object `dsl.list<email?>?` extends `DslEmail` with `box.NullableListOfNullable`
case object `dsl.set<email>?` extends `DslEmail` with `box.NullableSetOfOne`
case object `dsl.set<email?>?` extends `DslEmail` with `box.NullableSetOfNullable`
