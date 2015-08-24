package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslUrl
    extends OcdDslBoxType
    with `type.Url`

case object `dsl.Url`                extends DslUrl with `box.One`
case object `dsl.Url?`               extends DslUrl with `box.Nullable`
case object `dsl.Array<Url>`         extends DslUrl with `box.OneArrayOfOne`
case object `dsl.Url[]`              extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.Array<Url>?`        extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.Url[]?`             extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.Array<Url?>`        extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.Url?[]`             extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.Array<Url?>?`       extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.Url?[]?`            extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.List<Url>`          extends DslUrl with `box.OneListOfOne`
case object `dsl.List<Url>?`         extends DslUrl with `box.NullableListOfOne`
case object `dsl.List<Url?>`         extends DslUrl with `box.OneListOfNullable`
case object `dsl.List<Url?>?`        extends DslUrl with `box.NullableListOfNullable`
case object `dsl.Set<Url>`           extends DslUrl with `box.OneSetOfOne`
case object `dsl.Set<Url>?`          extends DslUrl with `box.NullableSetOfOne`
case object `dsl.Set<Url?>`          extends DslUrl with `box.OneSetOfNullable`
case object `dsl.Set<Url?>?`         extends DslUrl with `box.NullableSetOfNullable`
case object `dsl.Queue<Url>`         extends DslUrl with `box.OneQueueOfOne`
case object `dsl.Queue<Url>?`        extends DslUrl with `box.NullableQueueOfOne`
case object `dsl.Queue<Url?>`        extends DslUrl with `box.OneQueueOfNullable`
case object `dsl.Queue<Url?>?`       extends DslUrl with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Url>`   extends DslUrl with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Url>?`  extends DslUrl with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Url?>`  extends DslUrl with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Url?>?` extends DslUrl with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Url>`         extends DslUrl with `box.OneStackOfOne`
case object `dsl.Stack<Url>?`        extends DslUrl with `box.NullableStackOfOne`
case object `dsl.Stack<Url?>`        extends DslUrl with `box.OneStackOfNullable`
case object `dsl.Stack<Url?>?`       extends DslUrl with `box.NullableStackOfNullable`
case object `dsl.Vector<Url>`        extends DslUrl with `box.OneVectorOfOne`
case object `dsl.Vector<Url>?`       extends DslUrl with `box.NullableVectorOfOne`
case object `dsl.Vector<Url?>`       extends DslUrl with `box.OneVectorOfNullable`
case object `dsl.Vector<Url?>?`      extends DslUrl with `box.NullableVectorOfNullable`

