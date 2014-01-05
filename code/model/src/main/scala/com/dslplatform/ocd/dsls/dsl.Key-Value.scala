package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslKey-Value`
    extends OcdDsl
    with `type.Key-Value` {

  def dslName = toString.substring(4)
}

case object `dsl.Key-Value` extends `DslKey-Value` with `box.One`
case object `dsl.Array<Key-Value>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.Key-Value[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.Array<Key-Value?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.Key-Value?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.List<Key-Value>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.List<Key-Value?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.Set<Key-Value>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.Set<Key-Value?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.Key-Value?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.Array<Key-Value>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.Key-Value[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.Array<Key-Value?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.Key-Value?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.List<Key-Value>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.List<Key-Value?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.Set<Key-Value>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.Set<Key-Value?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.DICTIONARY` extends `DslKey-Value` with `box.One`
case object `dsl.ARRAY<DICTIONARY>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.DICTIONARY[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<DICTIONARY?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.DICTIONARY?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.LIST<DICTIONARY>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.LIST<DICTIONARY?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.SET<DICTIONARY>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.SET<DICTIONARY?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.DICTIONARY?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.ARRAY<DICTIONARY>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.DICTIONARY[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<DICTIONARY?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.DICTIONARY?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<DICTIONARY>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.LIST<DICTIONARY?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.SET<DICTIONARY>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.SET<DICTIONARY?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.Dictionary` extends `DslKey-Value` with `box.One`
case object `dsl.Array<Dictionary>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.Dictionary[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.Array<Dictionary?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.Dictionary?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.List<Dictionary>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.List<Dictionary?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.Set<Dictionary>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.Set<Dictionary?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.Dictionary?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.Array<Dictionary>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.Dictionary[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.Array<Dictionary?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.Dictionary?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.List<Dictionary>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.List<Dictionary?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.Set<Dictionary>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.Set<Dictionary?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.KEY-VALUE` extends `DslKey-Value` with `box.One`
case object `dsl.ARRAY<KEY-VALUE>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.KEY-VALUE[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<KEY-VALUE?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.KEY-VALUE?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.LIST<KEY-VALUE>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.LIST<KEY-VALUE?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.SET<KEY-VALUE>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.SET<KEY-VALUE?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.KEY-VALUE?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.ARRAY<KEY-VALUE>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.KEY-VALUE[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<KEY-VALUE?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.KEY-VALUE?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<KEY-VALUE>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.LIST<KEY-VALUE?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.SET<KEY-VALUE>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.SET<KEY-VALUE?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.MAP` extends `DslKey-Value` with `box.One`
case object `dsl.ARRAY<MAP>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.MAP[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<MAP?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.MAP?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.LIST<MAP>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.LIST<MAP?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.SET<MAP>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.SET<MAP?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.MAP?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.ARRAY<MAP>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.MAP[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<MAP?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.MAP?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<MAP>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.LIST<MAP?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.SET<MAP>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.SET<MAP?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.Map` extends `DslKey-Value` with `box.One`
case object `dsl.Array<Map>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.Map[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.Array<Map?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.Map?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.List<Map>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.List<Map?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.Set<Map>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.Set<Map?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.Map?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.Array<Map>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.Map[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.Array<Map?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.Map?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.List<Map>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.List<Map?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.Set<Map>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.Set<Map?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.dictionary` extends `DslKey-Value` with `box.One`
case object `dsl.array<dictionary>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.dictionary[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.array<dictionary?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.dictionary?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.list<dictionary>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.list<dictionary?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.set<dictionary>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.set<dictionary?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.dictionary?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.array<dictionary>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.dictionary[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.array<dictionary?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.dictionary?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.list<dictionary>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.list<dictionary?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.set<dictionary>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.set<dictionary?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.key-value` extends `DslKey-Value` with `box.One`
case object `dsl.array<key-value>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.key-value[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.array<key-value?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.key-value?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.list<key-value>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.list<key-value?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.set<key-value>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.set<key-value?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.key-value?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.array<key-value>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.key-value[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.array<key-value?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.key-value?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.list<key-value>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.list<key-value?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.set<key-value>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.set<key-value?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`

case object `dsl.map` extends `DslKey-Value` with `box.One`
case object `dsl.array<map>` extends `DslKey-Value` with `box.OneArrayOfOne`
case object `dsl.map[]` extends `DslKey-Value` with `box.OneBracketsOfOne`
case object `dsl.array<map?>` extends `DslKey-Value` with `box.OneArrayOfNullable`
case object `dsl.map?[]` extends `DslKey-Value` with `box.OneBracketsOfNullable`
case object `dsl.list<map>` extends `DslKey-Value` with `box.OneListOfOne`
case object `dsl.list<map?>` extends `DslKey-Value` with `box.OneListOfNullable`
case object `dsl.set<map>` extends `DslKey-Value` with `box.OneSetOfOne`
case object `dsl.set<map?>` extends `DslKey-Value` with `box.OneSetOfNullable`
case object `dsl.map?` extends `DslKey-Value` with `box.Nullable`
case object `dsl.array<map>?` extends `DslKey-Value` with `box.NullableArrayOfOne`
case object `dsl.map[]?` extends `DslKey-Value` with `box.NullableBracketsOfOne`
case object `dsl.array<map?>?` extends `DslKey-Value` with `box.NullableArrayOfNullable`
case object `dsl.map?[]?` extends `DslKey-Value` with `box.NullableBracketsOfNullable`
case object `dsl.list<map>?` extends `DslKey-Value` with `box.NullableListOfOne`
case object `dsl.list<map?>?` extends `DslKey-Value` with `box.NullableListOfNullable`
case object `dsl.set<map>?` extends `DslKey-Value` with `box.NullableSetOfOne`
case object `dsl.set<map?>?` extends `DslKey-Value` with `box.NullableSetOfNullable`
