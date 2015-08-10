package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslSecret
    extends OcdDslBoxType
    with `type.Secret`

case object `dsl.Secret`          extends DslSecret with `box.One`
case object `dsl.Secret?`         extends DslSecret with `box.Nullable`
case object `dsl.Array<Secret>`   extends DslSecret with `box.OneArrayOfOne`
case object `dsl.Secret[]`        extends DslSecret with `box.OneBracketsOfOne`
case object `dsl.Array<Secret>?`  extends DslSecret with `box.NullableArrayOfOne`
case object `dsl.Secret[]?`       extends DslSecret with `box.NullableBracketsOfOne`
case object `dsl.Array<Secret?>`  extends DslSecret with `box.OneArrayOfNullable`
case object `dsl.Secret?[]`       extends DslSecret with `box.OneBracketsOfNullable`
case object `dsl.Array<Secret?>?` extends DslSecret with `box.NullableArrayOfNullable`
case object `dsl.Secret?[]?`      extends DslSecret with `box.NullableBracketsOfNullable`
case object `dsl.List<Secret>`    extends DslSecret with `box.OneListOfOne`
case object `dsl.List<Secret>?`   extends DslSecret with `box.NullableListOfOne`
case object `dsl.List<Secret?>`   extends DslSecret with `box.OneListOfNullable`
case object `dsl.List<Secret?>?`  extends DslSecret with `box.NullableListOfNullable`
case object `dsl.Queue<Secret>`   extends DslSecret with `box.OneQueueOfOne`
case object `dsl.Queue<Secret>?`  extends DslSecret with `box.NullableQueueOfOne`
case object `dsl.Queue<Secret?>`  extends DslSecret with `box.OneQueueOfNullable`
case object `dsl.Queue<Secret?>?` extends DslSecret with `box.NullableQueueOfNullable`
case object `dsl.Set<Secret>`     extends DslSecret with `box.OneSetOfOne`
case object `dsl.Set<Secret>?`    extends DslSecret with `box.NullableSetOfOne`
case object `dsl.Set<Secret?>`    extends DslSecret with `box.OneSetOfNullable`
case object `dsl.Set<Secret?>?`   extends DslSecret with `box.NullableSetOfNullable`

case object `dsl.SECRET`          extends DslSecret with `box.One`
case object `dsl.SECRET?`         extends DslSecret with `box.Nullable`
case object `dsl.ARRAY<SECRET>`   extends DslSecret with `box.OneArrayOfOne`
case object `dsl.SECRET[]`        extends DslSecret with `box.OneBracketsOfOne`
case object `dsl.ARRAY<SECRET>?`  extends DslSecret with `box.NullableArrayOfOne`
case object `dsl.SECRET[]?`       extends DslSecret with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<SECRET?>`  extends DslSecret with `box.OneArrayOfNullable`
case object `dsl.SECRET?[]`       extends DslSecret with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<SECRET?>?` extends DslSecret with `box.NullableArrayOfNullable`
case object `dsl.SECRET?[]?`      extends DslSecret with `box.NullableBracketsOfNullable`
case object `dsl.LIST<SECRET>`    extends DslSecret with `box.OneListOfOne`
case object `dsl.LIST<SECRET>?`   extends DslSecret with `box.NullableListOfOne`
case object `dsl.LIST<SECRET?>`   extends DslSecret with `box.OneListOfNullable`
case object `dsl.LIST<SECRET?>?`  extends DslSecret with `box.NullableListOfNullable`
case object `dsl.QUEUE<SECRET>`   extends DslSecret with `box.OneQueueOfOne`
case object `dsl.QUEUE<SECRET>?`  extends DslSecret with `box.NullableQueueOfOne`
case object `dsl.QUEUE<SECRET?>`  extends DslSecret with `box.OneQueueOfNullable`
case object `dsl.QUEUE<SECRET?>?` extends DslSecret with `box.NullableQueueOfNullable`
case object `dsl.SET<SECRET>`     extends DslSecret with `box.OneSetOfOne`
case object `dsl.SET<SECRET>?`    extends DslSecret with `box.NullableSetOfOne`
case object `dsl.SET<SECRET?>`    extends DslSecret with `box.OneSetOfNullable`
case object `dsl.SET<SECRET?>?`   extends DslSecret with `box.NullableSetOfNullable`

case object `dsl.secret`          extends DslSecret with `box.One`
case object `dsl.secret?`         extends DslSecret with `box.Nullable`
case object `dsl.array<secret>`   extends DslSecret with `box.OneArrayOfOne`
case object `dsl.secret[]`        extends DslSecret with `box.OneBracketsOfOne`
case object `dsl.array<secret>?`  extends DslSecret with `box.NullableArrayOfOne`
case object `dsl.secret[]?`       extends DslSecret with `box.NullableBracketsOfOne`
case object `dsl.array<secret?>`  extends DslSecret with `box.OneArrayOfNullable`
case object `dsl.secret?[]`       extends DslSecret with `box.OneBracketsOfNullable`
case object `dsl.array<secret?>?` extends DslSecret with `box.NullableArrayOfNullable`
case object `dsl.secret?[]?`      extends DslSecret with `box.NullableBracketsOfNullable`
case object `dsl.list<secret>`    extends DslSecret with `box.OneListOfOne`
case object `dsl.list<secret>?`   extends DslSecret with `box.NullableListOfOne`
case object `dsl.list<secret?>`   extends DslSecret with `box.OneListOfNullable`
case object `dsl.list<secret?>?`  extends DslSecret with `box.NullableListOfNullable`
case object `dsl.queue<secret>`   extends DslSecret with `box.OneQueueOfOne`
case object `dsl.queue<secret>?`  extends DslSecret with `box.NullableQueueOfOne`
case object `dsl.queue<secret?>`  extends DslSecret with `box.OneQueueOfNullable`
case object `dsl.queue<secret?>?` extends DslSecret with `box.NullableQueueOfNullable`
case object `dsl.set<secret>`     extends DslSecret with `box.OneSetOfOne`
case object `dsl.set<secret>?`    extends DslSecret with `box.NullableSetOfOne`
case object `dsl.set<secret?>`    extends DslSecret with `box.OneSetOfNullable`
case object `dsl.set<secret?>?`   extends DslSecret with `box.NullableSetOfNullable`