object DslUrlGrammarAliases1 {
  case object `dsl.LINK`                extends DslUrl with `box.One`
  case object `dsl.LINK?`               extends DslUrl with `box.Nullable`
  case object `dsl.ARRAY<LINK>`         extends DslUrl with `box.OneArrayOfOne`
  case object `dsl.LINK[]`              extends DslUrl with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<LINK>?`        extends DslUrl with `box.NullableArrayOfOne`
  case object `dsl.LINK[]?`             extends DslUrl with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<LINK?>`        extends DslUrl with `box.OneArrayOfNullable`
  case object `dsl.LINK?[]`             extends DslUrl with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<LINK?>?`       extends DslUrl with `box.NullableArrayOfNullable`
  case object `dsl.LINK?[]?`            extends DslUrl with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<LINK>`          extends DslUrl with `box.OneListOfOne`
  case object `dsl.LIST<LINK>?`         extends DslUrl with `box.NullableListOfOne`
  case object `dsl.LIST<LINK?>`         extends DslUrl with `box.OneListOfNullable`
  case object `dsl.LIST<LINK?>?`        extends DslUrl with `box.NullableListOfNullable`
  case object `dsl.SET<LINK>`           extends DslUrl with `box.OneSetOfOne`
  case object `dsl.SET<LINK>?`          extends DslUrl with `box.NullableSetOfOne`
  case object `dsl.SET<LINK?>`          extends DslUrl with `box.OneSetOfNullable`
  case object `dsl.SET<LINK?>?`         extends DslUrl with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<LINK>`         extends DslUrl with `box.OneQueueOfOne`
  case object `dsl.QUEUE<LINK>?`        extends DslUrl with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<LINK?>`        extends DslUrl with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<LINK?>?`       extends DslUrl with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<LINK>`   extends DslUrl with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<LINK>?`  extends DslUrl with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<LINK?>`  extends DslUrl with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<LINK?>?` extends DslUrl with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<LINK>`         extends DslUrl with `box.OneStackOfOne`
  case object `dsl.STACK<LINK>?`        extends DslUrl with `box.NullableStackOfOne`
  case object `dsl.STACK<LINK?>`        extends DslUrl with `box.OneStackOfNullable`
  case object `dsl.STACK<LINK?>?`       extends DslUrl with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<LINK>`        extends DslUrl with `box.OneVectorOfOne`
  case object `dsl.VECTOR<LINK>?`       extends DslUrl with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<LINK?>`       extends DslUrl with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<LINK?>?`      extends DslUrl with `box.NullableVectorOfNullable`
}

object DslUrlGrammarAliases2 {
  case object `dsl.Link`                extends DslUrl with `box.One`
  case object `dsl.Link?`               extends DslUrl with `box.Nullable`
  case object `dsl.Array<Link>`         extends DslUrl with `box.OneArrayOfOne`
  case object `dsl.Link[]`              extends DslUrl with `box.OneBracketsOfOne`
  case object `dsl.Array<Link>?`        extends DslUrl with `box.NullableArrayOfOne`
  case object `dsl.Link[]?`             extends DslUrl with `box.NullableBracketsOfOne`
  case object `dsl.Array<Link?>`        extends DslUrl with `box.OneArrayOfNullable`
  case object `dsl.Link?[]`             extends DslUrl with `box.OneBracketsOfNullable`
  case object `dsl.Array<Link?>?`       extends DslUrl with `box.NullableArrayOfNullable`
  case object `dsl.Link?[]?`            extends DslUrl with `box.NullableBracketsOfNullable`
  case object `dsl.List<Link>`          extends DslUrl with `box.OneListOfOne`
  case object `dsl.List<Link>?`         extends DslUrl with `box.NullableListOfOne`
  case object `dsl.List<Link?>`         extends DslUrl with `box.OneListOfNullable`
  case object `dsl.List<Link?>?`        extends DslUrl with `box.NullableListOfNullable`
  case object `dsl.Set<Link>`           extends DslUrl with `box.OneSetOfOne`
  case object `dsl.Set<Link>?`          extends DslUrl with `box.NullableSetOfOne`
  case object `dsl.Set<Link?>`          extends DslUrl with `box.OneSetOfNullable`
  case object `dsl.Set<Link?>?`         extends DslUrl with `box.NullableSetOfNullable`
  case object `dsl.Queue<Link>`         extends DslUrl with `box.OneQueueOfOne`
  case object `dsl.Queue<Link>?`        extends DslUrl with `box.NullableQueueOfOne`
  case object `dsl.Queue<Link?>`        extends DslUrl with `box.OneQueueOfNullable`
  case object `dsl.Queue<Link?>?`       extends DslUrl with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Link>`   extends DslUrl with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Link>?`  extends DslUrl with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Link?>`  extends DslUrl with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Link?>?` extends DslUrl with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Link>`         extends DslUrl with `box.OneStackOfOne`
  case object `dsl.Stack<Link>?`        extends DslUrl with `box.NullableStackOfOne`
  case object `dsl.Stack<Link?>`        extends DslUrl with `box.OneStackOfNullable`
  case object `dsl.Stack<Link?>?`       extends DslUrl with `box.NullableStackOfNullable`
  case object `dsl.Vector<Link>`        extends DslUrl with `box.OneVectorOfOne`
  case object `dsl.Vector<Link>?`       extends DslUrl with `box.NullableVectorOfOne`
  case object `dsl.Vector<Link?>`       extends DslUrl with `box.OneVectorOfNullable`
  case object `dsl.Vector<Link?>?`      extends DslUrl with `box.NullableVectorOfNullable`
}

