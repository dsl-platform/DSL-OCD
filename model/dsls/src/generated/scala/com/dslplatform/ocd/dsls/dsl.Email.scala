package com.dslplatform.ocd
package dsls

import types._
import boxes._

sealed trait DslEmail
    extends OcdDslBoxType
    with `type.Email`

case object `dsl.Email`          extends DslEmail with `box.One`
case object `dsl.Email?`         extends DslEmail with `box.Nullable`
case object `dsl.Array<Email>`   extends DslEmail with `box.OneArrayOfOne`
case object `dsl.Email[]`        extends DslEmail with `box.OneBracketsOfOne`
case object `dsl.Array<Email>?`  extends DslEmail with `box.NullableArrayOfOne`
case object `dsl.Email[]?`       extends DslEmail with `box.NullableBracketsOfOne`
case object `dsl.Array<Email?>`  extends DslEmail with `box.OneArrayOfNullable`
case object `dsl.Email?[]`       extends DslEmail with `box.OneBracketsOfNullable`
case object `dsl.Array<Email?>?` extends DslEmail with `box.NullableArrayOfNullable`
case object `dsl.Email?[]?`      extends DslEmail with `box.NullableBracketsOfNullable`
case object `dsl.List<Email>`    extends DslEmail with `box.OneListOfOne`
case object `dsl.List<Email>?`   extends DslEmail with `box.NullableListOfOne`
case object `dsl.List<Email?>`   extends DslEmail with `box.OneListOfNullable`
case object `dsl.List<Email?>?`  extends DslEmail with `box.NullableListOfNullable`
case object `dsl.Set<Email>`     extends DslEmail with `box.OneSetOfOne`
case object `dsl.Set<Email>?`    extends DslEmail with `box.NullableSetOfOne`
case object `dsl.Set<Email?>`    extends DslEmail with `box.OneSetOfNullable`
case object `dsl.Set<Email?>?`   extends DslEmail with `box.NullableSetOfNullable`
