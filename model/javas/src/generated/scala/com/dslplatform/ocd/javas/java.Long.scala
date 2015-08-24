package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaLong
    extends OcdJavaBoxType
    with `type.Long` {

  val isPrecise = false
  val isPrimitive = true
  val isEqualable = true
}

case object `java.Long`
    extends JavaLong with `box.One` {

  val javaClass = "long"
  val javaType = JavaSimpleType("long")
  val javaDescription = "OneLong"

  def defaultValue = SingleJavaValue("0L")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("1L")
  , SingleJavaValue("1000000000000000000L")
  , SingleJavaValue("-1000000000000000000L")
  , SingleJavaValue("Long.MIN_VALUE")
  , SingleJavaValue("Long.MAX_VALUE")
  )

  val hasGenerics = false
}

case object `java.Long?`
    extends JavaLong with `box.Nullable` {

  val javaClass = "Long"
  val javaType = JavaSimpleType("Long")
  val javaDescription = "NullableLong"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("0L")
  , SingleJavaValue("1L")
  , SingleJavaValue("1000000000000000000L")
  , SingleJavaValue("-1000000000000000000L")
  , SingleJavaValue("Long.MIN_VALUE")
  , SingleJavaValue("Long.MAX_VALUE")
  )

  val hasGenerics = false
}

case object `java.Long[]`
    extends JavaLong with `box.OneArrayOfOne` {

  val javaClass = "long[]"
  val javaType = JavaSimpleType("long[]")
  val javaDescription = "OneArrayOfOneLongs"

  def defaultValue = SingleJavaValue("new long[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("long",
      SingleJavaValue("0L")
    )
  , ArrayOfJavaValues("long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ArrayOfJavaValues("long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Long[]?`
    extends JavaLong with `box.NullableArrayOfOne` {

  val javaClass = "long[]"
  val javaType = JavaSimpleType("long[]")
  val javaDescription = "NullableArrayOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("long",
      SingleJavaValue("0L")
    )
  , ArrayOfJavaValues("long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ArrayOfJavaValues("long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Long?[]`
    extends JavaLong with `box.OneArrayOfNullable` {

  val javaClass = "Long[]"
  val javaType = JavaSimpleType("Long[]")
  val javaDescription = "OneArrayOfNullableLongs"

  def defaultValue = SingleJavaValue("new Long[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.Long?[]?`
    extends JavaLong with `box.NullableArrayOfNullable` {

  val javaClass = "Long[]"
  val javaType = JavaSimpleType("Long[]")
  val javaDescription = "NullableArrayOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , ArrayOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = false
}

case object `java.List<Long>`
    extends JavaLong with `box.OneListOfOne` {

  val javaClass = "java.util.List<Long>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Long"))
  val javaDescription = "OneListOfOneLongs"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.List<Long>?`
    extends JavaLong with `box.NullableListOfOne` {

  val javaClass = "java.util.List<Long>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Long"))
  val javaDescription = "NullableListOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.List<Long?>`
    extends JavaLong with `box.OneListOfNullable` {

  val javaClass = "java.util.List<Long>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Long"))
  val javaDescription = "OneListOfNullableLongs"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.List<Long?>?`
    extends JavaLong with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<Long>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("Long"))
  val javaDescription = "NullableListOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , ListOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Long>`
    extends JavaLong with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<Long>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Long"))
  val javaDescription = "OneSetOfOneLongs"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Long>?`
    extends JavaLong with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<Long>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Long"))
  val javaDescription = "NullableSetOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Long?>`
    extends JavaLong with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<Long>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Long"))
  val javaDescription = "OneSetOfNullableLongs"

  def defaultValue = SingleJavaValue("new java.util.HashSet<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Long?>?`
    extends JavaLong with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<Long>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("Long"))
  val javaDescription = "NullableSetOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , SetOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Long>`
    extends JavaLong with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<Long>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Long"))
  val javaDescription = "OneQueueOfOneLongs"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Long>?`
    extends JavaLong with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<Long>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Long"))
  val javaDescription = "NullableQueueOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Long?>`
    extends JavaLong with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<Long>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Long"))
  val javaDescription = "OneQueueOfNullableLongs"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Long?>?`
    extends JavaLong with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<Long>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("Long"))
  val javaDescription = "NullableQueueOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , QueueOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Long>`
    extends JavaLong with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Long>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Long"))
  val javaDescription = "OneLinkedListOfOneLongs"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Long>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Long>?`
    extends JavaLong with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<Long>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Long"))
  val javaDescription = "NullableLinkedListOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Long?>`
    extends JavaLong with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Long>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Long"))
  val javaDescription = "OneLinkedListOfNullableLongs"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<Long>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Long?>?`
    extends JavaLong with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<Long>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("Long"))
  val javaDescription = "NullableLinkedListOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , LinkedListOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Long>`
    extends JavaLong with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<Long>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Long"))
  val javaDescription = "OneStackOfOneLongs"

  def defaultValue = SingleJavaValue("new java.util.Stack<Long>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Long>?`
    extends JavaLong with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<Long>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Long"))
  val javaDescription = "NullableStackOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Long?>`
    extends JavaLong with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<Long>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Long"))
  val javaDescription = "OneStackOfNullableLongs"

  def defaultValue = SingleJavaValue("new java.util.Stack<Long>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Long?>?`
    extends JavaLong with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<Long>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("Long"))
  val javaDescription = "NullableStackOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , StackOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Long>`
    extends JavaLong with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<Long>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Long"))
  val javaDescription = "OneVectorOfOneLongs"

  def defaultValue = SingleJavaValue("new java.util.Vector<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Long>?`
    extends JavaLong with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<Long>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Long"))
  val javaDescription = "NullableVectorOfOneLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Long?>`
    extends JavaLong with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<Long>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Long"))
  val javaDescription = "OneVectorOfNullableLongs"

  def defaultValue = SingleJavaValue("new java.util.Vector<Long>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Long?>?`
    extends JavaLong with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<Long>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("Long"))
  val javaDescription = "NullableVectorOfNullableLongs"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("Long",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("Long.MAX_VALUE")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  , VectorOfJavaValues("Long",
      SingleJavaValue("null")
    , SingleJavaValue("0L")
    , SingleJavaValue("1L")
    , SingleJavaValue("1000000000000000000L")
    , SingleJavaValue("-1000000000000000000L")
    , SingleJavaValue("Long.MIN_VALUE")
    , SingleJavaValue("Long.MAX_VALUE")
    )
  )

  val hasGenerics = true
}
