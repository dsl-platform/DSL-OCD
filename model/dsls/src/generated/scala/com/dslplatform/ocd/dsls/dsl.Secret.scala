package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslSecret
    extends OcdDslBoxType
    with `type.Secret`

case object `dsl.Secret`                extends DslSecret with `box.One`
case object `dsl.Secret?`               extends DslSecret with `box.Nullable`
case object `dsl.Array<Secret>`         extends DslSecret with `box.OneArrayOfOne`
case object `dsl.Secret[]`              extends DslSecret with `box.OneBracketsOfOne`
case object `dsl.Array<Secret>?`        extends DslSecret with `box.NullableArrayOfOne`
case object `dsl.Secret[]?`             extends DslSecret with `box.NullableBracketsOfOne`
case object `dsl.Array<Secret?>`        extends DslSecret with `box.OneArrayOfNullable`
case object `dsl.Secret?[]`             extends DslSecret with `box.OneBracketsOfNullable`
case object `dsl.Array<Secret?>?`       extends DslSecret with `box.NullableArrayOfNullable`
case object `dsl.Secret?[]?`            extends DslSecret with `box.NullableBracketsOfNullable`
case object `dsl.List<Secret>`          extends DslSecret with `box.OneListOfOne`
case object `dsl.List<Secret>?`         extends DslSecret with `box.NullableListOfOne`
case object `dsl.List<Secret?>`         extends DslSecret with `box.OneListOfNullable`
case object `dsl.List<Secret?>?`        extends DslSecret with `box.NullableListOfNullable`
case object `dsl.Set<Secret>`           extends DslSecret with `box.OneSetOfOne`
case object `dsl.Set<Secret>?`          extends DslSecret with `box.NullableSetOfOne`
case object `dsl.Set<Secret?>`          extends DslSecret with `box.OneSetOfNullable`
case object `dsl.Set<Secret?>?`         extends DslSecret with `box.NullableSetOfNullable`
case object `dsl.Queue<Secret>`         extends DslSecret with `box.OneQueueOfOne`
case object `dsl.Queue<Secret>?`        extends DslSecret with `box.NullableQueueOfOne`
case object `dsl.Queue<Secret?>`        extends DslSecret with `box.OneQueueOfNullable`
case object `dsl.Queue<Secret?>?`       extends DslSecret with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Secret>`   extends DslSecret with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Secret>?`  extends DslSecret with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Secret?>`  extends DslSecret with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Secret?>?` extends DslSecret with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Secret>`         extends DslSecret with `box.OneStackOfOne`
case object `dsl.Stack<Secret>?`        extends DslSecret with `box.NullableStackOfOne`
case object `dsl.Stack<Secret?>`        extends DslSecret with `box.OneStackOfNullable`
case object `dsl.Stack<Secret?>?`       extends DslSecret with `box.NullableStackOfNullable`
case object `dsl.Vector<Secret>`        extends DslSecret with `box.OneVectorOfOne`
case object `dsl.Vector<Secret>?`       extends DslSecret with `box.NullableVectorOfOne`
case object `dsl.Vector<Secret?>`       extends DslSecret with `box.OneVectorOfNullable`
case object `dsl.Vector<Secret?>?`      extends DslSecret with `box.NullableVectorOfNullable`

object DslSecretGrammarAliases1 {
  case object `dsl.SECRET`                extends DslSecret with `box.One`
  case object `dsl.SECRET?`               extends DslSecret with `box.Nullable`
  case object `dsl.ARRAY<SECRET>`         extends DslSecret with `box.OneArrayOfOne`
  case object `dsl.SECRET[]`              extends DslSecret with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<SECRET>?`        extends DslSecret with `box.NullableArrayOfOne`
  case object `dsl.SECRET[]?`             extends DslSecret with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<SECRET?>`        extends DslSecret with `box.OneArrayOfNullable`
  case object `dsl.SECRET?[]`             extends DslSecret with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<SECRET?>?`       extends DslSecret with `box.NullableArrayOfNullable`
  case object `dsl.SECRET?[]?`            extends DslSecret with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<SECRET>`          extends DslSecret with `box.OneListOfOne`
  case object `dsl.LIST<SECRET>?`         extends DslSecret with `box.NullableListOfOne`
  case object `dsl.LIST<SECRET?>`         extends DslSecret with `box.OneListOfNullable`
  case object `dsl.LIST<SECRET?>?`        extends DslSecret with `box.NullableListOfNullable`
  case object `dsl.SET<SECRET>`           extends DslSecret with `box.OneSetOfOne`
  case object `dsl.SET<SECRET>?`          extends DslSecret with `box.NullableSetOfOne`
  case object `dsl.SET<SECRET?>`          extends DslSecret with `box.OneSetOfNullable`
  case object `dsl.SET<SECRET?>?`         extends DslSecret with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<SECRET>`         extends DslSecret with `box.OneQueueOfOne`
  case object `dsl.QUEUE<SECRET>?`        extends DslSecret with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<SECRET?>`        extends DslSecret with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<SECRET?>?`       extends DslSecret with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<SECRET>`   extends DslSecret with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<SECRET>?`  extends DslSecret with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<SECRET?>`  extends DslSecret with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<SECRET?>?` extends DslSecret with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<SECRET>`         extends DslSecret with `box.OneStackOfOne`
  case object `dsl.STACK<SECRET>?`        extends DslSecret with `box.NullableStackOfOne`
  case object `dsl.STACK<SECRET?>`        extends DslSecret with `box.OneStackOfNullable`
  case object `dsl.STACK<SECRET?>?`       extends DslSecret with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<SECRET>`        extends DslSecret with `box.OneVectorOfOne`
  case object `dsl.VECTOR<SECRET>?`       extends DslSecret with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<SECRET?>`       extends DslSecret with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<SECRET?>?`      extends DslSecret with `box.NullableVectorOfNullable`
}