object DslUrlGrammarAliases3 {
  case object `dsl.URL`                extends DslUrl with `box.One`
  case object `dsl.URL?`               extends DslUrl with `box.Nullable`
  case object `dsl.ARRAY<URL>`         extends DslUrl with `box.OneArrayOfOne`
  case object `dsl.URL[]`              extends DslUrl with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<URL>?`        extends DslUrl with `box.NullableArrayOfOne`
  case object `dsl.URL[]?`             extends DslUrl with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<URL?>`        extends DslUrl with `box.OneArrayOfNullable`
  case object `dsl.URL?[]`             extends DslUrl with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<URL?>?`       extends DslUrl with `box.NullableArrayOfNullable`
  case object `dsl.URL?[]?`            extends DslUrl with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<URL>`          extends DslUrl with `box.OneListOfOne`
  case object `dsl.LIST<URL>?`         extends DslUrl with `box.NullableListOfOne`
  case object `dsl.LIST<URL?>`         extends DslUrl with `box.OneListOfNullable`
  case object `dsl.LIST<URL?>?`        extends DslUrl with `box.NullableListOfNullable`
  case object `dsl.SET<URL>`           extends DslUrl with `box.OneSetOfOne`
  case object `dsl.SET<URL>?`          extends DslUrl with `box.NullableSetOfOne`
  case object `dsl.SET<URL?>`          extends DslUrl with `box.OneSetOfNullable`
  case object `dsl.SET<URL?>?`         extends DslUrl with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<URL>`         extends DslUrl with `box.OneQueueOfOne`
  case object `dsl.QUEUE<URL>?`        extends DslUrl with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<URL?>`        extends DslUrl with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<URL?>?`       extends DslUrl with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<URL>`   extends DslUrl with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<URL>?`  extends DslUrl with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<URL?>`  extends DslUrl with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<URL?>?` extends DslUrl with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<URL>`         extends DslUrl with `box.OneStackOfOne`
  case object `dsl.STACK<URL>?`        extends DslUrl with `box.NullableStackOfOne`
  case object `dsl.STACK<URL?>`        extends DslUrl with `box.OneStackOfNullable`
  case object `dsl.STACK<URL?>?`       extends DslUrl with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<URL>`        extends DslUrl with `box.OneVectorOfOne`
  case object `dsl.VECTOR<URL>?`       extends DslUrl with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<URL?>`       extends DslUrl with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<URL?>?`      extends DslUrl with `box.NullableVectorOfNullable`
}

object DslUrlGrammarAliases4 {
  case object `dsl.link`                extends DslUrl with `box.One`
  case object `dsl.link?`               extends DslUrl with `box.Nullable`
  case object `dsl.array<link>`         extends DslUrl with `box.OneArrayOfOne`
  case object `dsl.link[]`              extends DslUrl with `box.OneBracketsOfOne`
  case object `dsl.array<link>?`        extends DslUrl with `box.NullableArrayOfOne`
  case object `dsl.link[]?`             extends DslUrl with `box.NullableBracketsOfOne`
  case object `dsl.array<link?>`        extends DslUrl with `box.OneArrayOfNullable`
  case object `dsl.link?[]`             extends DslUrl with `box.OneBracketsOfNullable`
  case object `dsl.array<link?>?`       extends DslUrl with `box.NullableArrayOfNullable`
  case object `dsl.link?[]?`            extends DslUrl with `box.NullableBracketsOfNullable`
  case object `dsl.list<link>`          extends DslUrl with `box.OneListOfOne`
  case object `dsl.list<link>?`         extends DslUrl with `box.NullableListOfOne`
  case object `dsl.list<link?>`         extends DslUrl with `box.OneListOfNullable`
  case object `dsl.list<link?>?`        extends DslUrl with `box.NullableListOfNullable`
  case object `dsl.set<link>`           extends DslUrl with `box.OneSetOfOne`
  case object `dsl.set<link>?`          extends DslUrl with `box.NullableSetOfOne`
  case object `dsl.set<link?>`          extends DslUrl with `box.OneSetOfNullable`
  case object `dsl.set<link?>?`         extends DslUrl with `box.NullableSetOfNullable`
  case object `dsl.queue<link>`         extends DslUrl with `box.OneQueueOfOne`
  case object `dsl.queue<link>?`        extends DslUrl with `box.NullableQueueOfOne`
  case object `dsl.queue<link?>`        extends DslUrl with `box.OneQueueOfNullable`
  case object `dsl.queue<link?>?`       extends DslUrl with `box.NullableQueueOfNullable`
  case object `dsl.linked list<link>`   extends DslUrl with `box.OneLinkedListOfOne`
  case object `dsl.linked list<link>?`  extends DslUrl with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<link?>`  extends DslUrl with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<link?>?` extends DslUrl with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<link>`         extends DslUrl with `box.OneStackOfOne`
  case object `dsl.stack<link>?`        extends DslUrl with `box.NullableStackOfOne`
  case object `dsl.stack<link?>`        extends DslUrl with `box.OneStackOfNullable`
  case object `dsl.stack<link?>?`       extends DslUrl with `box.NullableStackOfNullable`
  case object `dsl.vector<link>`        extends DslUrl with `box.OneVectorOfOne`
  case object `dsl.vector<link>?`       extends DslUrl with `box.NullableVectorOfOne`
  case object `dsl.vector<link?>`       extends DslUrl with `box.OneVectorOfNullable`
  case object `dsl.vector<link?>?`      extends DslUrl with `box.NullableVectorOfNullable`
}

