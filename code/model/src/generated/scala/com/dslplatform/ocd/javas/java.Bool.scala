package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaBool`
    extends OcdJava
    with `type.Bool`

case object `java.Bool`
    extends `JavaBool` with `box.One` {

  val javaClass = "boolean"

  val defaultValue = "false"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Bool[]`
    extends `JavaBool` with `box.OneArrayOfOne` {

  val javaClass = "boolean[]"

  val defaultValue = "new boolean[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Bool?[]`
    extends `JavaBool` with `box.OneArrayOfNullable` {

  val javaClass = "Boolean[0]"

  val defaultValue = "new Boolean[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Bool>`
    extends `JavaBool` with `box.OneListOfOne` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "new java.util.ArrayList<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Bool?>`
    extends `JavaBool` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "new java.util.ArrayList<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Bool>`
    extends `JavaBool` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "new java.util.HashSet<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Bool?>`
    extends `JavaBool` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "new java.util.HashSet<Boolean>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Bool?`
    extends `JavaBool` with `box.Nullable` {

  val javaClass = "Boolean"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Bool[]?`
    extends `JavaBool` with `box.NullableArrayOfOne` {

  val javaClass = "boolean[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Bool?[]?`
    extends `JavaBool` with `box.NullableArrayOfNullable` {

  val javaClass = "Boolean[0]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Bool>?`
    extends `JavaBool` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Bool?>?`
    extends `JavaBool` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Bool>?`
    extends `JavaBool` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Bool?>?`
    extends `JavaBool` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Boolean>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}
