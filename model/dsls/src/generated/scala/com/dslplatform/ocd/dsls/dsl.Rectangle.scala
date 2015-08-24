package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslRectangle
    extends OcdDslBoxType
    with `type.Rectangle`

case object `dsl.Rectangle`                extends DslRectangle with `box.One`
case object `dsl.Rectangle?`               extends DslRectangle with `box.Nullable`
case object `dsl.Array<Rectangle>`         extends DslRectangle with `box.OneArrayOfOne`
case object `dsl.Rectangle[]`              extends DslRectangle with `box.OneBracketsOfOne`
case object `dsl.Array<Rectangle>?`        extends DslRectangle with `box.NullableArrayOfOne`
case object `dsl.Rectangle[]?`             extends DslRectangle with `box.NullableBracketsOfOne`
case object `dsl.Array<Rectangle?>`        extends DslRectangle with `box.OneArrayOfNullable`
case object `dsl.Rectangle?[]`             extends DslRectangle with `box.OneBracketsOfNullable`
case object `dsl.Array<Rectangle?>?`       extends DslRectangle with `box.NullableArrayOfNullable`
case object `dsl.Rectangle?[]?`            extends DslRectangle with `box.NullableBracketsOfNullable`
case object `dsl.List<Rectangle>`          extends DslRectangle with `box.OneListOfOne`
case object `dsl.List<Rectangle>?`         extends DslRectangle with `box.NullableListOfOne`
case object `dsl.List<Rectangle?>`         extends DslRectangle with `box.OneListOfNullable`
case object `dsl.List<Rectangle?>?`        extends DslRectangle with `box.NullableListOfNullable`
case object `dsl.Set<Rectangle>`           extends DslRectangle with `box.OneSetOfOne`
case object `dsl.Set<Rectangle>?`          extends DslRectangle with `box.NullableSetOfOne`
case object `dsl.Set<Rectangle?>`          extends DslRectangle with `box.OneSetOfNullable`
case object `dsl.Set<Rectangle?>?`         extends DslRectangle with `box.NullableSetOfNullable`
case object `dsl.Queue<Rectangle>`         extends DslRectangle with `box.OneQueueOfOne`
case object `dsl.Queue<Rectangle>?`        extends DslRectangle with `box.NullableQueueOfOne`
case object `dsl.Queue<Rectangle?>`        extends DslRectangle with `box.OneQueueOfNullable`
case object `dsl.Queue<Rectangle?>?`       extends DslRectangle with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Rectangle>`   extends DslRectangle with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Rectangle>?`  extends DslRectangle with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Rectangle?>`  extends DslRectangle with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Rectangle?>?` extends DslRectangle with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Rectangle>`         extends DslRectangle with `box.OneStackOfOne`
case object `dsl.Stack<Rectangle>?`        extends DslRectangle with `box.NullableStackOfOne`
case object `dsl.Stack<Rectangle?>`        extends DslRectangle with `box.OneStackOfNullable`
case object `dsl.Stack<Rectangle?>?`       extends DslRectangle with `box.NullableStackOfNullable`
case object `dsl.Vector<Rectangle>`        extends DslRectangle with `box.OneVectorOfOne`
case object `dsl.Vector<Rectangle>?`       extends DslRectangle with `box.NullableVectorOfOne`
case object `dsl.Vector<Rectangle?>`       extends DslRectangle with `box.OneVectorOfNullable`
case object `dsl.Vector<Rectangle?>?`      extends DslRectangle with `box.NullableVectorOfNullable`

object DslRectangleGrammarAliases1 {
  case object `dsl.BOX`                extends DslRectangle with `box.One`
  case object `dsl.BOX?`               extends DslRectangle with `box.Nullable`
  case object `dsl.ARRAY<BOX>`         extends DslRectangle with `box.OneArrayOfOne`
  case object `dsl.BOX[]`              extends DslRectangle with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<BOX>?`        extends DslRectangle with `box.NullableArrayOfOne`
  case object `dsl.BOX[]?`             extends DslRectangle with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<BOX?>`        extends DslRectangle with `box.OneArrayOfNullable`
  case object `dsl.BOX?[]`             extends DslRectangle with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<BOX?>?`       extends DslRectangle with `box.NullableArrayOfNullable`
  case object `dsl.BOX?[]?`            extends DslRectangle with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<BOX>`          extends DslRectangle with `box.OneListOfOne`
  case object `dsl.LIST<BOX>?`         extends DslRectangle with `box.NullableListOfOne`
  case object `dsl.LIST<BOX?>`         extends DslRectangle with `box.OneListOfNullable`
  case object `dsl.LIST<BOX?>?`        extends DslRectangle with `box.NullableListOfNullable`
  case object `dsl.SET<BOX>`           extends DslRectangle with `box.OneSetOfOne`
  case object `dsl.SET<BOX>?`          extends DslRectangle with `box.NullableSetOfOne`
  case object `dsl.SET<BOX?>`          extends DslRectangle with `box.OneSetOfNullable`
  case object `dsl.SET<BOX?>?`         extends DslRectangle with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<BOX>`         extends DslRectangle with `box.OneQueueOfOne`
  case object `dsl.QUEUE<BOX>?`        extends DslRectangle with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<BOX?>`        extends DslRectangle with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<BOX?>?`       extends DslRectangle with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<BOX>`   extends DslRectangle with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<BOX>?`  extends DslRectangle with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<BOX?>`  extends DslRectangle with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<BOX?>?` extends DslRectangle with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<BOX>`         extends DslRectangle with `box.OneStackOfOne`
  case object `dsl.STACK<BOX>?`        extends DslRectangle with `box.NullableStackOfOne`
  case object `dsl.STACK<BOX?>`        extends DslRectangle with `box.OneStackOfNullable`
  case object `dsl.STACK<BOX?>?`       extends DslRectangle with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<BOX>`        extends DslRectangle with `box.OneVectorOfOne`
  case object `dsl.VECTOR<BOX>?`       extends DslRectangle with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<BOX?>`       extends DslRectangle with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<BOX?>?`      extends DslRectangle with `box.NullableVectorOfNullable`
}

