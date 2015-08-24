package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslNative
    extends OcdDslBoxType
    with `type.Native`

case object `dsl.Native`                extends DslNative with `box.One`
case object `dsl.Native?`               extends DslNative with `box.Nullable`
case object `dsl.Array<Native>`         extends DslNative with `box.OneArrayOfOne`
case object `dsl.Native[]`              extends DslNative with `box.OneBracketsOfOne`
case object `dsl.Array<Native>?`        extends DslNative with `box.NullableArrayOfOne`
case object `dsl.Native[]?`             extends DslNative with `box.NullableBracketsOfOne`
case object `dsl.Array<Native?>`        extends DslNative with `box.OneArrayOfNullable`
case object `dsl.Native?[]`             extends DslNative with `box.OneBracketsOfNullable`
case object `dsl.Array<Native?>?`       extends DslNative with `box.NullableArrayOfNullable`
case object `dsl.Native?[]?`            extends DslNative with `box.NullableBracketsOfNullable`
case object `dsl.List<Native>`          extends DslNative with `box.OneListOfOne`
case object `dsl.List<Native>?`         extends DslNative with `box.NullableListOfOne`
case object `dsl.List<Native?>`         extends DslNative with `box.OneListOfNullable`
case object `dsl.List<Native?>?`        extends DslNative with `box.NullableListOfNullable`
case object `dsl.Set<Native>`           extends DslNative with `box.OneSetOfOne`
case object `dsl.Set<Native>?`          extends DslNative with `box.NullableSetOfOne`
case object `dsl.Set<Native?>`          extends DslNative with `box.OneSetOfNullable`
case object `dsl.Set<Native?>?`         extends DslNative with `box.NullableSetOfNullable`
case object `dsl.Queue<Native>`         extends DslNative with `box.OneQueueOfOne`
case object `dsl.Queue<Native>?`        extends DslNative with `box.NullableQueueOfOne`
case object `dsl.Queue<Native?>`        extends DslNative with `box.OneQueueOfNullable`
case object `dsl.Queue<Native?>?`       extends DslNative with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Native>`   extends DslNative with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Native>?`  extends DslNative with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Native?>`  extends DslNative with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Native?>?` extends DslNative with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Native>`         extends DslNative with `box.OneStackOfOne`
case object `dsl.Stack<Native>?`        extends DslNative with `box.NullableStackOfOne`
case object `dsl.Stack<Native?>`        extends DslNative with `box.OneStackOfNullable`
case object `dsl.Stack<Native?>?`       extends DslNative with `box.NullableStackOfNullable`
case object `dsl.Vector<Native>`        extends DslNative with `box.OneVectorOfOne`
case object `dsl.Vector<Native>?`       extends DslNative with `box.NullableVectorOfOne`
case object `dsl.Vector<Native?>`       extends DslNative with `box.OneVectorOfNullable`
case object `dsl.Vector<Native?>?`      extends DslNative with `box.NullableVectorOfNullable`

object DslNativeGrammarAliases1 {
  case object `dsl.NATIVE`                extends DslNative with `box.One`
  case object `dsl.NATIVE?`               extends DslNative with `box.Nullable`
  case object `dsl.ARRAY<NATIVE>`         extends DslNative with `box.OneArrayOfOne`
  case object `dsl.NATIVE[]`              extends DslNative with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<NATIVE>?`        extends DslNative with `box.NullableArrayOfOne`
  case object `dsl.NATIVE[]?`             extends DslNative with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<NATIVE?>`        extends DslNative with `box.OneArrayOfNullable`
  case object `dsl.NATIVE?[]`             extends DslNative with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<NATIVE?>?`       extends DslNative with `box.NullableArrayOfNullable`
  case object `dsl.NATIVE?[]?`            extends DslNative with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<NATIVE>`          extends DslNative with `box.OneListOfOne`
  case object `dsl.LIST<NATIVE>?`         extends DslNative with `box.NullableListOfOne`
  case object `dsl.LIST<NATIVE?>`         extends DslNative with `box.OneListOfNullable`
  case object `dsl.LIST<NATIVE?>?`        extends DslNative with `box.NullableListOfNullable`
  case object `dsl.SET<NATIVE>`           extends DslNative with `box.OneSetOfOne`
  case object `dsl.SET<NATIVE>?`          extends DslNative with `box.NullableSetOfOne`
  case object `dsl.SET<NATIVE?>`          extends DslNative with `box.OneSetOfNullable`
  case object `dsl.SET<NATIVE?>?`         extends DslNative with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<NATIVE>`         extends DslNative with `box.OneQueueOfOne`
  case object `dsl.QUEUE<NATIVE>?`        extends DslNative with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<NATIVE?>`        extends DslNative with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<NATIVE?>?`       extends DslNative with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<NATIVE>`   extends DslNative with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<NATIVE>?`  extends DslNative with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<NATIVE?>`  extends DslNative with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<NATIVE?>?` extends DslNative with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<NATIVE>`         extends DslNative with `box.OneStackOfOne`
  case object `dsl.STACK<NATIVE>?`        extends DslNative with `box.NullableStackOfOne`
  case object `dsl.STACK<NATIVE?>`        extends DslNative with `box.OneStackOfNullable`
  case object `dsl.STACK<NATIVE?>?`       extends DslNative with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<NATIVE>`        extends DslNative with `box.OneVectorOfOne`
  case object `dsl.VECTOR<NATIVE>?`       extends DslNative with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<NATIVE?>`       extends DslNative with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<NATIVE?>?`      extends DslNative with `box.NullableVectorOfNullable`
}

