package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslTimestamp
    extends OcdDslBoxType
    with `type.Timestamp`

case object `dsl.Timestamp`                extends DslTimestamp with `box.One`
case object `dsl.Timestamp?`               extends DslTimestamp with `box.Nullable`
case object `dsl.Array<Timestamp>`         extends DslTimestamp with `box.OneArrayOfOne`
case object `dsl.Timestamp[]`              extends DslTimestamp with `box.OneBracketsOfOne`
case object `dsl.Array<Timestamp>?`        extends DslTimestamp with `box.NullableArrayOfOne`
case object `dsl.Timestamp[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
case object `dsl.Array<Timestamp?>`        extends DslTimestamp with `box.OneArrayOfNullable`
case object `dsl.Timestamp?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
case object `dsl.Array<Timestamp?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
case object `dsl.Timestamp?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
case object `dsl.List<Timestamp>`          extends DslTimestamp with `box.OneListOfOne`
case object `dsl.List<Timestamp>?`         extends DslTimestamp with `box.NullableListOfOne`
case object `dsl.List<Timestamp?>`         extends DslTimestamp with `box.OneListOfNullable`
case object `dsl.List<Timestamp?>?`        extends DslTimestamp with `box.NullableListOfNullable`
case object `dsl.Set<Timestamp>`           extends DslTimestamp with `box.OneSetOfOne`
case object `dsl.Set<Timestamp>?`          extends DslTimestamp with `box.NullableSetOfOne`
case object `dsl.Set<Timestamp?>`          extends DslTimestamp with `box.OneSetOfNullable`
case object `dsl.Set<Timestamp?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
case object `dsl.Queue<Timestamp>`         extends DslTimestamp with `box.OneQueueOfOne`
case object `dsl.Queue<Timestamp>?`        extends DslTimestamp with `box.NullableQueueOfOne`
case object `dsl.Queue<Timestamp?>`        extends DslTimestamp with `box.OneQueueOfNullable`
case object `dsl.Queue<Timestamp?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Timestamp>`   extends DslTimestamp with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Timestamp>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Timestamp?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Timestamp?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Timestamp>`         extends DslTimestamp with `box.OneStackOfOne`
case object `dsl.Stack<Timestamp>?`        extends DslTimestamp with `box.NullableStackOfOne`
case object `dsl.Stack<Timestamp?>`        extends DslTimestamp with `box.OneStackOfNullable`
case object `dsl.Stack<Timestamp?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
case object `dsl.Vector<Timestamp>`        extends DslTimestamp with `box.OneVectorOfOne`
case object `dsl.Vector<Timestamp>?`       extends DslTimestamp with `box.NullableVectorOfOne`
case object `dsl.Vector<Timestamp?>`       extends DslTimestamp with `box.OneVectorOfNullable`
case object `dsl.Vector<Timestamp?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`

object DslTimestampGrammarAliases1 {
  case object `dsl.DATETIME`                extends DslTimestamp with `box.One`
  case object `dsl.DATETIME?`               extends DslTimestamp with `box.Nullable`
  case object `dsl.ARRAY<DATETIME>`         extends DslTimestamp with `box.OneArrayOfOne`
  case object `dsl.DATETIME[]`              extends DslTimestamp with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<DATETIME>?`        extends DslTimestamp with `box.NullableArrayOfOne`
  case object `dsl.DATETIME[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<DATETIME?>`        extends DslTimestamp with `box.OneArrayOfNullable`
  case object `dsl.DATETIME?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<DATETIME?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
  case object `dsl.DATETIME?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<DATETIME>`          extends DslTimestamp with `box.OneListOfOne`
  case object `dsl.LIST<DATETIME>?`         extends DslTimestamp with `box.NullableListOfOne`
  case object `dsl.LIST<DATETIME?>`         extends DslTimestamp with `box.OneListOfNullable`
  case object `dsl.LIST<DATETIME?>?`        extends DslTimestamp with `box.NullableListOfNullable`
  case object `dsl.SET<DATETIME>`           extends DslTimestamp with `box.OneSetOfOne`
  case object `dsl.SET<DATETIME>?`          extends DslTimestamp with `box.NullableSetOfOne`
  case object `dsl.SET<DATETIME?>`          extends DslTimestamp with `box.OneSetOfNullable`
  case object `dsl.SET<DATETIME?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<DATETIME>`         extends DslTimestamp with `box.OneQueueOfOne`
  case object `dsl.QUEUE<DATETIME>?`        extends DslTimestamp with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<DATETIME?>`        extends DslTimestamp with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<DATETIME?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<DATETIME>`   extends DslTimestamp with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<DATETIME>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<DATETIME?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<DATETIME?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<DATETIME>`         extends DslTimestamp with `box.OneStackOfOne`
  case object `dsl.STACK<DATETIME>?`        extends DslTimestamp with `box.NullableStackOfOne`
  case object `dsl.STACK<DATETIME?>`        extends DslTimestamp with `box.OneStackOfNullable`
  case object `dsl.STACK<DATETIME?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<DATETIME>`        extends DslTimestamp with `box.OneVectorOfOne`
  case object `dsl.VECTOR<DATETIME>?`       extends DslTimestamp with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<DATETIME?>`       extends DslTimestamp with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<DATETIME?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`
}

