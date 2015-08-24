package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslDouble
    extends OcdDslBoxType
    with `type.Double`

case object `dsl.Double`                extends DslDouble with `box.One`
case object `dsl.Double?`               extends DslDouble with `box.Nullable`
case object `dsl.Array<Double>`         extends DslDouble with `box.OneArrayOfOne`
case object `dsl.Double[]`              extends DslDouble with `box.OneBracketsOfOne`
case object `dsl.Array<Double>?`        extends DslDouble with `box.NullableArrayOfOne`
case object `dsl.Double[]?`             extends DslDouble with `box.NullableBracketsOfOne`
case object `dsl.Array<Double?>`        extends DslDouble with `box.OneArrayOfNullable`
case object `dsl.Double?[]`             extends DslDouble with `box.OneBracketsOfNullable`
case object `dsl.Array<Double?>?`       extends DslDouble with `box.NullableArrayOfNullable`
case object `dsl.Double?[]?`            extends DslDouble with `box.NullableBracketsOfNullable`
case object `dsl.List<Double>`          extends DslDouble with `box.OneListOfOne`
case object `dsl.List<Double>?`         extends DslDouble with `box.NullableListOfOne`
case object `dsl.List<Double?>`         extends DslDouble with `box.OneListOfNullable`
case object `dsl.List<Double?>?`        extends DslDouble with `box.NullableListOfNullable`
case object `dsl.Set<Double>`           extends DslDouble with `box.OneSetOfOne`
case object `dsl.Set<Double>?`          extends DslDouble with `box.NullableSetOfOne`
case object `dsl.Set<Double?>`          extends DslDouble with `box.OneSetOfNullable`
case object `dsl.Set<Double?>?`         extends DslDouble with `box.NullableSetOfNullable`
case object `dsl.Queue<Double>`         extends DslDouble with `box.OneQueueOfOne`
case object `dsl.Queue<Double>?`        extends DslDouble with `box.NullableQueueOfOne`
case object `dsl.Queue<Double?>`        extends DslDouble with `box.OneQueueOfNullable`
case object `dsl.Queue<Double?>?`       extends DslDouble with `box.NullableQueueOfNullable`
case object `dsl.Linked List<Double>`   extends DslDouble with `box.OneLinkedListOfOne`
case object `dsl.Linked List<Double>?`  extends DslDouble with `box.NullableLinkedListOfOne`
case object `dsl.Linked List<Double?>`  extends DslDouble with `box.OneLinkedListOfNullable`
case object `dsl.Linked List<Double?>?` extends DslDouble with `box.NullableLinkedListOfNullable`
case object `dsl.Stack<Double>`         extends DslDouble with `box.OneStackOfOne`
case object `dsl.Stack<Double>?`        extends DslDouble with `box.NullableStackOfOne`
case object `dsl.Stack<Double?>`        extends DslDouble with `box.OneStackOfNullable`
case object `dsl.Stack<Double?>?`       extends DslDouble with `box.NullableStackOfNullable`
case object `dsl.Vector<Double>`        extends DslDouble with `box.OneVectorOfOne`
case object `dsl.Vector<Double>?`       extends DslDouble with `box.NullableVectorOfOne`
case object `dsl.Vector<Double?>`       extends DslDouble with `box.OneVectorOfNullable`
case object `dsl.Vector<Double?>?`      extends DslDouble with `box.NullableVectorOfNullable`

