package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed abstract class DslS3
    extends OcdDslBoxType
    with `type.S3`

case object `dsl.S3`                extends DslS3 with `box.One`
case object `dsl.S3?`               extends DslS3 with `box.Nullable`
case object `dsl.ARRAY<S3>`         extends DslS3 with `box.OneArrayOfOne`
case object `dsl.S3[]`              extends DslS3 with `box.OneBracketsOfOne`
case object `dsl.ARRAY<S3>?`        extends DslS3 with `box.NullableArrayOfOne`
case object `dsl.S3[]?`             extends DslS3 with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<S3?>`        extends DslS3 with `box.OneArrayOfNullable`
case object `dsl.S3?[]`             extends DslS3 with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<S3?>?`       extends DslS3 with `box.NullableArrayOfNullable`
case object `dsl.S3?[]?`            extends DslS3 with `box.NullableBracketsOfNullable`
case object `dsl.LIST<S3>`          extends DslS3 with `box.OneListOfOne`
case object `dsl.LIST<S3>?`         extends DslS3 with `box.NullableListOfOne`
case object `dsl.LIST<S3?>`         extends DslS3 with `box.OneListOfNullable`
case object `dsl.LIST<S3?>?`        extends DslS3 with `box.NullableListOfNullable`
case object `dsl.SET<S3>`           extends DslS3 with `box.OneSetOfOne`
case object `dsl.SET<S3>?`          extends DslS3 with `box.NullableSetOfOne`
case object `dsl.SET<S3?>`          extends DslS3 with `box.OneSetOfNullable`
case object `dsl.SET<S3?>?`         extends DslS3 with `box.NullableSetOfNullable`
case object `dsl.QUEUE<S3>`         extends DslS3 with `box.OneQueueOfOne`
case object `dsl.QUEUE<S3>?`        extends DslS3 with `box.NullableQueueOfOne`
case object `dsl.QUEUE<S3?>`        extends DslS3 with `box.OneQueueOfNullable`
case object `dsl.QUEUE<S3?>?`       extends DslS3 with `box.NullableQueueOfNullable`
case object `dsl.LINKED LIST<S3>`   extends DslS3 with `box.OneLinkedListOfOne`
case object `dsl.LINKED LIST<S3>?`  extends DslS3 with `box.NullableLinkedListOfOne`
case object `dsl.LINKED LIST<S3?>`  extends DslS3 with `box.OneLinkedListOfNullable`
case object `dsl.LINKED LIST<S3?>?` extends DslS3 with `box.NullableLinkedListOfNullable`
case object `dsl.STACK<S3>`         extends DslS3 with `box.OneStackOfOne`
case object `dsl.STACK<S3>?`        extends DslS3 with `box.NullableStackOfOne`
case object `dsl.STACK<S3?>`        extends DslS3 with `box.OneStackOfNullable`
case object `dsl.STACK<S3?>?`       extends DslS3 with `box.NullableStackOfNullable`
case object `dsl.VECTOR<S3>`        extends DslS3 with `box.OneVectorOfOne`
case object `dsl.VECTOR<S3>?`       extends DslS3 with `box.NullableVectorOfOne`
case object `dsl.VECTOR<S3?>`       extends DslS3 with `box.OneVectorOfNullable`
case object `dsl.VECTOR<S3?>?`      extends DslS3 with `box.NullableVectorOfNullable`

object DslS3GrammarAliases1 {
  case object `dsl.s3`                extends DslS3 with `box.One`
  case object `dsl.s3?`               extends DslS3 with `box.Nullable`
  case object `dsl.array<s3>`         extends DslS3 with `box.OneArrayOfOne`
  case object `dsl.s3[]`              extends DslS3 with `box.OneBracketsOfOne`
  case object `dsl.array<s3>?`        extends DslS3 with `box.NullableArrayOfOne`
  case object `dsl.s3[]?`             extends DslS3 with `box.NullableBracketsOfOne`
  case object `dsl.array<s3?>`        extends DslS3 with `box.OneArrayOfNullable`
  case object `dsl.s3?[]`             extends DslS3 with `box.OneBracketsOfNullable`
  case object `dsl.array<s3?>?`       extends DslS3 with `box.NullableArrayOfNullable`
  case object `dsl.s3?[]?`            extends DslS3 with `box.NullableBracketsOfNullable`
  case object `dsl.list<s3>`          extends DslS3 with `box.OneListOfOne`
  case object `dsl.list<s3>?`         extends DslS3 with `box.NullableListOfOne`
  case object `dsl.list<s3?>`         extends DslS3 with `box.OneListOfNullable`
  case object `dsl.list<s3?>?`        extends DslS3 with `box.NullableListOfNullable`
  case object `dsl.set<s3>`           extends DslS3 with `box.OneSetOfOne`
  case object `dsl.set<s3>?`          extends DslS3 with `box.NullableSetOfOne`
  case object `dsl.set<s3?>`          extends DslS3 with `box.OneSetOfNullable`
  case object `dsl.set<s3?>?`         extends DslS3 with `box.NullableSetOfNullable`
  case object `dsl.queue<s3>`         extends DslS3 with `box.OneQueueOfOne`
  case object `dsl.queue<s3>?`        extends DslS3 with `box.NullableQueueOfOne`
  case object `dsl.queue<s3?>`        extends DslS3 with `box.OneQueueOfNullable`
  case object `dsl.queue<s3?>?`       extends DslS3 with `box.NullableQueueOfNullable`
  case object `dsl.linked list<s3>`   extends DslS3 with `box.OneLinkedListOfOne`
  case object `dsl.linked list<s3>?`  extends DslS3 with `box.NullableLinkedListOfOne`
  case object `dsl.linked list<s3?>`  extends DslS3 with `box.OneLinkedListOfNullable`
  case object `dsl.linked list<s3?>?` extends DslS3 with `box.NullableLinkedListOfNullable`
  case object `dsl.stack<s3>`         extends DslS3 with `box.OneStackOfOne`
  case object `dsl.stack<s3>?`        extends DslS3 with `box.NullableStackOfOne`
  case object `dsl.stack<s3?>`        extends DslS3 with `box.OneStackOfNullable`
  case object `dsl.stack<s3?>?`       extends DslS3 with `box.NullableStackOfNullable`
  case object `dsl.vector<s3>`        extends DslS3 with `box.OneVectorOfOne`
  case object `dsl.vector<s3>?`       extends DslS3 with `box.NullableVectorOfOne`
  case object `dsl.vector<s3?>`       extends DslS3 with `box.OneVectorOfNullable`
  case object `dsl.vector<s3?>?`      extends DslS3 with `box.NullableVectorOfNullable`
}
