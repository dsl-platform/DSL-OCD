package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslMap
    extends OcdDslBoxType
    with `type.Map`

case object `dsl.Map`          extends DslMap with `box.One`
case object `dsl.Map?`         extends DslMap with `box.Nullable`
case object `dsl.Array<Map>`   extends DslMap with `box.OneArrayOfOne`
case object `dsl.Map[]`        extends DslMap with `box.OneBracketsOfOne`
case object `dsl.Array<Map>?`  extends DslMap with `box.NullableArrayOfOne`
case object `dsl.Map[]?`       extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.Array<Map?>`  extends DslMap with `box.OneArrayOfNullable`
case object `dsl.Map?[]`       extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.Array<Map?>?` extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.Map?[]?`      extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.List<Map>`    extends DslMap with `box.OneListOfOne`
case object `dsl.List<Map>?`   extends DslMap with `box.NullableListOfOne`
case object `dsl.List<Map?>`   extends DslMap with `box.OneListOfNullable`
case object `dsl.List<Map?>?`  extends DslMap with `box.NullableListOfNullable`
case object `dsl.Set<Map>`     extends DslMap with `box.OneSetOfOne`
case object `dsl.Set<Map>?`    extends DslMap with `box.NullableSetOfOne`
case object `dsl.Set<Map?>`    extends DslMap with `box.OneSetOfNullable`
case object `dsl.Set<Map?>?`   extends DslMap with `box.NullableSetOfNullable`

case object `dsl.DICTIONARY`          extends DslMap with `box.One`
case object `dsl.DICTIONARY?`         extends DslMap with `box.Nullable`
case object `dsl.ARRAY<DICTIONARY>`   extends DslMap with `box.OneArrayOfOne`
case object `dsl.DICTIONARY[]`        extends DslMap with `box.OneBracketsOfOne`
case object `dsl.ARRAY<DICTIONARY>?`  extends DslMap with `box.NullableArrayOfOne`
case object `dsl.DICTIONARY[]?`       extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<DICTIONARY?>`  extends DslMap with `box.OneArrayOfNullable`
case object `dsl.DICTIONARY?[]`       extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<DICTIONARY?>?` extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.DICTIONARY?[]?`      extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.LIST<DICTIONARY>`    extends DslMap with `box.OneListOfOne`
case object `dsl.LIST<DICTIONARY>?`   extends DslMap with `box.NullableListOfOne`
case object `dsl.LIST<DICTIONARY?>`   extends DslMap with `box.OneListOfNullable`
case object `dsl.LIST<DICTIONARY?>?`  extends DslMap with `box.NullableListOfNullable`
case object `dsl.SET<DICTIONARY>`     extends DslMap with `box.OneSetOfOne`
case object `dsl.SET<DICTIONARY>?`    extends DslMap with `box.NullableSetOfOne`
case object `dsl.SET<DICTIONARY?>`    extends DslMap with `box.OneSetOfNullable`
case object `dsl.SET<DICTIONARY?>?`   extends DslMap with `box.NullableSetOfNullable`

case object `dsl.Dictionary`          extends DslMap with `box.One`
case object `dsl.Dictionary?`         extends DslMap with `box.Nullable`
case object `dsl.Array<Dictionary>`   extends DslMap with `box.OneArrayOfOne`
case object `dsl.Dictionary[]`        extends DslMap with `box.OneBracketsOfOne`
case object `dsl.Array<Dictionary>?`  extends DslMap with `box.NullableArrayOfOne`
case object `dsl.Dictionary[]?`       extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.Array<Dictionary?>`  extends DslMap with `box.OneArrayOfNullable`
case object `dsl.Dictionary?[]`       extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.Array<Dictionary?>?` extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.Dictionary?[]?`      extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.List<Dictionary>`    extends DslMap with `box.OneListOfOne`
case object `dsl.List<Dictionary>?`   extends DslMap with `box.NullableListOfOne`
case object `dsl.List<Dictionary?>`   extends DslMap with `box.OneListOfNullable`
case object `dsl.List<Dictionary?>?`  extends DslMap with `box.NullableListOfNullable`
case object `dsl.Set<Dictionary>`     extends DslMap with `box.OneSetOfOne`
case object `dsl.Set<Dictionary>?`    extends DslMap with `box.NullableSetOfOne`
case object `dsl.Set<Dictionary?>`    extends DslMap with `box.OneSetOfNullable`
case object `dsl.Set<Dictionary?>?`   extends DslMap with `box.NullableSetOfNullable`