object DslDoubleGrammarAliases1 {
  case object `dsl.DOUBLE`                extends DslDouble with `box.One`
  case object `dsl.DOUBLE?`               extends DslDouble with `box.Nullable`
  case object `dsl.ARRAY<DOUBLE>`         extends DslDouble with `box.OneArrayOfOne`
  case object `dsl.DOUBLE[]`              extends DslDouble with `box.OneBracketsOfOne`
  case object `dsl.ARRAY<DOUBLE>?`        extends DslDouble with `box.NullableArrayOfOne`
  case object `dsl.DOUBLE[]?`             extends DslDouble with `box.NullableBracketsOfOne`
  case object `dsl.ARRAY<DOUBLE?>`        extends DslDouble with `box.OneArrayOfNullable`
  case object `dsl.DOUBLE?[]`             extends DslDouble with `box.OneBracketsOfNullable`
  case object `dsl.ARRAY<DOUBLE?>?`       extends DslDouble with `box.NullableArrayOfNullable`
  case object `dsl.DOUBLE?[]?`            extends DslDouble with `box.NullableBracketsOfNullable`
  case object `dsl.LIST<DOUBLE>`          extends DslDouble with `box.OneListOfOne`
  case object `dsl.LIST<DOUBLE>?`         extends DslDouble with `box.NullableListOfOne`
  case object `dsl.LIST<DOUBLE?>`         extends DslDouble with `box.OneListOfNullable`
  case object `dsl.LIST<DOUBLE?>?`        extends DslDouble with `box.NullableListOfNullable`
  case object `dsl.SET<DOUBLE>`           extends DslDouble with `box.OneSetOfOne`
  case object `dsl.SET<DOUBLE>?`          extends DslDouble with `box.NullableSetOfOne`
  case object `dsl.SET<DOUBLE?>`          extends DslDouble with `box.OneSetOfNullable`
  case object `dsl.SET<DOUBLE?>?`         extends DslDouble with `box.NullableSetOfNullable`
  case object `dsl.QUEUE<DOUBLE>`         extends DslDouble with `box.OneQueueOfOne`
  case object `dsl.QUEUE<DOUBLE>?`        extends DslDouble with `box.NullableQueueOfOne`
  case object `dsl.QUEUE<DOUBLE?>`        extends DslDouble with `box.OneQueueOfNullable`
  case object `dsl.QUEUE<DOUBLE?>?`       extends DslDouble with `box.NullableQueueOfNullable`
  case object `dsl.LINKED LIST<DOUBLE>`   extends DslDouble with `box.OneLinkedListOfOne`
  case object `dsl.LINKED LIST<DOUBLE>?`  extends DslDouble with `box.NullableLinkedListOfOne`
  case object `dsl.LINKED LIST<DOUBLE?>`  extends DslDouble with `box.OneLinkedListOfNullable`
  case object `dsl.LINKED LIST<DOUBLE?>?` extends DslDouble with `box.NullableLinkedListOfNullable`
  case object `dsl.STACK<DOUBLE>`         extends DslDouble with `box.OneStackOfOne`
  case object `dsl.STACK<DOUBLE>?`        extends DslDouble with `box.NullableStackOfOne`
  case object `dsl.STACK<DOUBLE?>`        extends DslDouble with `box.OneStackOfNullable`
  case object `dsl.STACK<DOUBLE?>?`       extends DslDouble with `box.NullableStackOfNullable`
  case object `dsl.VECTOR<DOUBLE>`        extends DslDouble with `box.OneVectorOfOne`
  case object `dsl.VECTOR<DOUBLE>?`       extends DslDouble with `box.NullableVectorOfOne`
  case object `dsl.VECTOR<DOUBLE?>`       extends DslDouble with `box.OneVectorOfNullable`
  case object `dsl.VECTOR<DOUBLE?>?`      extends DslDouble with `box.NullableVectorOfNullable`
}

object DslDoubleGrammarAliases2 {
  case object `dsl.double`                extends DslDouble with `box.One`
  case object `dsl.double?`               extends DslDouble with `box.Nullable`
  case object `dsl.array<double>`         extends DslDouble with `box.OneArrayOfOne`
  case object `dsl.double[]`              extends DslDouble with `box.OneBracketsOfOne`
  case object `dsl.array<double>?`        extends DslDouble with `box.NullableArrayOfOne`
  case object `dsl.double[]?`             extends DslDouble with `box.NullableBracketsOfOne`
  case object `dsl.array<double?>`        extends DslDouble with `box.OneArrayOfNullable`
  case object `dsl.double?[]`             extends DslDouble with `box.OneBracketsOfNullable`
  case object `dsl.array<double?>?`       extends DslDouble with `box.NullableArrayOfNullable`
  case object `dsl.double?[]?`            extends DslDouble with `box.NullableBracketsOfNullable`
  case object `dsl.list<double>`          extends DslDouble with `box.OneListOfOne`
  case object `dsl.list<double>?`         extends DslDouble with `box.NullableListOfOne`
  case object `dsl.list<double?>`         extends DslDouble with `box.OneListOfNullable`
  case object `dsl.list<double?>?`        extends DslDouble with `box.NullableListOfNullable`
  case object `dsl.set<double>`           extends DslDouble with `box.OneSetOfOne`
  case object `dsl.set<double>?`          extends DslDouble with `box.NullableSetOfOne`
  case object `dsl.set<double?>`          extends DslDouble with `box.OneSetOfNullable`
  case object `dsl.set<double?>?`         extends DslDouble with `box.NullableSetOfNullable`
  case object `dsl.queue<double>`         extends DslDouble with `box.OneQueueOfOne`
  case object `dsl.queue<double>?`        extends DslDouble with `box.NullableQueueOfOne`
  case object `dsl.queue<double?>`        extends DslDouble with `box.OneQueueOfNullable`
  case object `dsl.queue<double?>?`       extends DslDouble with `box.NullableQueueOfNullable`
  case object `dsl.linked list<double>`   extends DslDouble with `box.OneLinkedListOfOne`
  case object `dsl.linked list<double>?`  extends DslDouble with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<double?>`  extends DslDouble with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<double?>?` extends DslDouble with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<double>`         extends DslDouble with `box.OneStackOfOne`
  case object `dsl.stack<double>?`        extends DslDouble with `box.NullableStackOfOne`
  case object `dsl.stack<double?>`        extends DslDouble with `box.OneStackOfNullable`
  case object `dsl.stack<double?>?`       extends DslDouble with `box.NullableStackOfNullable`
  case object `dsl.vector<double>`        extends DslDouble with `box.OneVectorOfOne`
  case object `dsl.vector<double>?`       extends DslDouble with `box.NullableVectorOfOne`
  case object `dsl.vector<double?>`       extends DslDouble with `box.OneVectorOfNullable`
  case object `dsl.vector<double?>?`      extends DslDouble with `box.NullableVectorOfNullable`
}
