package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait `JavaDecimal`
    extends OcdJava
    with `type.Decimal`

case object `java.Decimal`
    extends `JavaDecimal` with `box.One` {

  val javaClass = "java.math.BigDecimal"

  val defaultValue = "java.math.BigDecimal.ZERO"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal[]`
    extends `JavaDecimal` with `box.OneArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "new java.math.BigDecimal[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal?[]`
    extends `JavaDecimal` with `box.OneArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[0]"

  val defaultValue = "new java.math.BigDecimal[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Decimal>`
    extends `JavaDecimal` with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "new java.util.ArrayList<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Decimal?>`
    extends `JavaDecimal` with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "new java.util.ArrayList<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal>`
    extends `JavaDecimal` with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "new java.util.HashSet<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal?>`
    extends `JavaDecimal` with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "new java.util.HashSet<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Decimal?`
    extends `JavaDecimal` with `box.Nullable` {

  val javaClass = "java.math.BigDecimal"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal[]?`
    extends `JavaDecimal` with `box.NullableArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Decimal?[]?`
    extends `JavaDecimal` with `box.NullableArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[0]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Decimal>?`
    extends `JavaDecimal` with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Decimal?>?`
    extends `JavaDecimal` with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal>?`
    extends `JavaDecimal` with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Decimal?>?`
    extends `JavaDecimal` with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