case object `dsl.MAP`          extends DslMap with `box.One`
case object `dsl.MAP?`         extends DslMap with `box.Nullable`
case object `dsl.ARRAY<MAP>`   extends DslMap with `box.OneArrayOfOne`
case object `dsl.MAP[]`        extends DslMap with `box.OneBracketsOfOne`
case object `dsl.ARRAY<MAP>?`  extends DslMap with `box.NullableArrayOfOne`
case object `dsl.MAP[]?`       extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<MAP?>`  extends DslMap with `box.OneArrayOfNullable`
case object `dsl.MAP?[]`       extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<MAP?>?` extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.MAP?[]?`      extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.LIST<MAP>`    extends DslMap with `box.OneListOfOne`
case object `dsl.LIST<MAP>?`   extends DslMap with `box.NullableListOfOne`
case object `dsl.LIST<MAP?>`   extends DslMap with `box.OneListOfNullable`
case object `dsl.LIST<MAP?>?`  extends DslMap with `box.NullableListOfNullable`
case object `dsl.SET<MAP>`     extends DslMap with `box.OneSetOfOne`
case object `dsl.SET<MAP>?`    extends DslMap with `box.NullableSetOfOne`
case object `dsl.SET<MAP?>`    extends DslMap with `box.OneSetOfNullable`
case object `dsl.SET<MAP?>?`   extends DslMap with `box.NullableSetOfNullable`

case object `dsl.dictionary`          extends DslMap with `box.One`
case object `dsl.dictionary?`         extends DslMap with `box.Nullable`
case object `dsl.array<dictionary>`   extends DslMap with `box.OneArrayOfOne`
case object `dsl.dictionary[]`        extends DslMap with `box.OneBracketsOfOne`
case object `dsl.array<dictionary>?`  extends DslMap with `box.NullableArrayOfOne`
case object `dsl.dictionary[]?`       extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.array<dictionary?>`  extends DslMap with `box.OneArrayOfNullable`
case object `dsl.dictionary?[]`       extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.array<dictionary?>?` extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.dictionary?[]?`      extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.list<dictionary>`    extends DslMap with `box.OneListOfOne`
case object `dsl.list<dictionary>?`   extends DslMap with `box.NullableListOfOne`
case object `dsl.list<dictionary?>`   extends DslMap with `box.OneListOfNullable`
case object `dsl.list<dictionary?>?`  extends DslMap with `box.NullableListOfNullable`
case object `dsl.set<dictionary>`     extends DslMap with `box.OneSetOfOne`
case object `dsl.set<dictionary>?`    extends DslMap with `box.NullableSetOfOne`
case object `dsl.set<dictionary?>`    extends DslMap with `box.OneSetOfNullable`
case object `dsl.set<dictionary?>?`   extends DslMap with `box.NullableSetOfNullable`

case object `dsl.map`          extends DslMap with `box.One`
case object `dsl.map?`         extends DslMap with `box.Nullable`
case object `dsl.array<map>`   extends DslMap with `box.OneArrayOfOne`
case object `dsl.map[]`        extends DslMap with `box.OneBracketsOfOne`
case object `dsl.array<map>?`  extends DslMap with `box.NullableArrayOfOne`
case object `dsl.map[]?`       extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.array<map?>`  extends DslMap with `box.OneArrayOfNullable`
case object `dsl.map?[]`       extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.array<map?>?` extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.map?[]?`      extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.list<map>`    extends DslMap with `box.OneListOfOne`
case object `dsl.list<map>?`   extends DslMap with `box.NullableListOfOne`
case object `dsl.list<map?>`   extends DslMap with `box.OneListOfNullable`
case object `dsl.list<map?>?`  extends DslMap with `box.NullableListOfNullable`
case object `dsl.set<map>`     extends DslMap with `box.OneSetOfOne`
case object `dsl.set<map>?`    extends DslMap with `box.NullableSetOfOne`
case object `dsl.set<map?>`    extends DslMap with `box.OneSetOfNullable`
case object `dsl.set<map?>?`   extends DslMap with `box.NullableSetOfNullable`
