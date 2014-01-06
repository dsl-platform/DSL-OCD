package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaGuid`
    extends OcdJava
    with `type.Guid`

case object `java.Guid`
    extends `JavaGuid` with `box.One` {

  val javaClass = "java.util.UUID"

  val defaultValue = "java.util.UUID.randomUUID()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Guid[]`
    extends `JavaGuid` with `box.OneArrayOfOne` {

  val javaClass = "java.util.UUID[]"

  val defaultValue = "new java.util.UUID[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Guid?[]`
    extends `JavaGuid` with `box.OneArrayOfNullable` {

  val javaClass = "java.util.UUID[0]"

  val defaultValue = "new java.util.UUID[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Guid>`
    extends `JavaGuid` with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.util.UUID>"

  val defaultValue = "new java.util.ArrayList<java.util.UUID>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Guid?>`
    extends `JavaGuid` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.util.UUID>"

  val defaultValue = "new java.util.ArrayList<java.util.UUID>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Guid>`
    extends `JavaGuid` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.util.UUID>"

  val defaultValue = "new java.util.HashSet<java.util.UUID>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Guid?>`
    extends `JavaGuid` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.util.UUID>"

  val defaultValue = "new java.util.HashSet<java.util.UUID>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Guid?`
    extends `JavaGuid` with `box.Nullable` {

  val javaClass = "java.util.UUID"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Guid[]?`
    extends `JavaGuid` with `box.NullableArrayOfOne` {

  val javaClass = "java.util.UUID[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Guid?[]?`
    extends `JavaGuid` with `box.NullableArrayOfNullable` {

  val javaClass = "java.util.UUID[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Guid>?`
    extends `JavaGuid` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.util.UUID>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Guid?>?`
    extends `JavaGuid` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.util.UUID>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Guid>?`
    extends `JavaGuid` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.util.UUID>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Guid?>?`
    extends `JavaGuid` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.util.UUID>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
