package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslIp
    extends OcdDslBoxType
    with `type.Ip`

case object `dsl.Ip`          extends DslIp with `box.One`
case object `dsl.Ip?`         extends DslIp with `box.Nullable`
case object `dsl.Array<Ip>`   extends DslIp with `box.OneArrayOfOne`
case object `dsl.Ip[]`        extends DslIp with `box.OneBracketsOfOne`
case object `dsl.Array<Ip>?`  extends DslIp with `box.NullableArrayOfOne`
case object `dsl.Ip[]?`       extends DslIp with `box.NullableBracketsOfOne`
case object `dsl.Array<Ip?>`  extends DslIp with `box.OneArrayOfNullable`
case object `dsl.Ip?[]`       extends DslIp with `box.OneBracketsOfNullable`
case object `dsl.Array<Ip?>?` extends DslIp with `box.NullableArrayOfNullable`
case object `dsl.Ip?[]?`      extends DslIp with `box.NullableBracketsOfNullable`
case object `dsl.List<Ip>`    extends DslIp with `box.OneListOfOne`
case object `dsl.List<Ip>?`   extends DslIp with `box.NullableListOfOne`
case object `dsl.List<Ip?>`   extends DslIp with `box.OneListOfNullable`
case object `dsl.List<Ip?>?`  extends DslIp with `box.NullableListOfNullable`
case object `dsl.Queue<Ip>`   extends DslIp with `box.OneQueueOfOne`
case object `dsl.Queue<Ip>?`  extends DslIp with `box.NullableQueueOfOne`
case object `dsl.Queue<Ip?>`  extends DslIp with `box.OneQueueOfNullable`
case object `dsl.Queue<Ip?>?` extends DslIp with `box.NullableQueueOfNullable`
case object `dsl.Set<Ip>`     extends DslIp with `box.OneSetOfOne`
case object `dsl.Set<Ip>?`    extends DslIp with `box.NullableSetOfOne`
case object `dsl.Set<Ip?>`    extends DslIp with `box.OneSetOfNullable`
case object `dsl.Set<Ip?>?`   extends DslIp with `box.NullableSetOfNullable`

case object `dsl.IP`          extends DslIp with `box.One`
case object `dsl.IP?`         extends DslIp with `box.Nullable`
case object `dsl.ARRAY<IP>`   extends DslIp with `box.OneArrayOfOne`
case object `dsl.IP[]`        extends DslIp with `box.OneBracketsOfOne`
case object `dsl.ARRAY<IP>?`  extends DslIp with `box.NullableArrayOfOne`
case object `dsl.IP[]?`       extends DslIp with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<IP?>`  extends DslIp with `box.OneArrayOfNullable`
case object `dsl.IP?[]`       extends DslIp with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<IP?>?` extends DslIp with `box.NullableArrayOfNullable`
case object `dsl.IP?[]?`      extends DslIp with `box.NullableBracketsOfNullable`
case object `dsl.LIST<IP>`    extends DslIp with `box.OneListOfOne`
case object `dsl.LIST<IP>?`   extends DslIp with `box.NullableListOfOne`
case object `dsl.LIST<IP?>`   extends DslIp with `box.OneListOfNullable`
case object `dsl.LIST<IP?>?`  extends DslIp with `box.NullableListOfNullable`
case object `dsl.QUEUE<IP>`   extends DslIp with `box.OneQueueOfOne`
case object `dsl.QUEUE<IP>?`  extends DslIp with `box.NullableQueueOfOne`
case object `dsl.QUEUE<IP?>`  extends DslIp with `box.OneQueueOfNullable`
case object `dsl.QUEUE<IP?>?` extends DslIp with `box.NullableQueueOfNullable`
case object `dsl.SET<IP>`     extends DslIp with `box.OneSetOfOne`
case object `dsl.SET<IP>?`    extends DslIp with `box.NullableSetOfOne`
case object `dsl.SET<IP?>`    extends DslIp with `box.OneSetOfNullable`
case object `dsl.SET<IP?>?`   extends DslIp with `box.NullableSetOfNullable`

case object `dsl.ip`          extends DslIp with `box.One`
case object `dsl.ip?`         extends DslIp with `box.Nullable`
case object `dsl.array<ip>`   extends DslIp with `box.OneArrayOfOne`
case object `dsl.ip[]`        extends DslIp with `box.OneBracketsOfOne`
case object `dsl.array<ip>?`  extends DslIp with `box.NullableArrayOfOne`
case object `dsl.ip[]?`       extends DslIp with `box.NullableBracketsOfOne`
case object `dsl.array<ip?>`  extends DslIp with `box.OneArrayOfNullable`
case object `dsl.ip?[]`       extends DslIp with `box.OneBracketsOfNullable`
case object `dsl.array<ip?>?` extends DslIp with `box.NullableArrayOfNullable`
case object `dsl.ip?[]?`      extends DslIp with `box.NullableBracketsOfNullable`
case object `dsl.list<ip>`    extends DslIp with `box.OneListOfOne`
case object `dsl.list<ip>?`   extends DslIp with `box.NullableListOfOne`
case object `dsl.list<ip?>`   extends DslIp with `box.OneListOfNullable`
case object `dsl.list<ip?>?`  extends DslIp with `box.NullableListOfNullable`
case object `dsl.queue<ip>`   extends DslIp with `box.OneQueueOfOne`
case object `dsl.queue<ip>?`  extends DslIp with `box.NullableQueueOfOne`
case object `dsl.queue<ip?>`  extends DslIp with `box.OneQueueOfNullable`
case object `dsl.queue<ip?>?` extends DslIp with `box.NullableQueueOfNullable`
case object `dsl.set<ip>`     extends DslIp with `box.OneSetOfOne`
case object `dsl.set<ip>?`    extends DslIp with `box.NullableSetOfOne`
case object `dsl.set<ip?>`    extends DslIp with `box.OneSetOfNullable`
case object `dsl.set<ip?>?`   extends DslIp with `box.NullableSetOfNullable`
