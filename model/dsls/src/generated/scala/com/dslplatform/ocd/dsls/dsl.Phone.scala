package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslPhone
    extends OcdDslBoxType
    with `type.Phone`

case object `dsl.Phone`                extends DslPhone with `box.One`
case object `dsl.Phone?`               extends DslPhone with `box.Nullable`
case object `dsl.Array<Phone>`         extends DslPhone with `box.OneArrayOfOne`
case object `dsl.Phone[]`              extends DslPhone with `box.OneBracketsOfOne`
case object `dsl.Array<Phone>?`        extends DslPhone with `box.NullableArrayOfOne`
case object `dsl.Phone[]?`             extends DslPhone with `box.NullableBracketsOfOne`
case object `dsl.Array<Phone?>`        extends DslPhone with `box.OneArrayOfNullable`
case object `dsl.Phone?[]`             extends DslPhone with `box.OneBracketsOfNullable`
case object `dsl.Array<Phone?>?`       extends DslPhone with `box.NullableArrayOfNullable`
case object `dsl.Phone?[]?`            extends DslPhone with `box.NullableBracketsOfNullable`
case object `dsl.List<Phone>`          extends DslPhone with `box.OneListOfOne`
case object `dsl.List<Phone>?`         extends DslPhone with `box.NullableListOfOne`
case object `dsl.List<Phone?>`         extends DslPhone with `box.OneListOfNullable`
case object `dsl.List<Phone?>?`        extends DslPhone with `box.NullableListOfNullable`
case object `dsl.Set<Phone>`           extends DslPhone with `box.OneSetOfOne`
case object `dsl.Set<Phone>?`          extends DslPhone with `box.NullableSetOfOne`
case object `dsl.Set<Phone?>`          extends DslPhone with `box.OneSetOfNullable`
case object `dsl.Set<Phone?>?`         extends DslPhone with `box.NullableSetOfNullable`
case object `dsl.Queue<Phone>`         extends DslPhone with `box.OneQueueOfOne`
case object `dsl.Queue<Phone>?`        extends DslPhone with `box.NullableQueueOfOne`
case object `dsl.Queue<Phone?>`        extends DslPhone with `box.OneQueueOfNullable`
case object `dsl.Queue<Phone?>?`       extends DslPhone with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Phone>`   extends DslPhone with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Phone>?`  extends DslPhone with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Phone?>`  extends DslPhone with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Phone?>?` extends DslPhone with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Phone>`         extends DslPhone with `box.OneStackOfOne`
case object `dsl.Stack<Phone>?`        extends DslPhone with `box.NullableStackOfOne`
case object `dsl.Stack<Phone?>`        extends DslPhone with `box.OneStackOfNullable`
case object `dsl.Stack<Phone?>?`       extends DslPhone with `box.NullableStackOfNullable`
case object `dsl.Vector<Phone>`        extends DslPhone with `box.OneVectorOfOne`
case object `dsl.Vector<Phone>?`       extends DslPhone with `box.NullableVectorOfOne`
case object `dsl.Vector<Phone?>`       extends DslPhone with `box.OneVectorOfNullable`
case object `dsl.Vector<Phone?>?`      extends DslPhone with `box.NullableVectorOfNullable`

object DslPhoneGrammarAliases1 {
  case object `dsl.PHONE`                extends DslPhone with `box.One`
  case object `dsl.PHONE?`               extends DslPhone with `box.Nullable`
  case object `dsl.ARRAY<PHONE>`         extends DslPhone with `box.OneArrayOfOne`
  case object `dsl.PHONE[]`              extends DslPhone with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<PHONE>?`        extends DslPhone with `box.NullableArrayOfOne`
  case object `dsl.PHONE[]?`             extends DslPhone with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<PHONE?>`        extends DslPhone with `box.OneArrayOfNullable`
  case object `dsl.PHONE?[]`             extends DslPhone with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<PHONE?>?`       extends DslPhone with `box.NullableArrayOfNullable`
  case object `dsl.PHONE?[]?`            extends DslPhone with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<PHONE>`          extends DslPhone with `box.OneListOfOne`
  case object `dsl.LIST<PHONE>?`         extends DslPhone with `box.NullableListOfOne`
  case object `dsl.LIST<PHONE?>`         extends DslPhone with `box.OneListOfNullable`
  case object `dsl.LIST<PHONE?>?`        extends DslPhone with `box.NullableListOfNullable`
  case object `dsl.SET<PHONE>`           extends DslPhone with `box.OneSetOfOne`
  case object `dsl.SET<PHONE>?`          extends DslPhone with `box.NullableSetOfOne`
  case object `dsl.SET<PHONE?>`          extends DslPhone with `box.OneSetOfNullable`
  case object `dsl.SET<PHONE?>?`         extends DslPhone with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<PHONE>`         extends DslPhone with `box.OneQueueOfOne`
  case object `dsl.QUEUE<PHONE>?`        extends DslPhone with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<PHONE?>`        extends DslPhone with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<PHONE?>?`       extends DslPhone with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<PHONE>`   extends DslPhone with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<PHONE>?`  extends DslPhone with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<PHONE?>`  extends DslPhone with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<PHONE?>?` extends DslPhone with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<PHONE>`         extends DslPhone with `box.OneStackOfOne`
  case object `dsl.STACK<PHONE>?`        extends DslPhone with `box.NullableStackOfOne`
  case object `dsl.STACK<PHONE?>`        extends DslPhone with `box.OneStackOfNullable`
  case object `dsl.STACK<PHONE?>?`       extends DslPhone with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<PHONE>`        extends DslPhone with `box.OneVectorOfOne`
  case object `dsl.VECTOR<PHONE>?`       extends DslPhone with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<PHONE?>`       extends DslPhone with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<PHONE?>?`      extends DslPhone with `box.NullableVectorOfNullable`
}

