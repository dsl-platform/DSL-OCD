package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslPoint
    extends OcdDslBoxType
    with `type.Point`

case object `dsl.Point`                extends DslPoint with `box.One`
case object `dsl.Point?`               extends DslPoint with `box.Nullable`
case object `dsl.Array<Point>`         extends DslPoint with `box.OneArrayOfOne`
case object `dsl.Point[]`              extends DslPoint with `box.OneBracketsOfOne`
case object `dsl.Array<Point>?`        extends DslPoint with `box.NullableArrayOfOne`
case object `dsl.Point[]?`             extends DslPoint with `box.NullableBracketsOfOne`
case object `dsl.Array<Point?>`        extends DslPoint with `box.OneArrayOfNullable`
case object `dsl.Point?[]`             extends DslPoint with `box.OneBracketsOfNullable`
case object `dsl.Array<Point?>?`       extends DslPoint with `box.NullableArrayOfNullable`
case object `dsl.Point?[]?`            extends DslPoint with `box.NullableBracketsOfNullable`
case object `dsl.List<Point>`          extends DslPoint with `box.OneListOfOne`
case object `dsl.List<Point>?`         extends DslPoint with `box.NullableListOfOne`
case object `dsl.List<Point?>`         extends DslPoint with `box.OneListOfNullable`
case object `dsl.List<Point?>?`        extends DslPoint with `box.NullableListOfNullable`
case object `dsl.Set<Point>`           extends DslPoint with `box.OneSetOfOne`
case object `dsl.Set<Point>?`          extends DslPoint with `box.NullableSetOfOne`
case object `dsl.Set<Point?>`          extends DslPoint with `box.OneSetOfNullable`
case object `dsl.Set<Point?>?`         extends DslPoint with `box.NullableSetOfNullable`
case object `dsl.Queue<Point>`         extends DslPoint with `box.OneQueueOfOne`
case object `dsl.Queue<Point>?`        extends DslPoint with `box.NullableQueueOfOne`
case object `dsl.Queue<Point?>`        extends DslPoint with `box.OneQueueOfNullable`
case object `dsl.Queue<Point?>?`       extends DslPoint with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Point>`   extends DslPoint with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Point>?`  extends DslPoint with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Point?>`  extends DslPoint with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Point?>?` extends DslPoint with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Point>`         extends DslPoint with `box.OneStackOfOne`
case object `dsl.Stack<Point>?`        extends DslPoint with `box.NullableStackOfOne`
case object `dsl.Stack<Point?>`        extends DslPoint with `box.OneStackOfNullable`
case object `dsl.Stack<Point?>?`       extends DslPoint with `box.NullableStackOfNullable`
case object `dsl.Vector<Point>`        extends DslPoint with `box.OneVectorOfOne`
case object `dsl.Vector<Point>?`       extends DslPoint with `box.NullableVectorOfOne`
case object `dsl.Vector<Point?>`       extends DslPoint with `box.OneVectorOfNullable`
case object `dsl.Vector<Point?>?`      extends DslPoint with `box.NullableVectorOfNullable`

object DslPointGrammarAliases1 {
  case object `dsl.POINT`                extends DslPoint with `box.One`
  case object `dsl.POINT?`               extends DslPoint with `box.Nullable`
  case object `dsl.ARRAY<POINT>`         extends DslPoint with `box.OneArrayOfOne`
  case object `dsl.POINT[]`              extends DslPoint with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<POINT>?`        extends DslPoint with `box.NullableArrayOfOne`
  case object `dsl.POINT[]?`             extends DslPoint with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<POINT?>`        extends DslPoint with `box.OneArrayOfNullable`
  case object `dsl.POINT?[]`             extends DslPoint with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<POINT?>?`       extends DslPoint with `box.NullableArrayOfNullable`
  case object `dsl.POINT?[]?`            extends DslPoint with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<POINT>`          extends DslPoint with `box.OneListOfOne`
  case object `dsl.LIST<POINT>?`         extends DslPoint with `box.NullableListOfOne`
  case object `dsl.LIST<POINT?>`         extends DslPoint with `box.OneListOfNullable`
  case object `dsl.LIST<POINT?>?`        extends DslPoint with `box.NullableListOfNullable`
  case object `dsl.SET<POINT>`           extends DslPoint with `box.OneSetOfOne`
  case object `dsl.SET<POINT>?`          extends DslPoint with `box.NullableSetOfOne`
  case object `dsl.SET<POINT?>`          extends DslPoint with `box.OneSetOfNullable`
  case object `dsl.SET<POINT?>?`         extends DslPoint with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<POINT>`         extends DslPoint with `box.OneQueueOfOne`
  case object `dsl.QUEUE<POINT>?`        extends DslPoint with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<POINT?>`        extends DslPoint with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<POINT?>?`       extends DslPoint with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<POINT>`   extends DslPoint with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<POINT>?`  extends DslPoint with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<POINT?>`  extends DslPoint with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<POINT?>?` extends DslPoint with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<POINT>`         extends DslPoint with `box.OneStackOfOne`
  case object `dsl.STACK<POINT>?`        extends DslPoint with `box.NullableStackOfOne`
  case object `dsl.STACK<POINT?>`        extends DslPoint with `box.OneStackOfNullable`
  case object `dsl.STACK<POINT?>?`       extends DslPoint with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<POINT>`        extends DslPoint with `box.OneVectorOfOne`
  case object `dsl.VECTOR<POINT>?`       extends DslPoint with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<POINT?>`       extends DslPoint with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<POINT?>?`      extends DslPoint with `box.NullableVectorOfNullable`
}

