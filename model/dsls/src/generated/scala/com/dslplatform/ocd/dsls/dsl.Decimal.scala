package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslDecimal
    extends OcdDslBoxType
    with `type.Decimal`

case object `dsl.Decimal`                extends DslDecimal with `box.One`
case object `dsl.Decimal?`               extends DslDecimal with `box.Nullable`
case object `dsl.Array<Decimal>`         extends DslDecimal with `box.OneArrayOfOne`
case object `dsl.Decimal[]`              extends DslDecimal with `box.OneBracketsOfOne`
case object `dsl.Array<Decimal>?`        extends DslDecimal with `box.NullableArrayOfOne`
case object `dsl.Decimal[]?`             extends DslDecimal with `box.NullableBracketsOfOne`
case object `dsl.Array<Decimal?>`        extends DslDecimal with `box.OneArrayOfNullable`
case object `dsl.Decimal?[]`             extends DslDecimal with `box.OneBracketsOfNullable`
case object `dsl.Array<Decimal?>?`       extends DslDecimal with `box.NullableArrayOfNullable`
case object `dsl.Decimal?[]?`            extends DslDecimal with `box.NullableBracketsOfNullable`
case object `dsl.List<Decimal>`          extends DslDecimal with `box.OneListOfOne`
case object `dsl.List<Decimal>?`         extends DslDecimal with `box.NullableListOfOne`
case object `dsl.List<Decimal?>`         extends DslDecimal with `box.OneListOfNullable`
case object `dsl.List<Decimal?>?`        extends DslDecimal with `box.NullableListOfNullable`
case object `dsl.Set<Decimal>`           extends DslDecimal with `box.OneSetOfOne`
case object `dsl.Set<Decimal>?`          extends DslDecimal with `box.NullableSetOfOne`
case object `dsl.Set<Decimal?>`          extends DslDecimal with `box.OneSetOfNullable`
case object `dsl.Set<Decimal?>?`         extends DslDecimal with `box.NullableSetOfNullable`
case object `dsl.Queue<Decimal>`         extends DslDecimal with `box.OneQueueOfOne`
case object `dsl.Queue<Decimal>?`        extends DslDecimal with `box.NullableQueueOfOne`
case object `dsl.Queue<Decimal?>`        extends DslDecimal with `box.OneQueueOfNullable`
case object `dsl.Queue<Decimal?>?`       extends DslDecimal with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Decimal>`   extends DslDecimal with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Decimal>?`  extends DslDecimal with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Decimal?>`  extends DslDecimal with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Decimal?>?` extends DslDecimal with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Decimal>`         extends DslDecimal with `box.OneStackOfOne`
case object `dsl.Stack<Decimal>?`        extends DslDecimal with `box.NullableStackOfOne`
case object `dsl.Stack<Decimal?>`        extends DslDecimal with `box.OneStackOfNullable`
case object `dsl.Stack<Decimal?>?`       extends DslDecimal with `box.NullableStackOfNullable`
case object `dsl.Vector<Decimal>`        extends DslDecimal with `box.OneVectorOfOne`
case object `dsl.Vector<Decimal>?`       extends DslDecimal with `box.NullableVectorOfOne`
case object `dsl.Vector<Decimal?>`       extends DslDecimal with `box.OneVectorOfNullable`
case object `dsl.Vector<Decimal?>?`      extends DslDecimal with `box.NullableVectorOfNullable`

object DslDecimalGrammarAliases1 {
  case object `dsl.DECIMAL`                extends DslDecimal with `box.One`
  case object `dsl.DECIMAL?`               extends DslDecimal with `box.Nullable`
  case object `dsl.ARRAY<DECIMAL>`         extends DslDecimal with `box.OneArrayOfOne`
  case object `dsl.DECIMAL[]`              extends DslDecimal with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<DECIMAL>?`        extends DslDecimal with `box.NullableArrayOfOne`
  case object `dsl.DECIMAL[]?`             extends DslDecimal with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<DECIMAL?>`        extends DslDecimal with `box.OneArrayOfNullable`
  case object `dsl.DECIMAL?[]`             extends DslDecimal with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<DECIMAL?>?`       extends DslDecimal with `box.NullableArrayOfNullable`
  case object `dsl.DECIMAL?[]?`            extends DslDecimal with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<DECIMAL>`          extends DslDecimal with `box.OneListOfOne`
  case object `dsl.LIST<DECIMAL>?`         extends DslDecimal with `box.NullableListOfOne`
  case object `dsl.LIST<DECIMAL?>`         extends DslDecimal with `box.OneListOfNullable`
  case object `dsl.LIST<DECIMAL?>?`        extends DslDecimal with `box.NullableListOfNullable`
  case object `dsl.SET<DECIMAL>`           extends DslDecimal with `box.OneSetOfOne`
  case object `dsl.SET<DECIMAL>?`          extends DslDecimal with `box.NullableSetOfOne`
  case object `dsl.SET<DECIMAL?>`          extends DslDecimal with `box.OneSetOfNullable`
  case object `dsl.SET<DECIMAL?>?`         extends DslDecimal with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<DECIMAL>`         extends DslDecimal with `box.OneQueueOfOne`
  case object `dsl.QUEUE<DECIMAL>?`        extends DslDecimal with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<DECIMAL?>`        extends DslDecimal with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<DECIMAL?>?`       extends DslDecimal with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<DECIMAL>`   extends DslDecimal with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<DECIMAL>?`  extends DslDecimal with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<DECIMAL?>`  extends DslDecimal with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<DECIMAL?>?` extends DslDecimal with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<DECIMAL>`         extends DslDecimal with `box.OneStackOfOne`
  case object `dsl.STACK<DECIMAL>?`        extends DslDecimal with `box.NullableStackOfOne`
  case object `dsl.STACK<DECIMAL?>`        extends DslDecimal with `box.OneStackOfNullable`
  case object `dsl.STACK<DECIMAL?>?`       extends DslDecimal with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<DECIMAL>`        extends DslDecimal with `box.OneVectorOfOne`
  case object `dsl.VECTOR<DECIMAL>?`       extends DslDecimal with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<DECIMAL?>`       extends DslDecimal with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<DECIMAL?>?`      extends DslDecimal with `box.NullableVectorOfNullable`
}

