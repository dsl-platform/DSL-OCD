package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslInteger
    extends OcdDslBoxType
    with `type.Integer`

case object `dsl.Integer`                extends DslInteger with `box.One`
case object `dsl.Integer?`               extends DslInteger with `box.Nullable`
case object `dsl.Array<Integer>`         extends DslInteger with `box.OneArrayOfOne`
case object `dsl.Integer[]`              extends DslInteger with `box.OneBracketsOfOne`
case object `dsl.Array<Integer>?`        extends DslInteger with `box.NullableArrayOfOne`
case object `dsl.Integer[]?`             extends DslInteger with `box.NullableBracketsOfOne`
case object `dsl.Array<Integer?>`        extends DslInteger with `box.OneArrayOfNullable`
case object `dsl.Integer?[]`             extends DslInteger with `box.OneBracketsOfNullable`
case object `dsl.Array<Integer?>?`       extends DslInteger with `box.NullableArrayOfNullable`
case object `dsl.Integer?[]?`            extends DslInteger with `box.NullableBracketsOfNullable`
case object `dsl.List<Integer>`          extends DslInteger with `box.OneListOfOne`
case object `dsl.List<Integer>?`         extends DslInteger with `box.NullableListOfOne`
case object `dsl.List<Integer?>`         extends DslInteger with `box.OneListOfNullable`
case object `dsl.List<Integer?>?`        extends DslInteger with `box.NullableListOfNullable`
case object `dsl.Set<Integer>`           extends DslInteger with `box.OneSetOfOne`
case object `dsl.Set<Integer>?`          extends DslInteger with `box.NullableSetOfOne`
case object `dsl.Set<Integer?>`          extends DslInteger with `box.OneSetOfNullable`
case object `dsl.Set<Integer?>?`         extends DslInteger with `box.NullableSetOfNullable`
case object `dsl.Queue<Integer>`         extends DslInteger with `box.OneQueueOfOne`
case object `dsl.Queue<Integer>?`        extends DslInteger with `box.NullableQueueOfOne`
case object `dsl.Queue<Integer?>`        extends DslInteger with `box.OneQueueOfNullable`
case object `dsl.Queue<Integer?>?`       extends DslInteger with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Integer>`   extends DslInteger with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Integer>?`  extends DslInteger with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Integer?>`  extends DslInteger with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Integer?>?` extends DslInteger with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Integer>`         extends DslInteger with `box.OneStackOfOne`
case object `dsl.Stack<Integer>?`        extends DslInteger with `box.NullableStackOfOne`
case object `dsl.Stack<Integer?>`        extends DslInteger with `box.OneStackOfNullable`
case object `dsl.Stack<Integer?>?`       extends DslInteger with `box.NullableStackOfNullable`
case object `dsl.Vector<Integer>`        extends DslInteger with `box.OneVectorOfOne`
case object `dsl.Vector<Integer>?`       extends DslInteger with `box.NullableVectorOfOne`
case object `dsl.Vector<Integer?>`       extends DslInteger with `box.OneVectorOfNullable`
case object `dsl.Vector<Integer?>?`      extends DslInteger with `box.NullableVectorOfNullable`

object DslIntegerGrammarAliases1 {
  case object `dsl.INT`                extends DslInteger with `box.One`
  case object `dsl.INT?`               extends DslInteger with `box.Nullable`
  case object `dsl.ARRAY<INT>`         extends DslInteger with `box.OneArrayOfOne`
  case object `dsl.INT[]`              extends DslInteger with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<INT>?`        extends DslInteger with `box.NullableArrayOfOne`
  case object `dsl.INT[]?`             extends DslInteger with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<INT?>`        extends DslInteger with `box.OneArrayOfNullable`
  case object `dsl.INT?[]`             extends DslInteger with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<INT?>?`       extends DslInteger with `box.NullableArrayOfNullable`
  case object `dsl.INT?[]?`            extends DslInteger with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<INT>`          extends DslInteger with `box.OneListOfOne`
  case object `dsl.LIST<INT>?`         extends DslInteger with `box.NullableListOfOne`
  case object `dsl.LIST<INT?>`         extends DslInteger with `box.OneListOfNullable`
  case object `dsl.LIST<INT?>?`        extends DslInteger with `box.NullableListOfNullable`
  case object `dsl.SET<INT>`           extends DslInteger with `box.OneSetOfOne`
  case object `dsl.SET<INT>?`          extends DslInteger with `box.NullableSetOfOne`
  case object `dsl.SET<INT?>`          extends DslInteger with `box.OneSetOfNullable`
  case object `dsl.SET<INT?>?`         extends DslInteger with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<INT>`         extends DslInteger with `box.OneQueueOfOne`
  case object `dsl.QUEUE<INT>?`        extends DslInteger with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<INT?>`        extends DslInteger with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<INT?>?`       extends DslInteger with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<INT>`   extends DslInteger with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<INT>?`  extends DslInteger with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<INT?>`  extends DslInteger with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<INT?>?` extends DslInteger with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<INT>`         extends DslInteger with `box.OneStackOfOne`
  case object `dsl.STACK<INT>?`        extends DslInteger with `box.NullableStackOfOne`
  case object `dsl.STACK<INT?>`        extends DslInteger with `box.OneStackOfNullable`
  case object `dsl.STACK<INT?>?`       extends DslInteger with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<INT>`        extends DslInteger with `box.OneVectorOfOne`
  case object `dsl.VECTOR<INT>?`       extends DslInteger with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<INT?>`       extends DslInteger with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<INT?>?`      extends DslInteger with `box.NullableVectorOfNullable`
}