object DslTimestampGrammarAliases2 {
  case object `dsl.DateTime`                extends DslTimestamp with `box.One`
  case object `dsl.DateTime?`               extends DslTimestamp with `box.Nullable`
  case object `dsl.Array<DateTime>`         extends DslTimestamp with `box.OneArrayOfOne`
  case object `dsl.DateTime[]`              extends DslTimestamp with `box.OneBracketsOfOne`
  case object `dsl.Array<DateTime>?`        extends DslTimestamp with `box.NullableArrayOfOne`
  case object `dsl.DateTime[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
  case object `dsl.Array<DateTime?>`        extends DslTimestamp with `box.OneArrayOfNullable`
  case object `dsl.DateTime?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
  case object `dsl.Array<DateTime?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
  case object `dsl.DateTime?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
  case object `dsl.List<DateTime>`          extends DslTimestamp with `box.OneListOfOne`
  case object `dsl.List<DateTime>?`         extends DslTimestamp with `box.NullableListOfOne`
  case object `dsl.List<DateTime?>`         extends DslTimestamp with `box.OneListOfNullable`
  case object `dsl.List<DateTime?>?`        extends DslTimestamp with `box.NullableListOfNullable`
  case object `dsl.Set<DateTime>`           extends DslTimestamp with `box.OneSetOfOne`
  case object `dsl.Set<DateTime>?`          extends DslTimestamp with `box.NullableSetOfOne`
  case object `dsl.Set<DateTime?>`          extends DslTimestamp with `box.OneSetOfNullable`
  case object `dsl.Set<DateTime?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
  case object `dsl.Queue<DateTime>`         extends DslTimestamp with `box.OneQueueOfOne`
  case object `dsl.Queue<DateTime>?`        extends DslTimestamp with `box.NullableQueueOfOne`
  case object `dsl.Queue<DateTime?>`        extends DslTimestamp with `box.OneQueueOfNullable`
  case object `dsl.Queue<DateTime?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<DateTime>`   extends DslTimestamp with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<DateTime>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<DateTime?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<DateTime?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<DateTime>`         extends DslTimestamp with `box.OneStackOfOne`
  case object `dsl.Stack<DateTime>?`        extends DslTimestamp with `box.NullableStackOfOne`
  case object `dsl.Stack<DateTime?>`        extends DslTimestamp with `box.OneStackOfNullable`
  case object `dsl.Stack<DateTime?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
  case object `dsl.Vector<DateTime>`        extends DslTimestamp with `box.OneVectorOfOne`
  case object `dsl.Vector<DateTime>?`       extends DslTimestamp with `box.NullableVectorOfOne`
  case object `dsl.Vector<DateTime?>`       extends DslTimestamp with `box.OneVectorOfNullable`
  case object `dsl.Vector<DateTime?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`
}

object DslTimestampGrammarAliases3 {
  case object `dsl.Datetime`                extends DslTimestamp with `box.One`
  case object `dsl.Datetime?`               extends DslTimestamp with `box.Nullable`
  case object `dsl.Array<Datetime>`         extends DslTimestamp with `box.OneArrayOfOne`
  case object `dsl.Datetime[]`              extends DslTimestamp with `box.OneBracketsOfOne`
  case object `dsl.Array<Datetime>?`        extends DslTimestamp with `box.NullableArrayOfOne`
  case object `dsl.Datetime[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
  case object `dsl.Array<Datetime?>`        extends DslTimestamp with `box.OneArrayOfNullable`
  case object `dsl.Datetime?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
  case object `dsl.Array<Datetime?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
  case object `dsl.Datetime?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
  case object `dsl.List<Datetime>`          extends DslTimestamp with `box.OneListOfOne`
  case object `dsl.List<Datetime>?`         extends DslTimestamp with `box.NullableListOfOne`
  case object `dsl.List<Datetime?>`         extends DslTimestamp with `box.OneListOfNullable`
  case object `dsl.List<Datetime?>?`        extends DslTimestamp with `box.NullableListOfNullable`
  case object `dsl.Set<Datetime>`           extends DslTimestamp with `box.OneSetOfOne`
  case object `dsl.Set<Datetime>?`          extends DslTimestamp with `box.NullableSetOfOne`
  case object `dsl.Set<Datetime?>`          extends DslTimestamp with `box.OneSetOfNullable`
  case object `dsl.Set<Datetime?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
  case object `dsl.Queue<Datetime>`         extends DslTimestamp with `box.OneQueueOfOne`
  case object `dsl.Queue<Datetime>?`        extends DslTimestamp with `box.NullableQueueOfOne`
  case object `dsl.Queue<Datetime?>`        extends DslTimestamp with `box.OneQueueOfNullable`
  case object `dsl.Queue<Datetime?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Datetime>`   extends DslTimestamp with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Datetime>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Datetime?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Datetime?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Datetime>`         extends DslTimestamp with `box.OneStackOfOne`
  case object `dsl.Stack<Datetime>?`        extends DslTimestamp with `box.NullableStackOfOne`
  case object `dsl.Stack<Datetime?>`        extends DslTimestamp with `box.OneStackOfNullable`
  case object `dsl.Stack<Datetime?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
  case object `dsl.Vector<Datetime>`        extends DslTimestamp with `box.OneVectorOfOne`
  case object `dsl.Vector<Datetime>?`       extends DslTimestamp with `box.NullableVectorOfOne`
  case object `dsl.Vector<Datetime?>`       extends DslTimestamp with `box.OneVectorOfNullable`
  case object `dsl.Vector<Datetime?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`
}

object DslTimestampGrammarAliases4 {
  case object `dsl.TIMESTAMP`                extends DslTimestamp with `box.One`
  case object `dsl.TIMESTAMP?`               extends DslTimestamp with `box.Nullable`
  case object `dsl.ARRAY<TIMESTAMP>`         extends DslTimestamp with `box.OneArrayOfOne`
  case object `dsl.TIMESTAMP[]`              extends DslTimestamp with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<TIMESTAMP>?`        extends DslTimestamp with `box.NullableArrayOfOne`
  case object `dsl.TIMESTAMP[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<TIMESTAMP?>`        extends DslTimestamp with `box.OneArrayOfNullable`
  case object `dsl.TIMESTAMP?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<TIMESTAMP?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
  case object `dsl.TIMESTAMP?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<TIMESTAMP>`          extends DslTimestamp with `box.OneListOfOne`
  case object `dsl.LIST<TIMESTAMP>?`         extends DslTimestamp with `box.NullableListOfOne`
  case object `dsl.LIST<TIMESTAMP?>`         extends DslTimestamp with `box.OneListOfNullable`
  case object `dsl.LIST<TIMESTAMP?>?`        extends DslTimestamp with `box.NullableListOfNullable`
  case object `dsl.SET<TIMESTAMP>`           extends DslTimestamp with `box.OneSetOfOne`
  case object `dsl.SET<TIMESTAMP>?`          extends DslTimestamp with `box.NullableSetOfOne`
  case object `dsl.SET<TIMESTAMP?>`          extends DslTimestamp with `box.OneSetOfNullable`
  case object `dsl.SET<TIMESTAMP?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<TIMESTAMP>`         extends DslTimestamp with `box.OneQueueOfOne`
  case object `dsl.QUEUE<TIMESTAMP>?`        extends DslTimestamp with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<TIMESTAMP?>`        extends DslTimestamp with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<TIMESTAMP?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<TIMESTAMP>`   extends DslTimestamp with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<TIMESTAMP>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<TIMESTAMP?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<TIMESTAMP?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<TIMESTAMP>`         extends DslTimestamp with `box.OneStackOfOne`
  case object `dsl.STACK<TIMESTAMP>?`        extends DslTimestamp with `box.NullableStackOfOne`
  case object `dsl.STACK<TIMESTAMP?>`        extends DslTimestamp with `box.OneStackOfNullable`
  case object `dsl.STACK<TIMESTAMP?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<TIMESTAMP>`        extends DslTimestamp with `box.OneVectorOfOne`
  case object `dsl.VECTOR<TIMESTAMP>?`       extends DslTimestamp with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<TIMESTAMP?>`       extends DslTimestamp with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<TIMESTAMP?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`
}

object DslTimestampGrammarAliases5 {
  case object `dsl.datetime`                extends DslTimestamp with `box.One`
  case object `dsl.datetime?`               extends DslTimestamp with `box.Nullable`
  case object `dsl.array<datetime>`         extends DslTimestamp with `box.OneArrayOfOne`
  case object `dsl.datetime[]`              extends DslTimestamp with `box.OneBracketsOfOne`
  case object `dsl.array<datetime>?`        extends DslTimestamp with `box.NullableArrayOfOne`
  case object `dsl.datetime[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
  case object `dsl.array<datetime?>`        extends DslTimestamp with `box.OneArrayOfNullable`
  case object `dsl.datetime?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
  case object `dsl.array<datetime?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
  case object `dsl.datetime?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
  case object `dsl.list<datetime>`          extends DslTimestamp with `box.OneListOfOne`
  case object `dsl.list<datetime>?`         extends DslTimestamp with `box.NullableListOfOne`
  case object `dsl.list<datetime?>`         extends DslTimestamp with `box.OneListOfNullable`
  case object `dsl.list<datetime?>?`        extends DslTimestamp with `box.NullableListOfNullable`
  case object `dsl.set<datetime>`           extends DslTimestamp with `box.OneSetOfOne`
  case object `dsl.set<datetime>?`          extends DslTimestamp with `box.NullableSetOfOne`
  case object `dsl.set<datetime?>`          extends DslTimestamp with `box.OneSetOfNullable`
  case object `dsl.set<datetime?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
  case object `dsl.queue<datetime>`         extends DslTimestamp with `box.OneQueueOfOne`
  case object `dsl.queue<datetime>?`        extends DslTimestamp with `box.NullableQueueOfOne`
  case object `dsl.queue<datetime?>`        extends DslTimestamp with `box.OneQueueOfNullable`
  case object `dsl.queue<datetime?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
  case object `dsl.linked list<datetime>`   extends DslTimestamp with `box.OneLinkedListOfOne`
  case object `dsl.linked list<datetime>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<datetime?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<datetime?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<datetime>`         extends DslTimestamp with `box.OneStackOfOne`
  case object `dsl.stack<datetime>?`        extends DslTimestamp with `box.NullableStackOfOne`
  case object `dsl.stack<datetime?>`        extends DslTimestamp with `box.OneStackOfNullable`
  case object `dsl.stack<datetime?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
  case object `dsl.vector<datetime>`        extends DslTimestamp with `box.OneVectorOfOne`
  case object `dsl.vector<datetime>?`       extends DslTimestamp with `box.NullableVectorOfOne`
  case object `dsl.vector<datetime?>`       extends DslTimestamp with `box.OneVectorOfNullable`
  case object `dsl.vector<datetime?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`
}

object DslTimestampGrammarAliases6 {
  case object `dsl.timestamp`                extends DslTimestamp with `box.One`
  case object `dsl.timestamp?`               extends DslTimestamp with `box.Nullable`
  case object `dsl.array<timestamp>`         extends DslTimestamp with `box.OneArrayOfOne`
  case object `dsl.timestamp[]`              extends DslTimestamp with `box.OneBracketsOfOne`
  case object `dsl.array<timestamp>?`        extends DslTimestamp with `box.NullableArrayOfOne`
  case object `dsl.timestamp[]?`             extends DslTimestamp with `box.NullableBracketsOfOne`
  case object `dsl.array<timestamp?>`        extends DslTimestamp with `box.OneArrayOfNullable`
  case object `dsl.timestamp?[]`             extends DslTimestamp with `box.OneBracketsOfNullable`
  case object `dsl.array<timestamp?>?`       extends DslTimestamp with `box.NullableArrayOfNullable`
  case object `dsl.timestamp?[]?`            extends DslTimestamp with `box.NullableBracketsOfNullable`
  case object `dsl.list<timestamp>`          extends DslTimestamp with `box.OneListOfOne`
  case object `dsl.list<timestamp>?`         extends DslTimestamp with `box.NullableListOfOne`
  case object `dsl.list<timestamp?>`         extends DslTimestamp with `box.OneListOfNullable`
  case object `dsl.list<timestamp?>?`        extends DslTimestamp with `box.NullableListOfNullable`
  case object `dsl.set<timestamp>`           extends DslTimestamp with `box.OneSetOfOne`
  case object `dsl.set<timestamp>?`          extends DslTimestamp with `box.NullableSetOfOne`
  case object `dsl.set<timestamp?>`          extends DslTimestamp with `box.OneSetOfNullable`
  case object `dsl.set<timestamp?>?`         extends DslTimestamp with `box.NullableSetOfNullable`
  case object `dsl.queue<timestamp>`         extends DslTimestamp with `box.OneQueueOfOne`
  case object `dsl.queue<timestamp>?`        extends DslTimestamp with `box.NullableQueueOfOne`
  case object `dsl.queue<timestamp?>`        extends DslTimestamp with `box.OneQueueOfNullable`
  case object `dsl.queue<timestamp?>?`       extends DslTimestamp with `box.NullableQueueOfNullable`
  case object `dsl.linked list<timestamp>`   extends DslTimestamp with `box.OneLinkedListOfOne`
  case object `dsl.linked list<timestamp>?`  extends DslTimestamp with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<timestamp?>`  extends DslTimestamp with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<timestamp?>?` extends DslTimestamp with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<timestamp>`         extends DslTimestamp with `box.OneStackOfOne`
  case object `dsl.stack<timestamp>?`        extends DslTimestamp with `box.NullableStackOfOne`
  case object `dsl.stack<timestamp?>`        extends DslTimestamp with `box.OneStackOfNullable`
  case object `dsl.stack<timestamp?>?`       extends DslTimestamp with `box.NullableStackOfNullable`
  case object `dsl.vector<timestamp>`        extends DslTimestamp with `box.OneVectorOfOne`
  case object `dsl.vector<timestamp>?`       extends DslTimestamp with `box.NullableVectorOfOne`
  case object `dsl.vector<timestamp?>`       extends DslTimestamp with `box.OneVectorOfNullable`
  case object `dsl.vector<timestamp?>?`      extends DslTimestamp with `box.NullableVectorOfNullable`
}
