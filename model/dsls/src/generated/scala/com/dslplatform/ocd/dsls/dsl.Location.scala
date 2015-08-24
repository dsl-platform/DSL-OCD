package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslLocation
    extends OcdDslBoxType
    with `type.Location`

case object `dsl.Location`                extends DslLocation with `box.One`
case object `dsl.Location?`               extends DslLocation with `box.Nullable`
case object `dsl.Array<Location>`         extends DslLocation with `box.OneArrayOfOne`
case object `dsl.Location[]`              extends DslLocation with `box.OneBracketsOfOne`
case object `dsl.Array<Location>?`        extends DslLocation with `box.NullableArrayOfOne`
case object `dsl.Location[]?`             extends DslLocation with `box.NullableBracketsOfOne`
case object `dsl.Array<Location?>`        extends DslLocation with `box.OneArrayOfNullable`
case object `dsl.Location?[]`             extends DslLocation with `box.OneBracketsOfNullable`
case object `dsl.Array<Location?>?`       extends DslLocation with `box.NullableArrayOfNullable`
case object `dsl.Location?[]?`            extends DslLocation with `box.NullableBracketsOfNullable`
case object `dsl.List<Location>`          extends DslLocation with `box.OneListOfOne`
case object `dsl.List<Location>?`         extends DslLocation with `box.NullableListOfOne`
case object `dsl.List<Location?>`         extends DslLocation with `box.OneListOfNullable`
case object `dsl.List<Location?>?`        extends DslLocation with `box.NullableListOfNullable`
case object `dsl.Set<Location>`           extends DslLocation with `box.OneSetOfOne`
case object `dsl.Set<Location>?`          extends DslLocation with `box.NullableSetOfOne`
case object `dsl.Set<Location?>`          extends DslLocation with `box.OneSetOfNullable`
case object `dsl.Set<Location?>?`         extends DslLocation with `box.NullableSetOfNullable`
case object `dsl.Queue<Location>`         extends DslLocation with `box.OneQueueOfOne`
case object `dsl.Queue<Location>?`        extends DslLocation with `box.NullableQueueOfOne`
case object `dsl.Queue<Location?>`        extends DslLocation with `box.OneQueueOfNullable`
case object `dsl.Queue<Location?>?`       extends DslLocation with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Location>`   extends DslLocation with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Location>?`  extends DslLocation with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Location?>`  extends DslLocation with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Location?>?` extends DslLocation with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Location>`         extends DslLocation with `box.OneStackOfOne`
case object `dsl.Stack<Location>?`        extends DslLocation with `box.NullableStackOfOne`
case object `dsl.Stack<Location?>`        extends DslLocation with `box.OneStackOfNullable`
case object `dsl.Stack<Location?>?`       extends DslLocation with `box.NullableStackOfNullable`
case object `dsl.Vector<Location>`        extends DslLocation with `box.OneVectorOfOne`
case object `dsl.Vector<Location>?`       extends DslLocation with `box.NullableVectorOfOne`
case object `dsl.Vector<Location?>`       extends DslLocation with `box.OneVectorOfNullable`
case object `dsl.Vector<Location?>?`      extends DslLocation with `box.NullableVectorOfNullable`

object DslLocationGrammarAliases1 {
  case object `dsl.LOCATION`                extends DslLocation with `box.One`
  case object `dsl.LOCATION?`               extends DslLocation with `box.Nullable`
  case object `dsl.ARRAY<LOCATION>`         extends DslLocation with `box.OneArrayOfOne`
  case object `dsl.LOCATION[]`              extends DslLocation with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<LOCATION>?`        extends DslLocation with `box.NullableArrayOfOne`
  case object `dsl.LOCATION[]?`             extends DslLocation with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<LOCATION?>`        extends DslLocation with `box.OneArrayOfNullable`
  case object `dsl.LOCATION?[]`             extends DslLocation with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<LOCATION?>?`       extends DslLocation with `box.NullableArrayOfNullable`
  case object `dsl.LOCATION?[]?`            extends DslLocation with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<LOCATION>`          extends DslLocation with `box.OneListOfOne`
  case object `dsl.LIST<LOCATION>?`         extends DslLocation with `box.NullableListOfOne`
  case object `dsl.LIST<LOCATION?>`         extends DslLocation with `box.OneListOfNullable`
  case object `dsl.LIST<LOCATION?>?`        extends DslLocation with `box.NullableListOfNullable`
  case object `dsl.SET<LOCATION>`           extends DslLocation with `box.OneSetOfOne`
  case object `dsl.SET<LOCATION>?`          extends DslLocation with `box.NullableSetOfOne`
  case object `dsl.SET<LOCATION?>`          extends DslLocation with `box.OneSetOfNullable`
  case object `dsl.SET<LOCATION?>?`         extends DslLocation with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<LOCATION>`         extends DslLocation with `box.OneQueueOfOne`
  case object `dsl.QUEUE<LOCATION>?`        extends DslLocation with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<LOCATION?>`        extends DslLocation with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<LOCATION?>?`       extends DslLocation with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<LOCATION>`   extends DslLocation with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<LOCATION>?`  extends DslLocation with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<LOCATION?>`  extends DslLocation with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<LOCATION?>?` extends DslLocation with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<LOCATION>`         extends DslLocation with `box.OneStackOfOne`
  case object `dsl.STACK<LOCATION>?`        extends DslLocation with `box.NullableStackOfOne`
  case object `dsl.STACK<LOCATION?>`        extends DslLocation with `box.OneStackOfNullable`
  case object `dsl.STACK<LOCATION?>?`       extends DslLocation with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<LOCATION>`        extends DslLocation with `box.OneVectorOfOne`
  case object `dsl.VECTOR<LOCATION>?`       extends DslLocation with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<LOCATION?>`       extends DslLocation with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<LOCATION?>?`      extends DslLocation with `box.NullableVectorOfNullable`
}

