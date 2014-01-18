package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaBinary
    extends OcdJava
    with `type.Binary`

case object `java.Binary`
    extends JavaBinary with `box.One` {

  val javaClass = "byte[]"

  val defaultValue = "new byte[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Binary[]`
    extends JavaBinary with `box.OneArrayOfOne` {

  val javaClass = "byte[][]"

  val defaultValue = "new byte[0][]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Binary?[]`
    extends JavaBinary with `box.OneArrayOfNullable` {

  val javaClass = "byte[][]"

  val defaultValue = "new byte[0][]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Binary>`
    extends JavaBinary with `box.OneListOfOne` {

  val javaClass = "java.util.List<byte[]>"

  val defaultValue = "new java.util.ArrayList<byte[]>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Binary?>`
    extends JavaBinary with `box.OneListOfNullable` {

  val javaClass = "java.util.List<byte[]>"

  val defaultValue = "new java.util.ArrayList<byte[]>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Binary>`
    extends JavaBinary with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<byte[]>"

  val defaultValue = "new java.util.HashSet<byte[]>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Binary?>`
    extends JavaBinary with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<byte[]>"

  val defaultValue = "new java.util.HashSet<byte[]>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Binary?`
    extends JavaBinary with `box.Nullable` {

  val javaClass = "byte[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Binary[]?`
    extends JavaBinary with `box.NullableArrayOfOne` {

  val javaClass = "byte[][]"

  val defaultValue = "new byte[0][]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Binary?[]?`
    extends JavaBinary with `box.NullableArrayOfNullable` {

  val javaClass = "byte[][]"

  val defaultValue = "new byte[0][]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Binary>?`
    extends JavaBinary with `box.NullableListOfOne` {

  val javaClass = "java.util.List<byte[]>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Binary?>?`
    extends JavaBinary with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<byte[]>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Binary>?`
    extends JavaBinary with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<byte[]>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Binary?>?`
    extends JavaBinary with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<byte[]>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
