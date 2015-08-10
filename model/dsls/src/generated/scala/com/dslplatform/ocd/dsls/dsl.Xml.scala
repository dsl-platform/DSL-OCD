package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslXml
    extends OcdDslBoxType
    with `type.Xml`

case object `dsl.Xml`          extends DslXml with `box.One`
case object `dsl.Xml?`         extends DslXml with `box.Nullable`
case object `dsl.Array<Xml>`   extends DslXml with `box.OneArrayOfOne`
case object `dsl.Xml[]`        extends DslXml with `box.OneBracketsOfOne`
case object `dsl.Array<Xml>?`  extends DslXml with `box.NullableArrayOfOne`
case object `dsl.Xml[]?`       extends DslXml with `box.NullableBracketsOfOne`
case object `dsl.Array<Xml?>`  extends DslXml with `box.OneArrayOfNullable`
case object `dsl.Xml?[]`       extends DslXml with `box.OneBracketsOfNullable`
case object `dsl.Array<Xml?>?` extends DslXml with `box.NullableArrayOfNullable`
case object `dsl.Xml?[]?`      extends DslXml with `box.NullableBracketsOfNullable`
case object `dsl.List<Xml>`    extends DslXml with `box.OneListOfOne`
case object `dsl.List<Xml>?`   extends DslXml with `box.NullableListOfOne`
case object `dsl.List<Xml?>`   extends DslXml with `box.OneListOfNullable`
case object `dsl.List<Xml?>?`  extends DslXml with `box.NullableListOfNullable`
case object `dsl.Queue<Xml>`   extends DslXml with `box.OneQueueOfOne`
case object `dsl.Queue<Xml>?`  extends DslXml with `box.NullableQueueOfOne`
case object `dsl.Queue<Xml?>`  extends DslXml with `box.OneQueueOfNullable`
case object `dsl.Queue<Xml?>?` extends DslXml with `box.NullableQueueOfNullable`
case object `dsl.Set<Xml>`     extends DslXml with `box.OneSetOfOne`
case object `dsl.Set<Xml>?`    extends DslXml with `box.NullableSetOfOne`
case object `dsl.Set<Xml?>`    extends DslXml with `box.OneSetOfNullable`
case object `dsl.Set<Xml?>?`   extends DslXml with `box.NullableSetOfNullable`

case object `dsl.XML`          extends DslXml with `box.One`
case object `dsl.XML?`         extends DslXml with `box.Nullable`
case object `dsl.ARRAY<XML>`   extends DslXml with `box.OneArrayOfOne`
case object `dsl.XML[]`        extends DslXml with `box.OneBracketsOfOne`
case object `dsl.ARRAY<XML>?`  extends DslXml with `box.NullableArrayOfOne`
case object `dsl.XML[]?`       extends DslXml with `box.NullableBracketsOfOne`
case object `dsl.ARRAY<XML?>`  extends DslXml with `box.OneArrayOfNullable`
case object `dsl.XML?[]`       extends DslXml with `box.OneBracketsOfNullable`
case object `dsl.ARRAY<XML?>?` extends DslXml with `box.NullableArrayOfNullable`
case object `dsl.XML?[]?`      extends DslXml with `box.NullableBracketsOfNullable`
case object `dsl.LIST<XML>`    extends DslXml with `box.OneListOfOne`
case object `dsl.LIST<XML>?`   extends DslXml with `box.NullableListOfOne`
case object `dsl.LIST<XML?>`   extends DslXml with `box.OneListOfNullable`
case object `dsl.LIST<XML?>?`  extends DslXml with `box.NullableListOfNullable`
case object `dsl.QUEUE<XML>`   extends DslXml with `box.OneQueueOfOne`
case object `dsl.QUEUE<XML>?`  extends DslXml with `box.NullableQueueOfOne`
case object `dsl.QUEUE<XML?>`  extends DslXml with `box.OneQueueOfNullable`
case object `dsl.QUEUE<XML?>?` extends DslXml with `box.NullableQueueOfNullable`
case object `dsl.SET<XML>`     extends DslXml with `box.OneSetOfOne`
case object `dsl.SET<XML>?`    extends DslXml with `box.NullableSetOfOne`
case object `dsl.SET<XML?>`    extends DslXml with `box.OneSetOfNullable`
case object `dsl.SET<XML?>?`   extends DslXml with `box.NullableSetOfNullable`

case object `dsl.xml`          extends DslXml with `box.One`
case object `dsl.xml?`         extends DslXml with `box.Nullable`
case object `dsl.array<xml>`   extends DslXml with `box.OneArrayOfOne`
case object `dsl.xml[]`        extends DslXml with `box.OneBracketsOfOne`
case object `dsl.array<xml>?`  extends DslXml with `box.NullableArrayOfOne`
case object `dsl.xml[]?`       extends DslXml with `box.NullableBracketsOfOne`
case object `dsl.array<xml?>`  extends DslXml with `box.OneArrayOfNullable`
case object `dsl.xml?[]`       extends DslXml with `box.OneBracketsOfNullable`
case object `dsl.array<xml?>?` extends DslXml with `box.NullableArrayOfNullable`
case object `dsl.xml?[]?`      extends DslXml with `box.NullableBracketsOfNullable`
case object `dsl.list<xml>`    extends DslXml with `box.OneListOfOne`
case object `dsl.list<xml>?`   extends DslXml with `box.NullableListOfOne`
case object `dsl.list<xml?>`   extends DslXml with `box.OneListOfNullable`
case object `dsl.list<xml?>?`  extends DslXml with `box.NullableListOfNullable`
case object `dsl.queue<xml>`   extends DslXml with `box.OneQueueOfOne`
case object `dsl.queue<xml>?`  extends DslXml with `box.NullableQueueOfOne`
case object `dsl.queue<xml?>`  extends DslXml with `box.OneQueueOfNullable`
case object `dsl.queue<xml?>?` extends DslXml with `box.NullableQueueOfNullable`
case object `dsl.set<xml>`     extends DslXml with `box.OneSetOfOne`
case object `dsl.set<xml>?`    extends DslXml with `box.NullableSetOfOne`
case object `dsl.set<xml?>`    extends DslXml with `box.OneSetOfNullable`
case object `dsl.set<xml?>?`   extends DslXml with `box.NullableSetOfNullable`
