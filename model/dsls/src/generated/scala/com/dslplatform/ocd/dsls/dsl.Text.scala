package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslText
    extends OcdDslBoxType
    with `type.Text`

case object `dsl.Text`                extends DslText with `box.One`
case object `dsl.Text?`               extends DslText with `box.Nullable`
case object `dsl.Array<Text>`         extends DslText with `box.OneArrayOfOne`
case object `dsl.Text[]`              extends DslText with `box.OneBracketsOfOne`
case object `dsl.Array<Text>?`        extends DslText with `box.NullableArrayOfOne`
case object `dsl.Text[]?`             extends DslText with `box.NullableBracketsOfOne`
case object `dsl.Array<Text?>`        extends DslText with `box.OneArrayOfNullable`
case object `dsl.Text?[]`             extends DslText with `box.OneBracketsOfNullable`
case object `dsl.Array<Text?>?`       extends DslText with `box.NullableArrayOfNullable`
case object `dsl.Text?[]?`            extends DslText with `box.NullableBracketsOfNullable`
case object `dsl.List<Text>`          extends DslText with `box.OneListOfOne`
case object `dsl.List<Text>?`         extends DslText with `box.NullableListOfOne`
case object `dsl.List<Text?>`         extends DslText with `box.OneListOfNullable`
case object `dsl.List<Text?>?`        extends DslText with `box.NullableListOfNullable`
case object `dsl.Set<Text>`           extends DslText with `box.OneSetOfOne`
case object `dsl.Set<Text>?`          extends DslText with `box.NullableSetOfOne`
case object `dsl.Set<Text?>`          extends DslText with `box.OneSetOfNullable`
case object `dsl.Set<Text?>?`         extends DslText with `box.NullableSetOfNullable`
case object `dsl.Queue<Text>`         extends DslText with `box.OneQueueOfOne`
case object `dsl.Queue<Text>?`        extends DslText with `box.NullableQueueOfOne`
case object `dsl.Queue<Text?>`        extends DslText with `box.OneQueueOfNullable`
case object `dsl.Queue<Text?>?`       extends DslText with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Text>`   extends DslText with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Text>?`  extends DslText with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Text?>`  extends DslText with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Text?>?` extends DslText with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Text>`         extends DslText with `box.OneStackOfOne`
case object `dsl.Stack<Text>?`        extends DslText with `box.NullableStackOfOne`
case object `dsl.Stack<Text?>`        extends DslText with `box.OneStackOfNullable`
case object `dsl.Stack<Text?>?`       extends DslText with `box.NullableStackOfNullable`
case object `dsl.Vector<Text>`        extends DslText with `box.OneVectorOfOne`
case object `dsl.Vector<Text>?`       extends DslText with `box.NullableVectorOfOne`
case object `dsl.Vector<Text?>`       extends DslText with `box.OneVectorOfNullable`
case object `dsl.Vector<Text?>?`      extends DslText with `box.NullableVectorOfNullable`

object DslTextGrammarAliases1 {
  case object `dsl.TEXT`                extends DslText with `box.One`
  case object `dsl.TEXT?`               extends DslText with `box.Nullable`
  case object `dsl.ARRAY<TEXT>`         extends DslText with `box.OneArrayOfOne`
  case object `dsl.TEXT[]`              extends DslText with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<TEXT>?`        extends DslText with `box.NullableArrayOfOne`
  case object `dsl.TEXT[]?`             extends DslText with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<TEXT?>`        extends DslText with `box.OneArrayOfNullable`
  case object `dsl.TEXT?[]`             extends DslText with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<TEXT?>?`       extends DslText with `box.NullableArrayOfNullable`
  case object `dsl.TEXT?[]?`            extends DslText with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<TEXT>`          extends DslText with `box.OneListOfOne`
  case object `dsl.LIST<TEXT>?`         extends DslText with `box.NullableListOfOne`
  case object `dsl.LIST<TEXT?>`         extends DslText with `box.OneListOfNullable`
  case object `dsl.LIST<TEXT?>?`        extends DslText with `box.NullableListOfNullable`
  case object `dsl.SET<TEXT>`           extends DslText with `box.OneSetOfOne`
  case object `dsl.SET<TEXT>?`          extends DslText with `box.NullableSetOfOne`
  case object `dsl.SET<TEXT?>`          extends DslText with `box.OneSetOfNullable`
  case object `dsl.SET<TEXT?>?`         extends DslText with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<TEXT>`         extends DslText with `box.OneQueueOfOne`
  case object `dsl.QUEUE<TEXT>?`        extends DslText with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<TEXT?>`        extends DslText with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<TEXT?>?`       extends DslText with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<TEXT>`   extends DslText with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<TEXT>?`  extends DslText with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<TEXT?>`  extends DslText with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<TEXT?>?` extends DslText with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<TEXT>`         extends DslText with `box.OneStackOfOne`
  case object `dsl.STACK<TEXT>?`        extends DslText with `box.NullableStackOfOne`
  case object `dsl.STACK<TEXT?>`        extends DslText with `box.OneStackOfNullable`
  case object `dsl.STACK<TEXT?>?`       extends DslText with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<TEXT>`        extends DslText with `box.OneVectorOfOne`
  case object `dsl.VECTOR<TEXT>?`       extends DslText with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<TEXT?>`       extends DslText with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<TEXT?>?`      extends DslText with `box.NullableVectorOfNullable`
}

