package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaXml
    extends OcdScala
    with `type.Xml`

case object `scala.Xml`
    extends ScalaXml with `box.One` {

  val scalaClass = "scala.xml.Elem"

  val defaultValue = "null"
}

case object `scala.Xml[]`
    extends ScalaXml with `box.OneArrayOfOne` {

  val scalaClass = "Array[scala.xml.Elem]"

  val defaultValue = "Array[scala.xml.Elem].empty"
}

case object `scala.Xml?[]`
    extends ScalaXml with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[scala.xml.Elem]]"

  val defaultValue = "Array[Option[scala.xml.Elem]].empty"
}

case object `scala.List<Xml>`
    extends ScalaXml with `box.OneListOfOne` {

  val scalaClass = "IndexedSeq[scala.xml.Elem]"

  val defaultValue = "IndexedSeq[scala.xml.Elem].empty"
}

case object `scala.List<Xml?>`
    extends ScalaXml with `box.OneListOfNullable` {

  val scalaClass = "IndexedSeq[Option[scala.xml.Elem]]"

  val defaultValue = "IndexedSeq[Option[scala.xml.Elem]].empty"
}

case object `scala.Set<Xml>`
    extends ScalaXml with `box.OneSetOfOne` {

  val scalaClass = "Set[scala.xml.Elem]"

  val defaultValue = "Set[scala.xml.Elem].empty"
}

case object `scala.Set<Xml?>`
    extends ScalaXml with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[scala.xml.Elem]]"

  val defaultValue = "Set[Option[scala.xml.Elem]].empty"
}

case object `scala.Xml?`
    extends ScalaXml with `box.Nullable` {

  val scalaClass = "Option[scala.xml.Elem]"

  val defaultValue = "None"
}

case object `scala.Xml[]?`
    extends ScalaXml with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Xml?[]?`
    extends ScalaXml with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.List<Xml>?`
    extends ScalaXml with `box.NullableListOfOne` {

  val scalaClass = "Option[IndexedSeq[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.List<Xml?>?`
    extends ScalaXml with `box.NullableListOfNullable` {

  val scalaClass = "Option[IndexedSeq[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}

case object `scala.Set<Xml>?`
    extends ScalaXml with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[scala.xml.Elem]]"

  val defaultValue = "None"
}

case object `scala.Set<Xml?>?`
    extends ScalaXml with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[scala.xml.Elem]]]"

  val defaultValue = "None"
}