object DslRectangleGrammarAliases2 {
  case object `dsl.Box`                extends DslRectangle with `box.One`
  case object `dsl.Box?`               extends DslRectangle with `box.Nullable`
  case object `dsl.Array<Box>`         extends DslRectangle with `box.OneArrayOfOne`
  case object `dsl.Box[]`              extends DslRectangle with `box.OneBracketsOfOne`
  case object `dsl.Array<Box>?`        extends DslRectangle with `box.NullableArrayOfOne`
  case object `dsl.Box[]?`             extends DslRectangle with `box.NullableBracketsOfOne`
  case object `dsl.Array<Box?>`        extends DslRectangle with `box.OneArrayOfNullable`
  case object `dsl.Box?[]`             extends DslRectangle with `box.OneBracketsOfNullable`
  case object `dsl.Array<Box?>?`       extends DslRectangle with `box.NullableArrayOfNullable`
  case object `dsl.Box?[]?`            extends DslRectangle with `box.NullableBracketsOfNullable`
  case object `dsl.List<Box>`          extends DslRectangle with `box.OneListOfOne`
  case object `dsl.List<Box>?`         extends DslRectangle with `box.NullableListOfOne`
  case object `dsl.List<Box?>`         extends DslRectangle with `box.OneListOfNullable`
  case object `dsl.List<Box?>?`        extends DslRectangle with `box.NullableListOfNullable`
  case object `dsl.Set<Box>`           extends DslRectangle with `box.OneSetOfOne`
  case object `dsl.Set<Box>?`          extends DslRectangle with `box.NullableSetOfOne`
  case object `dsl.Set<Box?>`          extends DslRectangle with `box.OneSetOfNullable`
  case object `dsl.Set<Box?>?`         extends DslRectangle with `box.NullableSetOfNullable`
  case object `dsl.Queue<Box>`         extends DslRectangle with `box.OneQueueOfOne`
  case object `dsl.Queue<Box>?`        extends DslRectangle with `box.NullableQueueOfOne`
  case object `dsl.Queue<Box?>`        extends DslRectangle with `box.OneQueueOfNullable`
  case object `dsl.Queue<Box?>?`       extends DslRectangle with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Box>`   extends DslRectangle with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Box>?`  extends DslRectangle with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Box?>`  extends DslRectangle with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Box?>?` extends DslRectangle with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Box>`         extends DslRectangle with `box.OneStackOfOne`
  case object `dsl.Stack<Box>?`        extends DslRectangle with `box.NullableStackOfOne`
  case object `dsl.Stack<Box?>`        extends DslRectangle with `box.OneStackOfNullable`
  case object `dsl.Stack<Box?>?`       extends DslRectangle with `box.NullableStackOfNullable`
  case object `dsl.Vector<Box>`        extends DslRectangle with `box.OneVectorOfOne`
  case object `dsl.Vector<Box>?`       extends DslRectangle with `box.NullableVectorOfOne`
  case object `dsl.Vector<Box?>`       extends DslRectangle with `box.OneVectorOfNullable`
  case object `dsl.Vector<Box?>?`      extends DslRectangle with `box.NullableVectorOfNullable`
}

object DslRectangleGrammarAliases3 {
  case object `dsl.RECTANGLE`                extends DslRectangle with `box.One`
  case object `dsl.RECTANGLE?`               extends DslRectangle with `box.Nullable`
  case object `dsl.ARRAY<RECTANGLE>`         extends DslRectangle with `box.OneArrayOfOne`
  case object `dsl.RECTANGLE[]`              extends DslRectangle with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<RECTANGLE>?`        extends DslRectangle with `box.NullableArrayOfOne`
  case object `dsl.RECTANGLE[]?`             extends DslRectangle with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<RECTANGLE?>`        extends DslRectangle with `box.OneArrayOfNullable`
  case object `dsl.RECTANGLE?[]`             extends DslRectangle with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<RECTANGLE?>?`       extends DslRectangle with `box.NullableArrayOfNullable`
  case object `dsl.RECTANGLE?[]?`            extends DslRectangle with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<RECTANGLE>`          extends DslRectangle with `box.OneListOfOne`
  case object `dsl.LIST<RECTANGLE>?`         extends DslRectangle with `box.NullableListOfOne`
  case object `dsl.LIST<RECTANGLE?>`         extends DslRectangle with `box.OneListOfNullable`
  case object `dsl.LIST<RECTANGLE?>?`        extends DslRectangle with `box.NullableListOfNullable`
  case object `dsl.SET<RECTANGLE>`           extends DslRectangle with `box.OneSetOfOne`
  case object `dsl.SET<RECTANGLE>?`          extends DslRectangle with `box.NullableSetOfOne`
  case object `dsl.SET<RECTANGLE?>`          extends DslRectangle with `box.OneSetOfNullable`
  case object `dsl.SET<RECTANGLE?>?`         extends DslRectangle with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<RECTANGLE>`         extends DslRectangle with `box.OneQueueOfOne`
  case object `dsl.QUEUE<RECTANGLE>?`        extends DslRectangle with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<RECTANGLE?>`        extends DslRectangle with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<RECTANGLE?>?`       extends DslRectangle with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<RECTANGLE>`   extends DslRectangle with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<RECTANGLE>?`  extends DslRectangle with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<RECTANGLE?>`  extends DslRectangle with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<RECTANGLE?>?` extends DslRectangle with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<RECTANGLE>`         extends DslRectangle with `box.OneStackOfOne`
  case object `dsl.STACK<RECTANGLE>?`        extends DslRectangle with `box.NullableStackOfOne`
  case object `dsl.STACK<RECTANGLE?>`        extends DslRectangle with `box.OneStackOfNullable`
  case object `dsl.STACK<RECTANGLE?>?`       extends DslRectangle with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<RECTANGLE>`        extends DslRectangle with `box.OneVectorOfOne`
  case object `dsl.VECTOR<RECTANGLE>?`       extends DslRectangle with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<RECTANGLE?>`       extends DslRectangle with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<RECTANGLE?>?`      extends DslRectangle with `box.NullableVectorOfNullable`
}

