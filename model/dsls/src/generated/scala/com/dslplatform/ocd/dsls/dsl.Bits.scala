package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslBits
    extends OcdDslBoxType
    with `type.Bits`

case object `dsl.Bits`                extends DslBits with `box.One`
case object `dsl.Bits?`               extends DslBits with `box.Nullable`
case object `dsl.Array<Bits>`         extends DslBits with `box.OneArrayOfOne`
case object `dsl.Bits[]`              extends DslBits with `box.OneBracketsOfOne`
case object `dsl.Array<Bits>?`        extends DslBits with `box.NullableArrayOfOne`
case object `dsl.Bits[]?`             extends DslBits with `box.NullableBracketsOfOne`
case object `dsl.Array<Bits?>`        extends DslBits with `box.OneArrayOfNullable`
case object `dsl.Bits?[]`             extends DslBits with `box.OneBracketsOfNullable`
case object `dsl.Array<Bits?>?`       extends DslBits with `box.NullableArrayOfNullable`
case object `dsl.Bits?[]?`            extends DslBits with `box.NullableBracketsOfNullable`
case object `dsl.List<Bits>`          extends DslBits with `box.OneListOfOne`
case object `dsl.List<Bits>?`         extends DslBits with `box.NullableListOfOne`
case object `dsl.List<Bits?>`         extends DslBits with `box.OneListOfNullable`
case object `dsl.List<Bits?>?`        extends DslBits with `box.NullableListOfNullable`
case object `dsl.Set<Bits>`           extends DslBits with `box.OneSetOfOne`
case object `dsl.Set<Bits>?`          extends DslBits with `box.NullableSetOfOne`
case object `dsl.Set<Bits?>`          extends DslBits with `box.OneSetOfNullable`
case object `dsl.Set<Bits?>?`         extends DslBits with `box.NullableSetOfNullable`
case object `dsl.Queue<Bits>`         extends DslBits with `box.OneQueueOfOne`
case object `dsl.Queue<Bits>?`        extends DslBits with `box.NullableQueueOfOne`
case object `dsl.Queue<Bits?>`        extends DslBits with `box.OneQueueOfNullable`
case object `dsl.Queue<Bits?>?`       extends DslBits with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Bits>`   extends DslBits with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Bits>?`  extends DslBits with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Bits?>`  extends DslBits with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Bits?>?` extends DslBits with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Bits>`         extends DslBits with `box.OneStackOfOne`
case object `dsl.Stack<Bits>?`        extends DslBits with `box.NullableStackOfOne`
case object `dsl.Stack<Bits?>`        extends DslBits with `box.OneStackOfNullable`
case object `dsl.Stack<Bits?>?`       extends DslBits with `box.NullableStackOfNullable`
case object `dsl.Vector<Bits>`        extends DslBits with `box.OneVectorOfOne`
case object `dsl.Vector<Bits>?`       extends DslBits with `box.NullableVectorOfOne`
case object `dsl.Vector<Bits?>`       extends DslBits with `box.OneVectorOfNullable`
case object `dsl.Vector<Bits?>?`      extends DslBits with `box.NullableVectorOfNullable`

object DslBitsGrammarAliases1 {
  case object `dsl.BITS`                extends DslBits with `box.One`
  case object `dsl.BITS?`               extends DslBits with `box.Nullable`
  case object `dsl.ARRAY<BITS>`         extends DslBits with `box.OneArrayOfOne`
  case object `dsl.BITS[]`              extends DslBits with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<BITS>?`        extends DslBits with `box.NullableArrayOfOne`
  case object `dsl.BITS[]?`             extends DslBits with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<BITS?>`        extends DslBits with `box.OneArrayOfNullable`
  case object `dsl.BITS?[]`             extends DslBits with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<BITS?>?`       extends DslBits with `box.NullableArrayOfNullable`
  case object `dsl.BITS?[]?`            extends DslBits with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<BITS>`          extends DslBits with `box.OneListOfOne`
  case object `dsl.LIST<BITS>?`         extends DslBits with `box.NullableListOfOne`
  case object `dsl.LIST<BITS?>`         extends DslBits with `box.OneListOfNullable`
  case object `dsl.LIST<BITS?>?`        extends DslBits with `box.NullableListOfNullable`
  case object `dsl.SET<BITS>`           extends DslBits with `box.OneSetOfOne`
  case object `dsl.SET<BITS>?`          extends DslBits with `box.NullableSetOfOne`
  case object `dsl.SET<BITS?>`          extends DslBits with `box.OneSetOfNullable`
  case object `dsl.SET<BITS?>?`         extends DslBits with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<BITS>`         extends DslBits with `box.OneQueueOfOne`
  case object `dsl.QUEUE<BITS>?`        extends DslBits with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<BITS?>`        extends DslBits with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<BITS?>?`       extends DslBits with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<BITS>`   extends DslBits with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<BITS>?`  extends DslBits with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<BITS?>`  extends DslBits with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<BITS?>?` extends DslBits with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<BITS>`         extends DslBits with `box.OneStackOfOne`
  case object `dsl.STACK<BITS>?`        extends DslBits with `box.NullableStackOfOne`
  case object `dsl.STACK<BITS?>`        extends DslBits with `box.OneStackOfNullable`
  case object `dsl.STACK<BITS?>?`       extends DslBits with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<BITS>`        extends DslBits with `box.OneVectorOfOne`
  case object `dsl.VECTOR<BITS>?`       extends DslBits with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<BITS?>`       extends DslBits with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<BITS?>?`      extends DslBits with `box.NullableVectorOfNullable`
}

