package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslIP`
    extends OcdDsl
    with `type.IP` {

  def dslName = toString.substring(4)
}

case object `dsl.IP` extends `DslIP` with `box.One`
case object `dsl.ARRAY<IP>` extends `DslIP` with `box.OneArrayOfOne`
case object `dsl.IP[]` extends `DslIP` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<IP?>` extends `DslIP` with `box.OneArrayOfNullable`
case object `dsl.IP?[]` extends `DslIP` with `box.OneBracketsOfNullable`
case object `dsl.LIST<IP>` extends `DslIP` with `box.OneListOfOne`
case object `dsl.LIST<IP?>` extends `DslIP` with `box.OneListOfNullable`
case object `dsl.SET<IP>` extends `DslIP` with `box.OneSetOfOne`
case object `dsl.SET<IP?>` extends `DslIP` with `box.OneSetOfNullable`
case object `dsl.IP?` extends `DslIP` with `box.Nullable`
case object `dsl.ARRAY<IP>?` extends `DslIP` with `box.NullableArrayOfOne`
case object `dsl.IP[]?` extends `DslIP` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<IP?>?` extends `DslIP` with `box.NullableArrayOfNullable`
case object `dsl.IP?[]?` extends `DslIP` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<IP>?` extends `DslIP` with `box.NullableListOfOne`
case object `dsl.LIST<IP?>?` extends `DslIP` with `box.NullableListOfNullable`
case object `dsl.SET<IP>?` extends `DslIP` with `box.NullableSetOfOne`
case object `dsl.SET<IP?>?` extends `DslIP` with `box.NullableSetOfNullable`

case object `dsl.ip` extends `DslIP` with `box.One`
case object `dsl.array<ip>` extends `DslIP` with `box.OneArrayOfOne`
case object `dsl.ip[]` extends `DslIP` with `box.OneBracketsOfOne`
case object `dsl.array<ip?>` extends `DslIP` with `box.OneArrayOfNullable`
case object `dsl.ip?[]` extends `DslIP` with `box.OneBracketsOfNullable`
case object `dsl.list<ip>` extends `DslIP` with `box.OneListOfOne`
case object `dsl.list<ip?>` extends `DslIP` with `box.OneListOfNullable`
case object `dsl.set<ip>` extends `DslIP` with `box.OneSetOfOne`
case object `dsl.set<ip?>` extends `DslIP` with `box.OneSetOfNullable`
case object `dsl.ip?` extends `DslIP` with `box.Nullable`
case object `dsl.array<ip>?` extends `DslIP` with `box.NullableArrayOfOne`
case object `dsl.ip[]?` extends `DslIP` with `box.NullableBracketsOfOne`
case object `dsl.array<ip?>?` extends `DslIP` with `box.NullableArrayOfNullable`
case object `dsl.ip?[]?` extends `DslIP` with `box.NullableBracketsOfNullable`
case object `dsl.list<ip>?` extends `DslIP` with `box.NullableListOfOne`
case object `dsl.list<ip?>?` extends `DslIP` with `box.NullableListOfNullable`
case object `dsl.set<ip>?` extends `DslIP` with `box.NullableSetOfOne`
case object `dsl.set<ip?>?` extends `DslIP` with `box.NullableSetOfNullable`
