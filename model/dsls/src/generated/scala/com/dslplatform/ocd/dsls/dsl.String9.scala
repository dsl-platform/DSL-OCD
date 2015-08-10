package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslStringWithMaxLengthOf9
    extends OcdDslBoxType
    with `type.String(9)`

case object `dsl.String(9)`          extends DslStringWithMaxLengthOf9 with `box.One`
case object `dsl.String(9)?`         extends DslStringWithMaxLengthOf9 with `box.Nullable`
case object `dsl.Array<String(9)>`   extends DslStringWithMaxLengthOf9 with `box.OneArrayOfOne`
case object `dsl.String(9)[]`        extends DslStringWithMaxLengthOf9 with `box.OneBracketsOfOne`
case object `dsl.Array<String(9)>?`  extends DslStringWithMaxLengthOf9 with `box.NullableArrayOfOne`
case object `dsl.String(9)[]?`       extends DslStringWithMaxLengthOf9 with `box.NullableBracketsOfOne`
case object `dsl.Array<String(9)?>`  extends DslStringWithMaxLengthOf9 with `box.OneArrayOfNullable`
case object `dsl.String(9)?[]`       extends DslStringWithMaxLengthOf9 with `box.OneBracketsOfNullable`
case object `dsl.Array<String(9)?>?` extends DslStringWithMaxLengthOf9 with `box.NullableArrayOfNullable`
case object `dsl.String(9)?[]?`      extends DslStringWithMaxLengthOf9 with `box.NullableBracketsOfNullable`
case object `dsl.List<String(9)>`    extends DslStringWithMaxLengthOf9 with `box.OneListOfOne`
case object `dsl.List<String(9)>?`   extends DslStringWithMaxLengthOf9 with `box.NullableListOfOne`
case object `dsl.List<String(9)?>`   extends DslStringWithMaxLengthOf9 with `box.OneListOfNullable`
case object `dsl.List<String(9)?>?`  extends DslStringWithMaxLengthOf9 with `box.NullableListOfNullable`
case object `dsl.Queue<String(9)>`   extends DslStringWithMaxLengthOf9 with `box.OneQueueOfOne`
case object `dsl.Queue<String(9)>?`  extends DslStringWithMaxLengthOf9 with `box.NullableQueueOfOne`
case object `dsl.Queue<String(9)?>`  extends DslStringWithMaxLengthOf9 with `box.OneQueueOfNullable`
case object `dsl.Queue<String(9)?>?` extends DslStringWithMaxLengthOf9 with `box.NullableQueueOfNullable`
case object `dsl.Set<String(9)>`     extends DslStringWithMaxLengthOf9 with `box.OneSetOfOne`
case object `dsl.Set<String(9)>?`    extends DslStringWithMaxLengthOf9 with `box.NullableSetOfOne`
case object `dsl.Set<String(9)?>`    extends DslStringWithMaxLengthOf9 with `box.OneSetOfNullable`
case object `dsl.Set<String(9)?>?`   extends DslStringWithMaxLengthOf9 with `box.NullableSetOfNullable`

