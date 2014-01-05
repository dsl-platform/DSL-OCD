package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait `DslS3`
    extends OcdDsl
    with `type.S3` {

  def dslName = toString.substring(4)
}

case object `dsl.S3` extends `DslS3` with `box.One`
case object `dsl.ARRAY<S3>` extends `DslS3` with `box.OneArrayOfOne`
case object `dsl.S3[]` extends `DslS3` with `box.OneBracketsOfOne`
case object `dsl.ARRAY<S3?>` extends `DslS3` with `box.OneArrayOfNullable`
case object `dsl.S3?[]` extends `DslS3` with `box.OneBracketsOfNullable`
case object `dsl.LIST<S3>` extends `DslS3` with `box.OneListOfOne`
case object `dsl.LIST<S3?>` extends `DslS3` with `box.OneListOfNullable`
case object `dsl.SET<S3>` extends `DslS3` with `box.OneSetOfOne`
case object `dsl.SET<S3?>` extends `DslS3` with `box.OneSetOfNullable`
case object `dsl.S3?` extends `DslS3` with `box.Nullable`
case object `dsl.ARRAY<S3>?` extends `DslS3` with `box.NullableArrayOfOne`
case object `dsl.S3[]?` extends `DslS3` with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<S3?>?` extends `DslS3` with `box.NullableArrayOfNullable`
case object `dsl.S3?[]?` extends `DslS3` with `box.NullableBracketsOfNullable`
case object `dsl.LIST<S3>?` extends `DslS3` with `box.NullableListOfOne`
case object `dsl.LIST<S3?>?` extends `DslS3` with `box.NullableListOfNullable`
case object `dsl.SET<S3>?` extends `DslS3` with `box.NullableSetOfOne`
case object `dsl.SET<S3?>?` extends `DslS3` with `box.NullableSetOfNullable`

case object `dsl.s3` extends `DslS3` with `box.One`
case object `dsl.array<s3>` extends `DslS3` with `box.OneArrayOfOne`
case object `dsl.s3[]` extends `DslS3` with `box.OneBracketsOfOne`
case object `dsl.array<s3?>` extends `DslS3` with `box.OneArrayOfNullable`
case object `dsl.s3?[]` extends `DslS3` with `box.OneBracketsOfNullable`
case object `dsl.list<s3>` extends `DslS3` with `box.OneListOfOne`
case object `dsl.list<s3?>` extends `DslS3` with `box.OneListOfNullable`
case object `dsl.set<s3>` extends `DslS3` with `box.OneSetOfOne`
case object `dsl.set<s3?>` extends `DslS3` with `box.OneSetOfNullable`
case object `dsl.s3?` extends `DslS3` with `box.Nullable`
case object `dsl.array<s3>?` extends `DslS3` with `box.NullableArrayOfOne`
case object `dsl.s3[]?` extends `DslS3` with `box.NullableBracketsOfOne`
case object `dsl.array<s3?>?` extends `DslS3` with `box.NullableArrayOfNullable`
case object `dsl.s3?[]?` extends `DslS3` with `box.NullableBracketsOfNullable`
case object `dsl.list<s3>?` extends `DslS3` with `box.NullableListOfOne`
case object `dsl.list<s3?>?` extends `DslS3` with `box.NullableListOfNullable`
case object `dsl.set<s3>?` extends `DslS3` with `box.NullableSetOfOne`
case object `dsl.set<s3?>?` extends `DslS3` with `box.NullableSetOfNullable`