object DslPhoneGrammarAliases2 {
  case object `dsl.phone`                extends DslPhone with `box.One`
  case object `dsl.phone?`               extends DslPhone with `box.Nullable`
  case object `dsl.array<phone>`         extends DslPhone with `box.OneArrayOfOne`
  case object `dsl.phone[]`              extends DslPhone with `box.OneBracketsOfOne`
  case object `dsl.array<phone>?`        extends DslPhone with `box.NullableArrayOfOne`
  case object `dsl.phone[]?`             extends DslPhone with `box.NullableBracketsOfOne`
  case object `dsl.array<phone?>`        extends DslPhone with `box.OneArrayOfNullable`
  case object `dsl.phone?[]`             extends DslPhone with `box.OneBracketsOfNullable`
  case object `dsl.array<phone?>?`       extends DslPhone with `box.NullableArrayOfNullable`
  case object `dsl.phone?[]?`            extends DslPhone with `box.NullableBracketsOfNullable`
  case object `dsl.list<phone>`          extends DslPhone with `box.OneListOfOne`
  case object `dsl.list<phone>?`         extends DslPhone with `box.NullableListOfOne`
  case object `dsl.list<phone?>`         extends DslPhone with `box.OneListOfNullable`
  case object `dsl.list<phone?>?`        extends DslPhone with `box.NullableListOfNullable`
  case object `dsl.set<phone>`           extends DslPhone with `box.OneSetOfOne`
  case object `dsl.set<phone>?`          extends DslPhone with `box.NullableSetOfOne`
  case object `dsl.set<phone?>`          extends DslPhone with `box.OneSetOfNullable`
  case object `dsl.set<phone?>?`         extends DslPhone with `box.NullableSetOfNullable`
  case object `dsl.queue<phone>`         extends DslPhone with `box.OneQueueOfOne`
  case object `dsl.queue<phone>?`        extends DslPhone with `box.NullableQueueOfOne`
  case object `dsl.queue<phone?>`        extends DslPhone with `box.OneQueueOfNullable`
  case object `dsl.queue<phone?>?`       extends DslPhone with `box.NullableQueueOfNullable`
  case object `dsl.linked list<phone>`   extends DslPhone with `box.OneLinkedListOfOne`
  case object `dsl.linked list<phone>?`  extends DslPhone with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<phone?>`  extends DslPhone with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<phone?>?` extends DslPhone with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<phone>`         extends DslPhone with `box.OneStackOfOne`
  case object `dsl.stack<phone>?`        extends DslPhone with `box.NullableStackOfOne`
  case object `dsl.stack<phone?>`        extends DslPhone with `box.OneStackOfNullable`
  case object `dsl.stack<phone?>?`       extends DslPhone with `box.NullableStackOfNullable`
  case object `dsl.vector<phone>`        extends DslPhone with `box.OneVectorOfOne`
  case object `dsl.vector<phone>?`       extends DslPhone with `box.NullableVectorOfOne`
  case object `dsl.vector<phone?>`       extends DslPhone with `box.OneVectorOfNullable`
  case object `dsl.vector<phone?>?`      extends DslPhone with `box.NullableVectorOfNullable`
}
