package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslImage
    extends OcdDslBoxType
    with `type.Image`

case object `dsl.Image`          extends DslImage with `box.One`
case object `dsl.Image?`         extends DslImage with `box.Nullable`
case object `dsl.Array<Image>`   extends DslImage with `box.OneArrayOfOne`
case object `dsl.Image[]`        extends DslImage with `box.OneBracketsOfOne`
case object `dsl.Array<Image>?`  extends DslImage with `box.NullableArrayOfOne`
case object `dsl.Image[]?`       extends DslImage with `box.NullableBracketsOfOne`
case object `dsl.Array<Image?>`  extends DslImage with `box.OneArrayOfNullable`
case object `dsl.Image?[]`       extends DslImage with `box.OneBracketsOfNullable`
case object `dsl.Array<Image?>?` extends DslImage with `box.NullableArrayOfNullable`
case object `dsl.Image?[]?`      extends DslImage with `box.NullableBracketsOfNullable`
case object `dsl.List<Image>`    extends DslImage with `box.OneListOfOne`
case object `dsl.List<Image>?`   extends DslImage with `box.NullableListOfOne`
case object `dsl.List<Image?>`   extends DslImage with `box.OneListOfNullable`
case object `dsl.List<Image?>?`  extends DslImage with `box.NullableListOfNullable`
case object `dsl.Set<Image>`     extends DslImage with `box.OneSetOfOne`
case object `dsl.Set<Image>?`    extends DslImage with `box.NullableSetOfOne`
case object `dsl.Set<Image?>`    extends DslImage with `box.OneSetOfNullable`
case object `dsl.Set<Image?>?`   extends DslImage with `box.NullableSetOfNullable`