object DslIntegerGrammarAliases2 {
  case object `dsl.INTEGER`                extends DslInteger with `box.One`
  case object `dsl.INTEGER?`               extends DslInteger with `box.Nullable`
  case object `dsl.ARRAY<INTEGER>`         extends DslInteger with `box.OneArrayOfOne`
  case object `dsl.INTEGER[]`              extends DslInteger with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<INTEGER>?`        extends DslInteger with `box.NullableArrayOfOne`
  case object `dsl.INTEGER[]?`             extends DslInteger with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<INTEGER?>`        extends DslInteger with `box.OneArrayOfNullable`
  case object `dsl.INTEGER?[]`             extends DslInteger with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<INTEGER?>?`       extends DslInteger with `box.NullableArrayOfNullable`
  case object `dsl.INTEGER?[]?`            extends DslInteger with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<INTEGER>`          extends DslInteger with `box.OneListOfOne`
  case object `dsl.LIST<INTEGER>?`         extends DslInteger with `box.NullableListOfOne`
  case object `dsl.LIST<INTEGER?>`         extends DslInteger with `box.OneListOfNullable`
  case object `dsl.LIST<INTEGER?>?`        extends DslInteger with `box.NullableListOfNullable`
  case object `dsl.SET<INTEGER>`           extends DslInteger with `box.OneSetOfOne`
  case object `dsl.SET<INTEGER>?`          extends DslInteger with `box.NullableSetOfOne`
  case object `dsl.SET<INTEGER?>`          extends DslInteger with `box.OneSetOfNullable`
  case object `dsl.SET<INTEGER?>?`         extends DslInteger with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<INTEGER>`         extends DslInteger with `box.OneQueueOfOne`
  case object `dsl.QUEUE<INTEGER>?`        extends DslInteger with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<INTEGER?>`        extends DslInteger with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<INTEGER?>?`       extends DslInteger with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<INTEGER>`   extends DslInteger with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<INTEGER>?`  extends DslInteger with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<INTEGER?>`  extends DslInteger with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<INTEGER?>?` extends DslInteger with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<INTEGER>`         extends DslInteger with `box.OneStackOfOne`
  case object `dsl.STACK<INTEGER>?`        extends DslInteger with `box.NullableStackOfOne`
  case object `dsl.STACK<INTEGER?>`        extends DslInteger with `box.OneStackOfNullable`
  case object `dsl.STACK<INTEGER?>?`       extends DslInteger with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<INTEGER>`        extends DslInteger with `box.OneVectorOfOne`
  case object `dsl.VECTOR<INTEGER>?`       extends DslInteger with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<INTEGER?>`       extends DslInteger with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<INTEGER?>?`      extends DslInteger with `box.NullableVectorOfNullable`
}

object DslIntegerGrammarAliases3 {
  case object `dsl.Int`                extends DslInteger with `box.One`
  case object `dsl.Int?`               extends DslInteger with `box.Nullable`
  case object `dsl.Array<Int>`         extends DslInteger with `box.OneArrayOfOne`
  case object `dsl.Int[]`              extends DslInteger with `box.OneBracketsOfOne`
  case object `dsl.Array<Int>?`        extends DslInteger with `box.NullableArrayOfOne`
  case object `dsl.Int[]?`             extends DslInteger with `box.NullableBracketsOfOne`
  case object `dsl.Array<Int?>`        extends DslInteger with `box.OneArrayOfNullable`
  case object `dsl.Int?[]`             extends DslInteger with `box.OneBracketsOfNullable`
  case object `dsl.Array<Int?>?`       extends DslInteger with `box.NullableArrayOfNullable`
  case object `dsl.Int?[]?`            extends DslInteger with `box.NullableBracketsOfNullable`
  case object `dsl.List<Int>`          extends DslInteger with `box.OneListOfOne`
  case object `dsl.List<Int>?`         extends DslInteger with `box.NullableListOfOne`
  case object `dsl.List<Int?>`         extends DslInteger with `box.OneListOfNullable`
  case object `dsl.List<Int?>?`        extends DslInteger with `box.NullableListOfNullable`
  case object `dsl.Set<Int>`           extends DslInteger with `box.OneSetOfOne`
  case object `dsl.Set<Int>?`          extends DslInteger with `box.NullableSetOfOne`
  case object `dsl.Set<Int?>`          extends DslInteger with `box.OneSetOfNullable`
  case object `dsl.Set<Int?>?`         extends DslInteger with `box.NullableSetOfNullable`
  case object `dsl.Queue<Int>`         extends DslInteger with `box.OneQueueOfOne`
  case object `dsl.Queue<Int>?`        extends DslInteger with `box.NullableQueueOfOne`
  case object `dsl.Queue<Int?>`        extends DslInteger with `box.OneQueueOfNullable`
  case object `dsl.Queue<Int?>?`       extends DslInteger with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Int>`   extends DslInteger with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Int>?`  extends DslInteger with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Int?>`  extends DslInteger with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Int?>?` extends DslInteger with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Int>`         extends DslInteger with `box.OneStackOfOne`
  case object `dsl.Stack<Int>?`        extends DslInteger with `box.NullableStackOfOne`
  case object `dsl.Stack<Int?>`        extends DslInteger with `box.OneStackOfNullable`
  case object `dsl.Stack<Int?>?`       extends DslInteger with `box.NullableStackOfNullable`
  case object `dsl.Vector<Int>`        extends DslInteger with `box.OneVectorOfOne`
  case object `dsl.Vector<Int>?`       extends DslInteger with `box.NullableVectorOfOne`
  case object `dsl.Vector<Int?>`       extends DslInteger with `box.OneVectorOfNullable`
  case object `dsl.Vector<Int?>?`      extends DslInteger with `box.NullableVectorOfNullable`
}

