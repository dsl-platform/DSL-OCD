package com.dslplatform.ocd
package scalas

import types._
import boxes._

sealed trait ScalaDouble
    extends OcdScala
    with `type.Double`

case object `scala.Double`
    extends ScalaDouble with `box.One` {

  val scalaClass = "Double"

  val defaultValue = "0.0"
}

case object `scala.Double[]`
    extends ScalaDouble with `box.OneArrayOfOne` {

  val scalaClass = "Array[Double]"

  val defaultValue = "Array[Double].empty"
}

case object `scala.Double?[]`
    extends ScalaDouble with `box.OneArrayOfNullable` {

  val scalaClass = "Array[Option[Double]]"

  val defaultValue = "Array[Option[Double]].empty"
}

case object `scala.List<Double>`
    extends ScalaDouble with `box.OneListOfOne` {

  val scalaClass = "List[Double]"

  val defaultValue = "List[Double].empty"
}

case object `scala.List<Double?>`
    extends ScalaDouble with `box.OneListOfNullable` {

  val scalaClass = "List[Option[Double]]"

  val defaultValue = "List[Option[Double]].empty"
}

case object `scala.Set<Double>`
    extends ScalaDouble with `box.OneSetOfOne` {

  val scalaClass = "Set[Double]"

  val defaultValue = "Set[Double].empty"
}

case object `scala.Set<Double?>`
    extends ScalaDouble with `box.OneSetOfNullable` {

  val scalaClass = "Set[Option[Double]]"

  val defaultValue = "Set[Option[Double]].empty"
}

case object `scala.Double?`
    extends ScalaDouble with `box.Nullable` {

  val scalaClass = "Option[Double]"

  val defaultValue = "None"
}

case object `scala.Double[]?`
    extends ScalaDouble with `box.NullableArrayOfOne` {

  val scalaClass = "Option[Array[Double]]"

  val defaultValue = "None"
}

case object `scala.Double?[]?`
    extends ScalaDouble with `box.NullableArrayOfNullable` {

  val scalaClass = "Option[Array[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.List<Double>?`
    extends ScalaDouble with `box.NullableListOfOne` {

  val scalaClass = "Option[List[Double]]"

  val defaultValue = "None"
}

case object `scala.List<Double?>?`
    extends ScalaDouble with `box.NullableListOfNullable` {

  val scalaClass = "Option[List[Option[Double]]]"

  val defaultValue = "None"
}

case object `scala.Set<Double>?`
    extends ScalaDouble with `box.NullableSetOfOne` {

  val scalaClass = "Option[Set[Double]]"

  val defaultValue = "None"
}

case object `scala.Set<Double?>?`
    extends ScalaDouble with `box.NullableSetOfNullable` {

  val scalaClass = "Option[Set[Option[Double]]]"

  val defaultValue = "None"
}
