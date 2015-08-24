package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaMoney
    extends OcdJavaBoxType
    with `type.Money` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Money`
    extends JavaMoney with `box.One` {

  val javaClass = "java.math.BigDecimal"
  val javaType = JavaSimpleType("java.math.BigDecimal")
  val javaDescription = "OneMoney"

  def defaultValue = SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.math.BigDecimal.ONE")
  , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
  , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
  , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
  )

  val hasGenerics = false
}

case object `java.Money?`
    extends JavaMoney with `box.Nullable` {

  val javaClass = "java.math.BigDecimal"
  val javaType = JavaSimpleType("java.math.BigDecimal")
  val javaDescription = "NullableMoney"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
  , SingleJavaValue("java.math.BigDecimal.ONE")
  , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
  , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
  , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
  )

  val hasGenerics = false
}

case object `java.Money[]`
    extends JavaMoney with `box.OneArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "OneArrayOfOneMonies"

  def defaultValue = SingleJavaValue("new java.math.BigDecimal[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.Money[]?`
    extends JavaMoney with `box.NullableArrayOfOne` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "NullableArrayOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.Money?[]`
    extends JavaMoney with `box.OneArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "OneArrayOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.math.BigDecimal[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.Money?[]?`
    extends JavaMoney with `box.NullableArrayOfNullable` {

  val javaClass = "java.math.BigDecimal[]"
  val javaType = JavaSimpleType("java.math.BigDecimal[]")
  val javaDescription = "NullableArrayOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ArrayOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = false
}

case object `java.List<Money>`
    extends JavaMoney with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneListOfOneMonies"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Money>?`
    extends JavaMoney with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableListOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Money?>`
    extends JavaMoney with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneListOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.List<Money?>?`
    extends JavaMoney with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableListOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , ListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Money>`
    extends JavaMoney with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneSetOfOneMonies"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Money>?`
    extends JavaMoney with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableSetOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Money?>`
    extends JavaMoney with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneSetOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Money?>?`
    extends JavaMoney with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableSetOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , SetOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Money>`
    extends JavaMoney with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneQueueOfOneMonies"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Money>?`
    extends JavaMoney with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableQueueOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Money?>`
    extends JavaMoney with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneQueueOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Money?>?`
    extends JavaMoney with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableQueueOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , QueueOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Money>`
    extends JavaMoney with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneLinkedListOfOneMonies"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Money>?`
    extends JavaMoney with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableLinkedListOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Money?>`
    extends JavaMoney with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneLinkedListOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Money?>?`
    extends JavaMoney with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableLinkedListOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , LinkedListOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Money>`
    extends JavaMoney with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneStackOfOneMonies"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Money>?`
    extends JavaMoney with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableStackOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Money?>`
    extends JavaMoney with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneStackOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.math.BigDecimal>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Money?>?`
    extends JavaMoney with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableStackOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , StackOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Money>`
    extends JavaMoney with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneVectorOfOneMonies"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Money>?`
    extends JavaMoney with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableVectorOfOneMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Money?>`
    extends JavaMoney with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "OneVectorOfNullableMonies"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.math.BigDecimal>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Money?>?`
    extends JavaMoney with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<java.math.BigDecimal>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.math.BigDecimal"))
  val javaDescription = "NullableVectorOfNullableMonies"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  , VectorOfJavaValues("java.math.BigDecimal",
      SingleJavaValue("null")
    , SingleJavaValue("java.math.BigDecimal.ZERO.setScale(2)")
    , SingleJavaValue("java.math.BigDecimal.ONE")
    , SingleJavaValue("new java.math.BigDecimal(\"3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679\").setScale(2, java.math.BigDecimal.ROUND_HALF_UP)")
    , SingleJavaValue("new java.math.BigDecimal(\"-1E-2\")")
    , SingleJavaValue("new java.math.BigDecimal(\"1E19\")")
    )
  )

  val hasGenerics = true
}
