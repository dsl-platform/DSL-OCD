package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslTimestamp
    extends OcdDslBoxType
    with `type.Timestamp`

case object `dsl.Timestamp`          extends DslTimestamp with `box.One`
case object `dsl.Timestamp?`         extends DslTimestamp with `box.Nullable`
case object `dsl.Array<Timestamp>`   extends DslTimestamp with `box.OneArrayOfOne`
case object `dsl.Timestamp[]`        extends DslTimestamp with `box.OneBracketsOfOne`
case object `dsl.Array<Timestamp>?`  extends DslTimestamp with `box.NullableArrayOfOne`
case object `dsl.Timestamp[]?`       extends DslTimestamp with `box.NullableBracketsOfOne`
case object `dsl.Array<Timestamp?>`  extends DslTimestamp with `box.OneArrayOfNullable`
case object `dsl.Timestamp?[]`       extends DslTimestamp with `box.OneBracketsOfNullable`
case object `dsl.Array<Timestamp?>?` extends DslTimestamp with `box.NullableArrayOfNullable`
case object `dsl.Timestamp?[]?`      extends DslTimestamp with `box.NullableBracketsOfNullable`
case object `dsl.List<Timestamp>`    extends DslTimestamp with `box.OneListOfOne`
case object `dsl.List<Timestamp>?`   extends DslTimestamp with `box.NullableListOfOne`
case object `dsl.List<Timestamp?>`   extends DslTimestamp with `box.OneListOfNullable`
case object `dsl.List<Timestamp?>?`  extends DslTimestamp with `box.NullableListOfNullable`
case object `dsl.Set<Timestamp>`     extends DslTimestamp with `box.OneSetOfOne`
case object `dsl.Set<Timestamp>?`    extends DslTimestamp with `box.NullableSetOfOne`
case object `dsl.Set<Timestamp?>`    extends DslTimestamp with `box.OneSetOfNullable`
case object `dsl.Set<Timestamp?>?`   extends DslTimestamp with `box.NullableSetOfNullable`
