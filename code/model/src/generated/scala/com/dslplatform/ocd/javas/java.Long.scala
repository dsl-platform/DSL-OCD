package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaLong`
    extends OcdJava
    with `type.Long`

case object `java.Long`
    extends `JavaLong` with `box.One` {

  val javaClass = "long"

  val defaultValue = "0L"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Long[]`
    extends `JavaLong` with `box.OneArrayOfOne` {

  val javaClass = "long[]"

  val defaultValue = "new long[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Long?[]`
    extends `JavaLong` with `box.OneArrayOfNullable` {

  val javaClass = "Long[0]"

  val defaultValue = "new Long[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Long>`
    extends `JavaLong` with `box.OneListOfOne` {

  val javaClass = "java.util.List<Long>"

  val defaultValue = "new java.util.ArrayList<Long>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Long?>`
    extends `JavaLong` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Long>"

  val defaultValue = "new java.util.ArrayList<Long>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Long>`
    extends `JavaLong` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Long>"

  val defaultValue = "new java.util.HashSet<Long>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Long?>`
    extends `JavaLong` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Long>"

  val defaultValue = "new java.util.HashSet<Long>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Long?`
    extends `JavaLong` with `box.Nullable` {

  val javaClass = "Long"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Long[]?`
    extends `JavaLong` with `box.NullableArrayOfOne` {

  val javaClass = "long[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Long?[]?`
    extends `JavaLong` with `box.NullableArrayOfNullable` {

  val javaClass = "Long[0]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Long>?`
    extends `JavaLong` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Long>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Long?>?`
    extends `JavaLong` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Long>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Long>?`
    extends `JavaLong` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Long>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Long?>?`
    extends `JavaLong` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Long>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}