object DslIntegerGrammarAliases4 {
  case object `dsl.int`                extends DslInteger with `box.One`
  case object `dsl.int?`               extends DslInteger with `box.Nullable`
  case object `dsl.array<int>`         extends DslInteger with `box.OneArrayOfOne`
  case object `dsl.int[]`              extends DslInteger with `box.OneBracketsOfOne`
  case object `dsl.array<int>?`        extends DslInteger with `box.NullableArrayOfOne`
  case object `dsl.int[]?`             extends DslInteger with `box.NullableBracketsOfOne`
  case object `dsl.array<int?>`        extends DslInteger with `box.OneArrayOfNullable`
  case object `dsl.int?[]`             extends DslInteger with `box.OneBracketsOfNullable`
  case object `dsl.array<int?>?`       extends DslInteger with `box.NullableArrayOfNullable`
  case object `dsl.int?[]?`            extends DslInteger with `box.NullableBracketsOfNullable`
  case object `dsl.list<int>`          extends DslInteger with `box.OneListOfOne`
  case object `dsl.list<int>?`         extends DslInteger with `box.NullableListOfOne`
  case object `dsl.list<int?>`         extends DslInteger with `box.OneListOfNullable`
  case object `dsl.list<int?>?`        extends DslInteger with `box.NullableListOfNullable`
  case object `dsl.set<int>`           extends DslInteger with `box.OneSetOfOne`
  case object `dsl.set<int>?`          extends DslInteger with `box.NullableSetOfOne`
  case object `dsl.set<int?>`          extends DslInteger with `box.OneSetOfNullable`
  case object `dsl.set<int?>?`         extends DslInteger with `box.NullableSetOfNullable`
  case object `dsl.queue<int>`         extends DslInteger with `box.OneQueueOfOne`
  case object `dsl.queue<int>?`        extends DslInteger with `box.NullableQueueOfOne`
  case object `dsl.queue<int?>`        extends DslInteger with `box.OneQueueOfNullable`
  case object `dsl.queue<int?>?`       extends DslInteger with `box.NullableQueueOfNullable`
  case object `dsl.linked list<int>`   extends DslInteger with `box.OneLinkedListOfOne`
  case object `dsl.linked list<int>?`  extends DslInteger with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<int?>`  extends DslInteger with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<int?>?` extends DslInteger with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<int>`         extends DslInteger with `box.OneStackOfOne`
  case object `dsl.stack<int>?`        extends DslInteger with `box.NullableStackOfOne`
  case object `dsl.stack<int?>`        extends DslInteger with `box.OneStackOfNullable`
  case object `dsl.stack<int?>?`       extends DslInteger with `box.NullableStackOfNullable`
  case object `dsl.vector<int>`        extends DslInteger with `box.OneVectorOfOne`
  case object `dsl.vector<int>?`       extends DslInteger with `box.NullableVectorOfOne`
  case object `dsl.vector<int?>`       extends DslInteger with `box.OneVectorOfNullable`
  case object `dsl.vector<int?>?`      extends DslInteger with `box.NullableVectorOfNullable`
}

object DslIntegerGrammarAliases5 {
  case object `dsl.integer`                extends DslInteger with `box.One`
  case object `dsl.integer?`               extends DslInteger with `box.Nullable`
  case object `dsl.array<integer>`         extends DslInteger with `box.OneArrayOfOne`
  case object `dsl.integer[]`              extends DslInteger with `box.OneBracketsOfOne`
  case object `dsl.array<integer>?`        extends DslInteger with `box.NullableArrayOfOne`
  case object `dsl.integer[]?`             extends DslInteger with `box.NullableBracketsOfOne`
  case object `dsl.array<integer?>`        extends DslInteger with `box.OneArrayOfNullable`
  case object `dsl.integer?[]`             extends DslInteger with `box.OneBracketsOfNullable`
  case object `dsl.array<integer?>?`       extends DslInteger with `box.NullableArrayOfNullable`
  case object `dsl.integer?[]?`            extends DslInteger with `box.NullableBracketsOfNullable`
  case object `dsl.list<integer>`          extends DslInteger with `box.OneListOfOne`
  case object `dsl.list<integer>?`         extends DslInteger with `box.NullableListOfOne`
  case object `dsl.list<integer?>`         extends DslInteger with `box.OneListOfNullable`
  case object `dsl.list<integer?>?`        extends DslInteger with `box.NullableListOfNullable`
  case object `dsl.set<integer>`           extends DslInteger with `box.OneSetOfOne`
  case object `dsl.set<integer>?`          extends DslInteger with `box.NullableSetOfOne`
  case object `dsl.set<integer?>`          extends DslInteger with `box.OneSetOfNullable`
  case object `dsl.set<integer?>?`         extends DslInteger with `box.NullableSetOfNullable`
  case object `dsl.queue<integer>`         extends DslInteger with `box.OneQueueOfOne`
  case object `dsl.queue<integer>?`        extends DslInteger with `box.NullableQueueOfOne`
  case object `dsl.queue<integer?>`        extends DslInteger with `box.OneQueueOfNullable`
  case object `dsl.queue<integer?>?`       extends DslInteger with `box.NullableQueueOfNullable`
  case object `dsl.linked list<integer>`   extends DslInteger with `box.OneLinkedListOfOne`
  case object `dsl.linked list<integer>?`  extends DslInteger with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<integer?>`  extends DslInteger with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<integer?>?` extends DslInteger with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<integer>`         extends DslInteger with `box.OneStackOfOne`
  case object `dsl.stack<integer>?`        extends DslInteger with `box.NullableStackOfOne`
  case object `dsl.stack<integer?>`        extends DslInteger with `box.OneStackOfNullable`
  case object `dsl.stack<integer?>?`       extends DslInteger with `box.NullableStackOfNullable`
  case object `dsl.vector<integer>`        extends DslInteger with `box.OneVectorOfOne`
  case object `dsl.vector<integer>?`       extends DslInteger with `box.NullableVectorOfOne`
  case object `dsl.vector<integer?>`       extends DslInteger with `box.OneVectorOfNullable`
  case object `dsl.vector<integer?>?`      extends DslInteger with `box.NullableVectorOfNullable`
}
