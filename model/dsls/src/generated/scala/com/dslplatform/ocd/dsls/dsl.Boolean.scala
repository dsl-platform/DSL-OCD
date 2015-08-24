package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslBoolean
    extends OcdDslBoxType
    with `type.Boolean`

case object `dsl.Boolean`                extends DslBoolean with `box.One`
case object `dsl.Boolean?`               extends DslBoolean with `box.Nullable`
case object `dsl.Array<Boolean>`         extends DslBoolean with `box.OneArrayOfOne`
case object `dsl.Boolean[]`              extends DslBoolean with `box.OneBracketsOfOne`
case object `dsl.Array<Boolean>?`        extends DslBoolean with `box.NullableArrayOfOne`
case object `dsl.Boolean[]?`             extends DslBoolean with `box.NullableBracketsOfOne`
case object `dsl.Array<Boolean?>`        extends DslBoolean with `box.OneArrayOfNullable`
case object `dsl.Boolean?[]`             extends DslBoolean with `box.OneBracketsOfNullable`
case object `dsl.Array<Boolean?>?`       extends DslBoolean with `box.NullableArrayOfNullable`
case object `dsl.Boolean?[]?`            extends DslBoolean with `box.NullableBracketsOfNullable`
case object `dsl.List<Boolean>`          extends DslBoolean with `box.OneListOfOne`
case object `dsl.List<Boolean>?`         extends DslBoolean with `box.NullableListOfOne`
case object `dsl.List<Boolean?>`         extends DslBoolean with `box.OneListOfNullable`
case object `dsl.List<Boolean?>?`        extends DslBoolean with `box.NullableListOfNullable`
case object `dsl.Set<Boolean>`           extends DslBoolean with `box.OneSetOfOne`
case object `dsl.Set<Boolean>?`          extends DslBoolean with `box.NullableSetOfOne`
case object `dsl.Set<Boolean?>`          extends DslBoolean with `box.OneSetOfNullable`
case object `dsl.Set<Boolean?>?`         extends DslBoolean with `box.NullableSetOfNullable`
case object `dsl.Queue<Boolean>`         extends DslBoolean with `box.OneQueueOfOne`
case object `dsl.Queue<Boolean>?`        extends DslBoolean with `box.NullableQueueOfOne`
case object `dsl.Queue<Boolean?>`        extends DslBoolean with `box.OneQueueOfNullable`
case object `dsl.Queue<Boolean?>?`       extends DslBoolean with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Boolean>`   extends DslBoolean with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Boolean>?`  extends DslBoolean with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Boolean?>`  extends DslBoolean with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Boolean?>?` extends DslBoolean with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Boolean>`         extends DslBoolean with `box.OneStackOfOne`
case object `dsl.Stack<Boolean>?`        extends DslBoolean with `box.NullableStackOfOne`
case object `dsl.Stack<Boolean?>`        extends DslBoolean with `box.OneStackOfNullable`
case object `dsl.Stack<Boolean?>?`       extends DslBoolean with `box.NullableStackOfNullable`
case object `dsl.Vector<Boolean>`        extends DslBoolean with `box.OneVectorOfOne`
case object `dsl.Vector<Boolean>?`       extends DslBoolean with `box.NullableVectorOfOne`
case object `dsl.Vector<Boolean?>`       extends DslBoolean with `box.OneVectorOfNullable`
case object `dsl.Vector<Boolean?>?`      extends DslBoolean with `box.NullableVectorOfNullable`

object DslBooleanGrammarAliases1 {
  case object `dsl.BOOL`                extends DslBoolean with `box.One`
  case object `dsl.BOOL?`               extends DslBoolean with `box.Nullable`
  case object `dsl.ARRAY<BOOL>`         extends DslBoolean with `box.OneArrayOfOne`
  case object `dsl.BOOL[]`              extends DslBoolean with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<BOOL>?`        extends DslBoolean with `box.NullableArrayOfOne`
  case object `dsl.BOOL[]?`             extends DslBoolean with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<BOOL?>`        extends DslBoolean with `box.OneArrayOfNullable`
  case object `dsl.BOOL?[]`             extends DslBoolean with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<BOOL?>?`       extends DslBoolean with `box.NullableArrayOfNullable`
  case object `dsl.BOOL?[]?`            extends DslBoolean with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<BOOL>`          extends DslBoolean with `box.OneListOfOne`
  case object `dsl.LIST<BOOL>?`         extends DslBoolean with `box.NullableListOfOne`
  case object `dsl.LIST<BOOL?>`         extends DslBoolean with `box.OneListOfNullable`
  case object `dsl.LIST<BOOL?>?`        extends DslBoolean with `box.NullableListOfNullable`
  case object `dsl.SET<BOOL>`           extends DslBoolean with `box.OneSetOfOne`
  case object `dsl.SET<BOOL>?`          extends DslBoolean with `box.NullableSetOfOne`
  case object `dsl.SET<BOOL?>`          extends DslBoolean with `box.OneSetOfNullable`
  case object `dsl.SET<BOOL?>?`         extends DslBoolean with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<BOOL>`         extends DslBoolean with `box.OneQueueOfOne`
  case object `dsl.QUEUE<BOOL>?`        extends DslBoolean with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<BOOL?>`        extends DslBoolean with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<BOOL?>?`       extends DslBoolean with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<BOOL>`   extends DslBoolean with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<BOOL>?`  extends DslBoolean with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<BOOL?>`  extends DslBoolean with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<BOOL?>?` extends DslBoolean with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<BOOL>`         extends DslBoolean with `box.OneStackOfOne`
  case object `dsl.STACK<BOOL>?`        extends DslBoolean with `box.NullableStackOfOne`
  case object `dsl.STACK<BOOL?>`        extends DslBoolean with `box.OneStackOfNullable`
  case object `dsl.STACK<BOOL?>?`       extends DslBoolean with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<BOOL>`        extends DslBoolean with `box.OneVectorOfOne`
  case object `dsl.VECTOR<BOOL>?`       extends DslBoolean with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<BOOL?>`       extends DslBoolean with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<BOOL?>?`      extends DslBoolean with `box.NullableVectorOfNullable`
}

