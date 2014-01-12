package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaDouble
    extends OcdJava
    with `type.Double`

case object `java.Double`
    extends JavaDouble with `box.One` {

  val javaClass = "double"

  val defaultValue = "0.0"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Double[]`
    extends JavaDouble with `box.OneArrayOfOne` {

  val javaClass = "double[]"

  val defaultValue = "new double[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Double?[]`
    extends JavaDouble with `box.OneArrayOfNullable` {

  val javaClass = "Double[]"

  val defaultValue = "new Double[0]"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Double>`
    extends JavaDouble with `box.OneListOfOne` {

  val javaClass = "java.util.List<Double>"

  val defaultValue = "new java.util.ArrayList<Double>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Double?>`
    extends JavaDouble with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Double>"

  val defaultValue = "new java.util.ArrayList<Double>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Double>`
    extends JavaDouble with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Double>"

  val defaultValue = "new java.util.HashSet<Double>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Double?>`
    extends JavaDouble with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Double>"

  val defaultValue = "new java.util.HashSet<Double>(0)"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Double?`
    extends JavaDouble with `box.Nullable` {

  val javaClass = "Double"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Double[]?`
    extends JavaDouble with `box.NullableArrayOfOne` {

  val javaClass = "double[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.Double?[]?`
    extends JavaDouble with `box.NullableArrayOfNullable` {

  val javaClass = "Double[]"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = false
}

case object `java.List<Double>?`
    extends JavaDouble with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Double>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.List<Double?>?`
    extends JavaDouble with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Double>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Double>?`
    extends JavaDouble with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Double>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}

case object `java.Set<Double?>?`
    extends JavaDouble with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Double>"

  val defaultValue = "null"

  val isPrimitive = true
  val hasGenerics = true
}
