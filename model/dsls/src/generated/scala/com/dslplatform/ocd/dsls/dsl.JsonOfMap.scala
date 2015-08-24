package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslJsonOfMapKind
    extends OcdDslBoxType
    with `type.JsonOf<Map>`

case object `dsl.JsonOf<Map>`                extends DslJsonOfMapKind with `box.One`
case object `dsl.JsonOf<Map>?`               extends DslJsonOfMapKind with `box.Nullable`
case object `dsl.Array<JsonOf<Map>>`         extends DslJsonOfMapKind with `box.OneArrayOfOne`
case object `dsl.JsonOf<Map>[]`              extends DslJsonOfMapKind with `box.OneBracketsOfOne`
case object `dsl.Array<JsonOf<Map>>?`        extends DslJsonOfMapKind with `box.NullableArrayOfOne`
case object `dsl.JsonOf<Map>[]?`             extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
case object `dsl.Array<JsonOf<Map>?>`        extends DslJsonOfMapKind with `box.OneArrayOfNullable`
case object `dsl.JsonOf<Map>?[]`             extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
case object `dsl.Array<JsonOf<Map>?>?`       extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
case object `dsl.JsonOf<Map>?[]?`            extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
case object `dsl.List<JsonOf<Map>>`          extends DslJsonOfMapKind with `box.OneListOfOne`
case object `dsl.List<JsonOf<Map>>?`         extends DslJsonOfMapKind with `box.NullableListOfOne`
case object `dsl.List<JsonOf<Map>?>`         extends DslJsonOfMapKind with `box.OneListOfNullable`
case object `dsl.List<JsonOf<Map>?>?`        extends DslJsonOfMapKind with `box.NullableListOfNullable`
case object `dsl.Set<JsonOf<Map>>`           extends DslJsonOfMapKind with `box.OneSetOfOne`
case object `dsl.Set<JsonOf<Map>>?`          extends DslJsonOfMapKind with `box.NullableSetOfOne`
case object `dsl.Set<JsonOf<Map>?>`          extends DslJsonOfMapKind with `box.OneSetOfNullable`
case object `dsl.Set<JsonOf<Map>?>?`         extends DslJsonOfMapKind with `box.NullableSetOfNullable`
case object `dsl.Queue<JsonOf<Map>>`         extends DslJsonOfMapKind with `box.OneQueueOfOne`
case object `dsl.Queue<JsonOf<Map>>?`        extends DslJsonOfMapKind with `box.NullableQueueOfOne`
case object `dsl.Queue<JsonOf<Map>?>`        extends DslJsonOfMapKind with `box.OneQueueOfNullable`
case object `dsl.Queue<JsonOf<Map>?>?`       extends DslJsonOfMapKind with `box.NullableQueueOfNullable`
case object `dsl.Linked List<JsonOf<Map>>`   extends DslJsonOfMapKind with `box.OneLinkedListOfOne`
case object `dsl.Linked List<JsonOf<Map>>?`  extends DslJsonOfMapKind with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<JsonOf<Map>?>`  extends DslJsonOfMapKind with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<JsonOf<Map>?>?` extends DslJsonOfMapKind with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<JsonOf<Map>>`         extends DslJsonOfMapKind with `box.OneStackOfOne`
case object `dsl.Stack<JsonOf<Map>>?`        extends DslJsonOfMapKind with `box.NullableStackOfOne`
case object `dsl.Stack<JsonOf<Map>?>`        extends DslJsonOfMapKind with `box.OneStackOfNullable`
case object `dsl.Stack<JsonOf<Map>?>?`       extends DslJsonOfMapKind with `box.NullableStackOfNullable`
case object `dsl.Vector<JsonOf<Map>>`        extends DslJsonOfMapKind with `box.OneVectorOfOne`
case object `dsl.Vector<JsonOf<Map>>?`       extends DslJsonOfMapKind with `box.NullableVectorOfOne`
case object `dsl.Vector<JsonOf<Map>?>`       extends DslJsonOfMapKind with `box.OneVectorOfNullable`
case object `dsl.Vector<JsonOf<Map>?>?`      extends DslJsonOfMapKind with `box.NullableVectorOfNullable`

object DslJsonOfMapKindGrammarAliases1 {
  case object `dsl.JSONOF<MAP>`                extends DslJsonOfMapKind with `box.One`
  case object `dsl.JSONOF<MAP>?`               extends DslJsonOfMapKind with `box.Nullable`
  case object `dsl.ARRAY<JSONOF<MAP>>`         extends DslJsonOfMapKind with `box.OneArrayOfOne`
  case object `dsl.JSONOF<MAP>[]`              extends DslJsonOfMapKind with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<JSONOF<MAP>>?`        extends DslJsonOfMapKind with `box.NullableArrayOfOne`
  case object `dsl.JSONOF<MAP>[]?`             extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<JSONOF<MAP>?>`        extends DslJsonOfMapKind with `box.OneArrayOfNullable`
  case object `dsl.JSONOF<MAP>?[]`             extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<JSONOF<MAP>?>?`       extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
  case object `dsl.JSONOF<MAP>?[]?`            extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<JSONOF<MAP>>`          extends DslJsonOfMapKind with `box.OneListOfOne`
  case object `dsl.LIST<JSONOF<MAP>>?`         extends DslJsonOfMapKind with `box.NullableListOfOne`
  case object `dsl.LIST<JSONOF<MAP>?>`         extends DslJsonOfMapKind with `box.OneListOfNullable`
  case object `dsl.LIST<JSONOF<MAP>?>?`        extends DslJsonOfMapKind with `box.NullableListOfNullable`
  case object `dsl.SET<JSONOF<MAP>>`           extends DslJsonOfMapKind with `box.OneSetOfOne`
  case object `dsl.SET<JSONOF<MAP>>?`          extends DslJsonOfMapKind with `box.NullableSetOfOne`
  case object `dsl.SET<JSONOF<MAP>?>`          extends DslJsonOfMapKind with `box.OneSetOfNullable`
  case object `dsl.SET<JSONOF<MAP>?>?`         extends DslJsonOfMapKind with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<JSONOF<MAP>>`         extends DslJsonOfMapKind with `box.OneQueueOfOne`
  case object `dsl.QUEUE<JSONOF<MAP>>?`        extends DslJsonOfMapKind with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<JSONOF<MAP>?>`        extends DslJsonOfMapKind with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<JSONOF<MAP>?>?`       extends DslJsonOfMapKind with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<JSONOF<MAP>>`   extends DslJsonOfMapKind with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<JSONOF<MAP>>?`  extends DslJsonOfMapKind with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<JSONOF<MAP>?>`  extends DslJsonOfMapKind with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<JSONOF<MAP>?>?` extends DslJsonOfMapKind with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<JSONOF<MAP>>`         extends DslJsonOfMapKind with `box.OneStackOfOne`
  case object `dsl.STACK<JSONOF<MAP>>?`        extends DslJsonOfMapKind with `box.NullableStackOfOne`
  case object `dsl.STACK<JSONOF<MAP>?>`        extends DslJsonOfMapKind with `box.OneStackOfNullable`
  case object `dsl.STACK<JSONOF<MAP>?>?`       extends DslJsonOfMapKind with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<JSONOF<MAP>>`        extends DslJsonOfMapKind with `box.OneVectorOfOne`
  case object `dsl.VECTOR<JSONOF<MAP>>?`       extends DslJsonOfMapKind with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<JSONOF<MAP>?>`       extends DslJsonOfMapKind with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<JSONOF<MAP>?>?`      extends DslJsonOfMapKind with `box.NullableVectorOfNullable`
}

