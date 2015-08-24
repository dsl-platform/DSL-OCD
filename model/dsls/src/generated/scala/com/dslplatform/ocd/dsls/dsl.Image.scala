package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslImage
    extends OcdDslBoxType
    with `type.Image`

case object `dsl.Image`                extends DslImage with `box.One`
case object `dsl.Image?`               extends DslImage with `box.Nullable`
case object `dsl.Array<Image>`         extends DslImage with `box.OneArrayOfOne`
case object `dsl.Image[]`              extends DslImage with `box.OneBracketsOfOne`
case object `dsl.Array<Image>?`        extends DslImage with `box.NullableArrayOfOne`
case object `dsl.Image[]?`             extends DslImage with `box.NullableBracketsOfOne`
case object `dsl.Array<Image?>`        extends DslImage with `box.OneArrayOfNullable`
case object `dsl.Image?[]`             extends DslImage with `box.OneBracketsOfNullable`
case object `dsl.Array<Image?>?`       extends DslImage with `box.NullableArrayOfNullable`
case object `dsl.Image?[]?`            extends DslImage with `box.NullableBracketsOfNullable`
case object `dsl.List<Image>`          extends DslImage with `box.OneListOfOne`
case object `dsl.List<Image>?`         extends DslImage with `box.NullableListOfOne`
case object `dsl.List<Image?>`         extends DslImage with `box.OneListOfNullable`
case object `dsl.List<Image?>?`        extends DslImage with `box.NullableListOfNullable`
case object `dsl.Set<Image>`           extends DslImage with `box.OneSetOfOne`
case object `dsl.Set<Image>?`          extends DslImage with `box.NullableSetOfOne`
case object `dsl.Set<Image?>`          extends DslImage with `box.OneSetOfNullable`
case object `dsl.Set<Image?>?`         extends DslImage with `box.NullableSetOfNullable`
case object `dsl.Queue<Image>`         extends DslImage with `box.OneQueueOfOne`
case object `dsl.Queue<Image>?`        extends DslImage with `box.NullableQueueOfOne`
case object `dsl.Queue<Image?>`        extends DslImage with `box.OneQueueOfNullable`
case object `dsl.Queue<Image?>?`       extends DslImage with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Image>`   extends DslImage with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Image>?`  extends DslImage with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Image?>`  extends DslImage with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Image?>?` extends DslImage with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Image>`         extends DslImage with `box.OneStackOfOne`
case object `dsl.Stack<Image>?`        extends DslImage with `box.NullableStackOfOne`
case object `dsl.Stack<Image?>`        extends DslImage with `box.OneStackOfNullable`
case object `dsl.Stack<Image?>?`       extends DslImage with `box.NullableStackOfNullable`
case object `dsl.Vector<Image>`        extends DslImage with `box.OneVectorOfOne`
case object `dsl.Vector<Image>?`       extends DslImage with `box.NullableVectorOfOne`
case object `dsl.Vector<Image?>`       extends DslImage with `box.OneVectorOfNullable`
case object `dsl.Vector<Image?>?`      extends DslImage with `box.NullableVectorOfNullable`

object DslImageGrammarAliases1 {
  case object `dsl.IMAGE`                extends DslImage with `box.One`
  case object `dsl.IMAGE?`               extends DslImage with `box.Nullable`
  case object `dsl.ARRAY<IMAGE>`         extends DslImage with `box.OneArrayOfOne`
  case object `dsl.IMAGE[]`              extends DslImage with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<IMAGE>?`        extends DslImage with `box.NullableArrayOfOne`
  case object `dsl.IMAGE[]?`             extends DslImage with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<IMAGE?>`        extends DslImage with `box.OneArrayOfNullable`
  case object `dsl.IMAGE?[]`             extends DslImage with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<IMAGE?>?`       extends DslImage with `box.NullableArrayOfNullable`
  case object `dsl.IMAGE?[]?`            extends DslImage with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<IMAGE>`          extends DslImage with `box.OneListOfOne`
  case object `dsl.LIST<IMAGE>?`         extends DslImage with `box.NullableListOfOne`
  case object `dsl.LIST<IMAGE?>`         extends DslImage with `box.OneListOfNullable`
  case object `dsl.LIST<IMAGE?>?`        extends DslImage with `box.NullableListOfNullable`
  case object `dsl.SET<IMAGE>`           extends DslImage with `box.OneSetOfOne`
  case object `dsl.SET<IMAGE>?`          extends DslImage with `box.NullableSetOfOne`
  case object `dsl.SET<IMAGE?>`          extends DslImage with `box.OneSetOfNullable`
  case object `dsl.SET<IMAGE?>?`         extends DslImage with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<IMAGE>`         extends DslImage with `box.OneQueueOfOne`
  case object `dsl.QUEUE<IMAGE>?`        extends DslImage with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<IMAGE?>`        extends DslImage with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<IMAGE?>?`       extends DslImage with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<IMAGE>`   extends DslImage with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<IMAGE>?`  extends DslImage with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<IMAGE?>`  extends DslImage with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<IMAGE?>?` extends DslImage with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<IMAGE>`         extends DslImage with `box.OneStackOfOne`
  case object `dsl.STACK<IMAGE>?`        extends DslImage with `box.NullableStackOfOne`
  case object `dsl.STACK<IMAGE?>`        extends DslImage with `box.OneStackOfNullable`
  case object `dsl.STACK<IMAGE?>?`       extends DslImage with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<IMAGE>`        extends DslImage with `box.OneVectorOfOne`
  case object `dsl.VECTOR<IMAGE>?`       extends DslImage with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<IMAGE?>`       extends DslImage with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<IMAGE?>?`      extends DslImage with `box.NullableVectorOfNullable`
}

