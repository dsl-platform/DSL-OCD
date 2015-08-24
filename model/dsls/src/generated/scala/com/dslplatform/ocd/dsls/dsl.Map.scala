package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslMap
    extends OcdDslBoxType
    with `type.Map`

case object `dsl.Map`                extends DslMap with `box.One`
case object `dsl.Map?`               extends DslMap with `box.Nullable`
case object `dsl.Array<Map>`         extends DslMap with `box.OneArrayOfOne`
case object `dsl.Map[]`              extends DslMap with `box.OneBracketsOfOne`
case object `dsl.Array<Map>?`        extends DslMap with `box.NullableArrayOfOne`
case object `dsl.Map[]?`             extends DslMap with `box.NullableBracketsOfOne`
case object `dsl.Array<Map?>`        extends DslMap with `box.OneArrayOfNullable`
case object `dsl.Map?[]`             extends DslMap with `box.OneBracketsOfNullable`
case object `dsl.Array<Map?>?`       extends DslMap with `box.NullableArrayOfNullable`
case object `dsl.Map?[]?`            extends DslMap with `box.NullableBracketsOfNullable`
case object `dsl.List<Map>`          extends DslMap with `box.OneListOfOne`
case object `dsl.List<Map>?`         extends DslMap with `box.NullableListOfOne`
case object `dsl.List<Map?>`         extends DslMap with `box.OneListOfNullable`
case object `dsl.List<Map?>?`        extends DslMap with `box.NullableListOfNullable`
case object `dsl.Set<Map>`           extends DslMap with `box.OneSetOfOne`
case object `dsl.Set<Map>?`          extends DslMap with `box.NullableSetOfOne`
case object `dsl.Set<Map?>`          extends DslMap with `box.OneSetOfNullable`
case object `dsl.Set<Map?>?`         extends DslMap with `box.NullableSetOfNullable`
case object `dsl.Queue<Map>`         extends DslMap with `box.OneQueueOfOne`
case object `dsl.Queue<Map>?`        extends DslMap with `box.NullableQueueOfOne`
case object `dsl.Queue<Map?>`        extends DslMap with `box.OneQueueOfNullable`
case object `dsl.Queue<Map?>?`       extends DslMap with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Map>`   extends DslMap with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Map>?`  extends DslMap with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Map?>`  extends DslMap with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Map?>?` extends DslMap with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Map>`         extends DslMap with `box.OneStackOfOne`
case object `dsl.Stack<Map>?`        extends DslMap with `box.NullableStackOfOne`
case object `dsl.Stack<Map?>`        extends DslMap with `box.OneStackOfNullable`
case object `dsl.Stack<Map?>?`       extends DslMap with `box.NullableStackOfNullable`
case object `dsl.Vector<Map>`        extends DslMap with `box.OneVectorOfOne`
case object `dsl.Vector<Map>?`       extends DslMap with `box.NullableVectorOfOne`
case object `dsl.Vector<Map?>`       extends DslMap with `box.OneVectorOfNullable`
case object `dsl.Vector<Map?>?`      extends DslMap with `box.NullableVectorOfNullable`

object DslMapGrammarAliases1 {
  case object `dsl.DICTIONARY`                extends DslMap with `box.One`
  case object `dsl.DICTIONARY?`               extends DslMap with `box.Nullable`
  case object `dsl.ARRAY<DICTIONARY>`         extends DslMap with `box.OneArrayOfOne`
  case object `dsl.DICTIONARY[]`              extends DslMap with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<DICTIONARY>?`        extends DslMap with `box.NullableArrayOfOne`
  case object `dsl.DICTIONARY[]?`             extends DslMap with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<DICTIONARY?>`        extends DslMap with `box.OneArrayOfNullable`
  case object `dsl.DICTIONARY?[]`             extends DslMap with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<DICTIONARY?>?`       extends DslMap with `box.NullableArrayOfNullable`
  case object `dsl.DICTIONARY?[]?`            extends DslMap with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<DICTIONARY>`          extends DslMap with `box.OneListOfOne`
  case object `dsl.LIST<DICTIONARY>?`         extends DslMap with `box.NullableListOfOne`
  case object `dsl.LIST<DICTIONARY?>`         extends DslMap with `box.OneListOfNullable`
  case object `dsl.LIST<DICTIONARY?>?`        extends DslMap with `box.NullableListOfNullable`
  case object `dsl.SET<DICTIONARY>`           extends DslMap with `box.OneSetOfOne`
  case object `dsl.SET<DICTIONARY>?`          extends DslMap with `box.NullableSetOfOne`
  case object `dsl.SET<DICTIONARY?>`          extends DslMap with `box.OneSetOfNullable`
  case object `dsl.SET<DICTIONARY?>?`         extends DslMap with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<DICTIONARY>`         extends DslMap with `box.OneQueueOfOne`
  case object `dsl.QUEUE<DICTIONARY>?`        extends DslMap with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<DICTIONARY?>`        extends DslMap with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<DICTIONARY?>?`       extends DslMap with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<DICTIONARY>`   extends DslMap with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<DICTIONARY>?`  extends DslMap with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<DICTIONARY?>`  extends DslMap with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<DICTIONARY?>?` extends DslMap with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<DICTIONARY>`         extends DslMap with `box.OneStackOfOne`
  case object `dsl.STACK<DICTIONARY>?`        extends DslMap with `box.NullableStackOfOne`
  case object `dsl.STACK<DICTIONARY?>`        extends DslMap with `box.OneStackOfNullable`
  case object `dsl.STACK<DICTIONARY?>?`       extends DslMap with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<DICTIONARY>`        extends DslMap with `box.OneVectorOfOne`
  case object `dsl.VECTOR<DICTIONARY>?`       extends DslMap with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<DICTIONARY?>`       extends DslMap with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<DICTIONARY?>?`      extends DslMap with `box.NullableVectorOfNullable`
}

