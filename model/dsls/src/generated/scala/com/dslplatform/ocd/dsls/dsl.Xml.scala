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
case object `dsl.Set<Xml>`     extends DslXml with `box.OneSetOfOne`
case object `dsl.Set<Xml>?`    extends DslXml with `box.NullableSetOfOne`
case object `dsl.Set<Xml?>`    extends DslXml with `box.OneSetOfNullable`
case object `dsl.Set<Xml?>?`   extends DslXml with `box.NullableSetOfNullable`