object DslBooleanGrammarAliases2 {
  case object `dsl.BOOLEAN`                extends DslBoolean with `box.One`
  case object `dsl.BOOLEAN?`               extends DslBoolean with `box.Nullable`
  case object `dsl.ARRAY<BOOLEAN>`         extends DslBoolean with `box.OneArrayOfOne`
  case object `dsl.BOOLEAN[]`              extends DslBoolean with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<BOOLEAN>?`        extends DslBoolean with `box.NullableArrayOfOne`
  case object `dsl.BOOLEAN[]?`             extends DslBoolean with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<BOOLEAN?>`        extends DslBoolean with `box.OneArrayOfNullable`
  case object `dsl.BOOLEAN?[]`             extends DslBoolean with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<BOOLEAN?>?`       extends DslBoolean with `box.NullableArrayOfNullable`
  case object `dsl.BOOLEAN?[]?`            extends DslBoolean with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<BOOLEAN>`          extends DslBoolean with `box.OneListOfOne`
  case object `dsl.LIST<BOOLEAN>?`         extends DslBoolean with `box.NullableListOfOne`
  case object `dsl.LIST<BOOLEAN?>`         extends DslBoolean with `box.OneListOfNullable`
  case object `dsl.LIST<BOOLEAN?>?`        extends DslBoolean with `box.NullableListOfNullable`
  case object `dsl.SET<BOOLEAN>`           extends DslBoolean with `box.OneSetOfOne`
  case object `dsl.SET<BOOLEAN>?`          extends DslBoolean with `box.NullableSetOfOne`
  case object `dsl.SET<BOOLEAN?>`          extends DslBoolean with `box.OneSetOfNullable`
  case object `dsl.SET<BOOLEAN?>?`         extends DslBoolean with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<BOOLEAN>`         extends DslBoolean with `box.OneQueueOfOne`
  case object `dsl.QUEUE<BOOLEAN>?`        extends DslBoolean with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<BOOLEAN?>`        extends DslBoolean with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<BOOLEAN?>?`       extends DslBoolean with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<BOOLEAN>`   extends DslBoolean with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<BOOLEAN>?`  extends DslBoolean with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<BOOLEAN?>`  extends DslBoolean with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<BOOLEAN?>?` extends DslBoolean with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<BOOLEAN>`         extends DslBoolean with `box.OneStackOfOne`
  case object `dsl.STACK<BOOLEAN>?`        extends DslBoolean with `box.NullableStackOfOne`
  case object `dsl.STACK<BOOLEAN?>`        extends DslBoolean with `box.OneStackOfNullable`
  case object `dsl.STACK<BOOLEAN?>?`       extends DslBoolean with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<BOOLEAN>`        extends DslBoolean with `box.OneVectorOfOne`
  case object `dsl.VECTOR<BOOLEAN>?`       extends DslBoolean with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<BOOLEAN?>`       extends DslBoolean with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<BOOLEAN?>?`      extends DslBoolean with `box.NullableVectorOfNullable`
}

object DslBooleanGrammarAliases3 {
  case object `dsl.Bool`                extends DslBoolean with `box.One`
  case object `dsl.Bool?`               extends DslBoolean with `box.Nullable`
  case object `dsl.Array<Bool>`         extends DslBoolean with `box.OneArrayOfOne`
  case object `dsl.Bool[]`              extends DslBoolean with `box.OneBracketsOfOne`
  case object `dsl.Array<Bool>?`        extends DslBoolean with `box.NullableArrayOfOne`
  case object `dsl.Bool[]?`             extends DslBoolean with `box.NullableBracketsOfOne`
  case object `dsl.Array<Bool?>`        extends DslBoolean with `box.OneArrayOfNullable`
  case object `dsl.Bool?[]`             extends DslBoolean with `box.OneBracketsOfNullable`
  case object `dsl.Array<Bool?>?`       extends DslBoolean with `box.NullableArrayOfNullable`
  case object `dsl.Bool?[]?`            extends DslBoolean with `box.NullableBracketsOfNullable`
  case object `dsl.List<Bool>`          extends DslBoolean with `box.OneListOfOne`
  case object `dsl.List<Bool>?`         extends DslBoolean with `box.NullableListOfOne`
  case object `dsl.List<Bool?>`         extends DslBoolean with `box.OneListOfNullable`
  case object `dsl.List<Bool?>?`        extends DslBoolean with `box.NullableListOfNullable`
  case object `dsl.Set<Bool>`           extends DslBoolean with `box.OneSetOfOne`
  case object `dsl.Set<Bool>?`          extends DslBoolean with `box.NullableSetOfOne`
  case object `dsl.Set<Bool?>`          extends DslBoolean with `box.OneSetOfNullable`
  case object `dsl.Set<Bool?>?`         extends DslBoolean with `box.NullableSetOfNullable`
  case object `dsl.Queue<Bool>`         extends DslBoolean with `box.OneQueueOfOne`
  case object `dsl.Queue<Bool>?`        extends DslBoolean with `box.NullableQueueOfOne`
  case object `dsl.Queue<Bool?>`        extends DslBoolean with `box.OneQueueOfNullable`
  case object `dsl.Queue<Bool?>?`       extends DslBoolean with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Bool>`   extends DslBoolean with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Bool>?`  extends DslBoolean with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Bool?>`  extends DslBoolean with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Bool?>?` extends DslBoolean with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Bool>`         extends DslBoolean with `box.OneStackOfOne`
  case object `dsl.Stack<Bool>?`        extends DslBoolean with `box.NullableStackOfOne`
  case object `dsl.Stack<Bool?>`        extends DslBoolean with `box.OneStackOfNullable`
  case object `dsl.Stack<Bool?>?`       extends DslBoolean with `box.NullableStackOfNullable`
  case object `dsl.Vector<Bool>`        extends DslBoolean with `box.OneVectorOfOne`
  case object `dsl.Vector<Bool>?`       extends DslBoolean with `box.NullableVectorOfOne`
  case object `dsl.Vector<Bool?>`       extends DslBoolean with `box.OneVectorOfNullable`
  case object `dsl.Vector<Bool?>?`      extends DslBoolean with `box.NullableVectorOfNullable`
}

