package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaDecimal(9)`
    extends OcdJava
    with `type.Decimal(9)`

case object `java.Decimal(9)`
    extends `JavaDecimal(9)` with `box.One` {

  val javaClass = "java.math.BigDecimal"

  val defaultValue = "java.math.BigDecimal.ZERO.setScale(9)"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal(9)[]`
    extends `JavaDecimal(9)` with `box.OneArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "new java.math.BigDecimal[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal(9)?[]`
    extends `JavaDecimal(9)` with `box.OneArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[0]"

  val defaultValue = "new java.math.BigDecimal[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Decimal(9)>`
    extends `JavaDecimal(9)` with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "new java.util.ArrayList<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Decimal(9)?>`
    extends `JavaDecimal(9)` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "new java.util.ArrayList<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal(9)>`
    extends `JavaDecimal(9)` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "new java.util.HashSet<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal(9)?>`
    extends `JavaDecimal(9)` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "new java.util.HashSet<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Decimal(9)?`
    extends `JavaDecimal(9)` with `box.Nullable` {

  val javaClass = "java.math.BigDecimal"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal(9)[]?`
    extends `JavaDecimal(9)` with `box.NullableArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal(9)?[]?`
    extends `JavaDecimal(9)` with `box.NullableArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Decimal(9)>?`
    extends `JavaDecimal(9)` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Decimal(9)?>?`
    extends `JavaDecimal(9)` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal(9)>?`
    extends `JavaDecimal(9)` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal(9)?>?`
    extends `JavaDecimal(9)` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