object DslImageGrammarAliases2 {
  case object `dsl.PICTURE`                extends DslImage with `box.One`
  case object `dsl.PICTURE?`               extends DslImage with `box.Nullable`
  case object `dsl.ARRAY<PICTURE>`         extends DslImage with `box.OneArrayOfOne`
  case object `dsl.PICTURE[]`              extends DslImage with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<PICTURE>?`        extends DslImage with `box.NullableArrayOfOne`
  case object `dsl.PICTURE[]?`             extends DslImage with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<PICTURE?>`        extends DslImage with `box.OneArrayOfNullable`
  case object `dsl.PICTURE?[]`             extends DslImage with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<PICTURE?>?`       extends DslImage with `box.NullableArrayOfNullable`
  case object `dsl.PICTURE?[]?`            extends DslImage with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<PICTURE>`          extends DslImage with `box.OneListOfOne`
  case object `dsl.LIST<PICTURE>?`         extends DslImage with `box.NullableListOfOne`
  case object `dsl.LIST<PICTURE?>`         extends DslImage with `box.OneListOfNullable`
  case object `dsl.LIST<PICTURE?>?`        extends DslImage with `box.NullableListOfNullable`
  case object `dsl.SET<PICTURE>`           extends DslImage with `box.OneSetOfOne`
  case object `dsl.SET<PICTURE>?`          extends DslImage with `box.NullableSetOfOne`
  case object `dsl.SET<PICTURE?>`          extends DslImage with `box.OneSetOfNullable`
  case object `dsl.SET<PICTURE?>?`         extends DslImage with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<PICTURE>`         extends DslImage with `box.OneQueueOfOne`
  case object `dsl.QUEUE<PICTURE>?`        extends DslImage with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<PICTURE?>`        extends DslImage with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<PICTURE?>?`       extends DslImage with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<PICTURE>`   extends DslImage with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<PICTURE>?`  extends DslImage with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<PICTURE?>`  extends DslImage with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<PICTURE?>?` extends DslImage with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<PICTURE>`         extends DslImage with `box.OneStackOfOne`
  case object `dsl.STACK<PICTURE>?`        extends DslImage with `box.NullableStackOfOne`
  case object `dsl.STACK<PICTURE?>`        extends DslImage with `box.OneStackOfNullable`
  case object `dsl.STACK<PICTURE?>?`       extends DslImage with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<PICTURE>`        extends DslImage with `box.OneVectorOfOne`
  case object `dsl.VECTOR<PICTURE>?`       extends DslImage with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<PICTURE?>`       extends DslImage with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<PICTURE?>?`      extends DslImage with `box.NullableVectorOfNullable`
}

object DslImageGrammarAliases3 {
  case object `dsl.Picture`                extends DslImage with `box.One`
  case object `dsl.Picture?`               extends DslImage with `box.Nullable`
  case object `dsl.Array<Picture>`         extends DslImage with `box.OneArrayOfOne`
  case object `dsl.Picture[]`              extends DslImage with `box.OneBracketsOfOne`
  case object `dsl.Array<Picture>?`        extends DslImage with `box.NullableArrayOfOne`
  case object `dsl.Picture[]?`             extends DslImage with `box.NullableBracketsOfOne`
  case object `dsl.Array<Picture?>`        extends DslImage with `box.OneArrayOfNullable`
  case object `dsl.Picture?[]`             extends DslImage with `box.OneBracketsOfNullable`
  case object `dsl.Array<Picture?>?`       extends DslImage with `box.NullableArrayOfNullable`
  case object `dsl.Picture?[]?`            extends DslImage with `box.NullableBracketsOfNullable`
  case object `dsl.List<Picture>`          extends DslImage with `box.OneListOfOne`
  case object `dsl.List<Picture>?`         extends DslImage with `box.NullableListOfOne`
  case object `dsl.List<Picture?>`         extends DslImage with `box.OneListOfNullable`
  case object `dsl.List<Picture?>?`        extends DslImage with `box.NullableListOfNullable`
  case object `dsl.Set<Picture>`           extends DslImage with `box.OneSetOfOne`
  case object `dsl.Set<Picture>?`          extends DslImage with `box.NullableSetOfOne`
  case object `dsl.Set<Picture?>`          extends DslImage with `box.OneSetOfNullable`
  case object `dsl.Set<Picture?>?`         extends DslImage with `box.NullableSetOfNullable`
  case object `dsl.Queue<Picture>`         extends DslImage with `box.OneQueueOfOne`
  case object `dsl.Queue<Picture>?`        extends DslImage with `box.NullableQueueOfOne`
  case object `dsl.Queue<Picture?>`        extends DslImage with `box.OneQueueOfNullable`
  case object `dsl.Queue<Picture?>?`       extends DslImage with `box.NullableQueueOfNullable`
  case object `dsl.Linked List<Picture>`   extends DslImage with `box.OneLinkedListOfOne`
  case object `dsl.Linked List<Picture>?`  extends DslImage with `box.NullableLinkedListOfOne`
  case object `dsl.Linked List<Picture?>`  extends DslImage with `box.OneLinkedListOfNullable`
  case object `dsl.Linked List<Picture?>?` extends DslImage with `box.NullableLinkedListOfNullable`
  case object `dsl.Stack<Picture>`         extends DslImage with `box.OneStackOfOne`
  case object `dsl.Stack<Picture>?`        extends DslImage with `box.NullableStackOfOne`
  case object `dsl.Stack<Picture?>`        extends DslImage with `box.OneStackOfNullable`
  case object `dsl.Stack<Picture?>?`       extends DslImage with `box.NullableStackOfNullable`
  case object `dsl.Vector<Picture>`        extends DslImage with `box.OneVectorOfOne`
  case object `dsl.Vector<Picture>?`       extends DslImage with `box.NullableVectorOfOne`
  case object `dsl.Vector<Picture?>`       extends DslImage with `box.OneVectorOfNullable`
  case object `dsl.Vector<Picture?>?`      extends DslImage with `box.NullableVectorOfNullable`
}

object DslImageGrammarAliases4 {
  case object `dsl.image`                extends DslImage with `box.One`
  case object `dsl.image?`               extends DslImage with `box.Nullable`
  case object `dsl.array<image>`         extends DslImage with `box.OneArrayOfOne`
  case object `dsl.image[]`              extends DslImage with `box.OneBracketsOfOne`
  case object `dsl.array<image>?`        extends DslImage with `box.NullableArrayOfOne`
  case object `dsl.image[]?`             extends DslImage with `box.NullableBracketsOfOne`
  case object `dsl.array<image?>`        extends DslImage with `box.OneArrayOfNullable`
  case object `dsl.image?[]`             extends DslImage with `box.OneBracketsOfNullable`
  case object `dsl.array<image?>?`       extends DslImage with `box.NullableArrayOfNullable`
  case object `dsl.image?[]?`            extends DslImage with `box.NullableBracketsOfNullable`
  case object `dsl.list<image>`          extends DslImage with `box.OneListOfOne`
  case object `dsl.list<image>?`         extends DslImage with `box.NullableListOfOne`
  case object `dsl.list<image?>`         extends DslImage with `box.OneListOfNullable`
  case object `dsl.list<image?>?`        extends DslImage with `box.NullableListOfNullable`
  case object `dsl.set<image>`           extends DslImage with `box.OneSetOfOne`
  case object `dsl.set<image>?`          extends DslImage with `box.NullableSetOfOne`
  case object `dsl.set<image?>`          extends DslImage with `box.OneSetOfNullable`
  case object `dsl.set<image?>?`         extends DslImage with `box.NullableSetOfNullable`
  case object `dsl.queue<image>`         extends DslImage with `box.OneQueueOfOne`
  case object `dsl.queue<image>?`        extends DslImage with `box.NullableQueueOfOne`
  case object `dsl.queue<image?>`        extends DslImage with `box.OneQueueOfNullable`
  case object `dsl.queue<image?>?`       extends DslImage with `box.NullableQueueOfNullable`
  case object `dsl.linked list<image>`   extends DslImage with `box.OneLinkedListOfOne`
  case object `dsl.linked list<image>?`  extends DslImage with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<image?>`  extends DslImage with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<image?>?` extends DslImage with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<image>`         extends DslImage with `box.OneStackOfOne`
  case object `dsl.stack<image>?`        extends DslImage with `box.NullableStackOfOne`
  case object `dsl.stack<image?>`        extends DslImage with `box.OneStackOfNullable`
  case object `dsl.stack<image?>?`       extends DslImage with `box.NullableStackOfNullable`
  case object `dsl.vector<image>`        extends DslImage with `box.OneVectorOfOne`
  case object `dsl.vector<image>?`       extends DslImage with `box.NullableVectorOfOne`
  case object `dsl.vector<image?>`       extends DslImage with `box.OneVectorOfNullable`
  case object `dsl.vector<image?>?`      extends DslImage with `box.NullableVectorOfNullable`
}