object DslMapGrammarAliases2 {
  case object `dsl.Dictionary`                extends DslMap with `box.One`
  case object `dsl.Dictionary?`               extends DslMap with `box.Nullable`
  case object `dsl.Array<Dictionary>`         extends DslMap with `box.OneArrayOfOne`
  case object `dsl.Dictionary[]`              extends DslMap with `box.OneBracketsOfOne`
  case object `dsl.Array<Dictionary>?`        extends DslMap with `box.NullableArrayOfOne`
  case object `dsl.Dictionary[]?`             extends DslMap with `box.NullableBracketsOfOne`
  case object `dsl.Array<Dictionary?>`        extends DslMap with `box.OneArrayOfNullable`
  case object `dsl.Dictionary?[]`             extends DslMap with `box.OneBracketsOfNullable`
  case object `dsl.Array<Dictionary?>?`       extends DslMap with `box.NullableArrayOfNullable`
  case object `dsl.Dictionary?[]?`            extends DslMap with `box.NullableBracketsOfNullable`
  case object `dsl.List<Dictionary>`          extends DslMap with `box.OneListOfOne`
  case object `dsl.List<Dictionary>?`         extends DslMap with `box.NullableListOfOne`
  case object `dsl.List<Dictionary?>`         extends DslMap with `box.OneListOfNullable`
  case object `dsl.List<Dictionary?>?`        extends DslMap with `box.NullableListOfNullable`
  case object `dsl.Set<Dictionary>`           extends DslMap with `box.OneSetOfOne`
  case object `dsl.Set<Dictionary>?`          extends DslMap with `box.NullableSetOfOne`
  case object `dsl.Set<Dictionary?>`          extends DslMap with `box.OneSetOfNullable`
  case object `dsl.Set<Dictionary?>?`         extends DslMap with `box.NullableSetOfNullable`
  case object `dsl.Queue<Dictionary>`         extends DslMap with `box.OneQueueOfOne`
  case object `dsl.Queue<Dictionary>?`        extends DslMap with `box.NullableQueueOfOne`
  case object `dsl.Queue<Dictionary?>`        extends DslMap with `box.OneQueueOfNullable`
  case object `dsl.Queue<Dictionary?>?`       extends DslMap with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Dictionary>`   extends DslMap with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Dictionary>?`  extends DslMap with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Dictionary?>`  extends DslMap with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Dictionary?>?` extends DslMap with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Dictionary>`         extends DslMap with `box.OneStackOfOne`
  case object `dsl.Stack<Dictionary>?`        extends DslMap with `box.NullableStackOfOne`
  case object `dsl.Stack<Dictionary?>`        extends DslMap with `box.OneStackOfNullable`
  case object `dsl.Stack<Dictionary?>?`       extends DslMap with `box.NullableStackOfNullable`
  case object `dsl.Vector<Dictionary>`        extends DslMap with `box.OneVectorOfOne`
  case object `dsl.Vector<Dictionary>?`       extends DslMap with `box.NullableVectorOfOne`
  case object `dsl.Vector<Dictionary?>`       extends DslMap with `box.OneVectorOfNullable`
  case object `dsl.Vector<Dictionary?>?`      extends DslMap with `box.NullableVectorOfNullable`
}

object DslMapGrammarAliases3 {
  case object `dsl.MAP`                extends DslMap with `box.One`
  case object `dsl.MAP?`               extends DslMap with `box.Nullable`
  case object `dsl.ARRAY<MAP>`         extends DslMap with `box.OneArrayOfOne`
  case object `dsl.MAP[]`              extends DslMap with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<MAP>?`        extends DslMap with `box.NullableArrayOfOne`
  case object `dsl.MAP[]?`             extends DslMap with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<MAP?>`        extends DslMap with `box.OneArrayOfNullable`
  case object `dsl.MAP?[]`             extends DslMap with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<MAP?>?`       extends DslMap with `box.NullableArrayOfNullable`
  case object `dsl.MAP?[]?`            extends DslMap with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<MAP>`          extends DslMap with `box.OneListOfOne`
  case object `dsl.LIST<MAP>?`         extends DslMap with `box.NullableListOfOne`
  case object `dsl.LIST<MAP?>`         extends DslMap with `box.OneListOfNullable`
  case object `dsl.LIST<MAP?>?`        extends DslMap with `box.NullableListOfNullable`
  case object `dsl.SET<MAP>`           extends DslMap with `box.OneSetOfOne`
  case object `dsl.SET<MAP>?`          extends DslMap with `box.NullableSetOfOne`
  case object `dsl.SET<MAP?>`          extends DslMap with `box.OneSetOfNullable`
  case object `dsl.SET<MAP?>?`         extends DslMap with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<MAP>`         extends DslMap with `box.OneQueueOfOne`
  case object `dsl.QUEUE<MAP>?`        extends DslMap with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<MAP?>`        extends DslMap with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<MAP?>?`       extends DslMap with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<MAP>`   extends DslMap with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<MAP>?`  extends DslMap with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<MAP?>`  extends DslMap with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<MAP?>?` extends DslMap with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<MAP>`         extends DslMap with `box.OneStackOfOne`
  case object `dsl.STACK<MAP>?`        extends DslMap with `box.NullableStackOfOne`
  case object `dsl.STACK<MAP?>`        extends DslMap with `box.OneStackOfNullable`
  case object `dsl.STACK<MAP?>?`       extends DslMap with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<MAP>`        extends DslMap with `box.OneVectorOfOne`
  case object `dsl.VECTOR<MAP>?`       extends DslMap with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<MAP?>`       extends DslMap with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<MAP?>?`      extends DslMap with `box.NullableVectorOfNullable`
}

