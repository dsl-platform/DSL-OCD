package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslString
    extends OcdDslBoxType
    with `type.String`

case object `dsl.String`                extends DslString with `box.One`
case object `dsl.String?`               extends DslString with `box.Nullable`
case object `dsl.Array<String>`         extends DslString with `box.OneArrayOfOne`
case object `dsl.String[]`              extends DslString with `box.OneBracketsOfOne`
case object `dsl.Array<String>?`        extends DslString with `box.NullableArrayOfOne`
case object `dsl.String[]?`             extends DslString with `box.NullableBracketsOfOne`
case object `dsl.Array<String?>`        extends DslString with `box.OneArrayOfNullable`
case object `dsl.String?[]`             extends DslString with `box.OneBracketsOfNullable`
case object `dsl.Array<String?>?`       extends DslString with `box.NullableArrayOfNullable`
case object `dsl.String?[]?`            extends DslString with `box.NullableBracketsOfNullable`
case object `dsl.List<String>`          extends DslString with `box.OneListOfOne`
case object `dsl.List<String>?`         extends DslString with `box.NullableListOfOne`
case object `dsl.List<String?>`         extends DslString with `box.OneListOfNullable`
case object `dsl.List<String?>?`        extends DslString with `box.NullableListOfNullable`
case object `dsl.Set<String>`           extends DslString with `box.OneSetOfOne`
case object `dsl.Set<String>?`          extends DslString with `box.NullableSetOfOne`
case object `dsl.Set<String?>`          extends DslString with `box.OneSetOfNullable`
case object `dsl.Set<String?>?`         extends DslString with `box.NullableSetOfNullable`
case object `dsl.Queue<String>`         extends DslString with `box.OneQueueOfOne`
case object `dsl.Queue<String>?`        extends DslString with `box.NullableQueueOfOne`
case object `dsl.Queue<String?>`        extends DslString with `box.OneQueueOfNullable`
case object `dsl.Queue<String?>?`       extends DslString with `box.NullableQueueOfNullable`
case object `dsl.Linked List<String>`   extends DslString with `box.OneLinkedListOfOne`
case object `dsl.Linked List<String>?`  extends DslString with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<String?>`  extends DslString with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<String?>?` extends DslString with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<String>`         extends DslString with `box.OneStackOfOne`
case object `dsl.Stack<String>?`        extends DslString with `box.NullableStackOfOne`
case object `dsl.Stack<String?>`        extends DslString with `box.OneStackOfNullable`
case object `dsl.Stack<String?>?`       extends DslString with `box.NullableStackOfNullable`
case object `dsl.Vector<String>`        extends DslString with `box.OneVectorOfOne`
case object `dsl.Vector<String>?`       extends DslString with `box.NullableVectorOfOne`
case object `dsl.Vector<String?>`       extends DslString with `box.OneVectorOfNullable`
case object `dsl.Vector<String?>?`      extends DslString with `box.NullableVectorOfNullable`

object DslStringGrammarAliases1 {
  case object `dsl.STRING`                extends DslString with `box.One`
  case object `dsl.STRING?`               extends DslString with `box.Nullable`
  case object `dsl.ARRAY<STRING>`         extends DslString with `box.OneArrayOfOne`
  case object `dsl.STRING[]`              extends DslString with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<STRING>?`        extends DslString with `box.NullableArrayOfOne`
  case object `dsl.STRING[]?`             extends DslString with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<STRING?>`        extends DslString with `box.OneArrayOfNullable`
  case object `dsl.STRING?[]`             extends DslString with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<STRING?>?`       extends DslString with `box.NullableArrayOfNullable`
  case object `dsl.STRING?[]?`            extends DslString with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<STRING>`          extends DslString with `box.OneListOfOne`
  case object `dsl.LIST<STRING>?`         extends DslString with `box.NullableListOfOne`
  case object `dsl.LIST<STRING?>`         extends DslString with `box.OneListOfNullable`
  case object `dsl.LIST<STRING?>?`        extends DslString with `box.NullableListOfNullable`
  case object `dsl.SET<STRING>`           extends DslString with `box.OneSetOfOne`
  case object `dsl.SET<STRING>?`          extends DslString with `box.NullableSetOfOne`
  case object `dsl.SET<STRING?>`          extends DslString with `box.OneSetOfNullable`
  case object `dsl.SET<STRING?>?`         extends DslString with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<STRING>`         extends DslString with `box.OneQueueOfOne`
  case object `dsl.QUEUE<STRING>?`        extends DslString with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<STRING?>`        extends DslString with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<STRING?>?`       extends DslString with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<STRING>`   extends DslString with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<STRING>?`  extends DslString with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<STRING?>`  extends DslString with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<STRING?>?` extends DslString with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<STRING>`         extends DslString with `box.OneStackOfOne`
  case object `dsl.STACK<STRING>?`        extends DslString with `box.NullableStackOfOne`
  case object `dsl.STACK<STRING?>`        extends DslString with `box.OneStackOfNullable`
  case object `dsl.STACK<STRING?>?`       extends DslString with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<STRING>`        extends DslString with `box.OneVectorOfOne`
  case object `dsl.VECTOR<STRING>?`       extends DslString with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<STRING?>`       extends DslString with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<STRING?>?`      extends DslString with `box.NullableVectorOfNullable`
}

