package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaFloat
    extends OcdJavaBoxType
    with `type.Float` {

  val isPrecise = true
  val isPrimitive = true
  val isEqualable = true
}

case object `java.Float`
    extends JavaFloat with `box.One` {

  val javaClass = "float"
  val javaType = JavaSimpleType("float")
  val javaDescription = "OneFloat"

  def defaultValue = SingleJavaValue("0.0f")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("-1.2345E-10f")
  , SingleJavaValue("1.2345E20f")
  , SingleJavaValue("-1E-5f")
  , SingleJavaValue("-1E-32f")
  , SingleJavaValue("1E32f")
  , SingleJavaValue("Float.NaN")
  , SingleJavaValue("Float.NEGATIVE_INFINITY")
  , SingleJavaValue("Float.POSITIVE_INFINITY")
  )

  val hasGenerics = false
}

case object `java.Float?`
    extends JavaFloat with `box.Nullable` {

  val javaClass = "Float"
  val javaType = JavaSimpleType("Float")
  val javaDescription = "NullableFloat"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("0.0f")
  , SingleJavaValue("-1.2345E-10f")
  , SingleJavaValue("1.2345E20f")
  , SingleJavaValue("-1E-5f")
  , SingleJavaValue("-1E-32f")
  , SingleJavaValue("1E32f")
  , SingleJavaValue("Float.NaN")
  , SingleJavaValue("Float.NEGATIVE_INFINITY")
  , SingleJavaValue("Float.POSITIVE_INFINITY")
  )

  val hasGenerics = false
}

case object `java.Float[]`
    extends JavaFloat with `box.OneArrayOfOne` {

  val javaClass = "float[]"
  val javaType = JavaSimpleType("float[]")
  val javaDescription = "OneArrayOfOneFloats"

  def defaultValue = SingleJavaValue("new float[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.Float[]?`
    extends JavaFloat with `box.NullableArrayOfOne` {

  val javaClass = "float[]"
  val javaType = JavaSimpleType("float[]")
  val javaDescription = "NullableArrayOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.Float?[]`
    extends JavaFloat with `box.OneArrayOfNullable` {

  val javaClass = "Float[]"
  val javaType = JavaSimpleType("Float[]")
  val javaDescription = "OneArrayOfNullableFloats"

  def defaultValue = SingleJavaValue("new Float[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.Float?[]?`
    extends JavaFloat with `box.NullableArrayOfNullable` {

  val javaClass = "Float[]"
  val javaType = JavaSimpleType("Float[]")
  val javaDescription = "NullableArrayOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ArrayOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = false
}

case object `java.List<Float>`
    extends JavaFloat with `box.OneListOfOne` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "OneListOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.List<Float>?`
    extends JavaFloat with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "NullableListOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.List<Float?>`
    extends JavaFloat with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "OneListOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.List<Float?>?`
    extends JavaFloat with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Float>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Float"))
  val javaDescription = "NullableListOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , ListOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float>`
    extends JavaFloat with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "OneSetOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float>?`
    extends JavaFloat with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "NullableSetOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float?>`
    extends JavaFloat with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "OneSetOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Float?>?`
    extends JavaFloat with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Float>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Float"))
  val javaDescription = "NullableSetOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , SetOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Float>`
    extends JavaFloat with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<Float>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Float"))
  val javaDescription = "OneQueueOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Float>?`
    extends JavaFloat with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<Float>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Float"))
  val javaDescription = "NullableQueueOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Float?>`
    extends JavaFloat with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<Float>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Float"))
  val javaDescription = "OneQueueOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Float?>?`
    extends JavaFloat with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<Float>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Float"))
  val javaDescription = "NullableQueueOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , QueueOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Float>`
    extends JavaFloat with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Float>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Float"))
  val javaDescription = "OneLinkedListOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Float>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Float>?`
    extends JavaFloat with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Float>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Float"))
  val javaDescription = "NullableLinkedListOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Float?>`
    extends JavaFloat with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Float>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Float"))
  val javaDescription = "OneLinkedListOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Float>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Float?>?`
    extends JavaFloat with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Float>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Float"))
  val javaDescription = "NullableLinkedListOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , LinkedListOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Float>`
    extends JavaFloat with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<Float>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Float"))
  val javaDescription = "OneStackOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.Stack<Float>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Float>?`
    extends JavaFloat with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<Float>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Float"))
  val javaDescription = "NullableStackOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Float?>`
    extends JavaFloat with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<Float>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Float"))
  val javaDescription = "OneStackOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.Stack<Float>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Float?>?`
    extends JavaFloat with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<Float>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Float"))
  val javaDescription = "NullableStackOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , StackOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Float>`
    extends JavaFloat with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<Float>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Float"))
  val javaDescription = "OneVectorOfOneFloats"

  def defaultValue = SingleJavaValue("new java.util.Vector<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Float>?`
    extends JavaFloat with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<Float>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Float"))
  val javaDescription = "NullableVectorOfOneFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Float?>`
    extends JavaFloat with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<Float>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Float"))
  val javaDescription = "OneVectorOfNullableFloats"

  def defaultValue = SingleJavaValue("new java.util.Vector<Float>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Float?>?`
    extends JavaFloat with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<Float>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Float"))
  val javaDescription = "NullableVectorOfNullableFloats"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Float",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  , VectorOfJavaValues("Float",
      SingleJavaValue("null")
    , SingleJavaValue("0.0f")
    , SingleJavaValue("-1.2345E-10f")
    , SingleJavaValue("1.2345E20f")
    , SingleJavaValue("-1E-5f")
    , SingleJavaValue("-1E-32f")
    , SingleJavaValue("1E32f")
    , SingleJavaValue("Float.NaN")
    , SingleJavaValue("Float.NEGATIVE_INFINITY")
    , SingleJavaValue("Float.POSITIVE_INFINITY")
    )
  )

  val hasGenerics = true
}
