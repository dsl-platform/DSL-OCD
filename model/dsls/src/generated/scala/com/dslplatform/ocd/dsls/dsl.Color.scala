package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslColor
    extends OcdDslBoxType
    with `type.Color`

case object `dsl.Color`                extends DslColor with `box.One`
case object `dsl.Color?`               extends DslColor with `box.Nullable`
case object `dsl.Array<Color>`         extends DslColor with `box.OneArrayOfOne`
case object `dsl.Color[]`              extends DslColor with `box.OneBracketsOfOne`
case object `dsl.Array<Color>?`        extends DslColor with `box.NullableArrayOfOne`
case object `dsl.Color[]?`             extends DslColor with `box.NullableBracketsOfOne`
case object `dsl.Array<Color?>`        extends DslColor with `box.OneArrayOfNullable`
case object `dsl.Color?[]`             extends DslColor with `box.OneBracketsOfNullable`
case object `dsl.Array<Color?>?`       extends DslColor with `box.NullableArrayOfNullable`
case object `dsl.Color?[]?`            extends DslColor with `box.NullableBracketsOfNullable`
case object `dsl.List<Color>`          extends DslColor with `box.OneListOfOne`
case object `dsl.List<Color>?`         extends DslColor with `box.NullableListOfOne`
case object `dsl.List<Color?>`         extends DslColor with `box.OneListOfNullable`
case object `dsl.List<Color?>?`        extends DslColor with `box.NullableListOfNullable`
case object `dsl.Set<Color>`           extends DslColor with `box.OneSetOfOne`
case object `dsl.Set<Color>?`          extends DslColor with `box.NullableSetOfOne`
case object `dsl.Set<Color?>`          extends DslColor with `box.OneSetOfNullable`
case object `dsl.Set<Color?>?`         extends DslColor with `box.NullableSetOfNullable`
case object `dsl.Queue<Color>`         extends DslColor with `box.OneQueueOfOne`
case object `dsl.Queue<Color>?`        extends DslColor with `box.NullableQueueOfOne`
case object `dsl.Queue<Color?>`        extends DslColor with `box.OneQueueOfNullable`
case object `dsl.Queue<Color?>?`       extends DslColor with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Color>`   extends DslColor with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Color>?`  extends DslColor with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Color?>`  extends DslColor with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Color?>?` extends DslColor with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Color>`         extends DslColor with `box.OneStackOfOne`
case object `dsl.Stack<Color>?`        extends DslColor with `box.NullableStackOfOne`
case object `dsl.Stack<Color?>`        extends DslColor with `box.OneStackOfNullable`
case object `dsl.Stack<Color?>?`       extends DslColor with `box.NullableStackOfNullable`
case object `dsl.Vector<Color>`        extends DslColor with `box.OneVectorOfOne`
case object `dsl.Vector<Color>?`       extends DslColor with `box.NullableVectorOfOne`
case object `dsl.Vector<Color?>`       extends DslColor with `box.OneVectorOfNullable`
case object `dsl.Vector<Color?>?`      extends DslColor with `box.NullableVectorOfNullable`

object DslColorGrammarAliases1 {
  case object `dsl.COLOR`                extends DslColor with `box.One`
  case object `dsl.COLOR?`               extends DslColor with `box.Nullable`
  case object `dsl.ARRAY<COLOR>`         extends DslColor with `box.OneArrayOfOne`
  case object `dsl.COLOR[]`              extends DslColor with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<COLOR>?`        extends DslColor with `box.NullableArrayOfOne`
  case object `dsl.COLOR[]?`             extends DslColor with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<COLOR?>`        extends DslColor with `box.OneArrayOfNullable`
  case object `dsl.COLOR?[]`             extends DslColor with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<COLOR?>?`       extends DslColor with `box.NullableArrayOfNullable`
  case object `dsl.COLOR?[]?`            extends DslColor with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<COLOR>`          extends DslColor with `box.OneListOfOne`
  case object `dsl.LIST<COLOR>?`         extends DslColor with `box.NullableListOfOne`
  case object `dsl.LIST<COLOR?>`         extends DslColor with `box.OneListOfNullable`
  case object `dsl.LIST<COLOR?>?`        extends DslColor with `box.NullableListOfNullable`
  case object `dsl.SET<COLOR>`           extends DslColor with `box.OneSetOfOne`
  case object `dsl.SET<COLOR>?`          extends DslColor with `box.NullableSetOfOne`
  case object `dsl.SET<COLOR?>`          extends DslColor with `box.OneSetOfNullable`
  case object `dsl.SET<COLOR?>?`         extends DslColor with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<COLOR>`         extends DslColor with `box.OneQueueOfOne`
  case object `dsl.QUEUE<COLOR>?`        extends DslColor with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<COLOR?>`        extends DslColor with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<COLOR?>?`       extends DslColor with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<COLOR>`   extends DslColor with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<COLOR>?`  extends DslColor with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<COLOR?>`  extends DslColor with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<COLOR?>?` extends DslColor with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<COLOR>`         extends DslColor with `box.OneStackOfOne`
  case object `dsl.STACK<COLOR>?`        extends DslColor with `box.NullableStackOfOne`
  case object `dsl.STACK<COLOR?>`        extends DslColor with `box.OneStackOfNullable`
  case object `dsl.STACK<COLOR?>?`       extends DslColor with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<COLOR>`        extends DslColor with `box.OneVectorOfOne`
  case object `dsl.VECTOR<COLOR>?`       extends DslColor with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<COLOR?>`       extends DslColor with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<COLOR?>?`      extends DslColor with `box.NullableVectorOfNullable`
}

