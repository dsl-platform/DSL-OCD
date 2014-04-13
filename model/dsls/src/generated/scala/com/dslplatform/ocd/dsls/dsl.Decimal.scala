package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslDecimal
    extends OcdDslBoxType
    with `type.Decimal`

case object `dsl.Decimal`          extends DslDecimal with `box.One`
case object `dsl.Decimal?`         extends DslDecimal with `box.Nullable`
case object `dsl.Array<Decimal>`   extends DslDecimal with `box.OneArrayOfOne`
case object `dsl.Decimal[]`        extends DslDecimal with `box.OneBracketsOfOne`
case object `dsl.Array<Decimal>?`  extends DslDecimal with `box.NullableArrayOfOne`
case object `dsl.Decimal[]?`       extends DslDecimal with `box.NullableBracketsOfOne`
case object `dsl.Array<Decimal?>`  extends DslDecimal with `box.OneArrayOfNullable`
case object `dsl.Decimal?[]`       extends DslDecimal with `box.OneBracketsOfNullable`
case object `dsl.Array<Decimal?>?` extends DslDecimal with `box.NullableArrayOfNullable`
case object `dsl.Decimal?[]?`      extends DslDecimal with `box.NullableBracketsOfNullable`
case object `dsl.List<Decimal>`    extends DslDecimal with `box.OneListOfOne`
case object `dsl.List<Decimal>?`   extends DslDecimal with `box.NullableListOfOne`
case object `dsl.List<Decimal?>`   extends DslDecimal with `box.OneListOfNullable`
case object `dsl.List<Decimal?>?`  extends DslDecimal with `box.NullableListOfNullable`
case object `dsl.Set<Decimal>`     extends DslDecimal with `box.OneSetOfOne`
case object `dsl.Set<Decimal>?`    extends DslDecimal with `box.NullableSetOfOne`
case object `dsl.Set<Decimal?>`    extends DslDecimal with `box.OneSetOfNullable`
case object `dsl.Set<Decimal?>?`   extends DslDecimal with `box.NullableSetOfNullable`