object DslDecimalGrammarAliases2 {
  case object `dsl.decimal`                extends DslDecimal with `box.One`
  case object `dsl.decimal?`               extends DslDecimal with `box.Nullable`
  case object `dsl.array<decimal>`         extends DslDecimal with `box.OneArrayOfOne`
  case object `dsl.decimal[]`              extends DslDecimal with `box.OneBracketsOfOne`
  case object `dsl.array<decimal>?`        extends DslDecimal with `box.NullableArrayOfOne`
  case object `dsl.decimal[]?`             extends DslDecimal with `box.NullableBracketsOfOne`
  case object `dsl.array<decimal?>`        extends DslDecimal with `box.OneArrayOfNullable`
  case object `dsl.decimal?[]`             extends DslDecimal with `box.OneBracketsOfNullable`
  case object `dsl.array<decimal?>?`       extends DslDecimal with `box.NullableArrayOfNullable`
  case object `dsl.decimal?[]?`            extends DslDecimal with `box.NullableBracketsOfNullable`
  case object `dsl.list<decimal>`          extends DslDecimal with `box.OneListOfOne`
  case object `dsl.list<decimal>?`         extends DslDecimal with `box.NullableListOfOne`
  case object `dsl.list<decimal?>`         extends DslDecimal with `box.OneListOfNullable`
  case object `dsl.list<decimal?>?`        extends DslDecimal with `box.NullableListOfNullable`
  case object `dsl.set<decimal>`           extends DslDecimal with `box.OneSetOfOne`
  case object `dsl.set<decimal>?`          extends DslDecimal with `box.NullableSetOfOne`
  case object `dsl.set<decimal?>`          extends DslDecimal with `box.OneSetOfNullable`
  case object `dsl.set<decimal?>?`         extends DslDecimal with `box.NullableSetOfNullable`
  case object `dsl.queue<decimal>`         extends DslDecimal with `box.OneQueueOfOne`
  case object `dsl.queue<decimal>?`        extends DslDecimal with `box.NullableQueueOfOne`
  case object `dsl.queue<decimal?>`        extends DslDecimal with `box.OneQueueOfNullable`
  case object `dsl.queue<decimal?>?`       extends DslDecimal with `box.NullableQueueOfNullable`
  case object `dsl.linked list<decimal>`   extends DslDecimal with `box.OneLinkedListOfOne`
  case object `dsl.linked list<decimal>?`  extends DslDecimal with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<decimal?>`  extends DslDecimal with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<decimal?>?` extends DslDecimal with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<decimal>`         extends DslDecimal with `box.OneStackOfOne`
  case object `dsl.stack<decimal>?`        extends DslDecimal with `box.NullableStackOfOne`
  case object `dsl.stack<decimal?>`        extends DslDecimal with `box.OneStackOfNullable`
  case object `dsl.stack<decimal?>?`       extends DslDecimal with `box.NullableStackOfNullable`
  case object `dsl.vector<decimal>`        extends DslDecimal with `box.OneVectorOfOne`
  case object `dsl.vector<decimal>?`       extends DslDecimal with `box.NullableVectorOfOne`
  case object `dsl.vector<decimal?>`       extends DslDecimal with `box.OneVectorOfNullable`
  case object `dsl.vector<decimal?>?`      extends DslDecimal with `box.NullableVectorOfNullable`
}
