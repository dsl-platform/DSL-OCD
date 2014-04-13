package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslDouble
    extends OcdDslBoxType
    with `type.Double`

case object `dsl.Double`          extends DslDouble with `box.One`
case object `dsl.Double?`         extends DslDouble with `box.Nullable`
case object `dsl.Array<Double>`   extends DslDouble with `box.OneArrayOfOne`
case object `dsl.Double[]`        extends DslDouble with `box.OneBracketsOfOne`
case object `dsl.Array<Double>?`  extends DslDouble with `box.NullableArrayOfOne`
case object `dsl.Double[]?`       extends DslDouble with `box.NullableBracketsOfOne`
case object `dsl.Array<Double?>`  extends DslDouble with `box.OneArrayOfNullable`
case object `dsl.Double?[]`       extends DslDouble with `box.OneBracketsOfNullable`
case object `dsl.Array<Double?>?` extends DslDouble with `box.NullableArrayOfNullable`
case object `dsl.Double?[]?`      extends DslDouble with `box.NullableBracketsOfNullable`
case object `dsl.List<Double>`    extends DslDouble with `box.OneListOfOne`
case object `dsl.List<Double>?`   extends DslDouble with `box.NullableListOfOne`
case object `dsl.List<Double?>`   extends DslDouble with `box.OneListOfNullable`
case object `dsl.List<Double?>?`  extends DslDouble with `box.NullableListOfNullable`
case object `dsl.Set<Double>`     extends DslDouble with `box.OneSetOfOne`
case object `dsl.Set<Double>?`    extends DslDouble with `box.NullableSetOfOne`
case object `dsl.Set<Double?>`    extends DslDouble with `box.OneSetOfNullable`
case object `dsl.Set<Double?>?`   extends DslDouble with `box.NullableSetOfNullable`
