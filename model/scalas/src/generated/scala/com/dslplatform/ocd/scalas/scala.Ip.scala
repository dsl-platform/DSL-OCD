package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaIp
    extends OcdScalaBoxType
    with `type.Ip`

case object `scala.Ip`
    extends ScalaIp with `box.One` {

  val scalaClass = "java.net.InetAddress"

  val defaultValue = "null"
}

case object `scala.Ip?`
    extends ScalaIp with `box.Nullable` {

  val scalaClass = "Option[java.net.InetAddress]"

  val defaultValue = "None"
}

case object `scala.Ip[]`
    extends ScalaIp with `box.OneArrayOfOne` {

  val scalaClass = "Array[java.net.InetAddress]"

  val defaultValue = "Array[java.net.InetAddress].empty"
}

case object `scala.Ip[]?`
    extends ScalaIp with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Ip?[]`
    extends ScalaIp with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[java.net.InetAddress]]"

  val defaultValue = "Array[Option[java.net.InetAddress]].empty"
}

case object `scala.Ip?[]?`
    extends ScalaIp with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.List<Ip>`
    extends ScalaIp with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[java.net.InetAddress]"

  val defaultValue = "IndexedSeq[java.net.InetAddress].empty"
}

case object `scala.List<Ip>?`
    extends ScalaIp with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.List<Ip?>`
    extends ScalaIp with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[java.net.InetAddress]]"

  val defaultValue = "IndexedSeq[Option[java.net.InetAddress]].empty"
}

case object `scala.List<Ip?>?`
    extends ScalaIp with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}

case object `scala.Set<Ip>`
    extends ScalaIp with `box.OneSetOfOne` {

  val scalaClass = "Set[java.net.InetAddress]"

  val defaultValue = "Set[java.net.InetAddress].empty"
}

case object `scala.Set<Ip>?`
    extends ScalaIp with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[java.net.InetAddress]]"

  val defaultValue = "None"
}

case object `scala.Set<Ip?>`
    extends ScalaIp with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[java.net.InetAddress]]"

  val defaultValue = "Set[Option[java.net.InetAddress]].empty"
}

case object `scala.Set<Ip?>?`
    extends ScalaIp with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[java.net.InetAddress]]]"

  val defaultValue = "None"
}