object DslColorGrammarAliases2 {
  case object `dsl.color`                extends DslColor with `box.One`
  case object `dsl.color?`               extends DslColor with `box.Nullable`
  case object `dsl.array<color>`         extends DslColor with `box.OneArrayOfOne`
  case object `dsl.color[]`              extends DslColor with `box.OneBracketsOfOne`
  case object `dsl.array<color>?`        extends DslColor with `box.NullableArrayOfOne`
  case object `dsl.color[]?`             extends DslColor with `box.NullableBracketsOfOne`
  case object `dsl.array<color?>`        extends DslColor with `box.OneArrayOfNullable`
  case object `dsl.color?[]`             extends DslColor with `box.OneBracketsOfNullable`
  case object `dsl.array<color?>?`       extends DslColor with `box.NullableArrayOfNullable`
  case object `dsl.color?[]?`            extends DslColor with `box.NullableBracketsOfNullable`
  case object `dsl.list<color>`          extends DslColor with `box.OneListOfOne`
  case object `dsl.list<color>?`         extends DslColor with `box.NullableListOfOne`
  case object `dsl.list<color?>`         extends DslColor with `box.OneListOfNullable`
  case object `dsl.list<color?>?`        extends DslColor with `box.NullableListOfNullable`
  case object `dsl.set<color>`           extends DslColor with `box.OneSetOfOne`
  case object `dsl.set<color>?`          extends DslColor with `box.NullableSetOfOne`
  case object `dsl.set<color?>`          extends DslColor with `box.OneSetOfNullable`
  case object `dsl.set<color?>?`         extends DslColor with `box.NullableSetOfNullable`
  case object `dsl.queue<color>`         extends DslColor with `box.OneQueueOfOne`
  case object `dsl.queue<color>?`        extends DslColor with `box.NullableQueueOfOne`
  case object `dsl.queue<color?>`        extends DslColor with `box.OneQueueOfNullable`
  case object `dsl.queue<color?>?`       extends DslColor with `box.NullableQueueOfNullable`
  case object `dsl.linked list<color>`   extends DslColor with `box.OneLinkedListOfOne`
  case object `dsl.linked list<color>?`  extends DslColor with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<color?>`  extends DslColor with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<color?>?` extends DslColor with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<color>`         extends DslColor with `box.OneStackOfOne`
  case object `dsl.stack<color>?`        extends DslColor with `box.NullableStackOfOne`
  case object `dsl.stack<color?>`        extends DslColor with `box.OneStackOfNullable`
  case object `dsl.stack<color?>?`       extends DslColor with `box.NullableStackOfNullable`
  case object `dsl.vector<color>`        extends DslColor with `box.OneVectorOfOne`
  case object `dsl.vector<color>?`       extends DslColor with `box.NullableVectorOfOne`
  case object `dsl.vector<color?>`       extends DslColor with `box.OneVectorOfNullable`
  case object `dsl.vector<color?>?`      extends DslColor with `box.NullableVectorOfNullable`
}
