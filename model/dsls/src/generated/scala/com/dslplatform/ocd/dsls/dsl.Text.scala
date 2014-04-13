package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslText
    extends OcdDslBoxType
    with `type.Text`

case object `dsl.Text`          extends DslText with `box.One`
case object `dsl.Text?`         extends DslText with `box.Nullable`
case object `dsl.Array<Text>`   extends DslText with `box.OneArrayOfOne`
case object `dsl.Text[]`        extends DslText with `box.OneBracketsOfOne`
case object `dsl.Array<Text>?`  extends DslText with `box.NullableArrayOfOne`
case object `dsl.Text[]?`       extends DslText with `box.NullableBracketsOfOne`
case object `dsl.Array<Text?>`  extends DslText with `box.OneArrayOfNullable`
case object `dsl.Text?[]`       extends DslText with `box.OneBracketsOfNullable`
case object `dsl.Array<Text?>?` extends DslText with `box.NullableArrayOfNullable`
case object `dsl.Text?[]?`      extends DslText with `box.NullableBracketsOfNullable`
case object `dsl.List<Text>`    extends DslText with `box.OneListOfOne`
case object `dsl.List<Text>?`   extends DslText with `box.NullableListOfOne`
case object `dsl.List<Text?>`   extends DslText with `box.OneListOfNullable`
case object `dsl.List<Text?>?`  extends DslText with `box.NullableListOfNullable`
case object `dsl.Set<Text>`     extends DslText with `box.OneSetOfOne`
case object `dsl.Set<Text>?`    extends DslText with `box.NullableSetOfOne`
case object `dsl.Set<Text?>`    extends DslText with `box.OneSetOfNullable`
case object `dsl.Set<Text?>?`   extends DslText with `box.NullableSetOfNullable`
