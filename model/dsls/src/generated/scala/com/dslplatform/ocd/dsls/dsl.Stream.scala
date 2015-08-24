package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslStream
    extends OcdDslBoxType
    with `type.Stream`

case object `dsl.Stream`                extends DslStream with `box.One`
case object `dsl.Stream?`               extends DslStream with `box.Nullable`
case object `dsl.Array<Stream>`         extends DslStream with `box.OneArrayOfOne`
case object `dsl.Stream[]`              extends DslStream with `box.OneBracketsOfOne`
case object `dsl.Array<Stream>?`        extends DslStream with `box.NullableArrayOfOne`
case object `dsl.Stream[]?`             extends DslStream with `box.NullableBracketsOfOne`
case object `dsl.Array<Stream?>`        extends DslStream with `box.OneArrayOfNullable`
case object `dsl.Stream?[]`             extends DslStream with `box.OneBracketsOfNullable`
case object `dsl.Array<Stream?>?`       extends DslStream with `box.NullableArrayOfNullable`
case object `dsl.Stream?[]?`            extends DslStream with `box.NullableBracketsOfNullable`
case object `dsl.List<Stream>`          extends DslStream with `box.OneListOfOne`
case object `dsl.List<Stream>?`         extends DslStream with `box.NullableListOfOne`
case object `dsl.List<Stream?>`         extends DslStream with `box.OneListOfNullable`
case object `dsl.List<Stream?>?`        extends DslStream with `box.NullableListOfNullable`
case object `dsl.Set<Stream>`           extends DslStream with `box.OneSetOfOne`
case object `dsl.Set<Stream>?`          extends DslStream with `box.NullableSetOfOne`
case object `dsl.Set<Stream?>`          extends DslStream with `box.OneSetOfNullable`
case object `dsl.Set<Stream?>?`         extends DslStream with `box.NullableSetOfNullable`
case object `dsl.Queue<Stream>`         extends DslStream with `box.OneQueueOfOne`
case object `dsl.Queue<Stream>?`        extends DslStream with `box.NullableQueueOfOne`
case object `dsl.Queue<Stream?>`        extends DslStream with `box.OneQueueOfNullable`
case object `dsl.Queue<Stream?>?`       extends DslStream with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Stream>`   extends DslStream with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Stream>?`  extends DslStream with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Stream?>`  extends DslStream with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Stream?>?` extends DslStream with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Stream>`         extends DslStream with `box.OneStackOfOne`
case object `dsl.Stack<Stream>?`        extends DslStream with `box.NullableStackOfOne`
case object `dsl.Stack<Stream?>`        extends DslStream with `box.OneStackOfNullable`
case object `dsl.Stack<Stream?>?`       extends DslStream with `box.NullableStackOfNullable`
case object `dsl.Vector<Stream>`        extends DslStream with `box.OneVectorOfOne`
case object `dsl.Vector<Stream>?`       extends DslStream with `box.NullableVectorOfOne`
case object `dsl.Vector<Stream?>`       extends DslStream with `box.OneVectorOfNullable`
case object `dsl.Vector<Stream?>?`      extends DslStream with `box.NullableVectorOfNullable`

object DslStreamGrammarAliases1 {
  case object `dsl.STREAM`                extends DslStream with `box.One`
  case object `dsl.STREAM?`               extends DslStream with `box.Nullable`
  case object `dsl.ARRAY<STREAM>`         extends DslStream with `box.OneArrayOfOne`
  case object `dsl.STREAM[]`              extends DslStream with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<STREAM>?`        extends DslStream with `box.NullableArrayOfOne`
  case object `dsl.STREAM[]?`             extends DslStream with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<STREAM?>`        extends DslStream with `box.OneArrayOfNullable`
  case object `dsl.STREAM?[]`             extends DslStream with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<STREAM?>?`       extends DslStream with `box.NullableArrayOfNullable`
  case object `dsl.STREAM?[]?`            extends DslStream with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<STREAM>`          extends DslStream with `box.OneListOfOne`
  case object `dsl.LIST<STREAM>?`         extends DslStream with `box.NullableListOfOne`
  case object `dsl.LIST<STREAM?>`         extends DslStream with `box.OneListOfNullable`
  case object `dsl.LIST<STREAM?>?`        extends DslStream with `box.NullableListOfNullable`
  case object `dsl.SET<STREAM>`           extends DslStream with `box.OneSetOfOne`
  case object `dsl.SET<STREAM>?`          extends DslStream with `box.NullableSetOfOne`
  case object `dsl.SET<STREAM?>`          extends DslStream with `box.OneSetOfNullable`
  case object `dsl.SET<STREAM?>?`         extends DslStream with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<STREAM>`         extends DslStream with `box.OneQueueOfOne`
  case object `dsl.QUEUE<STREAM>?`        extends DslStream with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<STREAM?>`        extends DslStream with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<STREAM?>?`       extends DslStream with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<STREAM>`   extends DslStream with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<STREAM>?`  extends DslStream with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<STREAM?>`  extends DslStream with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<STREAM?>?` extends DslStream with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<STREAM>`         extends DslStream with `box.OneStackOfOne`
  case object `dsl.STACK<STREAM>?`        extends DslStream with `box.NullableStackOfOne`
  case object `dsl.STACK<STREAM?>`        extends DslStream with `box.OneStackOfNullable`
  case object `dsl.STACK<STREAM?>?`       extends DslStream with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<STREAM>`        extends DslStream with `box.OneVectorOfOne`
  case object `dsl.VECTOR<STREAM>?`       extends DslStream with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<STREAM?>`       extends DslStream with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<STREAM?>?`      extends DslStream with `box.NullableVectorOfNullable`
}