object DslStringGrammarAliases2 {
  case object `dsl.string`                extends DslString with `box.One`
  case object `dsl.string?`               extends DslString with `box.Nullable`
  case object `dsl.array<string>`         extends DslString with `box.OneArrayOfOne`
  case object `dsl.string[]`              extends DslString with `box.OneBracketsOfOne`
  case object `dsl.array<string>?`        extends DslString with `box.NullableArrayOfOne`
  case object `dsl.string[]?`             extends DslString with `box.NullableBracketsOfOne`
  case object `dsl.array<string?>`        extends DslString with `box.OneArrayOfNullable`
  case object `dsl.string?[]`             extends DslString with `box.OneBracketsOfNullable`
  case object `dsl.array<string?>?`       extends DslString with `box.NullableArrayOfNullable`
  case object `dsl.string?[]?`            extends DslString with `box.NullableBracketsOfNullable`
  case object `dsl.list<string>`          extends DslString with `box.OneListOfOne`
  case object `dsl.list<string>?`         extends DslString with `box.NullableListOfOne`
  case object `dsl.list<string?>`         extends DslString with `box.OneListOfNullable`
  case object `dsl.list<string?>?`        extends DslString with `box.NullableListOfNullable`
  case object `dsl.set<string>`           extends DslString with `box.OneSetOfOne`
  case object `dsl.set<string>?`          extends DslString with `box.NullableSetOfOne`
  case object `dsl.set<string?>`          extends DslString with `box.OneSetOfNullable`
  case object `dsl.set<string?>?`         extends DslString with `box.NullableSetOfNullable`
  case object `dsl.queue<string>`         extends DslString with `box.OneQueueOfOne`
  case object `dsl.queue<string>?`        extends DslString with `box.NullableQueueOfOne`
  case object `dsl.queue<string?>`        extends DslString with `box.OneQueueOfNullable`
  case object `dsl.queue<string?>?`       extends DslString with `box.NullableQueueOfNullable`
  case object `dsl.linked list<string>`   extends DslString with `box.OneLinkedListOfOne`
  case object `dsl.linked list<string>?`  extends DslString with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<string?>`  extends DslString with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<string?>?` extends DslString with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<string>`         extends DslString with `box.OneStackOfOne`
  case object `dsl.stack<string>?`        extends DslString with `box.NullableStackOfOne`
  case object `dsl.stack<string?>`        extends DslString with `box.OneStackOfNullable`
  case object `dsl.stack<string?>?`       extends DslString with `box.NullableStackOfNullable`
  case object `dsl.vector<string>`        extends DslString with `box.OneVectorOfOne`
  case object `dsl.vector<string>?`       extends DslString with `box.NullableVectorOfOne`
  case object `dsl.vector<string?>`       extends DslString with `box.OneVectorOfNullable`
  case object `dsl.vector<string?>?`      extends DslString with `box.NullableVectorOfNullable`
}