object DslImageGrammarAliases5 {
  case object `dsl.picture`                extends DslImage with `box.One`
  case object `dsl.picture?`               extends DslImage with `box.Nullable`
  case object `dsl.array<picture>`         extends DslImage with `box.OneArrayOfOne`
  case object `dsl.picture[]`              extends DslImage with `box.OneBracketsOfOne`
  case object `dsl.array<picture>?`        extends DslImage with `box.NullableArrayOfOne`
  case object `dsl.picture[]?`             extends DslImage with `box.NullableBracketsOfOne`
  case object `dsl.array<picture?>`        extends DslImage with `box.OneArrayOfNullable`
  case object `dsl.picture?[]`             extends DslImage with `box.OneBracketsOfNullable`
  case object `dsl.array<picture?>?`       extends DslImage with `box.NullableArrayOfNullable`
  case object `dsl.picture?[]?`            extends DslImage with `box.NullableBracketsOfNullable`
  case object `dsl.list<picture>`          extends DslImage with `box.OneListOfOne`
  case object `dsl.list<picture>?`         extends DslImage with `box.NullableListOfOne`
  case object `dsl.list<picture?>`         extends DslImage with `box.OneListOfNullable`
  case object `dsl.list<picture?>?`        extends DslImage with `box.NullableListOfNullable`
  case object `dsl.set<picture>`           extends DslImage with `box.OneSetOfOne`
  case object `dsl.set<picture>?`          extends DslImage with `box.NullableSetOfOne`
  case object `dsl.set<picture?>`          extends DslImage with `box.OneSetOfNullable`
  case object `dsl.set<picture?>?`         extends DslImage with `box.NullableSetOfNullable`
  case object `dsl.queue<picture>`         extends DslImage with `box.OneQueueOfOne`
  case object `dsl.queue<picture>?`        extends DslImage with `box.NullableQueueOfOne`
  case object `dsl.queue<picture?>`        extends DslImage with `box.OneQueueOfNullable`
  case object `dsl.queue<picture?>?`       extends DslImage with `box.NullableQueueOfNullable`
  case object `dsl.linked list<picture>`   extends DslImage with `box.OneLinkedListOfOne`
  case object `dsl.linked list<picture>?`  extends DslImage with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<picture?>`  extends DslImage with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<picture?>?` extends DslImage with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<picture>`         extends DslImage with `box.OneStackOfOne`
  case object `dsl.stack<picture>?`        extends DslImage with `box.NullableStackOfOne`
  case object `dsl.stack<picture?>`        extends DslImage with `box.OneStackOfNullable`
  case object `dsl.stack<picture?>?`       extends DslImage with `box.NullableStackOfNullable`
  case object `dsl.vector<picture>`        extends DslImage with `box.OneVectorOfOne`
  case object `dsl.vector<picture>?`       extends DslImage with `box.NullableVectorOfOne`
  case object `dsl.vector<picture?>`       extends DslImage with `box.OneVectorOfNullable`
  case object `dsl.vector<picture?>?`      extends DslImage with `box.NullableVectorOfNullable`
}