object DslNativeGrammarAliases2 {
  case object `dsl.native`                extends DslNative with `box.One`
  case object `dsl.native?`               extends DslNative with `box.Nullable`
  case object `dsl.array<native>`         extends DslNative with `box.OneArrayOfOne`
  case object `dsl.native[]`              extends DslNative with `box.OneBracketsOfOne`
  case object `dsl.array<native>?`        extends DslNative with `box.NullableArrayOfOne`
  case object `dsl.native[]?`             extends DslNative with `box.NullableBracketsOfOne`
  case object `dsl.array<native?>`        extends DslNative with `box.OneArrayOfNullable`
  case object `dsl.native?[]`             extends DslNative with `box.OneBracketsOfNullable`
  case object `dsl.array<native?>?`       extends DslNative with `box.NullableArrayOfNullable`
  case object `dsl.native?[]?`            extends DslNative with `box.NullableBracketsOfNullable`
  case object `dsl.list<native>`          extends DslNative with `box.OneListOfOne`
  case object `dsl.list<native>?`         extends DslNative with `box.NullableListOfOne`
  case object `dsl.list<native?>`         extends DslNative with `box.OneListOfNullable`
  case object `dsl.list<native?>?`        extends DslNative with `box.NullableListOfNullable`
  case object `dsl.set<native>`           extends DslNative with `box.OneSetOfOne`
  case object `dsl.set<native>?`          extends DslNative with `box.NullableSetOfOne`
  case object `dsl.set<native?>`          extends DslNative with `box.OneSetOfNullable`
  case object `dsl.set<native?>?`         extends DslNative with `box.NullableSetOfNullable`
  case object `dsl.queue<native>`         extends DslNative with `box.OneQueueOfOne`
  case object `dsl.queue<native>?`        extends DslNative with `box.NullableQueueOfOne`
  case object `dsl.queue<native?>`        extends DslNative with `box.OneQueueOfNullable`
  case object `dsl.queue<native?>?`       extends DslNative with `box.NullableQueueOfNullable`
  case object `dsl.linked list<native>`   extends DslNative with `box.OneLinkedListOfOne`
  case object `dsl.linked list<native>?`  extends DslNative with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<native?>`  extends DslNative with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<native?>?` extends DslNative with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<native>`         extends DslNative with `box.OneStackOfOne`
  case object `dsl.stack<native>?`        extends DslNative with `box.NullableStackOfOne`
  case object `dsl.stack<native?>`        extends DslNative with `box.OneStackOfNullable`
  case object `dsl.stack<native?>?`       extends DslNative with `box.NullableStackOfNullable`
  case object `dsl.vector<native>`        extends DslNative with `box.OneVectorOfOne`
  case object `dsl.vector<native>?`       extends DslNative with `box.NullableVectorOfOne`
  case object `dsl.vector<native?>`       extends DslNative with `box.OneVectorOfNullable`
  case object `dsl.vector<native?>?`      extends DslNative with `box.NullableVectorOfNullable`
}