object DslPointGrammarAliases2 {
  case object `dsl.point`                extends DslPoint with `box.One`
  case object `dsl.point?`               extends DslPoint with `box.Nullable`
  case object `dsl.array<point>`         extends DslPoint with `box.OneArrayOfOne`
  case object `dsl.point[]`              extends DslPoint with `box.OneBracketsOfOne`
  case object `dsl.array<point>?`        extends DslPoint with `box.NullableArrayOfOne`
  case object `dsl.point[]?`             extends DslPoint with `box.NullableBracketsOfOne`
  case object `dsl.array<point?>`        extends DslPoint with `box.OneArrayOfNullable`
  case object `dsl.point?[]`             extends DslPoint with `box.OneBracketsOfNullable`
  case object `dsl.array<point?>?`       extends DslPoint with `box.NullableArrayOfNullable`
  case object `dsl.point?[]?`            extends DslPoint with `box.NullableBracketsOfNullable`
  case object `dsl.list<point>`          extends DslPoint with `box.OneListOfOne`
  case object `dsl.list<point>?`         extends DslPoint with `box.NullableListOfOne`
  case object `dsl.list<point?>`         extends DslPoint with `box.OneListOfNullable`
  case object `dsl.list<point?>?`        extends DslPoint with `box.NullableListOfNullable`
  case object `dsl.set<point>`           extends DslPoint with `box.OneSetOfOne`
  case object `dsl.set<point>?`          extends DslPoint with `box.NullableSetOfOne`
  case object `dsl.set<point?>`          extends DslPoint with `box.OneSetOfNullable`
  case object `dsl.set<point?>?`         extends DslPoint with `box.NullableSetOfNullable`
  case object `dsl.queue<point>`         extends DslPoint with `box.OneQueueOfOne`
  case object `dsl.queue<point>?`        extends DslPoint with `box.NullableQueueOfOne`
  case object `dsl.queue<point?>`        extends DslPoint with `box.OneQueueOfNullable`
  case object `dsl.queue<point?>?`       extends DslPoint with `box.NullableQueueOfNullable`
  case object `dsl.linked list<point>`   extends DslPoint with `box.OneLinkedListOfOne`
  case object `dsl.linked list<point>?`  extends DslPoint with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<point?>`  extends DslPoint with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<point?>?` extends DslPoint with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<point>`         extends DslPoint with `box.OneStackOfOne`
  case object `dsl.stack<point>?`        extends DslPoint with `box.NullableStackOfOne`
  case object `dsl.stack<point?>`        extends DslPoint with `box.OneStackOfNullable`
  case object `dsl.stack<point?>?`       extends DslPoint with `box.NullableStackOfNullable`
  case object `dsl.vector<point>`        extends DslPoint with `box.OneVectorOfOne`
  case object `dsl.vector<point>?`       extends DslPoint with `box.NullableVectorOfOne`
  case object `dsl.vector<point?>`       extends DslPoint with `box.OneVectorOfNullable`
  case object `dsl.vector<point?>?`      extends DslPoint with `box.NullableVectorOfNullable`
}