object DslBooleanGrammarAliases4 {
  case object `dsl.bool`                extends DslBoolean with `box.One`
  case object `dsl.bool?`               extends DslBoolean with `box.Nullable`
  case object `dsl.array<bool>`         extends DslBoolean with `box.OneArrayOfOne`
  case object `dsl.bool[]`              extends DslBoolean with `box.OneBracketsOfOne`
  case object `dsl.array<bool>?`        extends DslBoolean with `box.NullableArrayOfOne`
  case object `dsl.bool[]?`             extends DslBoolean with `box.NullableBracketsOfOne`
  case object `dsl.array<bool?>`        extends DslBoolean with `box.OneArrayOfNullable`
  case object `dsl.bool?[]`             extends DslBoolean with `box.OneBracketsOfNullable`
  case object `dsl.array<bool?>?`       extends DslBoolean with `box.NullableArrayOfNullable`
  case object `dsl.bool?[]?`            extends DslBoolean with `box.NullableBracketsOfNullable`
  case object `dsl.list<bool>`          extends DslBoolean with `box.OneListOfOne`
  case object `dsl.list<bool>?`         extends DslBoolean with `box.NullableListOfOne`
  case object `dsl.list<bool?>`         extends DslBoolean with `box.OneListOfNullable`
  case object `dsl.list<bool?>?`        extends DslBoolean with `box.NullableListOfNullable`
  case object `dsl.set<bool>`           extends DslBoolean with `box.OneSetOfOne`
  case object `dsl.set<bool>?`          extends DslBoolean with `box.NullableSetOfOne`
  case object `dsl.set<bool?>`          extends DslBoolean with `box.OneSetOfNullable`
  case object `dsl.set<bool?>?`         extends DslBoolean with `box.NullableSetOfNullable`
  case object `dsl.queue<bool>`         extends DslBoolean with `box.OneQueueOfOne`
  case object `dsl.queue<bool>?`        extends DslBoolean with `box.NullableQueueOfOne`
  case object `dsl.queue<bool?>`        extends DslBoolean with `box.OneQueueOfNullable`
  case object `dsl.queue<bool?>?`       extends DslBoolean with `box.NullableQueueOfNullable`
  case object `dsl.linked list<bool>`   extends DslBoolean with `box.OneLinkedListOfOne`
  case object `dsl.linked list<bool>?`  extends DslBoolean with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<bool?>`  extends DslBoolean with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<bool?>?` extends DslBoolean with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<bool>`         extends DslBoolean with `box.OneStackOfOne`
  case object `dsl.stack<bool>?`        extends DslBoolean with `box.NullableStackOfOne`
  case object `dsl.stack<bool?>`        extends DslBoolean with `box.OneStackOfNullable`
  case object `dsl.stack<bool?>?`       extends DslBoolean with `box.NullableStackOfNullable`
  case object `dsl.vector<bool>`        extends DslBoolean with `box.OneVectorOfOne`
  case object `dsl.vector<bool>?`       extends DslBoolean with `box.NullableVectorOfOne`
  case object `dsl.vector<bool?>`       extends DslBoolean with `box.OneVectorOfNullable`
  case object `dsl.vector<bool?>?`      extends DslBoolean with `box.NullableVectorOfNullable`
}

object DslBooleanGrammarAliases5 {
  case object `dsl.boolean`                extends DslBoolean with `box.One`
  case object `dsl.boolean?`               extends DslBoolean with `box.Nullable`
  case object `dsl.array<boolean>`         extends DslBoolean with `box.OneArrayOfOne`
  case object `dsl.boolean[]`              extends DslBoolean with `box.OneBracketsOfOne`
  case object `dsl.array<boolean>?`        extends DslBoolean with `box.NullableArrayOfOne`
  case object `dsl.boolean[]?`             extends DslBoolean with `box.NullableBracketsOfOne`
  case object `dsl.array<boolean?>`        extends DslBoolean with `box.OneArrayOfNullable`
  case object `dsl.boolean?[]`             extends DslBoolean with `box.OneBracketsOfNullable`
  case object `dsl.array<boolean?>?`       extends DslBoolean with `box.NullableArrayOfNullable`
  case object `dsl.boolean?[]?`            extends DslBoolean with `box.NullableBracketsOfNullable`
  case object `dsl.list<boolean>`          extends DslBoolean with `box.OneListOfOne`
  case object `dsl.list<boolean>?`         extends DslBoolean with `box.NullableListOfOne`
  case object `dsl.list<boolean?>`         extends DslBoolean with `box.OneListOfNullable`
  case object `dsl.list<boolean?>?`        extends DslBoolean with `box.NullableListOfNullable`
  case object `dsl.set<boolean>`           extends DslBoolean with `box.OneSetOfOne`
  case object `dsl.set<boolean>?`          extends DslBoolean with `box.NullableSetOfOne`
  case object `dsl.set<boolean?>`          extends DslBoolean with `box.OneSetOfNullable`
  case object `dsl.set<boolean?>?`         extends DslBoolean with `box.NullableSetOfNullable`
  case object `dsl.queue<boolean>`         extends DslBoolean with `box.OneQueueOfOne`
  case object `dsl.queue<boolean>?`        extends DslBoolean with `box.NullableQueueOfOne`
  case object `dsl.queue<boolean?>`        extends DslBoolean with `box.OneQueueOfNullable`
  case object `dsl.queue<boolean?>?`       extends DslBoolean with `box.NullableQueueOfNullable`
  case object `dsl.linked list<boolean>`   extends DslBoolean with `box.OneLinkedListOfOne`
  case object `dsl.linked list<boolean>?`  extends DslBoolean with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<boolean?>`  extends DslBoolean with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<boolean?>?` extends DslBoolean with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<boolean>`         extends DslBoolean with `box.OneStackOfOne`
  case object `dsl.stack<boolean>?`        extends DslBoolean with `box.NullableStackOfOne`
  case object `dsl.stack<boolean?>`        extends DslBoolean with `box.OneStackOfNullable`
  case object `dsl.stack<boolean?>?`       extends DslBoolean with `box.NullableStackOfNullable`
  case object `dsl.vector<boolean>`        extends DslBoolean with `box.OneVectorOfOne`
  case object `dsl.vector<boolean>?`       extends DslBoolean with `box.NullableVectorOfOne`
  case object `dsl.vector<boolean?>`       extends DslBoolean with `box.OneVectorOfNullable`
  case object `dsl.vector<boolean?>?`      extends DslBoolean with `box.NullableVectorOfNullable`
}