case object `dsl.STRING(9)`          extends DslStringWithMaxLengthOf9 with `box.One`
case object `dsl.STRING(9)?`         extends DslStringWithMaxLengthOf9 with `box.Nullable`
case object `dsl.ARRAY<STRING(9)>`   extends DslStringWithMaxLengthOf9 with `box.OneArrayOfOne`
case object `dsl.STRING(9)[]`        extends DslStringWithMaxLengthOf9 with `box.OneBracketsOfOne`
case object `dsl.ARRAY<STRING(9)>?`  extends DslStringWithMaxLengthOf9 with `box.NullableArrayOfOne`
case object `dsl.STRING(9)[]?`       extends DslStringWithMaxLengthOf9 with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<STRING(9)?>`  extends DslStringWithMaxLengthOf9 with `box.OneArrayOfNullable`
case object `dsl.STRING(9)?[]`       extends DslStringWithMaxLengthOf9 with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<STRING(9)?>?` extends DslStringWithMaxLengthOf9 with `box.NullableArrayOfNullable`
case object `dsl.STRING(9)?[]?`      extends DslStringWithMaxLengthOf9 with `box.NullableBracketsOfNullable`
case object `dsl.LIST<STRING(9)>`    extends DslStringWithMaxLengthOf9 with `box.OneListOfOne`
case object `dsl.LIST<STRING(9)>?`   extends DslStringWithMaxLengthOf9 with `box.NullableListOfOne`
case object `dsl.LIST<STRING(9)?>`   extends DslStringWithMaxLengthOf9 with `box.OneListOfNullable`
case object `dsl.LIST<STRING(9)?>?`  extends DslStringWithMaxLengthOf9 with `box.NullableListOfNullable`
case object `dsl.QUEUE<STRING(9)>`   extends DslStringWithMaxLengthOf9 with `box.OneQueueOfOne`
case object `dsl.QUEUE<STRING(9)>?`  extends DslStringWithMaxLengthOf9 with `box.NullableQueueOfOne`
case object `dsl.QUEUE<STRING(9)?>`  extends DslStringWithMaxLengthOf9 with `box.OneQueueOfNullable`
case object `dsl.QUEUE<STRING(9)?>?` extends DslStringWithMaxLengthOf9 with `box.NullableQueueOfNullable`
case object `dsl.SET<STRING(9)>`     extends DslStringWithMaxLengthOf9 with `box.OneSetOfOne`
case object `dsl.SET<STRING(9)>?`    extends DslStringWithMaxLengthOf9 with `box.NullableSetOfOne`
case object `dsl.SET<STRING(9)?>`    extends DslStringWithMaxLengthOf9 with `box.OneSetOfNullable`
case object `dsl.SET<STRING(9)?>?`   extends DslStringWithMaxLengthOf9 with `box.NullableSetOfNullable`

case object `dsl.string(9)`          extends DslStringWithMaxLengthOf9 with `box.One`
case object `dsl.string(9)?`         extends DslStringWithMaxLengthOf9 with `box.Nullable`
case object `dsl.array<string(9)>`   extends DslStringWithMaxLengthOf9 with `box.OneArrayOfOne`
case object `dsl.string(9)[]`        extends DslStringWithMaxLengthOf9 with `box.OneBracketsOfOne`
case object `dsl.array<string(9)>?`  extends DslStringWithMaxLengthOf9 with `box.NullableArrayOfOne`
case object `dsl.string(9)[]?`       extends DslStringWithMaxLengthOf9 with `box.NullableBracketsOfOne`
case object `dsl.array<string(9)?>`  extends DslStringWithMaxLengthOf9 with `box.OneArrayOfNullable`
case object `dsl.string(9)?[]`       extends DslStringWithMaxLengthOf9 with `box.OneBracketsOfNullable`
case object `dsl.array<string(9)?>?` extends DslStringWithMaxLengthOf9 with `box.NullableArrayOfNullable`
case object `dsl.string(9)?[]?`      extends DslStringWithMaxLengthOf9 with `box.NullableBracketsOfNullable`
case object `dsl.list<string(9)>`    extends DslStringWithMaxLengthOf9 with `box.OneListOfOne`
case object `dsl.list<string(9)>?`   extends DslStringWithMaxLengthOf9 with `box.NullableListOfOne`
case object `dsl.list<string(9)?>`   extends DslStringWithMaxLengthOf9 with `box.OneListOfNullable`
case object `dsl.list<string(9)?>?`  extends DslStringWithMaxLengthOf9 with `box.NullableListOfNullable`
case object `dsl.queue<string(9)>`   extends DslStringWithMaxLengthOf9 with `box.OneQueueOfOne`
case object `dsl.queue<string(9)>?`  extends DslStringWithMaxLengthOf9 with `box.NullableQueueOfOne`
case object `dsl.queue<string(9)?>`  extends DslStringWithMaxLengthOf9 with `box.OneQueueOfNullable`
case object `dsl.queue<string(9)?>?` extends DslStringWithMaxLengthOf9 with `box.NullableQueueOfNullable`
case object `dsl.set<string(9)>`     extends DslStringWithMaxLengthOf9 with `box.OneSetOfOne`
case object `dsl.set<string(9)>?`    extends DslStringWithMaxLengthOf9 with `box.NullableSetOfOne`
case object `dsl.set<string(9)?>`    extends DslStringWithMaxLengthOf9 with `box.OneSetOfNullable`
case object `dsl.set<string(9)?>?`   extends DslStringWithMaxLengthOf9 with `box.NullableSetOfNullable`
