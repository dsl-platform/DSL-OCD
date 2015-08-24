package com.dslplatform.ocd
package javas

import types._
import boxes._

sealed abstract class JavaGuid
    extends OcdJavaBoxType
    with `type.Guid` {

  val isPrecise = false
  val isPrimitive = false
  val isEqualable = true
}

case object `java.Guid`
    extends JavaGuid with `box.One` {

  val javaClass = "java.util.UUID"
  val javaType = JavaSimpleType("java.util.UUID")
  val javaDescription = "OneGuid"

  def defaultValue = SingleJavaValue("java.util.UUID.randomUUID()", Unstable)

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
  , SingleJavaValue("new java.util.UUID(0L, 0L)")
  )

  val hasGenerics = false
}

case object `java.Guid?`
    extends JavaGuid with `box.Nullable` {

  val javaClass = "java.util.UUID"
  val javaType = JavaSimpleType("java.util.UUID")
  val javaDescription = "NullableGuid"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
  , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
  , SingleJavaValue("new java.util.UUID(0L, 0L)")
  )

  val hasGenerics = false
}

case object `java.Guid[]`
    extends JavaGuid with `box.OneArrayOfOne` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "OneArrayOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.UUID[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.Guid[]?`
    extends JavaGuid with `box.NullableArrayOfOne` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "NullableArrayOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.Guid?[]`
    extends JavaGuid with `box.OneArrayOfNullable` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "OneArrayOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.UUID[0]")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.Guid?[]?`
    extends JavaGuid with `box.NullableArrayOfNullable` {

  val javaClass = "java.util.UUID[]"
  val javaType = JavaSimpleType("java.util.UUID[]")
  val javaDescription = "NullableArrayOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ArrayOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = false
}

case object `java.List<Guid>`
    extends JavaGuid with `box.OneListOfOne` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "OneListOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Guid>?`
    extends JavaGuid with `box.NullableListOfOne` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "NullableListOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Guid?>`
    extends JavaGuid with `box.OneListOfNullable` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "OneListOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.ArrayList<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.List<Guid?>?`
    extends JavaGuid with `box.NullableListOfNullable` {

  val javaClass = "java.util.List<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.List", JavaClass("java.util.UUID"))
  val javaDescription = "NullableListOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , ListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid>`
    extends JavaGuid with `box.OneSetOfOne` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "OneSetOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid>?`
    extends JavaGuid with `box.NullableSetOfOne` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "NullableSetOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid?>`
    extends JavaGuid with `box.OneSetOfNullable` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "OneSetOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.HashSet<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Set<Guid?>?`
    extends JavaGuid with `box.NullableSetOfNullable` {

  val javaClass = "java.util.Set<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Set", JavaClass("java.util.UUID"))
  val javaDescription = "NullableSetOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , SetOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Guid>`
    extends JavaGuid with `box.OneQueueOfOne` {

  val javaClass = "java.util.Queue<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.util.UUID"))
  val javaDescription = "OneQueueOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Guid>?`
    extends JavaGuid with `box.NullableQueueOfOne` {

  val javaClass = "java.util.Queue<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.util.UUID"))
  val javaDescription = "NullableQueueOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Guid?>`
    extends JavaGuid with `box.OneQueueOfNullable` {

  val javaClass = "java.util.Queue<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.util.UUID"))
  val javaDescription = "OneQueueOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.ArrayDeque<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Queue<Guid?>?`
    extends JavaGuid with `box.NullableQueueOfNullable` {

  val javaClass = "java.util.Queue<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Queue", JavaClass("java.util.UUID"))
  val javaDescription = "NullableQueueOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , QueueOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Guid>`
    extends JavaGuid with `box.OneLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.util.UUID"))
  val javaDescription = "OneLinkedListOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.util.UUID>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Guid>?`
    extends JavaGuid with `box.NullableLinkedListOfOne` {

  val javaClass = "java.util.LinkedList<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.util.UUID"))
  val javaDescription = "NullableLinkedListOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Guid?>`
    extends JavaGuid with `box.OneLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.util.UUID"))
  val javaDescription = "OneLinkedListOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.LinkedList<java.util.UUID>()")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.LinkedList<Guid?>?`
    extends JavaGuid with `box.NullableLinkedListOfNullable` {

  val javaClass = "java.util.LinkedList<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.LinkedList", JavaClass("java.util.UUID"))
  val javaDescription = "NullableLinkedListOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , LinkedListOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Guid>`
    extends JavaGuid with `box.OneStackOfOne` {

  val javaClass = "java.util.Stack<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.util.UUID"))
  val javaDescription = "OneStackOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.util.UUID>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Guid>?`
    extends JavaGuid with `box.NullableStackOfOne` {

  val javaClass = "java.util.Stack<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.util.UUID"))
  val javaDescription = "NullableStackOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Guid?>`
    extends JavaGuid with `box.OneStackOfNullable` {

  val javaClass = "java.util.Stack<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.util.UUID"))
  val javaDescription = "OneStackOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.Stack<java.util.UUID>()")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Stack<Guid?>?`
    extends JavaGuid with `box.NullableStackOfNullable` {

  val javaClass = "java.util.Stack<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Stack", JavaClass("java.util.UUID"))
  val javaDescription = "NullableStackOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    StackOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , StackOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Guid>`
    extends JavaGuid with `box.OneVectorOfOne` {

  val javaClass = "java.util.Vector<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.util.UUID"))
  val javaDescription = "OneVectorOfOneGuids"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Guid>?`
    extends JavaGuid with `box.NullableVectorOfOne` {

  val javaClass = "java.util.Vector<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.util.UUID"))
  val javaDescription = "NullableVectorOfOneGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Guid?>`
    extends JavaGuid with `box.OneVectorOfNullable` {

  val javaClass = "java.util.Vector<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.util.UUID"))
  val javaDescription = "OneVectorOfNullableGuids"

  def defaultValue = SingleJavaValue("new java.util.Vector<java.util.UUID>(0)")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}

case object `java.Vector<Guid?>?`
    extends JavaGuid with `box.NullableVectorOfNullable` {

  val javaClass = "java.util.Vector<java.util.UUID>"
  val javaType = JavaCollectionType("java.util.Vector", JavaClass("java.util.UUID"))
  val javaDescription = "NullableVectorOfNullableGuids"

  def defaultValue = SingleJavaValue("null")

  def nonDefaultValues = IndexedSeq(
    VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  , VectorOfJavaValues("java.util.UUID",
      SingleJavaValue("null")
    , SingleJavaValue("java.util.UUID.randomUUID()", Unstable)
    , SingleJavaValue("java.util.UUID.fromString(\"1-2-3-4-5\")")
    , SingleJavaValue("new java.util.UUID(0L, 0L)")
    )
  )

  val hasGenerics = true
}
