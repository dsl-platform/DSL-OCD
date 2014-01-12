package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslString
    extends OcdDsl
    with `type.String`

case object `dsl.String`          extends DslString with `box.One`
case object `dsl.Array<String>`   extends DslString with `box.OneArrayOfOne`
case object `dsl.String[]`        extends DslString with `box.OneBracketsOfOne`
case object `dsl.Array<String?>`  extends DslString with `box.OneArrayOfNullable`
case object `dsl.String?[]`       extends DslString with `box.OneBracketsOfNullable`
case object `dsl.List<String>`    extends DslString with `box.OneListOfOne`
case object `dsl.List<String?>`   extends DslString with `box.OneListOfNullable`
case object `dsl.Set<String>`     extends DslString with `box.OneSetOfOne`
case object `dsl.Set<String?>`    extends DslString with `box.OneSetOfNullable`
case object `dsl.String?`         extends DslString with `box.Nullable`
case object `dsl.Array<String>?`  extends DslString with `box.NullableArrayOfOne`
case object `dsl.String[]?`       extends DslString with `box.NullableBracketsOfOne`
case object `dsl.Array<String?>?` extends DslString with `box.NullableArrayOfNullable`
case object `dsl.String?[]?`      extends DslString with `box.NullableBracketsOfNullable`
case object `dsl.List<String>?`   extends DslString with `box.NullableListOfOne`
case object `dsl.List<String?>?`  extends DslString with `box.NullableListOfNullable`
case object `dsl.Set<String>?`    extends DslString with `box.NullableSetOfOne`
case object `dsl.Set<String?>?`   extends DslString with `box.NullableSetOfNullable`

case object `dsl.STRING`          extends DslString with `box.One`
case object `dsl.ARRAY<STRING>`   extends DslString with `box.OneArrayOfOne`
case object `dsl.STRING[]`        extends DslString with `box.OneBracketsOfOne`
case object `dsl.ARRAY<STRING?>`  extends DslString with `box.OneArrayOfNullable`
case object `dsl.STRING?[]`       extends DslString with `box.OneBracketsOfNullable`
case object `dsl.LIST<STRING>`    extends DslString with `box.OneListOfOne`
case object `dsl.LIST<STRING?>`   extends DslString with `box.OneListOfNullable`
case object `dsl.SET<STRING>`     extends DslString with `box.OneSetOfOne`
case object `dsl.SET<STRING?>`    extends DslString with `box.OneSetOfNullable`
case object `dsl.STRING?`         extends DslString with `box.Nullable`
case object `dsl.ARRAY<STRING>?`  extends DslString with `box.NullableArrayOfOne`
case object `dsl.STRING[]?`       extends DslString with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<STRING?>?` extends DslString with `box.NullableArrayOfNullable`
case object `dsl.STRING?[]?`      extends DslString with `box.NullableBracketsOfNullable`
case object `dsl.LIST<STRING>?`   extends DslString with `box.NullableListOfOne`
case object `dsl.LIST<STRING?>?`  extends DslString with `box.NullableListOfNullable`
case object `dsl.SET<STRING>?`    extends DslString with `box.NullableSetOfOne`
case object `dsl.SET<STRING?>?`   extends DslString with `box.NullableSetOfNullable`

case object `dsl.string`          extends DslString with `box.One`
case object `dsl.array<string>`   extends DslString with `box.OneArrayOfOne`
case object `dsl.string[]`        extends DslString with `box.OneBracketsOfOne`
case object `dsl.array<string?>`  extends DslString with `box.OneArrayOfNullable`
case object `dsl.string?[]`       extends DslString with `box.OneBracketsOfNullable`
case object `dsl.list<string>`    extends DslString with `box.OneListOfOne`
case object `dsl.list<string?>`   extends DslString with `box.OneListOfNullable`
case object `dsl.set<string>`     extends DslString with `box.OneSetOfOne`
case object `dsl.set<string?>`    extends DslString with `box.OneSetOfNullable`
case object `dsl.string?`         extends DslString with `box.Nullable`
case object `dsl.array<string>?`  extends DslString with `box.NullableArrayOfOne`
case object `dsl.string[]?`       extends DslString with `box.NullableBracketsOfOne`
case object `dsl.array<string?>?` extends DslString with `box.NullableArrayOfNullable`
case object `dsl.string?[]?`      extends DslString with `box.NullableBracketsOfNullable`
case object `dsl.list<string>?`   extends DslString with `box.NullableListOfOne`
case object `dsl.list<string?>?`  extends DslString with `box.NullableListOfNullable`
case object `dsl.set<string>?`    extends DslString with `box.NullableSetOfOne`
case object `dsl.set<string?>?`   extends DslString with `box.NullableSetOfNullable`
