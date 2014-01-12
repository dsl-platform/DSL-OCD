package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaIp
    extends OcdJava
    with `type.Ip`

case object `java.Ip`
    extends JavaIp with `box.One` {

  val javaClass = "java.net.InetAddress"

  val defaultValue = "java.net.InetAddress.getLoopbackAddress()"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Ip[]`
    extends JavaIp with `box.OneArrayOfOne` {

  val javaClass = "java.net.InetAddress[]"

  val defaultValue = "new java.net.InetAddress[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Ip?[]`
    extends JavaIp with `box.OneArrayOfNullable` {

  val javaClass = "java.net.InetAddress[]"

  val defaultValue = "new java.net.InetAddress[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Ip>`
    extends JavaIp with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.net.InetAddress>"

  val defaultValue = "new java.util.ArrayList<java.net.InetAddress>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Ip?>`
    extends JavaIp with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.net.InetAddress>"

  val defaultValue = "new java.util.ArrayList<java.net.InetAddress>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Ip>`
    extends JavaIp with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.net.InetAddress>"

  val defaultValue = "new java.util.HashSet<java.net.InetAddress>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Ip?>`
    extends JavaIp with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.net.InetAddress>"

  val defaultValue = "new java.util.HashSet<java.net.InetAddress>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Ip?`
    extends JavaIp with `box.Nullable` {

  val javaClass = "java.net.InetAddress"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Ip[]?`
    extends JavaIp with `box.NullableArrayOfOne` {

  val javaClass = "java.net.InetAddress[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Ip?[]?`
    extends JavaIp with `box.NullableArrayOfNullable` {

  val javaClass = "java.net.InetAddress[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Ip>?`
    extends JavaIp with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.net.InetAddress>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Ip?>?`
    extends JavaIp with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.net.InetAddress>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Ip>?`
    extends JavaIp with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.net.InetAddress>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Ip?>?`
    extends JavaIp with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.net.InetAddress>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
