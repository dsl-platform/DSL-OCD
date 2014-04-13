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