object DslStreamGrammarAliases2 {
  case object `dsl.stream`                extends DslStream with `box.One`
  case object `dsl.stream?`               extends DslStream with `box.Nullable`
  case object `dsl.array<stream>`         extends DslStream with `box.OneArrayOfOne`
  case object `dsl.stream[]`              extends DslStream with `box.OneBracketsOfOne`
  case object `dsl.array<stream>?`        extends DslStream with `box.NullableArrayOfOne`
  case object `dsl.stream[]?`             extends DslStream with `box.NullableBracketsOfOne`
  case object `dsl.array<stream?>`        extends DslStream with `box.OneArrayOfNullable`
  case object `dsl.stream?[]`             extends DslStream with `box.OneBracketsOfNullable`
  case object `dsl.array<stream?>?`       extends DslStream with `box.NullableArrayOfNullable`
  case object `dsl.stream?[]?`            extends DslStream with `box.NullableBracketsOfNullable`
  case object `dsl.list<stream>`          extends DslStream with `box.OneListOfOne`
  case object `dsl.list<stream>?`         extends DslStream with `box.NullableListOfOne`
  case object `dsl.list<stream?>`         extends DslStream with `box.OneListOfNullable`
  case object `dsl.list<stream?>?`        extends DslStream with `box.NullableListOfNullable`
  case object `dsl.set<stream>`           extends DslStream with `box.OneSetOfOne`
  case object `dsl.set<stream>?`          extends DslStream with `box.NullableSetOfOne`
  case object `dsl.set<stream?>`          extends DslStream with `box.OneSetOfNullable`
  case object `dsl.set<stream?>?`         extends DslStream with `box.NullableSetOfNullable`
  case object `dsl.queue<stream>`         extends DslStream with `box.OneQueueOfOne`
  case object `dsl.queue<stream>?`        extends DslStream with `box.NullableQueueOfOne`
  case object `dsl.queue<stream?>`        extends DslStream with `box.OneQueueOfNullable`
  case object `dsl.queue<stream?>?`       extends DslStream with `box.NullableQueueOfNullable`
  case object `dsl.linked list<stream>`   extends DslStream with `box.OneLinkedListOfOne`
  case object `dsl.linked list<stream>?`  extends DslStream with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<stream?>`  extends DslStream with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<stream?>?` extends DslStream with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<stream>`         extends DslStream with `box.OneStackOfOne`
  case object `dsl.stack<stream>?`        extends DslStream with `box.NullableStackOfOne`
  case object `dsl.stack<stream?>`        extends DslStream with `box.OneStackOfNullable`
  case object `dsl.stack<stream?>?`       extends DslStream with `box.NullableStackOfNullable`
  case object `dsl.vector<stream>`        extends DslStream with `box.OneVectorOfOne`
  case object `dsl.vector<stream>?`       extends DslStream with `box.NullableVectorOfOne`
  case object `dsl.vector<stream?>`       extends DslStream with `box.OneVectorOfNullable`
  case object `dsl.vector<stream?>?`      extends DslStream with `box.NullableVectorOfNullable`
}
