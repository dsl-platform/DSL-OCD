package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaDecimalWithScaleOf9
    extends OcdJavaBoxType
    with `type.Decimal(9)` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
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

case object `java.Queue<Decimal(9)>`
    extends JavaDecimalWithScaleOf9 with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneQueueOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Decimal(9)>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableQueueOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Decimal(9)?>`
    extends JavaDecimalWithScaleOf9 with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneQueueOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
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

case object `java.Queue<Decimal(9)?>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableQueueOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
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

case object `java.LinkedList<Decimal(9)>`
    extends JavaDecimalWithScaleOf9 with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneLinkedListOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Decimal(9)>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableLinkedListOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Decimal(9)?>`
    extends JavaDecimalWithScaleOf9 with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneLinkedListOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
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

case object `java.LinkedList<Decimal(9)?>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableLinkedListOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
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

case object `java.Stack<Decimal(9)>`
    extends JavaDecimalWithScaleOf9 with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneStackOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Decimal(9)>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableStackOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Decimal(9)?>`
    extends JavaDecimalWithScaleOf9 with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneStackOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
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

case object `java.Stack<Decimal(9)?>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableStackOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
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

case object `java.Vector<Decimal(9)>`
    extends JavaDecimalWithScaleOf9 with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneVectorOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Decimal(9)>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableVectorOfOneDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Decimal(9)?>`
    extends JavaDecimalWithScaleOf9 with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneVectorOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
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

case object `java.Vector<Decimal(9)?>?`
    extends JavaDecimalWithScaleOf9 with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableVectorOfNullableDecimalsWithScaleOf9"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(9)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(9, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-9\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
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