object DslMapGrammarAliases4 {
  case object `dsl.dictionary`                extends DslMap with `box.One`
  case object `dsl.dictionary?`               extends DslMap with `box.Nullable`
  case object `dsl.array<dictionary>`         extends DslMap with `box.OneArrayOfOne`
  case object `dsl.dictionary[]`              extends DslMap with `box.OneBracketsOfOne`
  case object `dsl.array<dictionary>?`        extends DslMap with `box.NullableArrayOfOne`
  case object `dsl.dictionary[]?`             extends DslMap with `box.NullableBracketsOfOne`
  case object `dsl.array<dictionary?>`        extends DslMap with `box.OneArrayOfNullable`
  case object `dsl.dictionary?[]`             extends DslMap with `box.OneBracketsOfNullable`
  case object `dsl.array<dictionary?>?`       extends DslMap with `box.NullableArrayOfNullable`
  case object `dsl.dictionary?[]?`            extends DslMap with `box.NullableBracketsOfNullable`
  case object `dsl.list<dictionary>`          extends DslMap with `box.OneListOfOne`
  case object `dsl.list<dictionary>?`         extends DslMap with `box.NullableListOfOne`
  case object `dsl.list<dictionary?>`         extends DslMap with `box.OneListOfNullable`
  case object `dsl.list<dictionary?>?`        extends DslMap with `box.NullableListOfNullable`
  case object `dsl.set<dictionary>`           extends DslMap with `box.OneSetOfOne`
  case object `dsl.set<dictionary>?`          extends DslMap with `box.NullableSetOfOne`
  case object `dsl.set<dictionary?>`          extends DslMap with `box.OneSetOfNullable`
  case object `dsl.set<dictionary?>?`         extends DslMap with `box.NullableSetOfNullable`
  case object `dsl.queue<dictionary>`         extends DslMap with `box.OneQueueOfOne`
  case object `dsl.queue<dictionary>?`        extends DslMap with `box.NullableQueueOfOne`
  case object `dsl.queue<dictionary?>`        extends DslMap with `box.OneQueueOfNullable`
  case object `dsl.queue<dictionary?>?`       extends DslMap with `box.NullableQueueOfNullable`
  case object `dsl.linked list<dictionary>`   extends DslMap with `box.OneLinkedListOfOne`
  case object `dsl.linked list<dictionary>?`  extends DslMap with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<dictionary?>`  extends DslMap with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<dictionary?>?` extends DslMap with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<dictionary>`         extends DslMap with `box.OneStackOfOne`
  case object `dsl.stack<dictionary>?`        extends DslMap with `box.NullableStackOfOne`
  case object `dsl.stack<dictionary?>`        extends DslMap with `box.OneStackOfNullable`
  case object `dsl.stack<dictionary?>?`       extends DslMap with `box.NullableStackOfNullable`
  case object `dsl.vector<dictionary>`        extends DslMap with `box.OneVectorOfOne`
  case object `dsl.vector<dictionary>?`       extends DslMap with `box.NullableVectorOfOne`
  case object `dsl.vector<dictionary?>`       extends DslMap with `box.OneVectorOfNullable`
  case object `dsl.vector<dictionary?>?`      extends DslMap with `box.NullableVectorOfNullable`
}

object DslMapGrammarAliases5 {
  case object `dsl.map`                extends DslMap with `box.One`
  case object `dsl.map?`               extends DslMap with `box.Nullable`
  case object `dsl.array<map>`         extends DslMap with `box.OneArrayOfOne`
  case object `dsl.map[]`              extends DslMap with `box.OneBracketsOfOne`
  case object `dsl.array<map>?`        extends DslMap with `box.NullableArrayOfOne`
  case object `dsl.map[]?`             extends DslMap with `box.NullableBracketsOfOne`
  case object `dsl.array<map?>`        extends DslMap with `box.OneArrayOfNullable`
  case object `dsl.map?[]`             extends DslMap with `box.OneBracketsOfNullable`
  case object `dsl.array<map?>?`       extends DslMap with `box.NullableArrayOfNullable`
  case object `dsl.map?[]?`            extends DslMap with `box.NullableBracketsOfNullable`
  case object `dsl.list<map>`          extends DslMap with `box.OneListOfOne`
  case object `dsl.list<map>?`         extends DslMap with `box.NullableListOfOne`
  case object `dsl.list<map?>`         extends DslMap with `box.OneListOfNullable`
  case object `dsl.list<map?>?`        extends DslMap with `box.NullableListOfNullable`
  case object `dsl.set<map>`           extends DslMap with `box.OneSetOfOne`
  case object `dsl.set<map>?`          extends DslMap with `box.NullableSetOfOne`
  case object `dsl.set<map?>`          extends DslMap with `box.OneSetOfNullable`
  case object `dsl.set<map?>?`         extends DslMap with `box.NullableSetOfNullable`
  case object `dsl.queue<map>`         extends DslMap with `box.OneQueueOfOne`
  case object `dsl.queue<map>?`        extends DslMap with `box.NullableQueueOfOne`
  case object `dsl.queue<map?>`        extends DslMap with `box.OneQueueOfNullable`
  case object `dsl.queue<map?>?`       extends DslMap with `box.NullableQueueOfNullable`
  case object `dsl.linked list<map>`   extends DslMap with `box.OneLinkedListOfOne`
  case object `dsl.linked list<map>?`  extends DslMap with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<map?>`  extends DslMap with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<map?>?` extends DslMap with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<map>`         extends DslMap with `box.OneStackOfOne`
  case object `dsl.stack<map>?`        extends DslMap with `box.NullableStackOfOne`
  case object `dsl.stack<map?>`        extends DslMap with `box.OneStackOfNullable`
  case object `dsl.stack<map?>?`       extends DslMap with `box.NullableStackOfNullable`
  case object `dsl.vector<map>`        extends DslMap with `box.OneVectorOfOne`
  case object `dsl.vector<map>?`       extends DslMap with `box.NullableVectorOfOne`
  case object `dsl.vector<map?>`       extends DslMap with `box.OneVectorOfNullable`
  case object `dsl.vector<map?>?`      extends DslMap with `box.NullableVectorOfNullable`
}