object DslTextGrammarAliases2 {
  case object `dsl.text`                extends DslText with `box.One`
  case object `dsl.text?`               extends DslText with `box.Nullable`
  case object `dsl.array<text>`         extends DslText with `box.OneArrayOfOne`
  case object `dsl.text[]`              extends DslText with `box.OneBracketsOfOne`
  case object `dsl.array<text>?`        extends DslText with `box.NullableArrayOfOne`
  case object `dsl.text[]?`             extends DslText with `box.NullableBracketsOfOne`
  case object `dsl.array<text?>`        extends DslText with `box.OneArrayOfNullable`
  case object `dsl.text?[]`             extends DslText with `box.OneBracketsOfNullable`
  case object `dsl.array<text?>?`       extends DslText with `box.NullableArrayOfNullable`
  case object `dsl.text?[]?`            extends DslText with `box.NullableBracketsOfNullable`
  case object `dsl.list<text>`          extends DslText with `box.OneListOfOne`
  case object `dsl.list<text>?`         extends DslText with `box.NullableListOfOne`
  case object `dsl.list<text?>`         extends DslText with `box.OneListOfNullable`
  case object `dsl.list<text?>?`        extends DslText with `box.NullableListOfNullable`
  case object `dsl.set<text>`           extends DslText with `box.OneSetOfOne`
  case object `dsl.set<text>?`          extends DslText with `box.NullableSetOfOne`
  case object `dsl.set<text?>`          extends DslText with `box.OneSetOfNullable`
  case object `dsl.set<text?>?`         extends DslText with `box.NullableSetOfNullable`
  case object `dsl.queue<text>`         extends DslText with `box.OneQueueOfOne`
  case object `dsl.queue<text>?`        extends DslText with `box.NullableQueueOfOne`
  case object `dsl.queue<text?>`        extends DslText with `box.OneQueueOfNullable`
  case object `dsl.queue<text?>?`       extends DslText with `box.NullableQueueOfNullable`
  case object `dsl.linked list<text>`   extends DslText with `box.OneLinkedListOfOne`
  case object `dsl.linked list<text>?`  extends DslText with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<text?>`  extends DslText with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<text?>?` extends DslText with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<text>`         extends DslText with `box.OneStackOfOne`
  case object `dsl.stack<text>?`        extends DslText with `box.NullableStackOfOne`
  case object `dsl.stack<text?>`        extends DslText with `box.OneStackOfNullable`
  case object `dsl.stack<text?>?`       extends DslText with `box.NullableStackOfNullable`
  case object `dsl.vector<text>`        extends DslText with `box.OneVectorOfOne`
  case object `dsl.vector<text>?`       extends DslText with `box.NullableVectorOfOne`
  case object `dsl.vector<text?>`       extends DslText with `box.OneVectorOfNullable`
  case object `dsl.vector<text?>?`      extends DslText with `box.NullableVectorOfNullable`
}
