package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaMoney
    extends OcdJava
    with `type.Money`

case object `java.Money`
    extends JavaMoney with `box.One` {

  val javaClass = "java.math.BigDecimal"

  val defaultValue = "java.math.BigDecimal.ZERO.setScale(2)"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Money[]`
    extends JavaMoney with `box.OneArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "new java.math.BigDecimal[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Money?[]`
    extends JavaMoney with `box.OneArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "new java.math.BigDecimal[0]"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Money>`
    extends JavaMoney with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "new java.util.ArrayList<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Money?>`
    extends JavaMoney with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "new java.util.ArrayList<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Money>`
    extends JavaMoney with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "new java.util.HashSet<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Money?>`
    extends JavaMoney with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "new java.util.HashSet<java.math.BigDecimal>(0)"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Money?`
    extends JavaMoney with `box.Nullable` {

  val javaClass = "java.math.BigDecimal"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Money[]?`
    extends JavaMoney with `box.NullableArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.Money?[]?`
    extends JavaMoney with `box.NullableArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = false
}

case object `java.List<Money>?`
    extends JavaMoney with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.List<Money?>?`
    extends JavaMoney with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Money>?`
    extends JavaMoney with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}

case object `java.Set<Money?>?`
    extends JavaMoney with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"

  val defaultValue = "null"

  val isPrimitive = false
  val hasGenerics = true
}