object DslBitsGrammarAliases2 {
  case object `dsl.bits`                extends DslBits with `box.One`
  case object `dsl.bits?`               extends DslBits with `box.Nullable`
  case object `dsl.array<bits>`         extends DslBits with `box.OneArrayOfOne`
  case object `dsl.bits[]`              extends DslBits with `box.OneBracketsOfOne`
  case object `dsl.array<bits>?`        extends DslBits with `box.NullableArrayOfOne`
  case object `dsl.bits[]?`             extends DslBits with `box.NullableBracketsOfOne`
  case object `dsl.array<bits?>`        extends DslBits with `box.OneArrayOfNullable`
  case object `dsl.bits?[]`             extends DslBits with `box.OneBracketsOfNullable`
  case object `dsl.array<bits?>?`       extends DslBits with `box.NullableArrayOfNullable`
  case object `dsl.bits?[]?`            extends DslBits with `box.NullableBracketsOfNullable`
  case object `dsl.list<bits>`          extends DslBits with `box.OneListOfOne`
  case object `dsl.list<bits>?`         extends DslBits with `box.NullableListOfOne`
  case object `dsl.list<bits?>`         extends DslBits with `box.OneListOfNullable`
  case object `dsl.list<bits?>?`        extends DslBits with `box.NullableListOfNullable`
  case object `dsl.set<bits>`           extends DslBits with `box.OneSetOfOne`
  case object `dsl.set<bits>?`          extends DslBits with `box.NullableSetOfOne`
  case object `dsl.set<bits?>`          extends DslBits with `box.OneSetOfNullable`
  case object `dsl.set<bits?>?`         extends DslBits with `box.NullableSetOfNullable`
  case object `dsl.queue<bits>`         extends DslBits with `box.OneQueueOfOne`
  case object `dsl.queue<bits>?`        extends DslBits with `box.NullableQueueOfOne`
  case object `dsl.queue<bits?>`        extends DslBits with `box.OneQueueOfNullable`
  case object `dsl.queue<bits?>?`       extends DslBits with `box.NullableQueueOfNullable`
  case object `dsl.linked list<bits>`   extends DslBits with `box.OneLinkedListOfOne`
  case object `dsl.linked list<bits>?`  extends DslBits with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<bits?>`  extends DslBits with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<bits?>?` extends DslBits with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<bits>`         extends DslBits with `box.OneStackOfOne`
  case object `dsl.stack<bits>?`        extends DslBits with `box.NullableStackOfOne`
  case object `dsl.stack<bits?>`        extends DslBits with `box.OneStackOfNullable`
  case object `dsl.stack<bits?>?`       extends DslBits with `box.NullableStackOfNullable`
  case object `dsl.vector<bits>`        extends DslBits with `box.OneVectorOfOne`
  case object `dsl.vector<bits>?`       extends DslBits with `box.NullableVectorOfOne`
  case object `dsl.vector<bits?>`       extends DslBits with `box.OneVectorOfNullable`
  case object `dsl.vector<bits?>?`      extends DslBits with `box.NullableVectorOfNullable`
}
