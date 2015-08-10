package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslTime
    extends OcdDslBoxType
    with `type.Time`

case object `dsl.Time`          extends DslTime with `box.One`
case object `dsl.Time?`         extends DslTime with `box.Nullable`
case object `dsl.Array<Time>`   extends DslTime with `box.OneArrayOfOne`
case object `dsl.Time[]`        extends DslTime with `box.OneBracketsOfOne`
case object `dsl.Array<Time>?`  extends DslTime with `box.NullableArrayOfOne`
case object `dsl.Time[]?`       extends DslTime with `box.NullableBracketsOfOne`
case object `dsl.Array<Time?>`  extends DslTime with `box.OneArrayOfNullable`
case object `dsl.Time?[]`       extends DslTime with `box.OneBracketsOfNullable`
case object `dsl.Array<Time?>?` extends DslTime with `box.NullableArrayOfNullable`
case object `dsl.Time?[]?`      extends DslTime with `box.NullableBracketsOfNullable`
case object `dsl.List<Time>`    extends DslTime with `box.OneListOfOne`
case object `dsl.List<Time>?`   extends DslTime with `box.NullableListOfOne`
case object `dsl.List<Time?>`   extends DslTime with `box.OneListOfNullable`
case object `dsl.List<Time?>?`  extends DslTime with `box.NullableListOfNullable`
case object `dsl.Queue<Time>`   extends DslTime with `box.OneQueueOfOne`
case object `dsl.Queue<Time>?`  extends DslTime with `box.NullableQueueOfOne`
case object `dsl.Queue<Time?>`  extends DslTime with `box.OneQueueOfNullable`
case object `dsl.Queue<Time?>?` extends DslTime with `box.NullableQueueOfNullable`
case object `dsl.Set<Time>`     extends DslTime with `box.OneSetOfOne`
case object `dsl.Set<Time>?`    extends DslTime with `box.NullableSetOfOne`
case object `dsl.Set<Time?>`    extends DslTime with `box.OneSetOfNullable`
case object `dsl.Set<Time?>?`   extends DslTime with `box.NullableSetOfNullable`

case object `dsl.TIME`          extends DslTime with `box.One`
case object `dsl.TIME?`         extends DslTime with `box.Nullable`
case object `dsl.ARRAY<TIME>`   extends DslTime with `box.OneArrayOfOne`
case object `dsl.TIME[]`        extends DslTime with `box.OneBracketsOfOne`
case object `dsl.ARRAY<TIME>?`  extends DslTime with `box.NullableArrayOfOne`
case object `dsl.TIME[]?`       extends DslTime with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<TIME?>`  extends DslTime with `box.OneArrayOfNullable`
case object `dsl.TIME?[]`       extends DslTime with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<TIME?>?` extends DslTime with `box.NullableArrayOfNullable`
case object `dsl.TIME?[]?`      extends DslTime with `box.NullableBracketsOfNullable`
case object `dsl.LIST<TIME>`    extends DslTime with `box.OneListOfOne`
case object `dsl.LIST<TIME>?`   extends DslTime with `box.NullableListOfOne`
case object `dsl.LIST<TIME?>`   extends DslTime with `box.OneListOfNullable`
case object `dsl.LIST<TIME?>?`  extends DslTime with `box.NullableListOfNullable`
case object `dsl.QUEUE<TIME>`   extends DslTime with `box.OneQueueOfOne`
case object `dsl.QUEUE<TIME>?`  extends DslTime with `box.NullableQueueOfOne`
case object `dsl.QUEUE<TIME?>`  extends DslTime with `box.OneQueueOfNullable`
case object `dsl.QUEUE<TIME?>?` extends DslTime with `box.NullableQueueOfNullable`
case object `dsl.SET<TIME>`     extends DslTime with `box.OneSetOfOne`
case object `dsl.SET<TIME>?`    extends DslTime with `box.NullableSetOfOne`
case object `dsl.SET<TIME?>`    extends DslTime with `box.OneSetOfNullable`
case object `dsl.SET<TIME?>?`   extends DslTime with `box.NullableSetOfNullable`

case object `dsl.time`          extends DslTime with `box.One`
case object `dsl.time?`         extends DslTime with `box.Nullable`
case object `dsl.array<time>`   extends DslTime with `box.OneArrayOfOne`
case object `dsl.time[]`        extends DslTime with `box.OneBracketsOfOne`
case object `dsl.array<time>?`  extends DslTime with `box.NullableArrayOfOne`
case object `dsl.time[]?`       extends DslTime with `box.NullableBracketsOfOne`
case object `dsl.array<time?>`  extends DslTime with `box.OneArrayOfNullable`
case object `dsl.time?[]`       extends DslTime with `box.OneBracketsOfNullable`
case object `dsl.array<time?>?` extends DslTime with `box.NullableArrayOfNullable`
case object `dsl.time?[]?`      extends DslTime with `box.NullableBracketsOfNullable`
case object `dsl.list<time>`    extends DslTime with `box.OneListOfOne`
case object `dsl.list<time>?`   extends DslTime with `box.NullableListOfOne`
case object `dsl.list<time?>`   extends DslTime with `box.OneListOfNullable`
case object `dsl.list<time?>?`  extends DslTime with `box.NullableListOfNullable`
case object `dsl.queue<time>`   extends DslTime with `box.OneQueueOfOne`
case object `dsl.queue<time>?`  extends DslTime with `box.NullableQueueOfOne`
case object `dsl.queue<time?>`  extends DslTime with `box.OneQueueOfNullable`
case object `dsl.queue<time?>?` extends DslTime with `box.NullableQueueOfNullable`
case object `dsl.set<time>`     extends DslTime with `box.OneSetOfOne`
case object `dsl.set<time>?`    extends DslTime with `box.NullableSetOfOne`
case object `dsl.set<time?>`    extends DslTime with `box.OneSetOfNullable`
case object `dsl.set<time?>?`   extends DslTime with `box.NullableSetOfNullable`
