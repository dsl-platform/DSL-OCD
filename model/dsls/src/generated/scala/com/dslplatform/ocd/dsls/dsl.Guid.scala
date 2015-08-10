package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslGuid
    extends OcdDslBoxType
    with `type.Guid`

case object `dsl.Guid`          extends DslGuid with `box.One`
case object `dsl.Guid?`         extends DslGuid with `box.Nullable`
case object `dsl.Array<Guid>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.Guid[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.Array<Guid>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.Guid[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.Array<Guid?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.Guid?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.Array<Guid?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.Guid?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.List<Guid>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.List<Guid>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.List<Guid?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.List<Guid?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.Queue<Guid>`   extends DslGuid with `box.OneQueueOfOne`
case object `dsl.Queue<Guid>?`  extends DslGuid with `box.NullableQueueOfOne`
case object `dsl.Queue<Guid?>`  extends DslGuid with `box.OneQueueOfNullable`
case object `dsl.Queue<Guid?>?` extends DslGuid with `box.NullableQueueOfNullable`
case object `dsl.Set<Guid>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.Set<Guid>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.Set<Guid?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.Set<Guid?>?`   extends DslGuid with `box.NullableSetOfNullable`

case object `dsl.GUID`          extends DslGuid with `box.One`
case object `dsl.GUID?`         extends DslGuid with `box.Nullable`
case object `dsl.ARRAY<GUID>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.GUID[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.ARRAY<GUID>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.GUID[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<GUID?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.GUID?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<GUID?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.GUID?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.LIST<GUID>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.LIST<GUID>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.LIST<GUID?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.LIST<GUID?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.QUEUE<GUID>`   extends DslGuid with `box.OneQueueOfOne`
case object `dsl.QUEUE<GUID>?`  extends DslGuid with `box.NullableQueueOfOne`
case object `dsl.QUEUE<GUID?>`  extends DslGuid with `box.OneQueueOfNullable`
case object `dsl.QUEUE<GUID?>?` extends DslGuid with `box.NullableQueueOfNullable`
case object `dsl.SET<GUID>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.SET<GUID>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.SET<GUID?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.SET<GUID?>?`   extends DslGuid with `box.NullableSetOfNullable`

case object `dsl.UUID`          extends DslGuid with `box.One`
case object `dsl.UUID?`         extends DslGuid with `box.Nullable`
case object `dsl.ARRAY<UUID>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.UUID[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.ARRAY<UUID>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.UUID[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<UUID?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.UUID?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<UUID?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.UUID?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.LIST<UUID>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.LIST<UUID>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.LIST<UUID?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.LIST<UUID?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.QUEUE<UUID>`   extends DslGuid with `box.OneQueueOfOne`
case object `dsl.QUEUE<UUID>?`  extends DslGuid with `box.NullableQueueOfOne`
case object `dsl.QUEUE<UUID?>`  extends DslGuid with `box.OneQueueOfNullable`
case object `dsl.QUEUE<UUID?>?` extends DslGuid with `box.NullableQueueOfNullable`
case object `dsl.SET<UUID>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.SET<UUID>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.SET<UUID?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.SET<UUID?>?`   extends DslGuid with `box.NullableSetOfNullable`

case object `dsl.Uuid`          extends DslGuid with `box.One`
case object `dsl.Uuid?`         extends DslGuid with `box.Nullable`
case object `dsl.Array<Uuid>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.Uuid[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.Array<Uuid>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.Uuid[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.Array<Uuid?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.Uuid?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.Array<Uuid?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.Uuid?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.List<Uuid>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.List<Uuid>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.List<Uuid?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.List<Uuid?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.Queue<Uuid>`   extends DslGuid with `box.OneQueueOfOne`
case object `dsl.Queue<Uuid>?`  extends DslGuid with `box.NullableQueueOfOne`
case object `dsl.Queue<Uuid?>`  extends DslGuid with `box.OneQueueOfNullable`
case object `dsl.Queue<Uuid?>?` extends DslGuid with `box.NullableQueueOfNullable`
case object `dsl.Set<Uuid>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.Set<Uuid>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.Set<Uuid?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.Set<Uuid?>?`   extends DslGuid with `box.NullableSetOfNullable`

case object `dsl.guid`          extends DslGuid with `box.One`
case object `dsl.guid?`         extends DslGuid with `box.Nullable`
case object `dsl.array<guid>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.guid[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.array<guid>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.guid[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.array<guid?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.guid?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.array<guid?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.guid?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.list<guid>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.list<guid>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.list<guid?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.list<guid?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.queue<guid>`   extends DslGuid with `box.OneQueueOfOne`
case object `dsl.queue<guid>?`  extends DslGuid with `box.NullableQueueOfOne`
case object `dsl.queue<guid?>`  extends DslGuid with `box.OneQueueOfNullable`
case object `dsl.queue<guid?>?` extends DslGuid with `box.NullableQueueOfNullable`
case object `dsl.set<guid>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.set<guid>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.set<guid?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.set<guid?>?`   extends DslGuid with `box.NullableSetOfNullable`

case object `dsl.uuid`          extends DslGuid with `box.One`
case object `dsl.uuid?`         extends DslGuid with `box.Nullable`
case object `dsl.array<uuid>`   extends DslGuid with `box.OneArrayOfOne`
case object `dsl.uuid[]`        extends DslGuid with `box.OneBracketsOfOne`
case object `dsl.array<uuid>?`  extends DslGuid with `box.NullableArrayOfOne`
case object `dsl.uuid[]?`       extends DslGuid with `box.NullableBracketsOfOne`
case object `dsl.array<uuid?>`  extends DslGuid with `box.OneArrayOfNullable`
case object `dsl.uuid?[]`       extends DslGuid with `box.OneBracketsOfNullable`
case object `dsl.array<uuid?>?` extends DslGuid with `box.NullableArrayOfNullable`
case object `dsl.uuid?[]?`      extends DslGuid with `box.NullableBracketsOfNullable`
case object `dsl.list<uuid>`    extends DslGuid with `box.OneListOfOne`
case object `dsl.list<uuid>?`   extends DslGuid with `box.NullableListOfOne`
case object `dsl.list<uuid?>`   extends DslGuid with `box.OneListOfNullable`
case object `dsl.list<uuid?>?`  extends DslGuid with `box.NullableListOfNullable`
case object `dsl.queue<uuid>`   extends DslGuid with `box.OneQueueOfOne`
case object `dsl.queue<uuid>?`  extends DslGuid with `box.NullableQueueOfOne`
case object `dsl.queue<uuid?>`  extends DslGuid with `box.OneQueueOfNullable`
case object `dsl.queue<uuid?>?` extends DslGuid with `box.NullableQueueOfNullable`
case object `dsl.set<uuid>`     extends DslGuid with `box.OneSetOfOne`
case object `dsl.set<uuid>?`    extends DslGuid with `box.NullableSetOfOne`
case object `dsl.set<uuid?>`    extends DslGuid with `box.OneSetOfNullable`
case object `dsl.set<uuid?>?`   extends DslGuid with `box.NullableSetOfNullable`
