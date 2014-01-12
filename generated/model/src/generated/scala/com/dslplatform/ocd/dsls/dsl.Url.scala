package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslUrl
    extends OcdDsl
    with `type.Url`

case object `dsl.Url`          extends DslUrl with `box.One`
case object `dsl.Array<Url>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.Url[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.Array<Url?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.Url?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.List<Url>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.List<Url?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.Set<Url>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.Set<Url?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.Url?`         extends DslUrl with `box.Nullable`
case object `dsl.Array<Url>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.Url[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.Array<Url?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.Url?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.List<Url>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.List<Url?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.Set<Url>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.Set<Url?>?`   extends DslUrl with `box.NullableSetOfNullable`

case object `dsl.LINK`          extends DslUrl with `box.One`
case object `dsl.ARRAY<LINK>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.LINK[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.ARRAY<LINK?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.LINK?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.LIST<LINK>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.LIST<LINK?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.SET<LINK>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.SET<LINK?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.LINK?`         extends DslUrl with `box.Nullable`
case object `dsl.ARRAY<LINK>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.LINK[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<LINK?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.LINK?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.LIST<LINK>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.LIST<LINK?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.SET<LINK>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.SET<LINK?>?`   extends DslUrl with `box.NullableSetOfNullable`

case object `dsl.Link`          extends DslUrl with `box.One`
case object `dsl.Array<Link>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.Link[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.Array<Link?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.Link?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.List<Link>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.List<Link?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.Set<Link>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.Set<Link?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.Link?`         extends DslUrl with `box.Nullable`
case object `dsl.Array<Link>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.Link[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.Array<Link?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.Link?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.List<Link>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.List<Link?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.Set<Link>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.Set<Link?>?`   extends DslUrl with `box.NullableSetOfNullable`

case object `dsl.URL`          extends DslUrl with `box.One`
case object `dsl.ARRAY<URL>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.URL[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.ARRAY<URL?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.URL?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.LIST<URL>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.LIST<URL?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.SET<URL>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.SET<URL?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.URL?`         extends DslUrl with `box.Nullable`
case object `dsl.ARRAY<URL>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.URL[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<URL?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.URL?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.LIST<URL>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.LIST<URL?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.SET<URL>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.SET<URL?>?`   extends DslUrl with `box.NullableSetOfNullable`

case object `dsl.link`          extends DslUrl with `box.One`
case object `dsl.array<link>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.link[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.array<link?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.link?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.list<link>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.list<link?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.set<link>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.set<link?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.link?`         extends DslUrl with `box.Nullable`
case object `dsl.array<link>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.link[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.array<link?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.link?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.list<link>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.list<link?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.set<link>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.set<link?>?`   extends DslUrl with `box.NullableSetOfNullable`

case object `dsl.url`          extends DslUrl with `box.One`
case object `dsl.array<url>`   extends DslUrl with `box.OneArrayOfOne`
case object `dsl.url[]`        extends DslUrl with `box.OneBracketsOfOne`
case object `dsl.array<url?>`  extends DslUrl with `box.OneArrayOfNullable`
case object `dsl.url?[]`       extends DslUrl with `box.OneBracketsOfNullable`
case object `dsl.list<url>`    extends DslUrl with `box.OneListOfOne`
case object `dsl.list<url?>`   extends DslUrl with `box.OneListOfNullable`
case object `dsl.set<url>`     extends DslUrl with `box.OneSetOfOne`
case object `dsl.set<url?>`    extends DslUrl with `box.OneSetOfNullable`
case object `dsl.url?`         extends DslUrl with `box.Nullable`
case object `dsl.array<url>?`  extends DslUrl with `box.NullableArrayOfOne`
case object `dsl.url[]?`       extends DslUrl with `box.NullableBracketsOfOne`
case object `dsl.array<url?>?` extends DslUrl with `box.NullableArrayOfNullable`
case object `dsl.url?[]?`      extends DslUrl with `box.NullableBracketsOfNullable`
case object `dsl.list<url>?`   extends DslUrl with `box.NullableListOfOne`
case object `dsl.list<url?>?`  extends DslUrl with `box.NullableListOfNullable`
case object `dsl.set<url>?`    extends DslUrl with `box.NullableSetOfOne`
case object `dsl.set<url?>?`   extends DslUrl with `box.NullableSetOfNullable`
