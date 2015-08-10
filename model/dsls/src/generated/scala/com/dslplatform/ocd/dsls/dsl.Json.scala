package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslJson
    extends OcdDslBoxType
    with `type.Json`

case object `dsl.Json`          extends DslJson with `box.One`
case object `dsl.Json?`         extends DslJson with `box.Nullable`
case object `dsl.Array<Json>`   extends DslJson with `box.OneArrayOfOne`
case object `dsl.Json[]`        extends DslJson with `box.OneBracketsOfOne`
case object `dsl.Array<Json>?`  extends DslJson with `box.NullableArrayOfOne`
case object `dsl.Json[]?`       extends DslJson with `box.NullableBracketsOfOne`
case object `dsl.Array<Json?>`  extends DslJson with `box.OneArrayOfNullable`
case object `dsl.Json?[]`       extends DslJson with `box.OneBracketsOfNullable`
case object `dsl.Array<Json?>?` extends DslJson with `box.NullableArrayOfNullable`
case object `dsl.Json?[]?`      extends DslJson with `box.NullableBracketsOfNullable`
case object `dsl.List<Json>`    extends DslJson with `box.OneListOfOne`
case object `dsl.List<Json>?`   extends DslJson with `box.NullableListOfOne`
case object `dsl.List<Json?>`   extends DslJson with `box.OneListOfNullable`
case object `dsl.List<Json?>?`  extends DslJson with `box.NullableListOfNullable`
case object `dsl.Queue<Json>`   extends DslJson with `box.OneQueueOfOne`
case object `dsl.Queue<Json>?`  extends DslJson with `box.NullableQueueOfOne`
case object `dsl.Queue<Json?>`  extends DslJson with `box.OneQueueOfNullable`
case object `dsl.Queue<Json?>?` extends DslJson with `box.NullableQueueOfNullable`
case object `dsl.Set<Json>`     extends DslJson with `box.OneSetOfOne`
case object `dsl.Set<Json>?`    extends DslJson with `box.NullableSetOfOne`
case object `dsl.Set<Json?>`    extends DslJson with `box.OneSetOfNullable`
case object `dsl.Set<Json?>?`   extends DslJson with `box.NullableSetOfNullable`

case object `dsl.JSON`          extends DslJson with `box.One`
case object `dsl.JSON?`         extends DslJson with `box.Nullable`
case object `dsl.ARRAY<JSON>`   extends DslJson with `box.OneArrayOfOne`
case object `dsl.JSON[]`        extends DslJson with `box.OneBracketsOfOne`
case object `dsl.ARRAY<JSON>?`  extends DslJson with `box.NullableArrayOfOne`
case object `dsl.JSON[]?`       extends DslJson with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<JSON?>`  extends DslJson with `box.OneArrayOfNullable`
case object `dsl.JSON?[]`       extends DslJson with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<JSON?>?` extends DslJson with `box.NullableArrayOfNullable`
case object `dsl.JSON?[]?`      extends DslJson with `box.NullableBracketsOfNullable`
case object `dsl.LIST<JSON>`    extends DslJson with `box.OneListOfOne`
case object `dsl.LIST<JSON>?`   extends DslJson with `box.NullableListOfOne`
case object `dsl.LIST<JSON?>`   extends DslJson with `box.OneListOfNullable`
case object `dsl.LIST<JSON?>?`  extends DslJson with `box.NullableListOfNullable`
case object `dsl.QUEUE<JSON>`   extends DslJson with `box.OneQueueOfOne`
case object `dsl.QUEUE<JSON>?`  extends DslJson with `box.NullableQueueOfOne`
case object `dsl.QUEUE<JSON?>`  extends DslJson with `box.OneQueueOfNullable`
case object `dsl.QUEUE<JSON?>?` extends DslJson with `box.NullableQueueOfNullable`
case object `dsl.SET<JSON>`     extends DslJson with `box.OneSetOfOne`
case object `dsl.SET<JSON>?`    extends DslJson with `box.NullableSetOfOne`
case object `dsl.SET<JSON?>`    extends DslJson with `box.OneSetOfNullable`
case object `dsl.SET<JSON?>?`   extends DslJson with `box.NullableSetOfNullable`

case object `dsl.json`          extends DslJson with `box.One`
case object `dsl.json?`         extends DslJson with `box.Nullable`
case object `dsl.array<json>`   extends DslJson with `box.OneArrayOfOne`
case object `dsl.json[]`        extends DslJson with `box.OneBracketsOfOne`
case object `dsl.array<json>?`  extends DslJson with `box.NullableArrayOfOne`
case object `dsl.json[]?`       extends DslJson with `box.NullableBracketsOfOne`
case object `dsl.array<json?>`  extends DslJson with `box.OneArrayOfNullable`
case object `dsl.json?[]`       extends DslJson with `box.OneBracketsOfNullable`
case object `dsl.array<json?>?` extends DslJson with `box.NullableArrayOfNullable`
case object `dsl.json?[]?`      extends DslJson with `box.NullableBracketsOfNullable`
case object `dsl.list<json>`    extends DslJson with `box.OneListOfOne`
case object `dsl.list<json>?`   extends DslJson with `box.NullableListOfOne`
case object `dsl.list<json?>`   extends DslJson with `box.OneListOfNullable`
case object `dsl.list<json?>?`  extends DslJson with `box.NullableListOfNullable`
case object `dsl.queue<json>`   extends DslJson with `box.OneQueueOfOne`
case object `dsl.queue<json>?`  extends DslJson with `box.NullableQueueOfOne`
case object `dsl.queue<json?>`  extends DslJson with `box.OneQueueOfNullable`
case object `dsl.queue<json?>?` extends DslJson with `box.NullableQueueOfNullable`
case object `dsl.set<json>`     extends DslJson with `box.OneSetOfOne`
case object `dsl.set<json>?`    extends DslJson with `box.NullableSetOfOne`
case object `dsl.set<json?>`    extends DslJson with `box.OneSetOfNullable`
case object `dsl.set<json?>?`   extends DslJson with `box.NullableSetOfNullable`
