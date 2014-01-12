package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslMoney
    extends OcdDsl
    with `type.Money`

case object `dsl.Money`          extends DslMoney with `box.One`
case object `dsl.Array<Money>`   extends DslMoney with `box.OneArrayOfOne`
case object `dsl.Money[]`        extends DslMoney with `box.OneBracketsOfOne`
case object `dsl.Array<Money?>`  extends DslMoney with `box.OneArrayOfNullable`
case object `dsl.Money?[]`       extends DslMoney with `box.OneBracketsOfNullable`
case object `dsl.List<Money>`    extends DslMoney with `box.OneListOfOne`
case object `dsl.List<Money?>`   extends DslMoney with `box.OneListOfNullable`
case object `dsl.Set<Money>`     extends DslMoney with `box.OneSetOfOne`
case object `dsl.Set<Money?>`    extends DslMoney with `box.OneSetOfNullable`
case object `dsl.Money?`         extends DslMoney with `box.Nullable`
case object `dsl.Array<Money>?`  extends DslMoney with `box.NullableArrayOfOne`
case object `dsl.Money[]?`       extends DslMoney with `box.NullableBracketsOfOne`
case object `dsl.Array<Money?>?` extends DslMoney with `box.NullableArrayOfNullable`
case object `dsl.Money?[]?`      extends DslMoney with `box.NullableBracketsOfNullable`
case object `dsl.List<Money>?`   extends DslMoney with `box.NullableListOfOne`
case object `dsl.List<Money?>?`  extends DslMoney with `box.NullableListOfNullable`
case object `dsl.Set<Money>?`    extends DslMoney with `box.NullableSetOfOne`
case object `dsl.Set<Money?>?`   extends DslMoney with `box.NullableSetOfNullable`

case object `dsl.MONEY`          extends DslMoney with `box.One`
case object `dsl.ARRAY<MONEY>`   extends DslMoney with `box.OneArrayOfOne`
case object `dsl.MONEY[]`        extends DslMoney with `box.OneBracketsOfOne`
case object `dsl.ARRAY<MONEY?>`  extends DslMoney with `box.OneArrayOfNullable`
case object `dsl.MONEY?[]`       extends DslMoney with `box.OneBracketsOfNullable`
case object `dsl.LIST<MONEY>`    extends DslMoney with `box.OneListOfOne`
case object `dsl.LIST<MONEY?>`   extends DslMoney with `box.OneListOfNullable`
case object `dsl.SET<MONEY>`     extends DslMoney with `box.OneSetOfOne`
case object `dsl.SET<MONEY?>`    extends DslMoney with `box.OneSetOfNullable`
case object `dsl.MONEY?`         extends DslMoney with `box.Nullable`
case object `dsl.ARRAY<MONEY>?`  extends DslMoney with `box.NullableArrayOfOne`
case object `dsl.MONEY[]?`       extends DslMoney with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<MONEY?>?` extends DslMoney with `box.NullableArrayOfNullable`
case object `dsl.MONEY?[]?`      extends DslMoney with `box.NullableBracketsOfNullable`
case object `dsl.LIST<MONEY>?`   extends DslMoney with `box.NullableListOfOne`
case object `dsl.LIST<MONEY?>?`  extends DslMoney with `box.NullableListOfNullable`
case object `dsl.SET<MONEY>?`    extends DslMoney with `box.NullableSetOfOne`
case object `dsl.SET<MONEY?>?`   extends DslMoney with `box.NullableSetOfNullable`

case object `dsl.money`          extends DslMoney with `box.One`
case object `dsl.array<money>`   extends DslMoney with `box.OneArrayOfOne`
case object `dsl.money[]`        extends DslMoney with `box.OneBracketsOfOne`
case object `dsl.array<money?>`  extends DslMoney with `box.OneArrayOfNullable`
case object `dsl.money?[]`       extends DslMoney with `box.OneBracketsOfNullable`
case object `dsl.list<money>`    extends DslMoney with `box.OneListOfOne`
case object `dsl.list<money?>`   extends DslMoney with `box.OneListOfNullable`
case object `dsl.set<money>`     extends DslMoney with `box.OneSetOfOne`
case object `dsl.set<money?>`    extends DslMoney with `box.OneSetOfNullable`
case object `dsl.money?`         extends DslMoney with `box.Nullable`
case object `dsl.array<money>?`  extends DslMoney with `box.NullableArrayOfOne`
case object `dsl.money[]?`       extends DslMoney with `box.NullableBracketsOfOne`
case object `dsl.array<money?>?` extends DslMoney with `box.NullableArrayOfNullable`
case object `dsl.money?[]?`      extends DslMoney with `box.NullableBracketsOfNullable`
case object `dsl.list<money>?`   extends DslMoney with `box.NullableListOfOne`
case object `dsl.list<money?>?`  extends DslMoney with `box.NullableListOfNullable`
case object `dsl.set<money>?`    extends DslMoney with `box.NullableSetOfOne`
case object `dsl.set<money?>?`   extends DslMoney with `box.NullableSetOfNullable`
