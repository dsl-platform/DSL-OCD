package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslLong
    extends OcdDslBoxType
    with `type.Long`

case object `dsl.Long`                extends DslLong with `box.One`
case object `dsl.Long?`               extends DslLong with `box.Nullable`
case object `dsl.Array<Long>`         extends DslLong with `box.OneArrayOfOne`
case object `dsl.Long[]`              extends DslLong with `box.OneBracketsOfOne`
case object `dsl.Array<Long>?`        extends DslLong with `box.NullableArrayOfOne`
case object `dsl.Long[]?`             extends DslLong with `box.NullableBracketsOfOne`
case object `dsl.Array<Long?>`        extends DslLong with `box.OneArrayOfNullable`
case object `dsl.Long?[]`             extends DslLong with `box.OneBracketsOfNullable`
case object `dsl.Array<Long?>?`       extends DslLong with `box.NullableArrayOfNullable`
case object `dsl.Long?[]?`            extends DslLong with `box.NullableBracketsOfNullable`
case object `dsl.List<Long>`          extends DslLong with `box.OneListOfOne`
case object `dsl.List<Long>?`         extends DslLong with `box.NullableListOfOne`
case object `dsl.List<Long?>`         extends DslLong with `box.OneListOfNullable`
case object `dsl.List<Long?>?`        extends DslLong with `box.NullableListOfNullable`
case object `dsl.Set<Long>`           extends DslLong with `box.OneSetOfOne`
case object `dsl.Set<Long>?`          extends DslLong with `box.NullableSetOfOne`
case object `dsl.Set<Long?>`          extends DslLong with `box.OneSetOfNullable`
case object `dsl.Set<Long?>?`         extends DslLong with `box.NullableSetOfNullable`
case object `dsl.Queue<Long>`         extends DslLong with `box.OneQueueOfOne`
case object `dsl.Queue<Long>?`        extends DslLong with `box.NullableQueueOfOne`
case object `dsl.Queue<Long?>`        extends DslLong with `box.OneQueueOfNullable`
case object `dsl.Queue<Long?>?`       extends DslLong with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Long>`   extends DslLong with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Long>?`  extends DslLong with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Long?>`  extends DslLong with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Long?>?` extends DslLong with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Long>`         extends DslLong with `box.OneStackOfOne`
case object `dsl.Stack<Long>?`        extends DslLong with `box.NullableStackOfOne`
case object `dsl.Stack<Long?>`        extends DslLong with `box.OneStackOfNullable`
case object `dsl.Stack<Long?>?`       extends DslLong with `box.NullableStackOfNullable`
case object `dsl.Vector<Long>`        extends DslLong with `box.OneVectorOfOne`
case object `dsl.Vector<Long>?`       extends DslLong with `box.NullableVectorOfOne`
case object `dsl.Vector<Long?>`       extends DslLong with `box.OneVectorOfNullable`
case object `dsl.Vector<Long?>?`      extends DslLong with `box.NullableVectorOfNullable`

object DslLongGrammarAliases1 {
  case object `dsl.LONG`                extends DslLong with `box.One`
  case object `dsl.LONG?`               extends DslLong with `box.Nullable`
  case object `dsl.ARRAY<LONG>`         extends DslLong with `box.OneArrayOfOne`
  case object `dsl.LONG[]`              extends DslLong with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<LONG>?`        extends DslLong with `box.NullableArrayOfOne`
  case object `dsl.LONG[]?`             extends DslLong with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<LONG?>`        extends DslLong with `box.OneArrayOfNullable`
  case object `dsl.LONG?[]`             extends DslLong with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<LONG?>?`       extends DslLong with `box.NullableArrayOfNullable`
  case object `dsl.LONG?[]?`            extends DslLong with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<LONG>`          extends DslLong with `box.OneListOfOne`
  case object `dsl.LIST<LONG>?`         extends DslLong with `box.NullableListOfOne`
  case object `dsl.LIST<LONG?>`         extends DslLong with `box.OneListOfNullable`
  case object `dsl.LIST<LONG?>?`        extends DslLong with `box.NullableListOfNullable`
  case object `dsl.SET<LONG>`           extends DslLong with `box.OneSetOfOne`
  case object `dsl.SET<LONG>?`          extends DslLong with `box.NullableSetOfOne`
  case object `dsl.SET<LONG?>`          extends DslLong with `box.OneSetOfNullable`
  case object `dsl.SET<LONG?>?`         extends DslLong with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<LONG>`         extends DslLong with `box.OneQueueOfOne`
  case object `dsl.QUEUE<LONG>?`        extends DslLong with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<LONG?>`        extends DslLong with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<LONG?>?`       extends DslLong with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<LONG>`   extends DslLong with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<LONG>?`  extends DslLong with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<LONG?>`  extends DslLong with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<LONG?>?` extends DslLong with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<LONG>`         extends DslLong with `box.OneStackOfOne`
  case object `dsl.STACK<LONG>?`        extends DslLong with `box.NullableStackOfOne`
  case object `dsl.STACK<LONG?>`        extends DslLong with `box.OneStackOfNullable`
  case object `dsl.STACK<LONG?>?`       extends DslLong with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<LONG>`        extends DslLong with `box.OneVectorOfOne`
  case object `dsl.VECTOR<LONG>?`       extends DslLong with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<LONG?>`       extends DslLong with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<LONG?>?`      extends DslLong with `box.NullableVectorOfNullable`
}

