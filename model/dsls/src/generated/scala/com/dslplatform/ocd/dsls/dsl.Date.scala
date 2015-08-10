package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslDate
    extends OcdDslBoxType
    with `type.Date`

case object `dsl.Date`          extends DslDate with `box.One`
case object `dsl.Date?`         extends DslDate with `box.Nullable`
case object `dsl.Array<Date>`   extends DslDate with `box.OneArrayOfOne`
case object `dsl.Date[]`        extends DslDate with `box.OneBracketsOfOne`
case object `dsl.Array<Date>?`  extends DslDate with `box.NullableArrayOfOne`
case object `dsl.Date[]?`       extends DslDate with `box.NullableBracketsOfOne`
case object `dsl.Array<Date?>`  extends DslDate with `box.OneArrayOfNullable`
case object `dsl.Date?[]`       extends DslDate with `box.OneBracketsOfNullable`
case object `dsl.Array<Date?>?` extends DslDate with `box.NullableArrayOfNullable`
case object `dsl.Date?[]?`      extends DslDate with `box.NullableBracketsOfNullable`
case object `dsl.List<Date>`    extends DslDate with `box.OneListOfOne`
case object `dsl.List<Date>?`   extends DslDate with `box.NullableListOfOne`
case object `dsl.List<Date?>`   extends DslDate with `box.OneListOfNullable`
case object `dsl.List<Date?>?`  extends DslDate with `box.NullableListOfNullable`
case object `dsl.Queue<Date>`   extends DslDate with `box.OneQueueOfOne`
case object `dsl.Queue<Date>?`  extends DslDate with `box.NullableQueueOfOne`
case object `dsl.Queue<Date?>`  extends DslDate with `box.OneQueueOfNullable`
case object `dsl.Queue<Date?>?` extends DslDate with `box.NullableQueueOfNullable`
case object `dsl.Set<Date>`     extends DslDate with `box.OneSetOfOne`
case object `dsl.Set<Date>?`    extends DslDate with `box.NullableSetOfOne`
case object `dsl.Set<Date?>`    extends DslDate with `box.OneSetOfNullable`
case object `dsl.Set<Date?>?`   extends DslDate with `box.NullableSetOfNullable`

case object `dsl.DATE`          extends DslDate with `box.One`
case object `dsl.DATE?`         extends DslDate with `box.Nullable`
case object `dsl.ARRAY<DATE>`   extends DslDate with `box.OneArrayOfOne`
case object `dsl.DATE[]`        extends DslDate with `box.OneBracketsOfOne`
case object `dsl.ARRAY<DATE>?`  extends DslDate with `box.NullableArrayOfOne`
case object `dsl.DATE[]?`       extends DslDate with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<DATE?>`  extends DslDate with `box.OneArrayOfNullable`
case object `dsl.DATE?[]`       extends DslDate with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<DATE?>?` extends DslDate with `box.NullableArrayOfNullable`
case object `dsl.DATE?[]?`      extends DslDate with `box.NullableBracketsOfNullable`
case object `dsl.LIST<DATE>`    extends DslDate with `box.OneListOfOne`
case object `dsl.LIST<DATE>?`   extends DslDate with `box.NullableListOfOne`
case object `dsl.LIST<DATE?>`   extends DslDate with `box.OneListOfNullable`
case object `dsl.LIST<DATE?>?`  extends DslDate with `box.NullableListOfNullable`
case object `dsl.QUEUE<DATE>`   extends DslDate with `box.OneQueueOfOne`
case object `dsl.QUEUE<DATE>?`  extends DslDate with `box.NullableQueueOfOne`
case object `dsl.QUEUE<DATE?>`  extends DslDate with `box.OneQueueOfNullable`
case object `dsl.QUEUE<DATE?>?` extends DslDate with `box.NullableQueueOfNullable`
case object `dsl.SET<DATE>`     extends DslDate with `box.OneSetOfOne`
case object `dsl.SET<DATE>?`    extends DslDate with `box.NullableSetOfOne`
case object `dsl.SET<DATE?>`    extends DslDate with `box.OneSetOfNullable`
case object `dsl.SET<DATE?>?`   extends DslDate with `box.NullableSetOfNullable`

case object `dsl.date`          extends DslDate with `box.One`
case object `dsl.date?`         extends DslDate with `box.Nullable`
case object `dsl.array<date>`   extends DslDate with `box.OneArrayOfOne`
case object `dsl.date[]`        extends DslDate with `box.OneBracketsOfOne`
case object `dsl.array<date>?`  extends DslDate with `box.NullableArrayOfOne`
case object `dsl.date[]?`       extends DslDate with `box.NullableBracketsOfOne`
case object `dsl.array<date?>`  extends DslDate with `box.OneArrayOfNullable`
case object `dsl.date?[]`       extends DslDate with `box.OneBracketsOfNullable`
case object `dsl.array<date?>?` extends DslDate with `box.NullableArrayOfNullable`
case object `dsl.date?[]?`      extends DslDate with `box.NullableBracketsOfNullable`
case object `dsl.list<date>`    extends DslDate with `box.OneListOfOne`
case object `dsl.list<date>?`   extends DslDate with `box.NullableListOfOne`
case object `dsl.list<date?>`   extends DslDate with `box.OneListOfNullable`
case object `dsl.list<date?>?`  extends DslDate with `box.NullableListOfNullable`
case object `dsl.queue<date>`   extends DslDate with `box.OneQueueOfOne`
case object `dsl.queue<date>?`  extends DslDate with `box.NullableQueueOfOne`
case object `dsl.queue<date?>`  extends DslDate with `box.OneQueueOfNullable`
case object `dsl.queue<date?>?` extends DslDate with `box.NullableQueueOfNullable`
case object `dsl.set<date>`     extends DslDate with `box.OneSetOfOne`
case object `dsl.set<date>?`    extends DslDate with `box.NullableSetOfOne`
case object `dsl.set<date?>`    extends DslDate with `box.OneSetOfNullable`
case object `dsl.set<date?>?`   extends DslDate with `box.NullableSetOfNullable`
