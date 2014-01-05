package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslLocation`
    extends OcdDsl
    with `type.Location` {

  def dslName = toString.substring(4)
}

case object `dsl.Location` extends `DslLocation` with `box.One`
case object `dsl.Array<Location>` extends `DslLocation` with `box.OneArrayOfOne`
case object `dsl.Location[]` extends `DslLocation` with `box.OneBracketsOfOne`
case object `dsl.Array<Location?>` extends `DslLocation` with `box.OneArrayOfNullable`
case object `dsl.Location?[]` extends `DslLocation` with `box.OneBracketsOfNullable`
case object `dsl.List<Location>` extends `DslLocation` with `box.OneListOfOne`
case object `dsl.List<Location?>` extends `DslLocation` with `box.OneListOfNullable`
case object `dsl.Set<Location>` extends `DslLocation` with `box.OneSetOfOne`
case object `dsl.Set<Location?>` extends `DslLocation` with `box.OneSetOfNullable`
case object `dsl.Location?` extends `DslLocation` with `box.Nullable`
case object `dsl.Array<Location>?` extends `DslLocation` with `box.NullableArrayOfOne`
case object `dsl.Location[]?` extends `DslLocation` with `box.NullableBracketsOfOne`
case object `dsl.Array<Location?>?` extends `DslLocation` with `box.NullableArrayOfNullable`
case object `dsl.Location?[]?` extends `DslLocation` with `box.NullableBracketsOfNullable`
case object `dsl.List<Location>?` extends `DslLocation` with `box.NullableListOfOne`
case object `dsl.List<Location?>?` extends `DslLocation` with `box.NullableListOfNullable`
case object `dsl.Set<Location>?` extends `DslLocation` with `box.NullableSetOfOne`
case object `dsl.Set<Location?>?` extends `DslLocation` with `box.NullableSetOfNullable`

case object `dsl.LOCATION` extends `DslLocation` with `box.One`
case object `dsl.ARRAY<LOCATION>` extends `DslLocation` with `box.OneArrayOfOne`
case object `dsl.LOCATION[]` extends `DslLocation` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<LOCATION?>` extends `DslLocation` with `box.OneArrayOfNullable`
case object `dsl.LOCATION?[]` extends `DslLocation` with `box.OneBracketsOfNullable`
case object `dsl.LIST<LOCATION>` extends `DslLocation` with `box.OneListOfOne`
case object `dsl.LIST<LOCATION?>` extends `DslLocation` with `box.OneListOfNullable`
case object `dsl.SET<LOCATION>` extends `DslLocation` with `box.OneSetOfOne`
case object `dsl.SET<LOCATION?>` extends `DslLocation` with `box.OneSetOfNullable`
case object `dsl.LOCATION?` extends `DslLocation` with `box.Nullable`
case object `dsl.ARRAY<LOCATION>?` extends `DslLocation` with `box.NullableArrayOfOne`
case object `dsl.LOCATION[]?` extends `DslLocation` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<LOCATION?>?` extends `DslLocation` with `box.NullableArrayOfNullable`
case object `dsl.LOCATION?[]?` extends `DslLocation` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<LOCATION>?` extends `DslLocation` with `box.NullableListOfOne`
case object `dsl.LIST<LOCATION?>?` extends `DslLocation` with `box.NullableListOfNullable`
case object `dsl.SET<LOCATION>?` extends `DslLocation` with `box.NullableSetOfOne`
case object `dsl.SET<LOCATION?>?` extends `DslLocation` with `box.NullableSetOfNullable`

case object `dsl.location` extends `DslLocation` with `box.One`
case object `dsl.array<location>` extends `DslLocation` with `box.OneArrayOfOne`
case object `dsl.location[]` extends `DslLocation` with `box.OneBracketsOfOne`
case object `dsl.array<location?>` extends `DslLocation` with `box.OneArrayOfNullable`
case object `dsl.location?[]` extends `DslLocation` with `box.OneBracketsOfNullable`
case object `dsl.list<location>` extends `DslLocation` with `box.OneListOfOne`
case object `dsl.list<location?>` extends `DslLocation` with `box.OneListOfNullable`
case object `dsl.set<location>` extends `DslLocation` with `box.OneSetOfOne`
case object `dsl.set<location?>` extends `DslLocation` with `box.OneSetOfNullable`
case object `dsl.location?` extends `DslLocation` with `box.Nullable`
case object `dsl.array<location>?` extends `DslLocation` with `box.NullableArrayOfOne`
case object `dsl.location[]?` extends `DslLocation` with `box.NullableBracketsOfOne`
case object `dsl.array<location?>?` extends `DslLocation` with `box.NullableArrayOfNullable`
case object `dsl.location?[]?` extends `DslLocation` with `box.NullableBracketsOfNullable`
case object `dsl.list<location>?` extends `DslLocation` with `box.NullableListOfOne`
case object `dsl.list<location?>?` extends `DslLocation` with `box.NullableListOfNullable`
case object `dsl.set<location>?` extends `DslLocation` with `box.NullableSetOfOne`
case object `dsl.set<location?>?` extends `DslLocation` with `box.NullableSetOfNullable`
