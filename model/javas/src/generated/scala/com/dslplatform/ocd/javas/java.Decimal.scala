package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaDecimal
    extends OcdJavaBoxType
    with `type.Decimal` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Decimal`
    extends JavaDecimal with `box.One` {

  val javaClass = "java.math.BigDecimal"
  val javaType = JavaSimpleType("java.math.BigDecimal")
  val javaDescription = "OneDecimal"

  def defaultValue = SingleJavaValue("java.math.BigDecimal.ZERO")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.math.BigDecimal.ONE")
  , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
  , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
  , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
  )

  val hasGenerics = false
}

case object `java.Decimal?`
    extends JavaDecimal with `box.Nullable` {

  val javaClass = "java.math.BigDecimal"
  val javaType = JavaSimpleType("java.math.BigDecimal")
  val javaDescription = "NullableDecimal"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.math.BigDecimal.ZERO")
  , SingleJavaValue("java.math.BigDecimal.ONE")
  , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
  , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
  , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
  )

  val hasGenerics = false
}

case object `java.Decimal[]`
    extends JavaDecimal with `box.OneArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "OneArrayOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.math.BigDecimal[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = false
}

case object `java.Decimal[]?`
    extends JavaDecimal with `box.NullableArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "NullableArrayOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = false
}

case object `java.Decimal?[]`
    extends JavaDecimal with `box.OneArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "OneArrayOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.math.BigDecimal[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = false
}

case object `java.Decimal?[]?`
    extends JavaDecimal with `box.NullableArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "NullableArrayOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = false
}

case object `java.List<Decimal>`
    extends JavaDecimal with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneListOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Decimal>?`
    extends JavaDecimal with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableListOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Decimal?>`
    extends JavaDecimal with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneListOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Decimal?>?`
    extends JavaDecimal with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableListOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal>`
    extends JavaDecimal with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneSetOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal>?`
    extends JavaDecimal with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableSetOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal?>`
    extends JavaDecimal with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneSetOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Decimal?>?`
    extends JavaDecimal with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableSetOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Decimal>`
    extends JavaDecimal with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneQueueOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Decimal>?`
    extends JavaDecimal with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableQueueOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Decimal?>`
    extends JavaDecimal with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneQueueOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Decimal?>?`
    extends JavaDecimal with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableQueueOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Decimal>`
    extends JavaDecimal with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneLinkedListOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Decimal>?`
    extends JavaDecimal with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableLinkedListOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Decimal?>`
    extends JavaDecimal with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneLinkedListOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Decimal?>?`
    extends JavaDecimal with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableLinkedListOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Decimal>`
    extends JavaDecimal with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneStackOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Decimal>?`
    extends JavaDecimal with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableStackOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Decimal?>`
    extends JavaDecimal with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneStackOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Decimal?>?`
    extends JavaDecimal with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableStackOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Decimal>`
    extends JavaDecimal with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneVectorOfOneDecimals"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Decimal>?`
    extends JavaDecimal with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableVectorOfOneDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Decimal?>`
    extends JavaDecimal with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneVectorOfNullableDecimals"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Decimal?>?`
    extends JavaDecimal with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableVectorOfNullableDecimals"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(28, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-28\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E28\")")
    )
  )

  val hasGenerics = true
}