object DslJsonOfMapKindGrammarAliases2 {
  case object `dsl.Jsonof<map>`                extends DslJsonOfMapKind with `box.One`
  case object `dsl.Jsonof<map>?`               extends DslJsonOfMapKind with `box.Nullable`
  case object `dsl.Array<Jsonof<map>>`         extends DslJsonOfMapKind with `box.OneArrayOfOne`
  case object `dsl.Jsonof<map>[]`              extends DslJsonOfMapKind with `box.OneBracketsOfOne`
  case object `dsl.Array<Jsonof<map>>?`        extends DslJsonOfMapKind with `box.NullableArrayOfOne`
  case object `dsl.Jsonof<map>[]?`             extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
  case object `dsl.Array<Jsonof<map>?>`        extends DslJsonOfMapKind with `box.OneArrayOfNullable`
  case object `dsl.Jsonof<map>?[]`             extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
  case object `dsl.Array<Jsonof<map>?>?`       extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
  case object `dsl.Jsonof<map>?[]?`            extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
  case object `dsl.List<Jsonof<map>>`          extends DslJsonOfMapKind with `box.OneListOfOne`
  case object `dsl.List<Jsonof<map>>?`         extends DslJsonOfMapKind with `box.NullableListOfOne`
  case object `dsl.List<Jsonof<map>?>`         extends DslJsonOfMapKind with `box.OneListOfNullable`
  case object `dsl.List<Jsonof<map>?>?`        extends DslJsonOfMapKind with `box.NullableListOfNullable`
  case object `dsl.Set<Jsonof<map>>`           extends DslJsonOfMapKind with `box.OneSetOfOne`
  case object `dsl.Set<Jsonof<map>>?`          extends DslJsonOfMapKind with `box.NullableSetOfOne`
  case object `dsl.Set<Jsonof<map>?>`          extends DslJsonOfMapKind with `box.OneSetOfNullable`
  case object `dsl.Set<Jsonof<map>?>?`         extends DslJsonOfMapKind with `box.NullableSetOfNullable`
  case object `dsl.Queue<Jsonof<map>>`         extends DslJsonOfMapKind with `box.OneQueueOfOne`
  case object `dsl.Queue<Jsonof<map>>?`        extends DslJsonOfMapKind with `box.NullableQueueOfOne`
  case object `dsl.Queue<Jsonof<map>?>`        extends DslJsonOfMapKind with `box.OneQueueOfNullable`
  case object `dsl.Queue<Jsonof<map>?>?`       extends DslJsonOfMapKind with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Jsonof<map>>`   extends DslJsonOfMapKind with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Jsonof<map>>?`  extends DslJsonOfMapKind with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Jsonof<map>?>`  extends DslJsonOfMapKind with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Jsonof<map>?>?` extends DslJsonOfMapKind with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Jsonof<map>>`         extends DslJsonOfMapKind with `box.OneStackOfOne`
  case object `dsl.Stack<Jsonof<map>>?`        extends DslJsonOfMapKind with `box.NullableStackOfOne`
  case object `dsl.Stack<Jsonof<map>?>`        extends DslJsonOfMapKind with `box.OneStackOfNullable`
  case object `dsl.Stack<Jsonof<map>?>?`       extends DslJsonOfMapKind with `box.NullableStackOfNullable`
  case object `dsl.Vector<Jsonof<map>>`        extends DslJsonOfMapKind with `box.OneVectorOfOne`
  case object `dsl.Vector<Jsonof<map>>?`       extends DslJsonOfMapKind with `box.NullableVectorOfOne`
  case object `dsl.Vector<Jsonof<map>?>`       extends DslJsonOfMapKind with `box.OneVectorOfNullable`
  case object `dsl.Vector<Jsonof<map>?>?`      extends DslJsonOfMapKind with `box.NullableVectorOfNullable`
}

object DslJsonOfMapKindGrammarAliases3 {
  case object `dsl.jsonof<map>`                extends DslJsonOfMapKind with `box.One`
  case object `dsl.jsonof<map>?`               extends DslJsonOfMapKind with `box.Nullable`
  case object `dsl.array<jsonof<map>>`         extends DslJsonOfMapKind with `box.OneArrayOfOne`
  case object `dsl.jsonof<map>[]`              extends DslJsonOfMapKind with `box.OneBracketsOfOne`
  case object `dsl.array<jsonof<map>>?`        extends DslJsonOfMapKind with `box.NullableArrayOfOne`
  case object `dsl.jsonof<map>[]?`             extends DslJsonOfMapKind with `box.NullableBracketsOfOne`
  case object `dsl.array<jsonof<map>?>`        extends DslJsonOfMapKind with `box.OneArrayOfNullable`
  case object `dsl.jsonof<map>?[]`             extends DslJsonOfMapKind with `box.OneBracketsOfNullable`
  case object `dsl.array<jsonof<map>?>?`       extends DslJsonOfMapKind with `box.NullableArrayOfNullable`
  case object `dsl.jsonof<map>?[]?`            extends DslJsonOfMapKind with `box.NullableBracketsOfNullable`
  case object `dsl.list<jsonof<map>>`          extends DslJsonOfMapKind with `box.OneListOfOne`
  case object `dsl.list<jsonof<map>>?`         extends DslJsonOfMapKind with `box.NullableListOfOne`
  case object `dsl.list<jsonof<map>?>`         extends DslJsonOfMapKind with `box.OneListOfNullable`
  case object `dsl.list<jsonof<map>?>?`        extends DslJsonOfMapKind with `box.NullableListOfNullable`
  case object `dsl.set<jsonof<map>>`           extends DslJsonOfMapKind with `box.OneSetOfOne`
  case object `dsl.set<jsonof<map>>?`          extends DslJsonOfMapKind with `box.NullableSetOfOne`
  case object `dsl.set<jsonof<map>?>`          extends DslJsonOfMapKind with `box.OneSetOfNullable`
  case object `dsl.set<jsonof<map>?>?`         extends DslJsonOfMapKind with `box.NullableSetOfNullable`
  case object `dsl.queue<jsonof<map>>`         extends DslJsonOfMapKind with `box.OneQueueOfOne`
  case object `dsl.queue<jsonof<map>>?`        extends DslJsonOfMapKind with `box.NullableQueueOfOne`
  case object `dsl.queue<jsonof<map>?>`        extends DslJsonOfMapKind with `box.OneQueueOfNullable`
  case object `dsl.queue<jsonof<map>?>?`       extends DslJsonOfMapKind with `box.NullableQueueOfNullable`
  case object `dsl.linked list<jsonof<map>>`   extends DslJsonOfMapKind with `box.OneLinkedListOfOne`
  case object `dsl.linked list<jsonof<map>>?`  extends DslJsonOfMapKind with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<jsonof<map>?>`  extends DslJsonOfMapKind with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<jsonof<map>?>?` extends DslJsonOfMapKind with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<jsonof<map>>`         extends DslJsonOfMapKind with `box.OneStackOfOne`
  case object `dsl.stack<jsonof<map>>?`        extends DslJsonOfMapKind with `box.NullableStackOfOne`
  case object `dsl.stack<jsonof<map>?>`        extends DslJsonOfMapKind with `box.OneStackOfNullable`
  case object `dsl.stack<jsonof<map>?>?`       extends DslJsonOfMapKind with `box.NullableStackOfNullable`
  case object `dsl.vector<jsonof<map>>`        extends DslJsonOfMapKind with `box.OneVectorOfOne`
  case object `dsl.vector<jsonof<map>>?`       extends DslJsonOfMapKind with `box.NullableVectorOfOne`
  case object `dsl.vector<jsonof<map>?>`       extends DslJsonOfMapKind with `box.OneVectorOfNullable`
  case object `dsl.vector<jsonof<map>?>?`      extends DslJsonOfMapKind with `box.NullableVectorOfNullable`
}
