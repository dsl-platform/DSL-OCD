package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaDouble
    extends OcdJavaBoxType
    with `type.Double` {

  val isPrecise = true
  val isPrimitive = true
  val isEqualable = true
}

case object `java.Double`
    extends JavaDouble with `box.One` {

  val javaClass = "double"
  val javaType = JavaSimpleType("double")
  val javaDescription = "OneDouble"

  def defaultValue = SingleJavaValue("0.0")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("1E-307")
  , SingleJavaValue("9E307")
  , SingleJavaValue("-1.23456789012345E-10")
  , SingleJavaValue("1.23456789012345E20")
  , SingleJavaValue("Double.NEGATIVE_INFINITY")
  , SingleJavaValue("Double.POSITIVE_INFINITY")
  , SingleJavaValue("Double.NaN")
  )

  val hasGenerics = false
}

case object `java.Double?`
    extends JavaDouble with `box.Nullable` {

  val javaClass = "Double"
  val javaType = JavaSimpleType("Double")
  val javaDescription = "NullableDouble"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("0.0")
  , SingleJavaValue("1E-307")
  , SingleJavaValue("9E307")
  , SingleJavaValue("-1.23456789012345E-10")
  , SingleJavaValue("1.23456789012345E20")
  , SingleJavaValue("Double.NEGATIVE_INFINITY")
  , SingleJavaValue("Double.POSITIVE_INFINITY")
  , SingleJavaValue("Double.NaN")
  )

  val hasGenerics = false
}

case object `java.Double[]`
    extends JavaDouble with `box.OneArrayOfOne` {

  val javaClass = "double[]"
  val javaType = JavaSimpleType("double[]")
  val javaDescription = "OneArrayOfOneDoubles"

  def defaultValue = SingleJavaValue("new double[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("double",
      SingleJavaValue("0.0")
    )
  , ArrayOfJavaValues("double",
      SingleJavaValue("Double.NaN")
    )
  , ArrayOfJavaValues("double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = false
}

case object `java.Double[]?`
    extends JavaDouble with `box.NullableArrayOfOne` {

  val javaClass = "double[]"
  val javaType = JavaSimpleType("double[]")
  val javaDescription = "NullableArrayOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("double",
      SingleJavaValue("0.0")
    )
  , ArrayOfJavaValues("double",
      SingleJavaValue("Double.NaN")
    )
  , ArrayOfJavaValues("double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = false
}

case object `java.Double?[]`
    extends JavaDouble with `box.OneArrayOfNullable` {

  val javaClass = "Double[]"
  val javaType = JavaSimpleType("Double[]")
  val javaDescription = "OneArrayOfNullableDoubles"

  def defaultValue = SingleJavaValue("new Double[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = false
}

case object `java.Double?[]?`
    extends JavaDouble with `box.NullableArrayOfNullable` {

  val javaClass = "Double[]"
  val javaType = JavaSimpleType("Double[]")
  val javaDescription = "NullableArrayOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , ArrayOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = false
}

case object `java.List<Double>`
    extends JavaDouble with `box.OneListOfOne` {

  val javaClass = "java.util.List<Double>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Double"))
  val javaDescription = "OneListOfOneDoubles"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.List<Double>?`
    extends JavaDouble with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Double>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Double"))
  val javaDescription = "NullableListOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.List<Double?>`
    extends JavaDouble with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Double>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Double"))
  val javaDescription = "OneListOfNullableDoubles"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.List<Double?>?`
    extends JavaDouble with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Double>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Double"))
  val javaDescription = "NullableListOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , ListOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Double>`
    extends JavaDouble with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Double>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Double"))
  val javaDescription = "OneSetOfOneDoubles"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Double>?`
    extends JavaDouble with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Double>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Double"))
  val javaDescription = "NullableSetOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Double?>`
    extends JavaDouble with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Double>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Double"))
  val javaDescription = "OneSetOfNullableDoubles"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Double?>?`
    extends JavaDouble with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Double>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Double"))
  val javaDescription = "NullableSetOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , SetOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Double>`
    extends JavaDouble with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<Double>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Double"))
  val javaDescription = "OneQueueOfOneDoubles"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Double>?`
    extends JavaDouble with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<Double>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Double"))
  val javaDescription = "NullableQueueOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Double?>`
    extends JavaDouble with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<Double>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Double"))
  val javaDescription = "OneQueueOfNullableDoubles"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Double?>?`
    extends JavaDouble with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<Double>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Double"))
  val javaDescription = "NullableQueueOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , QueueOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Double>`
    extends JavaDouble with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Double>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Double"))
  val javaDescription = "OneLinkedListOfOneDoubles"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Double>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Double>?`
    extends JavaDouble with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Double>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Double"))
  val javaDescription = "NullableLinkedListOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Double?>`
    extends JavaDouble with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Double>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Double"))
  val javaDescription = "OneLinkedListOfNullableDoubles"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Double>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Double?>?`
    extends JavaDouble with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Double>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Double"))
  val javaDescription = "NullableLinkedListOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , LinkedListOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Double>`
    extends JavaDouble with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<Double>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Double"))
  val javaDescription = "OneStackOfOneDoubles"

  def defaultValue = SingleJavaValue("new java.util.Stack<Double>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Double>?`
    extends JavaDouble with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<Double>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Double"))
  val javaDescription = "NullableStackOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Double?>`
    extends JavaDouble with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<Double>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Double"))
  val javaDescription = "OneStackOfNullableDoubles"

  def defaultValue = SingleJavaValue("new java.util.Stack<Double>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Double?>?`
    extends JavaDouble with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<Double>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Double"))
  val javaDescription = "NullableStackOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , StackOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Double>`
    extends JavaDouble with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<Double>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Double"))
  val javaDescription = "OneVectorOfOneDoubles"

  def defaultValue = SingleJavaValue("new java.util.Vector<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Double>?`
    extends JavaDouble with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<Double>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Double"))
  val javaDescription = "NullableVectorOfOneDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Double?>`
    extends JavaDouble with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<Double>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Double"))
  val javaDescription = "OneVectorOfNullableDoubles"

  def defaultValue = SingleJavaValue("new java.util.Vector<Double>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Double?>?`
    extends JavaDouble with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<Double>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Double"))
  val javaDescription = "NullableVectorOfNullableDoubles"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Double",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("Double.NaN")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  , VectorOfJavaValues("Double",
      SingleJavaValue("null")
    , SingleJavaValue("0.0")
    , SingleJavaValue("1E-307")
    , SingleJavaValue("9E307")
    , SingleJavaValue("-1.23456789012345E-10")
    , SingleJavaValue("1.23456789012345E20")
    , SingleJavaValue("Double.NEGATIVE_INFINITY")
    , SingleJavaValue("Double.POSITIVE_INFINITY")
    , SingleJavaValue("Double.NaN")
    )
  )

  val hasGenerics = true
}