object DslSecretGrammarAliases2 {
  case object `dsl.secret`                extends DslSecret with `box.One`
  case object `dsl.secret?`               extends DslSecret with `box.Nullable`
  case object `dsl.array<secret>`         extends DslSecret with `box.OneArrayOfOne`
  case object `dsl.secret[]`              extends DslSecret with `box.OneBracketsOfOne`
  case object `dsl.array<secret>?`        extends DslSecret with `box.NullableArrayOfOne`
  case object `dsl.secret[]?`             extends DslSecret with `box.NullableBracketsOfOne`
  case object `dsl.array<secret?>`        extends DslSecret with `box.OneArrayOfNullable`
  case object `dsl.secret?[]`             extends DslSecret with `box.OneBracketsOfNullable`
  case object `dsl.array<secret?>?`       extends DslSecret with `box.NullableArrayOfNullable`
  case object `dsl.secret?[]?`            extends DslSecret with `box.NullableBracketsOfNullable`
  case object `dsl.list<secret>`          extends DslSecret with `box.OneListOfOne`
  case object `dsl.list<secret>?`         extends DslSecret with `box.NullableListOfOne`
  case object `dsl.list<secret?>`         extends DslSecret with `box.OneListOfNullable`
  case object `dsl.list<secret?>?`        extends DslSecret with `box.NullableListOfNullable`
  case object `dsl.set<secret>`           extends DslSecret with `box.OneSetOfOne`
  case object `dsl.set<secret>?`          extends DslSecret with `box.NullableSetOfOne`
  case object `dsl.set<secret?>`          extends DslSecret with `box.OneSetOfNullable`
  case object `dsl.set<secret?>?`         extends DslSecret with `box.NullableSetOfNullable`
  case object `dsl.queue<secret>`         extends DslSecret with `box.OneQueueOfOne`
  case object `dsl.queue<secret>?`        extends DslSecret with `box.NullableQueueOfOne`
  case object `dsl.queue<secret?>`        extends DslSecret with `box.OneQueueOfNullable`
  case object `dsl.queue<secret?>?`       extends DslSecret with `box.NullableQueueOfNullable`
  case object `dsl.linked list<secret>`   extends DslSecret with `box.OneLinkedListOfOne`
  case object `dsl.linked list<secret>?`  extends DslSecret with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<secret?>`  extends DslSecret with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<secret?>?` extends DslSecret with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<secret>`         extends DslSecret with `box.OneStackOfOne`
  case object `dsl.stack<secret>?`        extends DslSecret with `box.NullableStackOfOne`
  case object `dsl.stack<secret?>`        extends DslSecret with `box.OneStackOfNullable`
  case object `dsl.stack<secret?>?`       extends DslSecret with `box.NullableStackOfNullable`
  case object `dsl.vector<secret>`        extends DslSecret with `box.OneVectorOfOne`
  case object `dsl.vector<secret>?`       extends DslSecret with `box.NullableVectorOfOne`
  case object `dsl.vector<secret?>`       extends DslSecret with `box.OneVectorOfNullable`
  case object `dsl.vector<secret?>?`      extends DslSecret with `box.NullableVectorOfNullable`
}