object DslUrlGrammarAliases5 {
  case object `dsl.url`                extends DslUrl with `box.One`
  case object `dsl.url?`               extends DslUrl with `box.Nullable`
  case object `dsl.array<url>`         extends DslUrl with `box.OneArrayOfOne`
  case object `dsl.url[]`              extends DslUrl with `box.OneBracketsOfOne`
  case object `dsl.array<url>?`        extends DslUrl with `box.NullableArrayOfOne`
  case object `dsl.url[]?`             extends DslUrl with `box.NullableBracketsOfOne`
  case object `dsl.array<url?>`        extends DslUrl with `box.OneArrayOfNullable`
  case object `dsl.url?[]`             extends DslUrl with `box.OneBracketsOfNullable`
  case object `dsl.array<url?>?`       extends DslUrl with `box.NullableArrayOfNullable`
  case object `dsl.url?[]?`            extends DslUrl with `box.NullableBracketsOfNullable`
  case object `dsl.list<url>`          extends DslUrl with `box.OneListOfOne`
  case object `dsl.list<url>?`         extends DslUrl with `box.NullableListOfOne`
  case object `dsl.list<url?>`         extends DslUrl with `box.OneListOfNullable`
  case object `dsl.list<url?>?`        extends DslUrl with `box.NullableListOfNullable`
  case object `dsl.set<url>`           extends DslUrl with `box.OneSetOfOne`
  case object `dsl.set<url>?`          extends DslUrl with `box.NullableSetOfOne`
  case object `dsl.set<url?>`          extends DslUrl with `box.OneSetOfNullable`
  case object `dsl.set<url?>?`         extends DslUrl with `box.NullableSetOfNullable`
  case object `dsl.queue<url>`         extends DslUrl with `box.OneQueueOfOne`
  case object `dsl.queue<url>?`        extends DslUrl with `box.NullableQueueOfOne`
  case object `dsl.queue<url?>`        extends DslUrl with `box.OneQueueOfNullable`
  case object `dsl.queue<url?>?`       extends DslUrl with `box.NullableQueueOfNullable`
  case object `dsl.linked list<url>`   extends DslUrl with `box.OneLinkedListOfOne`
  case object `dsl.linked list<url>?`  extends DslUrl with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<url?>`  extends DslUrl with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<url?>?` extends DslUrl with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<url>`         extends DslUrl with `box.OneStackOfOne`
  case object `dsl.stack<url>?`        extends DslUrl with `box.NullableStackOfOne`
  case object `dsl.stack<url?>`        extends DslUrl with `box.OneStackOfNullable`
  case object `dsl.stack<url?>?`       extends DslUrl with `box.NullableStackOfNullable`
  case object `dsl.vector<url>`        extends DslUrl with `box.OneVectorOfOne`
  case object `dsl.vector<url>?`       extends DslUrl with `box.NullableVectorOfOne`
  case object `dsl.vector<url?>`       extends DslUrl with `box.OneVectorOfNullable`
  case object `dsl.vector<url?>?`      extends DslUrl with `box.NullableVectorOfNullable`
}
