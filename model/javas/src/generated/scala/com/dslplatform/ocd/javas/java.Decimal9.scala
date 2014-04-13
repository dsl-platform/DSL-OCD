package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed trait JavaDecimalWithScaleOf9
    extends OcdJavaBoxType
    with `type.Decimal(9)` {

  val isPrecise = false
  val isPrimitive = false
}

case object `java.Decimal(9)`
    extends JavaDecimalWithScaleOf9 with `box.One` {

  val javaClass = "java.math.BigDecimal"
  val javaType = JavaSimpleType("java.math.BigDecimal")
  val javaDescription = "OneDecimalWithScaleOf9"

  def defaultValue = SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.math.BigDecimal.ONE")
  , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
  , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
  , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
  )

  val hasGenerics = false
}

case object `java.Decimal(9)?`
    extends JavaDecimalWithScaleOf9 with `box.Nullable` {

  val javaClass = "java.math.BigDecimal"
  val javaType = JavaSimpleType("java.math.BigDecimal")
  val javaDescription = "NullableDecimalWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
  , SingleJavaValue("java.math.BigDecimal.ONE")
  , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
  , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
  , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
  )

  val hasGenerics = false
}

case object `java.Decimal(9)[]`
    extends JavaDecimalWithScaleOf9 with `box.OneArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "OneArrayOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.math.BigDecimal[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.Decimal(9)[]?`
    extends JavaDecimalWithScaleOf9 with `box.NullableArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "NullableArrayOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.Decimal(9)?[]`
    extends JavaDecimalWithScaleOf9 with `box.OneArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "OneArrayOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.math.BigDecimal[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.Decimal(9)?[]?`
    extends JavaDecimalWithScaleOf9 with `box.NullableArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "NullableArrayOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.List<Decimal(9)>`
    extends JavaDecimalWithScaleOf9 with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneListOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Decimal(9)>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableListOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Decimal(9)?>`
    extends JavaDecimalWithScaleOf9 with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneListOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Decimal(9)?>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableListOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal(9)>`
    extends JavaDecimalWithScaleOf9 with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneSetOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal(9)>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableSetOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal(9)?>`
    extends JavaDecimalWithScaleOf9 with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneSetOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal(9)?>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableSetOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}
