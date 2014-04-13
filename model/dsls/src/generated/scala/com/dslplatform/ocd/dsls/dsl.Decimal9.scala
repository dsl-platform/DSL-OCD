package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslDecimalWithScaleOf9
    extends OcdDslBoxType
    with `type.Decimal(9)`

case object `dsl.Decimal(9)`          extends DslDecimalWithScaleOf9 with `box.One`
case object `dsl.Decimal(9)?`         extends DslDecimalWithScaleOf9 with `box.Nullable`
case object `dsl.Array<Decimal(9)>`   extends DslDecimalWithScaleOf9 with `box.OneArrayOfOne`
case object `dsl.Decimal(9)[]`        extends DslDecimalWithScaleOf9 with `box.OneBracketsOfOne`
case object `dsl.Array<Decimal(9)>?`  extends DslDecimalWithScaleOf9 with `box.NullableArrayOfOne`
case object `dsl.Decimal(9)[]?`       extends DslDecimalWithScaleOf9 with `box.NullableBracketsOfOne`
case object `dsl.Array<Decimal(9)?>`  extends DslDecimalWithScaleOf9 with `box.OneArrayOfNullable`
case object `dsl.Decimal(9)?[]`       extends DslDecimalWithScaleOf9 with `box.OneBracketsOfNullable`
case object `dsl.Array<Decimal(9)?>?` extends DslDecimalWithScaleOf9 with `box.NullableArrayOfNullable`
case object `dsl.Decimal(9)?[]?`      extends DslDecimalWithScaleOf9 with `box.NullableBracketsOfNullable`
case object `dsl.List<Decimal(9)>`    extends DslDecimalWithScaleOf9 with `box.OneListOfOne`
case object `dsl.List<Decimal(9)>?`   extends DslDecimalWithScaleOf9 with `box.NullableListOfOne`
case object `dsl.List<Decimal(9)?>`   extends DslDecimalWithScaleOf9 with `box.OneListOfNullable`
case object `dsl.List<Decimal(9)?>?`  extends DslDecimalWithScaleOf9 with `box.NullableListOfNullable`
case object `dsl.Set<Decimal(9)>`     extends DslDecimalWithScaleOf9 with `box.OneSetOfOne`
case object `dsl.Set<Decimal(9)>?`    extends DslDecimalWithScaleOf9 with `box.NullableSetOfOne`
case object `dsl.Set<Decimal(9)?>`    extends DslDecimalWithScaleOf9 with `box.OneSetOfNullable`
case object `dsl.Set<Decimal(9)?>?`   extends DslDecimalWithScaleOf9 with `box.NullableSetOfNullable`
