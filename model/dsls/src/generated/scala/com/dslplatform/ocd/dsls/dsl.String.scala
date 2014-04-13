package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslString
    extends OcdDslBoxType
    with `type.String`

case object `dsl.String`          extends DslString with `box.One`
case object `dsl.String?`         extends DslString with `box.Nullable`
case object `dsl.Array<String>`   extends DslString with `box.OneArrayOfOne`
case object `dsl.String[]`        extends DslString with `box.OneBracketsOfOne`
case object `dsl.Array<String>?`  extends DslString with `box.NullableArrayOfOne`
case object `dsl.String[]?`       extends DslString with `box.NullableBracketsOfOne`
case object `dsl.Array<String?>`  extends DslString with `box.OneArrayOfNullable`
case object `dsl.String?[]`       extends DslString with `box.OneBracketsOfNullable`
case object `dsl.Array<String?>?` extends DslString with `box.NullableArrayOfNullable`
case object `dsl.String?[]?`      extends DslString with `box.NullableBracketsOfNullable`
case object `dsl.List<String>`    extends DslString with `box.OneListOfOne`
case object `dsl.List<String>?`   extends DslString with `box.NullableListOfOne`
case object `dsl.List<String?>`   extends DslString with `box.OneListOfNullable`
case object `dsl.List<String?>?`  extends DslString with `box.NullableListOfNullable`
case object `dsl.Set<String>`     extends DslString with `box.OneSetOfOne`
case object `dsl.Set<String>?`    extends DslString with `box.NullableSetOfOne`
case object `dsl.Set<String?>`    extends DslString with `box.OneSetOfNullable`
case object `dsl.Set<String?>?`   extends DslString with `box.NullableSetOfNullable`