object DslLocationGrammarAliases2 {
  case object `dsl.location`                extends DslLocation with `box.One`
  case object `dsl.location?`               extends DslLocation with `box.Nullable`
  case object `dsl.array<location>`         extends DslLocation with `box.OneArrayOfOne`
  case object `dsl.location[]`              extends DslLocation with `box.OneBracketsOfOne`
  case object `dsl.array<location>?`        extends DslLocation with `box.NullableArrayOfOne`
  case object `dsl.location[]?`             extends DslLocation with `box.NullableBracketsOfOne`
  case object `dsl.array<location?>`        extends DslLocation with `box.OneArrayOfNullable`
  case object `dsl.location?[]`             extends DslLocation with `box.OneBracketsOfNullable`
  case object `dsl.array<location?>?`       extends DslLocation with `box.NullableArrayOfNullable`
  case object `dsl.location?[]?`            extends DslLocation with `box.NullableBracketsOfNullable`
  case object `dsl.list<location>`          extends DslLocation with `box.OneListOfOne`
  case object `dsl.list<location>?`         extends DslLocation with `box.NullableListOfOne`
  case object `dsl.list<location?>`         extends DslLocation with `box.OneListOfNullable`
  case object `dsl.list<location?>?`        extends DslLocation with `box.NullableListOfNullable`
  case object `dsl.set<location>`           extends DslLocation with `box.OneSetOfOne`
  case object `dsl.set<location>?`          extends DslLocation with `box.NullableSetOfOne`
  case object `dsl.set<location?>`          extends DslLocation with `box.OneSetOfNullable`
  case object `dsl.set<location?>?`         extends DslLocation with `box.NullableSetOfNullable`
  case object `dsl.queue<location>`         extends DslLocation with `box.OneQueueOfOne`
  case object `dsl.queue<location>?`        extends DslLocation with `box.NullableQueueOfOne`
  case object `dsl.queue<location?>`        extends DslLocation with `box.OneQueueOfNullable`
  case object `dsl.queue<location?>?`       extends DslLocation with `box.NullableQueueOfNullable`
  case object `dsl.linked list<location>`   extends DslLocation with `box.OneLinkedListOfOne`
  case object `dsl.linked list<location>?`  extends DslLocation with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<location?>`  extends DslLocation with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<location?>?` extends DslLocation with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<location>`         extends DslLocation with `box.OneStackOfOne`
  case object `dsl.stack<location>?`        extends DslLocation with `box.NullableStackOfOne`
  case object `dsl.stack<location?>`        extends DslLocation with `box.OneStackOfNullable`
  case object `dsl.stack<location?>?`       extends DslLocation with `box.NullableStackOfNullable`
  case object `dsl.vector<location>`        extends DslLocation with `box.OneVectorOfOne`
  case object `dsl.vector<location>?`       extends DslLocation with `box.NullableVectorOfOne`
  case object `dsl.vector<location?>`       extends DslLocation with `box.OneVectorOfNullable`
  case object `dsl.vector<location?>?`      extends DslLocation with `box.NullableVectorOfNullable`
}