object DslLongGrammarAliases2 {
  case object `dsl.long`                extends DslLong with `box.One`
  case object `dsl.long?`               extends DslLong with `box.Nullable`
  case object `dsl.array<long>`         extends DslLong with `box.OneArrayOfOne`
  case object `dsl.long[]`              extends DslLong with `box.OneBracketsOfOne`
  case object `dsl.array<long>?`        extends DslLong with `box.NullableArrayOfOne`
  case object `dsl.long[]?`             extends DslLong with `box.NullableBracketsOfOne`
  case object `dsl.array<long?>`        extends DslLong with `box.OneArrayOfNullable`
  case object `dsl.long?[]`             extends DslLong with `box.OneBracketsOfNullable`
  case object `dsl.array<long?>?`       extends DslLong with `box.NullableArrayOfNullable`
  case object `dsl.long?[]?`            extends DslLong with `box.NullableBracketsOfNullable`
  case object `dsl.list<long>`          extends DslLong with `box.OneListOfOne`
  case object `dsl.list<long>?`         extends DslLong with `box.NullableListOfOne`
  case object `dsl.list<long?>`         extends DslLong with `box.OneListOfNullable`
  case object `dsl.list<long?>?`        extends DslLong with `box.NullableListOfNullable`
  case object `dsl.set<long>`           extends DslLong with `box.OneSetOfOne`
  case object `dsl.set<long>?`          extends DslLong with `box.NullableSetOfOne`
  case object `dsl.set<long?>`          extends DslLong with `box.OneSetOfNullable`
  case object `dsl.set<long?>?`         extends DslLong with `box.NullableSetOfNullable`
  case object `dsl.queue<long>`         extends DslLong with `box.OneQueueOfOne`
  case object `dsl.queue<long>?`        extends DslLong with `box.NullableQueueOfOne`
  case object `dsl.queue<long?>`        extends DslLong with `box.OneQueueOfNullable`
  case object `dsl.queue<long?>?`       extends DslLong with `box.NullableQueueOfNullable`
  case object `dsl.linked list<long>`   extends DslLong with `box.OneLinkedListOfOne`
  case object `dsl.linked list<long>?`  extends DslLong with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<long?>`  extends DslLong with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<long?>?` extends DslLong with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<long>`         extends DslLong with `box.OneStackOfOne`
  case object `dsl.stack<long>?`        extends DslLong with `box.NullableStackOfOne`
  case object `dsl.stack<long?>`        extends DslLong with `box.OneStackOfNullable`
  case object `dsl.stack<long?>?`       extends DslLong with `box.NullableStackOfNullable`
  case object `dsl.vector<long>`        extends DslLong with `box.OneVectorOfOne`
  case object `dsl.vector<long>?`       extends DslLong with `box.NullableVectorOfOne`
  case object `dsl.vector<long?>`       extends DslLong with `box.OneVectorOfNullable`
  case object `dsl.vector<long?>?`      extends DslLong with `box.NullableVectorOfNullable`
}
