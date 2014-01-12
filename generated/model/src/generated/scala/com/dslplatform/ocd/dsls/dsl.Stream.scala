package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslStream
    extends OcdDsl
    with `type.Stream`

case object `dsl.Stream`          extends DslStream with `box.One`
case object `dsl.Array<Stream>`   extends DslStream with `box.OneArrayOfOne`
case object `dsl.Stream[]`        extends DslStream with `box.OneBracketsOfOne`
case object `dsl.Array<Stream?>`  extends DslStream with `box.OneArrayOfNullable`
case object `dsl.Stream?[]`       extends DslStream with `box.OneBracketsOfNullable`
case object `dsl.List<Stream>`    extends DslStream with `box.OneListOfOne`
case object `dsl.List<Stream?>`   extends DslStream with `box.OneListOfNullable`
case object `dsl.Set<Stream>`     extends DslStream with `box.OneSetOfOne`
case object `dsl.Set<Stream?>`    extends DslStream with `box.OneSetOfNullable`
case object `dsl.Stream?`         extends DslStream with `box.Nullable`
case object `dsl.Array<Stream>?`  extends DslStream with `box.NullableArrayOfOne`
case object `dsl.Stream[]?`       extends DslStream with `box.NullableBracketsOfOne`
case object `dsl.Array<Stream?>?` extends DslStream with `box.NullableArrayOfNullable`
case object `dsl.Stream?[]?`      extends DslStream with `box.NullableBracketsOfNullable`
case object `dsl.List<Stream>?`   extends DslStream with `box.NullableListOfOne`
case object `dsl.List<Stream?>?`  extends DslStream with `box.NullableListOfNullable`
case object `dsl.Set<Stream>?`    extends DslStream with `box.NullableSetOfOne`
case object `dsl.Set<Stream?>?`   extends DslStream with `box.NullableSetOfNullable`

case object `dsl.STREAM`          extends DslStream with `box.One`
case object `dsl.ARRAY<STREAM>`   extends DslStream with `box.OneArrayOfOne`
case object `dsl.STREAM[]`        extends DslStream with `box.OneBracketsOfOne`
case object `dsl.ARRAY<STREAM?>`  extends DslStream with `box.OneArrayOfNullable`
case object `dsl.STREAM?[]`       extends DslStream with `box.OneBracketsOfNullable`
case object `dsl.LIST<STREAM>`    extends DslStream with `box.OneListOfOne`
case object `dsl.LIST<STREAM?>`   extends DslStream with `box.OneListOfNullable`
case object `dsl.SET<STREAM>`     extends DslStream with `box.OneSetOfOne`
case object `dsl.SET<STREAM?>`    extends DslStream with `box.OneSetOfNullable`
case object `dsl.STREAM?`         extends DslStream with `box.Nullable`
case object `dsl.ARRAY<STREAM>?`  extends DslStream with `box.NullableArrayOfOne`
case object `dsl.STREAM[]?`       extends DslStream with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<STREAM?>?` extends DslStream with `box.NullableArrayOfNullable`
case object `dsl.STREAM?[]?`      extends DslStream with `box.NullableBracketsOfNullable`
case object `dsl.LIST<STREAM>?`   extends DslStream with `box.NullableListOfOne`
case object `dsl.LIST<STREAM?>?`  extends DslStream with `box.NullableListOfNullable`
case object `dsl.SET<STREAM>?`    extends DslStream with `box.NullableSetOfOne`
case object `dsl.SET<STREAM?>?`   extends DslStream with `box.NullableSetOfNullable`

case object `dsl.stream`          extends DslStream with `box.One`
case object `dsl.array<stream>`   extends DslStream with `box.OneArrayOfOne`
case object `dsl.stream[]`        extends DslStream with `box.OneBracketsOfOne`
case object `dsl.array<stream?>`  extends DslStream with `box.OneArrayOfNullable`
case object `dsl.stream?[]`       extends DslStream with `box.OneBracketsOfNullable`
case object `dsl.list<stream>`    extends DslStream with `box.OneListOfOne`
case object `dsl.list<stream?>`   extends DslStream with `box.OneListOfNullable`
case object `dsl.set<stream>`     extends DslStream with `box.OneSetOfOne`
case object `dsl.set<stream?>`    extends DslStream with `box.OneSetOfNullable`
case object `dsl.stream?`         extends DslStream with `box.Nullable`
case object `dsl.array<stream>?`  extends DslStream with `box.NullableArrayOfOne`
case object `dsl.stream[]?`       extends DslStream with `box.NullableBracketsOfOne`
case object `dsl.array<stream?>?` extends DslStream with `box.NullableArrayOfNullable`
case object `dsl.stream?[]?`      extends DslStream with `box.NullableBracketsOfNullable`
case object `dsl.list<stream>?`   extends DslStream with `box.NullableListOfOne`
case object `dsl.list<stream?>?`  extends DslStream with `box.NullableListOfNullable`
case object `dsl.set<stream>?`    extends DslStream with `box.NullableSetOfOne`
case object `dsl.set<stream?>?`   extends DslStream with `box.NullableSetOfNullable`