object DslRectangleGrammarAliases4 {
  case object `dsl.box`                extends DslRectangle with `box.One`
  case object `dsl.box?`               extends DslRectangle with `box.Nullable`
  case object `dsl.array<box>`         extends DslRectangle with `box.OneArrayOfOne`
  case object `dsl.box[]`              extends DslRectangle with `box.OneBracketsOfOne`
  case object `dsl.array<box>?`        extends DslRectangle with `box.NullableArrayOfOne`
  case object `dsl.box[]?`             extends DslRectangle with `box.NullableBracketsOfOne`
  case object `dsl.array<box?>`        extends DslRectangle with `box.OneArrayOfNullable`
  case object `dsl.box?[]`             extends DslRectangle with `box.OneBracketsOfNullable`
  case object `dsl.array<box?>?`       extends DslRectangle with `box.NullableArrayOfNullable`
  case object `dsl.box?[]?`            extends DslRectangle with `box.NullableBracketsOfNullable`
  case object `dsl.list<box>`          extends DslRectangle with `box.OneListOfOne`
  case object `dsl.list<box>?`         extends DslRectangle with `box.NullableListOfOne`
  case object `dsl.list<box?>`         extends DslRectangle with `box.OneListOfNullable`
  case object `dsl.list<box?>?`        extends DslRectangle with `box.NullableListOfNullable`
  case object `dsl.set<box>`           extends DslRectangle with `box.OneSetOfOne`
  case object `dsl.set<box>?`          extends DslRectangle with `box.NullableSetOfOne`
  case object `dsl.set<box?>`          extends DslRectangle with `box.OneSetOfNullable`
  case object `dsl.set<box?>?`         extends DslRectangle with `box.NullableSetOfNullable`
  case object `dsl.queue<box>`         extends DslRectangle with `box.OneQueueOfOne`
  case object `dsl.queue<box>?`        extends DslRectangle with `box.NullableQueueOfOne`
  case object `dsl.queue<box?>`        extends DslRectangle with `box.OneQueueOfNullable`
  case object `dsl.queue<box?>?`       extends DslRectangle with `box.NullableQueueOfNullable`
  case object `dsl.linked list<box>`   extends DslRectangle with `box.OneLinkedListOfOne`
  case object `dsl.linked list<box>?`  extends DslRectangle with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<box?>`  extends DslRectangle with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<box?>?` extends DslRectangle with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<box>`         extends DslRectangle with `box.OneStackOfOne`
  case object `dsl.stack<box>?`        extends DslRectangle with `box.NullableStackOfOne`
  case object `dsl.stack<box?>`        extends DslRectangle with `box.OneStackOfNullable`
  case object `dsl.stack<box?>?`       extends DslRectangle with `box.NullableStackOfNullable`
  case object `dsl.vector<box>`        extends DslRectangle with `box.OneVectorOfOne`
  case object `dsl.vector<box>?`       extends DslRectangle with `box.NullableVectorOfOne`
  case object `dsl.vector<box?>`       extends DslRectangle with `box.OneVectorOfNullable`
  case object `dsl.vector<box?>?`      extends DslRectangle with `box.NullableVectorOfNullable`
}

object DslRectangleGrammarAliases5 {
  case object `dsl.rectangle`                extends DslRectangle with `box.One`
  case object `dsl.rectangle?`               extends DslRectangle with `box.Nullable`
  case object `dsl.array<rectangle>`         extends DslRectangle with `box.OneArrayOfOne`
  case object `dsl.rectangle[]`              extends DslRectangle with `box.OneBracketsOfOne`
  case object `dsl.array<rectangle>?`        extends DslRectangle with `box.NullableArrayOfOne`
  case object `dsl.rectangle[]?`             extends DslRectangle with `box.NullableBracketsOfOne`
  case object `dsl.array<rectangle?>`        extends DslRectangle with `box.OneArrayOfNullable`
  case object `dsl.rectangle?[]`             extends DslRectangle with `box.OneBracketsOfNullable`
  case object `dsl.array<rectangle?>?`       extends DslRectangle with `box.NullableArrayOfNullable`
  case object `dsl.rectangle?[]?`            extends DslRectangle with `box.NullableBracketsOfNullable`
  case object `dsl.list<rectangle>`          extends DslRectangle with `box.OneListOfOne`
  case object `dsl.list<rectangle>?`         extends DslRectangle with `box.NullableListOfOne`
  case object `dsl.list<rectangle?>`         extends DslRectangle with `box.OneListOfNullable`
  case object `dsl.list<rectangle?>?`        extends DslRectangle with `box.NullableListOfNullable`
  case object `dsl.set<rectangle>`           extends DslRectangle with `box.OneSetOfOne`
  case object `dsl.set<rectangle>?`          extends DslRectangle with `box.NullableSetOfOne`
  case object `dsl.set<rectangle?>`          extends DslRectangle with `box.OneSetOfNullable`
  case object `dsl.set<rectangle?>?`         extends DslRectangle with `box.NullableSetOfNullable`
  case object `dsl.queue<rectangle>`         extends DslRectangle with `box.OneQueueOfOne`
  case object `dsl.queue<rectangle>?`        extends DslRectangle with `box.NullableQueueOfOne`
  case object `dsl.queue<rectangle?>`        extends DslRectangle with `box.OneQueueOfNullable`
  case object `dsl.queue<rectangle?>?`       extends DslRectangle with `box.NullableQueueOfNullable`
  case object `dsl.linked list<rectangle>`   extends DslRectangle with `box.OneLinkedListOfOne`
  case object `dsl.linked list<rectangle>?`  extends DslRectangle with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<rectangle?>`  extends DslRectangle with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<rectangle?>?` extends DslRectangle with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<rectangle>`         extends DslRectangle with `box.OneStackOfOne`
  case object `dsl.stack<rectangle>?`        extends DslRectangle with `box.NullableStackOfOne`
  case object `dsl.stack<rectangle?>`        extends DslRectangle with `box.OneStackOfNullable`
  case object `dsl.stack<rectangle?>?`       extends DslRectangle with `box.NullableStackOfNullable`
  case object `dsl.vector<rectangle>`        extends DslRectangle with `box.OneVectorOfOne`
  case object `dsl.vector<rectangle>?`       extends DslRectangle with `box.NullableVectorOfOne`
  case object `dsl.vector<rectangle?>`       extends DslRectangle with `box.OneVectorOfNullable`
  case object `dsl.vector<rectangle?>?`      extends DslRectangle with `box.NullableVectorOfNullable`
}
