package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslUrl
    extends OcdDslBoxType
    with `type.Url`

case object `dsl.Url`          extends DslUrl with `box.One`
case object `dsl.Url?`         extends DslUrl with `box.Nullable`
case object `dsl.Array<Url>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.Url[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.Array<Url>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.Url[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.Array<Url?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.Url?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.Array<Url?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.Url?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.List<Url>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.List<Url>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.List<Url?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.List<Url?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.Set<Url>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.Set<Url>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.Set<Url?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.Set<Url?>?`   extends DslUrl with `box.NullableSetOfNullable`
