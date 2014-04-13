package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslInteger
    extends OcdDslBoxType
    with `type.Integer`

case object `dsl.Integer`          extends DslInteger with `box.One`
case object `dsl.Integer?`         extends DslInteger with `box.Nullable`
case object `dsl.Array<Integer>`   extends DslInteger with `box.OneArrayOfOne`
case object `dsl.Integer[]`        extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.Array<Integer>?`  extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.Integer[]?`       extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.Array<Integer?>`  extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.Integer?[]`       extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.Array<Integer?>?` extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.Integer?[]?`      extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.List<Integer>`    extends DslInteger with `box.OneListOfOne`
case object `dsl.List<Integer>?`   extends DslInteger with `box.NullableListOfOne`
case object `dsl.List<Integer?>`   extends DslInteger with `box.OneListOfNullable`
case object `dsl.List<Integer?>?`  extends DslInteger with `box.NullableListOfNullable`
case object `dsl.Set<Integer>`     extends DslInteger with `box.OneSetOfOne`
case object `dsl.Set<Integer>?`    extends DslInteger with `box.NullableSetOfOne`
case object `dsl.Set<Integer?>`    extends DslInteger with `box.OneSetOfNullable`
case object `dsl.Set<Integer?>?`   extends DslInteger with `box.NullableSetOfNullable`
